package com.skip.rest;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.transaction.Transactional;
import javax.ws.rs.core.Response;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.skip.model.Category;
import com.skip.repository.CategoryRepository;

@RestController("/categories")
public class CategoryRest {
	@Autowired
	private CategoryRepository repo;
	
	private Logger LOG = LoggerFactory.getLogger(this.getClass());
	
	@PostConstruct
	public void init() {
		LOG.info("initializing bean...");
		if (repo==null) LOG.warn("repository is null");
	}
	
	@RequestMapping(method=RequestMethod.GET)
	public List<Category> listAll(){
		return repo.findAll();
	}
	
	@RequestMapping(method=RequestMethod.POST, consumes="application/json", produces="application/json")
	@Transactional
	public Response newCategory(@RequestBody Category category) {	
		
		try {
			category = repo.save(category);	
			
			return Response.ok(new MessageResponse("OK")).build();
		} catch (Exception e) {
			e.printStackTrace();
			return Response.status(500).entity(new MessageResponse("Error", e.getMessage())).build();
		}

		
	}
}

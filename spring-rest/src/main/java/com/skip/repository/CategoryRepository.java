package com.skip.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.skip.model.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}

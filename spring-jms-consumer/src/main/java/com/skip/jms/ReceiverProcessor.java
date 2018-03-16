package com.skip.jms;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import com.skip.model.Category;

@Component
public class ReceiverProcessor {
	Logger LOG = LoggerFactory.getLogger(getClass());

	@JmsListener(destination="seller")
	public void receiver(Category msg) throws Exception {
		LOG.info(String.format("Received :: %s", msg.serialize()));
	}
}

package com.skip.model;

import com.skip.utils.JsonBean;

public abstract class EntityBean extends JsonBean {
	private static final long serialVersionUID = 7892045904359574828L;

	public abstract Long getId();
	public abstract void setId(Long id);
	
	@Override
	public String toString() {
		try {
			return super.serialize();
		} catch (Exception e) {
			return getId().toString();
		}
	}
}

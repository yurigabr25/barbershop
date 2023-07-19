package com.yuri.barber.dto;

import java.math.BigDecimal;

import com.yuri.barber.entities.Service;

public class ServiceMinDTO {

	private Long id;
	private String name;
	private BigDecimal value;
	private String description;

	public ServiceMinDTO() {
	}

	public ServiceMinDTO(Service entity) {
		id = entity.getId();
		name = entity.getName();
		value = entity.getValue();
		description = entity.getDescription();
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public BigDecimal getValue() {
		return value;
	}

	public String getDescription() {
		return description;
	}

}

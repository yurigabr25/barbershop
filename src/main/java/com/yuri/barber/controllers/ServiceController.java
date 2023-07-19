package com.yuri.barber.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yuri.barber.dto.ServiceMinDTO;
import com.yuri.barber.services.ServiceService;

@RestController
@RequestMapping(value = "/service")
public class ServiceController {

	@Autowired
	private ServiceService serviceService;

	@GetMapping
	public List<ServiceMinDTO> findAll() {
		List<ServiceMinDTO> result = serviceService.findAll();
		return result;
	}

}

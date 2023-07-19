package com.yuri.barber.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yuri.barber.dto.ServiceMinDTO;
import com.yuri.barber.repositories.ServiceRepository;

@Service
public class ServiceService {

	@Autowired
	private ServiceRepository serviceRepository;

	public List<ServiceMinDTO> findAll() {
		List<com.yuri.barber.entities.Service> result = serviceRepository.findAll();
		return result.stream().map(x -> new ServiceMinDTO(x)).toList();
	}

}

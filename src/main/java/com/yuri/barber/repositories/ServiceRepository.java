package com.yuri.barber.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yuri.barber.entities.Service;

public interface ServiceRepository extends JpaRepository<Service, Long> {

}

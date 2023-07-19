package com.yuri.barber.entities;

import java.math.BigDecimal;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_service")
public class Service {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private BigDecimal hair;
	private BigDecimal beard;
	private BigDecimal nail;

	public Service() {
	}

	public Service(Long id, BigDecimal corteCabelo, BigDecimal corteBarab, BigDecimal nail) {
		this.id = id;
		this.hair = corteCabelo;
		this.beard = corteBarab;
		this.nail = nail;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public BigDecimal getHair() {
		return hair;
	}

	public void setHair(BigDecimal hair) {
		this.hair = hair;
	}

	public BigDecimal getBeard() {
		return beard;
	}

	public void setBeard(BigDecimal beard) {
		this.beard = beard;
	}

	public BigDecimal getNail() {
		return nail;
	}

	public void setNail(BigDecimal nail) {
		this.nail = nail;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Service other = (Service) obj;
		return Objects.equals(id, other.id);
	}

}

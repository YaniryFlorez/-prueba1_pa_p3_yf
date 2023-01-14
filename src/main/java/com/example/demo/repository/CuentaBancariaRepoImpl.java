package com.example.demo.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.modelo.CuentaBancaria;

import jakarta.persistence.Entity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Transactional
@Repository

public class CuentaBancariaRepoImpl implements ICuentaBancariaRepo {
	
	@PersistenceContext
	private EntityManager entityManager;
	

	@Override
	public void insertar(CuentaBancaria cuenta) {
		// TODO Auto-generated method stub
		this.entityManager.persist(cuenta);
	}

	@Override
	public void actualizar(CuentaBancaria cuenta) {
		// TODO Auto-generated method stub
		this.entityManager.merge(cuenta);
	}

	@Override
	public CuentaBancaria buscar(String numero) {
		// TODO Auto-generated method stub
		return this.entityManager.find(CuentaBancaria.class, numero);
	}

	@Override
	public void eliminar(String numero) {
		// TODO Auto-generated method stub
	//	this.entityManager.clear(numero);
		
	}

}

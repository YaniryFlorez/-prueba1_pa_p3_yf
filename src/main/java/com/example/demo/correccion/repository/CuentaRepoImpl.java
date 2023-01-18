package com.example.demo.correccion.repository;

import com.example.demo.correccion.modelo.Cuenta;
import com.example.demo.modelo.CuentaBancaria;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

public class CuentaRepoImpl implements ICuentaReepo{

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertar(Cuenta cuenta) {
		// TODO Auto-generated method stub
		this.entityManager.merge(cuenta);
	}

	@Override
	public void actualizar(Cuenta cuenta) {
		// TODO Auto-generated method stub
		this.entityManager.merge(cuenta);
	}

	@Override
	public Cuenta buscar(String id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Cuenta.class, id);
	}

	@Override
	public void eliminar(String id) {
		// TODO Auto-generated method stub
		
		
	}
	
	

}

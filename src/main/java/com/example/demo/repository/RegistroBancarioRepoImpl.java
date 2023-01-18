package com.example.demo.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.modelo.RegistroBancario;

import jakarta.persistence.Entity;
import jakarta.persistence.EntityManager;
@Repository
@Entity
public class RegistroBancarioRepoImpl implements IRegistroBancarioRepo{

	@Autowired
	private EntityManager entityManager;
	
	@Override
	public void insertar(RegistroBancario registro) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actualizar(RegistroBancario registro) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public RegistroBancario buscar(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		
	}

}

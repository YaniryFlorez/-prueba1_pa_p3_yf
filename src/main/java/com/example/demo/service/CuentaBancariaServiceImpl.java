package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.CuentaBancaria;
import com.example.demo.repository.ICuentaBancariaRepo;

@Service
public class CuentaBancariaServiceImpl implements ICuentaBancariaService{
	@Autowired
	private ICuentaBancariaRepo cuentaRepo;
	

	@Override
	public void ingresar(CuentaBancaria cuenta) {
		// TODO Auto-generated method stub
		this.cuentaRepo.insertar(cuenta);
	}

	@Override
	public void actualizar(CuentaBancaria cuenta) {
		// TODO Auto-generated method stub
		this.cuentaRepo.actualizar(cuenta);
	}

	@Override
	public CuentaBancaria buscar(String numero) {
		// TODO Auto-generated method stub
		return this.cuentaRepo.buscar(numero);
	}

	@Override
	public void eliminar(String numero) {
		// TODO Auto-generated method stub
		this.cuentaRepo.eliminar(numero);
	}
	
	

}

package com.example.demo.service;

import com.example.demo.modelo.CuentaBancaria;

public interface ICuentaBancariaService {
	
	public void ingresar(CuentaBancaria cuenta);
	public void actualizar(CuentaBancaria cuenta);
	public CuentaBancaria buscar(String numero);
	public void eliminar(String numero);
}

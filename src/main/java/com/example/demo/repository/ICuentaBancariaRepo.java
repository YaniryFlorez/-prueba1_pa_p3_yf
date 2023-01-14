package com.example.demo.repository;

import com.example.demo.modelo.CuentaBancaria;

public interface ICuentaBancariaRepo {
	//crud
	public void insertar(CuentaBancaria cuenta);
	public void actualizar(CuentaBancaria cuenta);
	public CuentaBancaria buscar(String numero);
	public void eliminar(String numero);

}

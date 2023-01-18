package com.example.demo.correccion.repository;

import com.example.demo.correccion.modelo.Cuenta;

public interface ICuentaReepo {

	public void insertar(Cuenta cuenta);
	public void actualizar(Cuenta cuenta);
	public Cuenta buscar(String id);
	public void eliminar(String id);
	
	
	
}

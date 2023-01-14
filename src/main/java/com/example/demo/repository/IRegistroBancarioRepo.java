package com.example.demo.repository;

import com.example.demo.modelo.RegistroBancario;

public interface IRegistroBancarioRepo {

	public void insertar(RegistroBancario registro);
	public void actualizar(RegistroBancario registro);
	public RegistroBancario buscar(Integer id);
	public void eliminar(Integer id);
}

package com.example.demo;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.modelo.CuentaBancaria;
import com.example.demo.service.ICuentaBancariaService;

@SpringBootApplication
public class CorrecionPaP3YfApplication2 implements CommandLineRunner{

	@Autowired
	private ICuentaBancariaService cuentaService;
	
	//@Autowired
	//private ICuentaBancariaService cuentaService;
	
	
	public static void main(String[] args) {
		SpringApplication.run(CorrecionPaP3YfApplication2.class, args);
	}
	
	public void run(String... args)throws Exception {
		CuentaBancaria cuenta = new CuentaBancaria();
		
		cuenta.setNumero("1");
		cuenta.setTipo("corriente");
		cuenta.setSaldo(new BigDecimal(1000));
		cuenta.setCedula("12345");
		
		cuenta.setNumero("2");
		cuenta.setTipo("ahorro");
		cuenta.setSaldo(new BigDecimal(3000));
		cuenta.setCedula("13322");
		
		this.cuentaService.ingresar(cuenta);
			
	}

}

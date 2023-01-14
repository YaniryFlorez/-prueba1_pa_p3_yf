package com.example.demo.modelo;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="registro")
public class RegistroBancario {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "reg_seq")
	@SequenceGenerator(name = "reg_seq ", sequenceName = "reg_seq",allocationSize = 1)
	
	
	@Column(name="reg_id")
	private Integer id;
	
	@Column(name="reg_fecha_transf")
	private LocalDateTime fechaTransferencia;
	
	@Column(name="reg_cuenta_orig")
	private String cuentaOrigen;
	
	@Column(name="reg_cuenta_dest")
	private String cuentaDestino;
	
	@Column(name="reg_monto")
	private Double monto;
	
	@Column(name="reg_comision_trans")
	private Double comision ;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public LocalDateTime getFechaTransferencia() {
		return fechaTransferencia;
	}

	public void setFechaTransferencia(LocalDateTime fechaTransferencia) {
		this.fechaTransferencia = fechaTransferencia;
	}

	public String getCuentaOrigen() {
		return cuentaOrigen;
	}

	public void setCuentaOrigen(String cuentaOrigen) {
		this.cuentaOrigen = cuentaOrigen;
	}

	public String getCuentaDestino() {
		return cuentaDestino;
	}

	public void setCuentaDestino(String cuentaDestino) {
		this.cuentaDestino = cuentaDestino;
	}

	public Double getMonto() {
		return monto;
	}

	public void setMonto(Double monto) {
		this.monto = monto;
	}

	public Double getComision() {
		return comision;
	}

	public void setComision(Double comision) {
		this.comision = comision;
	}

	
}

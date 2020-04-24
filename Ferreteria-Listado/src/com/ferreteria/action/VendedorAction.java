package com.ferreteria.action;

import org.apache.struts2.convention.annotation.ParentPackage;

import com.ferreteria.service.Servicio;
import com.ferreteria.service.ServicioImpl;

@ParentPackage(value="dawi")
public class VendedorAction {
	
	
	public String dni;
	public Integer cantidad;
	
	public String execute() throws Exception {
		Servicio servicio=new ServicioImpl();
		cantidad=servicio.getCantidadByVendedor(dni);
		return "exito";
	}
	
	
	
	
	
	
	
	
	
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public Integer getCantidad() {
		return cantidad;
	}
	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}
	
	

}

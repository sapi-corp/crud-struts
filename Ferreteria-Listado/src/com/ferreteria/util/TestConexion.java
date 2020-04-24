package com.ferreteria.util;

import java.sql.Connection;

public class TestConexion {

	public static void main(String[] args) throws Exception {
		Connection cn=new Conexion().getAcceso();
		System.out.println(cn);

	}
}

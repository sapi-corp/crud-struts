package com.ferreteria.daos;

public abstract class DAOFactory {
	
	public static final int MYSQL = 1;
	public static final int ORACLE = 2;
	
	//OBJETO DE DAOS
	public abstract ClienteDAO getCliente();
	public abstract DistritoDAO getDistrito();
	
	//SE APLICA POLIMORFISMO
	public static DAOFactory getFactorty(int bd) {
		switch (bd) {
			case MYSQL:
				return new MySqlDAOFActory();
			
		}
		return null;
	}

}

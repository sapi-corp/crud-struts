package com.ferreteria.daos;

public class MySqlDAOFActory extends DAOFactory {

	@Override
	public ClienteDAO getCliente() {
		// TODO Auto-generated method stub
		return new MySqlClienteDAO();
	}

	@Override
	public DistritoDAO getDistrito() {
		// TODO Auto-generated method stub
		return new MySqlDistritoDAO();
	}

}

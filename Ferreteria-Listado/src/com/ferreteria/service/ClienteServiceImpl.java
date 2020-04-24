package com.ferreteria.service;

import java.util.List;

import com.ferreteria.bean.ClienteBean;
import com.ferreteria.daos.ClienteDAO;
import com.ferreteria.daos.DAOFactory;

public class ClienteServiceImpl implements ClienteService{
	
	DAOFactory fabrica =DAOFactory.getFactorty(DAOFactory.MYSQL);
	ClienteDAO dao= fabrica.getCliente();
	
	
	@Override
	public List<ClienteBean> listaCliente() throws Exception {
		// TODO Auto-generated method stub
		return dao.listaCliente();
	}


	@Override
	public int addCliente(ClienteBean obj) throws Exception {
		// TODO Auto-generated method stub
		return dao.addCliente(obj);
	}
	

	
}

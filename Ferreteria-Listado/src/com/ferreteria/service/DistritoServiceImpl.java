package com.ferreteria.service;

import java.util.List;

import com.ferreteria.bean.DistritoBean;
import com.ferreteria.daos.DAOFactory;
import com.ferreteria.daos.DistritoDAO;

public class DistritoServiceImpl implements DistritoService{
	
	DAOFactory fabrica =DAOFactory.getFactorty(DAOFactory.MYSQL);
	DistritoDAO dao= fabrica.getDistrito();

	@Override
	public List<DistritoBean> listaDistrito() throws Exception {
		// TODO Auto-generated method stub
		return dao.listaDistrito();
	}

}

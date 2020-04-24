package com.ferreteria.daos;

import java.util.List;

import com.ferreteria.bean.ClienteBean;

public interface ClienteDAO {
	
	public List<ClienteBean> listaCliente() throws Exception;
	public int addCliente(ClienteBean obj) throws Exception;

}

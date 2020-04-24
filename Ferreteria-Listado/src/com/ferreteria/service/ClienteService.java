package com.ferreteria.service;

import java.util.List;

import com.ferreteria.bean.ClienteBean;

public interface ClienteService {
	
	public List<ClienteBean> listaCliente() throws Exception;
	public int addCliente(ClienteBean obj) throws Exception;
}

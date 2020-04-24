package com.ferreteria.action;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.ParentPackage;

import com.ferreteria.bean.ClienteBean;
import com.ferreteria.service.ClienteService;
import com.ferreteria.service.ClienteServiceImpl;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.convention.annotation.Result;


@SuppressWarnings("serial")
@ParentPackage(value="dawi")
public class ClienteAction extends ActionSupport {
	
	private static final Log log = LogFactory.getLog(ClienteAction.class);
	
	private List<ClienteBean> lstCliente=new ArrayList<ClienteBean>();//GETTER AND SETTER
	private ClienteBean cliente;
	
	@Action(value="/addClient", results={@Result(name="salida",	location="/WEB-INF/paginas/listado-clientes.jsp")})
	public String Agregar(){
		ClienteServiceImpl service = new ClienteServiceImpl();	
		try {
			service.addCliente(cliente);
			System.out.println("addCliente de actionCliente OK");
		} catch (Exception e) {
			System.out.println("Error de addCliente ActionCliente" + 	e.getMessage());
			e.printStackTrace();
		}
		return "salida";
	}
	
	
	
	
	@Action(value="/consultaCliente" ,results={@Result(name ="success", location ="/WEB-INF/paginas/listado-clientes.jsp") })
	public String consultaCliente() {
		ClienteService service= new ClienteServiceImpl();
		//log.info("Listado de cliente");
		try {						
			lstCliente=service.listaCliente();
			System.out.println("Listado de actionCliente OK");
		}catch (Exception e) {
			System.out.println("Error en el listado ActionCliente" + 	e.getMessage());
			e.printStackTrace();
		}
		return SUCCESS;
	}
	
	
	
	
	
	
	

	public ClienteBean getCliente() {
		return cliente;
	}
	public void setCliente(ClienteBean cliente) {
		this.cliente = cliente;
	}
	public List<ClienteBean> getLstCliente() {
		return lstCliente;
	}
	public void setLstCliente(List<ClienteBean> lstCliente) {
		this.lstCliente = lstCliente;
	}
	
	

}

package com.ferreteria.action;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;

import com.ferreteria.bean.DistritoBean;
import com.ferreteria.service.DistritoServiceImpl;
import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
@ParentPackage(value="dawi")
public class DistritoAction extends ActionSupport{
	
	private static final Log log = LogFactory.getLog(ClienteAction.class);
	
	private List<DistritoBean> lstDistrito;
	
	
	@Action(value="/llenaDistrito", results={@Result(name="salida", type="json")})
	public String metodo(){
		DistritoServiceImpl service = new DistritoServiceImpl();	
		try {
			lstDistrito = service.listaDistrito();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "salida";
	}
	
	
	
	
	
	
	
	

	public List<DistritoBean> getLstDistrito() {
		return lstDistrito;
	}

	public void setLstDistrito(List<DistritoBean> lstDistrito) {
		this.lstDistrito = lstDistrito;
	}
	
	
	
	
	

}

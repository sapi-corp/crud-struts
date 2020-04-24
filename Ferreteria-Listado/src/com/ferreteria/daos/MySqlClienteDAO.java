package com.ferreteria.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ferreteria.bean.ClienteBean;
import com.ferreteria.util.Conexion;

public class MySqlClienteDAO implements ClienteDAO {

	@Override
	public List<ClienteBean> listaCliente() throws Exception {
		Connection conn=null;
		PreparedStatement pstm=null;
		ResultSet rs=null;
		List<ClienteBean> lista=new ArrayList<ClienteBean>();
		try {		
			String sql = "select * from tb_cliente";
			conn = new Conexion().getAcceso();
			pstm = conn.prepareStatement(sql);
			rs = pstm.executeQuery();
			ClienteBean bean = null;
			while(rs.next()){
				bean = new ClienteBean();
				bean.setCod_cliente(rs.getInt(1));
				bean.setNom_cliente(rs.getString(2));
				lista.add(bean);
			}
			System.out.println("Listado dao  OK");
		}catch(Exception e) {
			System.out.println("Error lista de listaCliente" + 	e.getMessage());
			e.printStackTrace();
		}finally {
			try {
				if (rs != null)rs.close();
				if (pstm != null)pstm.close();
				if (conn != null)conn.close();			
		}catch (SQLException e) {}
		}
		return lista;
	}

	@Override
	public int addCliente(ClienteBean obj) throws Exception {
		Connection conn = null;
		PreparedStatement pstm = null;
		int insertados = -1;
		try {
			String sql = "insert into tb_cliente values(null,?)";
			conn = new Conexion().getAcceso();
			pstm = conn.prepareStatement(sql);
			pstm.setString(1, obj.getNom_cliente());		
			insertados = pstm.executeUpdate();
			System.out.println("Agregado dao  OK");
		} catch (Exception e) {
			System.out.println("Error de agregado dao __"  + 	e.getMessage());
			e.printStackTrace();
		}finally {
			try {
				if (pstm != null)pstm.close();
			} catch (SQLException e1) {}
			try {
				if (conn != null)conn.close();
			} catch (SQLException e) {}
		}
		return insertados;
	}

}

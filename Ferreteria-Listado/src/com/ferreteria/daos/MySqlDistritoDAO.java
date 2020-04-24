package com.ferreteria.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ferreteria.bean.DistritoBean;
import com.ferreteria.util.Conexion;

public class MySqlDistritoDAO implements DistritoDAO {

	@Override
	public List<DistritoBean> listaDistrito() throws Exception {
		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		
		List<DistritoBean> lista = new ArrayList<DistritoBean>();
		try {
			String sql = "select * from tb_distrito";
			conn = new Conexion().getAcceso();
			pstm = conn.prepareStatement(sql);
			rs = pstm.executeQuery();
			DistritoBean bean = null;
			while(rs.next()){
				bean = new DistritoBean();
				bean.setCod_distrito(rs.getInt(1));
				bean.setNom_distrito(rs.getString(2));
				lista.add(bean);
			}
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			try {
				if (rs != null)rs.close();
				if (pstm != null)pstm.close();
				if (conn != null)conn.close();
			} catch (SQLException e) {}
		}
		return lista;
	}

}

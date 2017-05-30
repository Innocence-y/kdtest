package com.dao;

import com.bean.Kd;
import com.util.Conn;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by WWWW on 2017/5/28.
 */
public class KdDao {
	//增加
	public int insert(Kd kd) throws ClassNotFoundException, SQLException {
		Connection conn = Conn.getConn();
		String sql_insert = "insert into kd(kd_id,receiver,address,tele,sender,status) values(?,?,?,?,?,?)";
		PreparedStatement pst = conn.prepareStatement(sql_insert);
		pst.setString(1, kd.getKd_id());
		pst.setString(2, kd.getReceiver());
		pst.setString(3, kd.getAddress());
		pst.setString(4, kd.getTele());
		pst.setString(5, kd.getSender());
		pst.setString(6, kd.getStatus());
		int rs = pst.executeUpdate();
		return rs;
	}
	//删除
	public int delete(int id) throws ClassNotFoundException, SQLException {
		Connection conn = Conn.getConn();
		String sql_delete = "delete from kd where id=?";
		PreparedStatement pst = conn.prepareStatement(sql_delete);
		pst.setInt(1, id);
		int rs = pst.executeUpdate();
		if(rs!=0){
			System.out.print("删除成功！");
		}
		return rs;
	}
	//修改
	public int update(int id,Kd kd) throws ClassNotFoundException, SQLException {
		Connection conn = Conn.getConn();
		//receiver,address,tele,sender,status
		String sql_update = "update kd set kd_id=?,receiver=?,address=?,tele=?,sender=?,status=? where id=?";
		PreparedStatement pst = conn.prepareStatement(sql_update);

		pst.setString(1, kd.getKd_id());
		pst.setString(2, kd.getReceiver());
		pst.setString(3, kd.getAddress());
		pst.setString(4, kd.getTele());
		pst.setString(5, kd.getSender());
		pst.setString(6, kd.getStatus());
		pst.setInt(7,id);
		int rs = pst.executeUpdate();
		return rs;

	}
	//查询
	public List<Kd> select() throws ClassNotFoundException, SQLException{

		List<Kd> list = new ArrayList<Kd>();
		Connection conn = Conn.getConn();
		String sql_select = "select * from kd";
		PreparedStatement pst = conn.prepareStatement(sql_select);
		ResultSet rs = pst.executeQuery();
		while(rs.next()){
			Kd kd = new Kd();
			kd.setId(rs.getInt(1));
			kd.setKd_id(rs.getString(2));
			kd.setReceiver(rs.getString(3));
			kd.setAddress(rs.getString(4));
			kd.setTele(rs.getString(5));
			kd.setSender(rs.getString(6));
			//kd.setMydate(rs.getString(7));
			kd.setStatus(rs.getString(7));
			list.add(kd);
		}
		return list;

	}
	//根据快递编号获取快递信息
	/*public ResultSet SelectById(Kd kd){//根据ID查询,更新的时候用
		ResultSet rs=null;
		try {
			Conn conn=new Conn();
			Connection dbc=conn.getConn();
			String sql_selectId="select * from kd where id=?";
			PreparedStatement pst=dbc.prepareStatement(sql_selectId);
			pst.setInt(1, kd.getId());//从数据库获取到id值
			rs=pst.executeQuery();
			if (rs.next()){
				Kd kd1 = new Kd();
				kd1.setId(rs.getInt("id"));
				kd1.setKd_id(rs.getString("Kd_id"));
				kd1.setReceiver(rs.getString("receiver"));
				kd1.setAddress(rs.getString("address"));
				kd1.setTele(rs.getString("tele"));
				kd1.setSender(rs.getString("sender"));
				kd.setStatus(rs.getString("status"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rs;
	}*/
	//根据快递编号获取快递信息
	/*public Kd SelectById(String id ){//根据ID查询,更新的时候用
		ResultSet rs=null;
		try {
			Conn conn=new Conn();
			Connection dbc=conn.getConn();
			String sql_selectId="select * from kd where id=?";
			PreparedStatement pst=dbc.prepareStatement(sql_selectId);
			pst.setString(1,id);//从数据库获取到id值
			rs=pst.executeQuery();
			if (rs.next()){
				Kd kd = new Kd();
				kd.setId(rs.getInt("id"));
				kd.setKd_id(rs.getString("Kd_id"));
				kd.setReceiver(rs.getString("receiver"));
				kd.setAddress(rs.getString("address"));
				kd.setTele(rs.getString("tele"));
				kd.setSender(rs.getString("sender"));
				kd.setStatus(rs.getString("status"));
				return kd;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}*/
}

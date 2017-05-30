package com.servlet;

import com.bean.Kd;
import com.dao.KdDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.text.SimpleDateFormat;

/**
 * Created by WWWW on 2017/5/29.
 */
//@WebServlet(name = "kd_RegServlet")
@WebServlet(name = "kd_RegServlet", urlPatterns= "/servlet/kd_RegServlet")
public class kd_RegServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Kd kd=new Kd();
		kd.setKd_id(request.getParameter("kd_id"));
		kd.setReceiver(request.getParameter("receiver"));
		kd.setAddress(request.getParameter("address"));
		kd.setTele(request.getParameter("tele"));
		kd.setSender(request.getParameter("sender"));
//		kd.setMydate(request.getParameter("mydate"));
		kd.setStatus(request.getParameter("status"));
		KdDao dao=new KdDao();
		try {
			dao.insert(kd);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		request.getRequestDispatcher("kd_selectServlet").forward(request, response);
	}


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}
}

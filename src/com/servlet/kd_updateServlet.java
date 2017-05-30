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

/**
 * Created by WWWW on 2017/5/29.
 */
@WebServlet(name = "kd_updateServlet", urlPatterns= "/servlet/kd_updateServlet")
public class kd_updateServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		int id = Integer.parseInt(request.getParameter("id"));
		System.out.println(id);
		Kd kd=new Kd();
		kd.setKd_id(request.getParameter("kd_id"));
		kd.setReceiver(request.getParameter("receiver"));
		kd.setAddress(request.getParameter("address"));
		kd.setTele(request.getParameter("tele"));
		kd.setSender(request.getParameter("sender"));
		kd.setStatus(request.getParameter("status"));
		KdDao dao=new KdDao();
		try {
			dao.update(id, kd);
			System.out.println(kd.toString());
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}catch(SQLException e){
			e.printStackTrace();
		}
		response.sendRedirect("kd_selectServlet");
	  }
	}


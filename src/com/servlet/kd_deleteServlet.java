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
@WebServlet(name = "kd_deleteServlet", urlPatterns= "/servlet/kd_deleteServlet")
public class kd_deleteServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		Kd kd=new Kd();
		KdDao dao=new KdDao();
		try {
			dao.delete(Integer.parseInt(request.getParameter("id")));
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		response.sendRedirect("kd_selectServlet");
	}
}

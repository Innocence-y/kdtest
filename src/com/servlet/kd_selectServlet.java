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
import java.util.ArrayList;
import java.util.List;

/**
 * Created by WWWW on 2017/5/29.
 */
@WebServlet(name = "kd_selectServlet", urlPatterns= "/servlet/kd_selectServlet")
public class kd_selectServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		List<Kd> list=new ArrayList<Kd>();
		KdDao dao=new KdDao();
		try {
			list=dao.select();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		request.setAttribute("list",list);
		request.getRequestDispatcher("../kd_select.jsp").forward(request, response);


	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}
}

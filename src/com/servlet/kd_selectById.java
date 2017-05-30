/*
package com.servlet;

import com.bean.Kd;
import com.dao.KdDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;

*/
/**
 * Created by WWWW on 2017/5/30.
 *//*

@WebServlet(name = "kd_selectById")
public class kd_selectById extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			doPost(request,response);
			try {
				response.setContentType("text/html");
				PrintWriter out = response.getWriter();
				Kd kd = new Kd();
				KdDao dao = new KdDao();
				kd.setId(Integer.parseInt(request.getParameter("id")));
				ResultSet rs = (ResultSet) dao.SelectById("id");      //根据id进行查询
			}catch (Exception e){
			e.printStackTrace();
		}
	}
}
*/

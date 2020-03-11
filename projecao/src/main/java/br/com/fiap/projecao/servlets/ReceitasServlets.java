package br.com.fiap.projecao.servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import br.com.fiap.projecao.bean.Projecoes;

@WebServlet(urlPatterns = "/consultar")
public class ReceitasServlets extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		
		
		
		resp.setContentType("application/json");
		
		//resp.getWriter().write(new Gson().toJson(nomes));
	}
}

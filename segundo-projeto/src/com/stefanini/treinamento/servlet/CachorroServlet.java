package com.stefanini.treinamento.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.stefanini.treinamento.model.Cachorro;
@WebServlet("/cachorro")
public class CachorroServlet extends HttpServlet{
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("service");
		super.service(req, resp);
	}
	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("get");
		List<Cachorro> cachorros = new ArrayList<>();
		cachorros.add(new Cachorro("Bob",2));
		cachorros.add(new Cachorro("Aroldo",10));
		cachorros.add(new Cachorro("Tuco",3));
		for(Cachorro dog : cachorros) {
		resp.getWriter().append(dog.getNome()+" "+dog.getIdade()+" ");
		
		}
		resp.getWriter().append("     "+req.getContextPath());
		//resp.getWriter().append(cachorros.toString());
		
	}
	//Implementar o resto dos metodos HTTP
}

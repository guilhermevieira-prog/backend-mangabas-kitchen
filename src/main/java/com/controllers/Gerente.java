package com.controllers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/gerente")
public class Gerente extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.getRequestDispatcher("/views/gerente.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String nome = request.getParameter("nome");
        String prato = request.getParameter("prato");

        Gerente gerente = new Gerente();
        gerente.cadastrarPrato(prato);
        request.setAttribute("gerente", gerente);
        request.getRequestDispatcher("/views/gerente.jsp").forward(request, response);
    }

	private void cadastrarPrato(String prato) {
		// TODO Auto-generated method stub
		
	}
}
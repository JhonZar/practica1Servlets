package com.emergentes.practica1servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "RespJSON", urlPatterns = {"/RespJSON"})
public class RespJSON extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("application/json");
        PrintWriter out = response.getWriter();
        try {
            out.print("{\"empleados\":[");
            out.print("{\"nombre\":\"Jhonatan Luis\",\"apellidos\":\"Zarzuri Chauca\"},");
            out.print("{\"nombre\":\"Dolores\",\"apellidos\":\"Paredes\"},");
            out.print("{\"nombre\":\"Bruno\",\"apellidos\":\"Diaz\"},");
            out.print("{\"nombre\":\"Bruno\",\"apellidos\":\"Diaz\"},");
            out.print("]}");
        } finally {
            out.close();
        }
    }

}

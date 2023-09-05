package com.emergentes.practica1servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "RespXML", urlPatterns = {"/RespXML"})
public class RespXML extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/xml:charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            out.println("<?xml version=\"1.0\" encoding=\"utf-8\"?>");
            out.println("<CATALOGO>");
            out.println("<CD>");
            out.println("<TITULO>TINTA ROJA</TITULO>");
            out.println("<ARTISTA>ANDRES CALAMARO</ARTISTA>");
            out.println("<ORIGEN>AR</ORIGEN>");
            out.println("<PRECIO>5.90</PRECIO>");
            out.println("<ANO>2006</ANO>");
            out.println("</CD>");

            out.println("<CD>");
            out.println("<TITULO>LA LENGUA POPULAR</TITULO>");
            out.println("<ARTISTA>ANDRES CALAMARO</ARTISTA>");
            out.println("<ORIGEN>AR</ORIGEN>");
            out.println("<PRECIO>9.90</PRECIO>");
            out.println("<ANO>2007</ANO>");
            out.println("</CD>");
            out.println("</CATALOGO>");

        } finally {
            out.close();
        }
    }
}

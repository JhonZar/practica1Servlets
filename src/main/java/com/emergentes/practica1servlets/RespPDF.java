package com.emergentes.practica1servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

@WebServlet(name = "RespPDF", urlPatterns = {"/RespPDF"})
public class RespPDF extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("application/pdf");
        response.setHeader("Content-Disposition", "attachment;filename=JHONATANZARZURI.pdf");

        try {
            // Crear un objeto Document
            Document document = new Document();

            // Obtener el flujo de salida del servlet
            PdfWriter.getInstance(document, response.getOutputStream());

            // Abrir el documento
            document.open();

            // Agregar contenido al PDF
            Paragraph paragraph1 = new Paragraph("Respuesta generada desde un PDF");
            Paragraph paragraph2 = new Paragraph("JHONATAN LUIS ZARZURI CHAUCA");

            document.add(paragraph1);
            document.add(paragraph2);

            // Cerrar el documento
            document.close();
        } catch (DocumentException e) {
            e.printStackTrace();
        }
    }
}

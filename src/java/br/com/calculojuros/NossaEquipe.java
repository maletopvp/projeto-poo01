/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.calculojuros;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Info
 */
public class NossaEquipe extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Apresentação da Equipe</title>");
            out.println("<meta charset='UTF-8' name='viewport' content='width=device-width, initial-scale=1.0'>");
            out.println("</head>");
            out.println("<body>");
            out.println("<section>");
            out.println("<header>");
            out.println("<h1>Projeto 01: Apresentação da Equipe</h1>");
            out.println("</header>");
            out.println("<article>");
            out.println("<h1>Sobre a aplicação:</h1>");
            out.println("<p id='header'>Boa noite galera, esta é a apresentação da minha equipe e vamos disponibilizar para vocês uma aplicação com dois links, um para o cálculo de juros simples, e outro calculando juros composto.</p>");
            out.println("<a href='juros-simples.php'>Juros Simples</a> <a href='juros-composto.php'>Juros Composto </a>");
            out.println("</article>");
            out.println("<article>");
            out.println("<h2>Esta é a nossa equipe!:</h2>");
            out.println("<div>");
            out.println("<h2>Diogo Átila Rodrigues de Carvalho</h2>");
            out.println("<h2>Gustavo Carvalho</h2>");
            out.println("<h2>Mário Lannes</h2>");
            out.println("<h2>Rafael Marcos Sales</h2>");
            out.println("<h2>Thalisson Figueredo Pereira</h2>");
            out.println("</div>");
            out.println("</article>");
            out.println("</section>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

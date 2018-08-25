/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.calculojuros;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Info
 */
public class JSimples extends HttpServlet {

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
            out.println("<title>Cálculo Juros Simples</title>");            
            out.println("<meta charset='UTF-8' name='viewport' content='width=device-width, initial-scale=1.0'>");
            out.println("</head>");
            out.println("<body>");
            out.println("<section>");
            out.println("<header>");
            out.println("<h1>Calcular Juros Simples</h1>");
            out.println("</header>");
            out.println("<article>");
            out.println("<a href='home.php'>Voltar a página inicial</a>");
            out.println("<form method='get'>");
            out.println("<label for='valorSemJuros'>Insira o capital:</label><br/>");
            out.println("<input type='number' name='valorSemJuros' step='0.01' min='0.01' required maxlength='12'/><br/>");
            out.println("<label for='jurosCapital'>Insira o juros (max. 100%):</label><br/>");
            out.println("<input type='number' name='jurosCapital' step='0.01' max='100' required/><br/>");
            out.println("<label for='quantidadeMeses'>Insira o período de aplicação (meses, ex: 60):</label><br/>");
            out.println("<input type='number' name='quantidadeMeses' step='1' min='1' required/><br/>");
            out.println("<input type='submit' value='Calcular'/><br/>");
            out.println("</form>");
            if(request.getParameter("valorSemJuros") != null){
                try{
                    double capitalSemJuros = Double.parseDouble(request.getParameter("valorSemJuros"));
                    double juros = Double.parseDouble(request.getParameter("jurosCapital"))/100;
                    int quantidadeMeses = Integer.parseInt(request.getParameter("quantidadeMeses"));
                    String montante = new DecimalFormat("0.00").format(capitalSemJuros +(capitalSemJuros* quantidadeMeses)* juros);
                    String capitalComJuros = new DecimalFormat("0.00").format(capitalSemJuros * (juros) * quantidadeMeses);
                    String valorJurosMensal = new DecimalFormat("0.00").format(capitalSemJuros*(juros));
                    
                    
                    out.println("<h1>Resultado do Cálculo:</h1><hr>");
                    out.println("<p>Dinheiro acumulado em "+ quantidadeMeses +" meses (simples): " + montante + " reais.</p><hr>");
                    out.println("<p>Dinheiro Investido por mês: "+ capitalSemJuros +" reais.</p>");
                    out.println("<p>Juros Mensal: "+ valorJurosMensal +" reais.</p>");
                    out.println("<p>Total em Juros: "+ capitalComJuros +" reais.</p><hr>");
                    
                }catch(Exception ex){
                    out.println("<h1>Dados encontrados inválidos</h1>");
                }
            }
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

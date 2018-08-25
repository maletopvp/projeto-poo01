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
 * @author tHALISSON
 */
public class JComposto extends HttpServlet {

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
            out.println("<html lang='pt-BR'>");
            out.println("<head>");
            out.println("<title>Juros Composto - Projeto POO</title>");            
            out.println("<meta charset='utf-8'>");
            out.println("<meta charset='UTF-8' name='viewport' content='width=device-width, initial-scale=1.0'>");
            out.println("<link rel='stylesheet' href='css/style.css'>");
            out.println("<link rel='icon' type='image/png' href='img/icone.png'>");
            out.println("<link rel='stylesheet' href='https://stackpath.bootstrapcdn.com/bootstrap/4.1.2/css/bootstrap.min.css' integrity='sha384-Smlep5jCw/wG7hdkwQ/Z5nLIefveQRIY9nfy6xoR1uRYBtpZgI6339F5dgvm/e9B' crossorigin='anonymous'>");
            out.println("<link rel='stylesheet' href='https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css'>");
            out.println("</head>");
            out.println("<body>");
            out.println("<nav class='navbar navbar-expand-lg navbar-light bg-light shadow-sm fixed-top font-weight-bold'>");
            out.println("<div class='container'>");
            out.println("<div class='row'>");
            out.println("<a class='navbar-brand' href='#'>");
            out.println("<img class='logo' src='img/logo-centropaulasouza-corfatec.png'>");
            out.println("</a>");
            out.println("<button class='navbar-toggler' type='button' data-toggle='collapse' data-target='#collapsibleNavId' aria-controls='collapsibleNavId' aria-expanded='false' aria-label='Toggle navigation'>");
            out.println("<span class='navbar-toggler-icon'></span>");
            out.println("</button>");
            out.println("<div class='collapse navbar-collapse' id='collapsibleNavId'>");
            out.println("<ul class='navbar-nav mr-auto mt-2 mt-lg-0'>");
            out.println("<li class='nav-item'>");
            out.println("<a class='nav-link' href='index.html'>Home <span class='sr-only'>(current)</span> </a>");
            out.println("</li>");
            out.println("<li class='nav-item'>");
            out.println("<a class='nav-link' style='cursor:pointer' data-toggle='modal' data-target='#modelId'>Integrantes</a>");
            out.println("</li>");
            out.println("<li class='nav-item dropdown'>");
            out.println("<a class='nav-link dropdown-toggle' href='#' id='dropdownId' data-toggle='dropdown' aria-haspopup='true' aria-expanded='false'>Projeto POO</a>");
            out.println("<div class='dropdown-menu' aria-labelledby='dropdownId'>");
            out.println("<a class='dropdown-item' href='juros-simples.html'>Juros Simples</a>");
            out.println("<a class='dropdown-item' href='juros-composto.html'>Juros Composto</a>");
            out.println("</div>");
            out.println("</li>");
            out.println("</ul>");
            out.println("</div>");
            out.println("</div>");
            out.println("</div>");
            out.println("</nav>");
            out.println("<header class='espaco juros-composto'>");
            out.println("<div class='container'>");
            out.println("<div class='row'>");
            out.println("<div class='col-12 text-center texto-sombra text-white'>");
            out.println("<h1 class='font-weight-bold'>Juros Composto</h1>");
            out.println("<p class='font-weight-bold'>Projeto POO</p>");
            out.println("</div>");
            out.println("</div>");
            out.println("</div>");
            out.println("</header>");
            out.println("<section class='py-5'>");
            out.println("<div class='container'>");
            out.println("<div class='row pb-5'>");
            out.println("<div class='col-lg-6'>");
            out.println("<div class='card card-vermelho'>");
            out.println("<div class='card-body'>");
            out.println("<h3 class='card-title font-weight-bold'>Juros Composto</h3>");
            out.println("<form method='get'>");
            out.println("<div class='form-group p-2'>");
            out.println("<div class='pb-2'>");
            out.println("<label for='valorSemJuros'>Valor inicial do capital:</label>");
            out.println("<input type='text' name='valorSemJuros' id='' class='form-control' placeholder='' aria-describedby='helpId'>");
            out.println("</div>");
            out.println("<div class='pb-2'>");
            out.println("<label for='jurosCapital'>Taxa de Juros:</label>");
            out.println("<input type='text' name='jurosCapital' id='' class='form-control' placeholder='' aria-describedby='helpId'>");
            out.println("</div>");
            out.println("<div class='pb-2'>");
            out.println("<label for='quantidadeMeses'>Periodo de aplicação (meses):</label>");
            out.println("<input type='text' name='quantidadeMeses' id='' class='form-control' placeholder='' aria-describedby='helpId'>");
            out.println("</div>");
            out.println("</div>");
            out.println("<button type='submit' class='btn btn-danger text-white font-weight-bold'>Calcular</button>");
            out.println("</form>");
            out.println("</div>");
            out.println("</div>");
            out.println("</div>");
            if(request.getParameter("valorSemJuros") != null){
                try{
                    double capitalSemJuros = Double.parseDouble(request.getParameter("valorSemJuros"));
                    double juros = Double.parseDouble(request.getParameter("jurosCapital"));
                    int quantidadeMeses = Integer.parseInt(request.getParameter("quantidadeMeses"));
                    double montante = capitalSemJuros * Math.pow((1 + juros/100),quantidadeMeses);
                    String valorInicial = new DecimalFormat("0.00").format(capitalSemJuros);
                    out.println("<div class='col-lg-6'>");
                    out.println("<div class='card card-vermelho'>");
                    out.println("<div class='card-body'>");
                    out.println("<h3 class='card-title font-weight-bold pb-2'>Resultados</h3>");
                    out.println("<div class='p-2'>");
                    out.println("<p>");
                    out.println("<span class='font-weight-bold text-vermelho'>Valor inicial: </span>R$ " + valorInicial);
                    out.println("</p>");
                    out.println("<p>");
                    out.println("<span class='font-weight-bold text-vermelho'>Total ganho em Juros: </span>R$ " + String.valueOf(new DecimalFormat("0.00").format(montante - capitalSemJuros)));
                    out.println("</p>");
                    out.println("<hr>");
                    out.println("<p>");
                    out.println("<span class='font-weight-bold text-vermelho'>Montante acumulado em "+ quantidadeMeses +" meses:  </span>R$ " + String.valueOf(new DecimalFormat("0.00").format(montante)));
                    out.println("</p>");
                    out.println("</div>");
                    out.println("</div>");
                    out.println("</div>");
                    out.println("</div>");

                }catch(Exception ex){
                    out.println("<br/><h1>Dados encontrados inválidos</h1>");
                }
            }
            out.println("</div>");
            out.println("</div>");
            out.println("</section>");
            out.println("<footer class='cor-rodape'>");
            out.println("<div class='container'>");
            out.println("<div class='row'>");
            out.println("<div class='col-12 py-3 text-center'>");
            out.println("<img class='rodape-img' src='img/SaoPaulo-Logo-02.png'>");
            out.println("</div>");
            out.println("</div>");
            out.println("</div>");
            out.println("</footer>");
            out.println("<div class='modal fade' id='modelId' tabindex='-1' role='dialog' aria-labelledby='modelTitleId' aria-hidden='true'>");
            out.println("<div class='modal-dialog' role='document'>");
            out.println("<div class='modal-content'>");
            out.println("<div class='modal-header'>");
            out.println("<h4 class='modal-title' id='modelTitleId'>Integrantes do Grupo</h4>");
            out.println("<button type='button' class='close' data-dismiss='modal' aria-label='Close'>");
            out.println("<span aria-hidden='true'>&times;</span>");
            out.println("</button>");
            out.println("</div>");
            out.println("<div class='modal-body px-4 pb-2'>");
            out.println("<p class='font-weight-bold'>");
            out.println("<i class='fa fa-angle-right'></i> Diogo Átila Rodrigues de Carvalho");
            out.println("</p>");
            out.println("<p class='font-weight-bold'>");
            out.println("<i class='fa fa-angle-right'></i> Gustavo Carvalho");
            out.println("</p>");
            out.println("<p class='font-weight-bold'> ");
            out.println("<i class='fa fa-angle-right'></i> Rafael Marcos Sales");
            out.println("</p>");
            out.println("<p class='font-weight-bold'>");
            out.println("<i class='fa fa-angle-right'></i> Mário César Lanes Júnior");
            out.println("</p>");
            out.println("<p class='font-weight-bold'>");
            out.println("<i class='fa fa-angle-right'></i> Thalisson Figueredo Pereira");
            out.println("</p>");
            out.println("<hr>");
            out.println("<p class='font-weight-bold text-center'>");
            out.println("<i class='fa fa-github'></i>");
            out.println("<a href='https://github.com/maletopvp/projeto-poo01' rel='noreffer'>https://github.com/maletopvp/projeto-poo01</a>");
            out.println("</p>");
            out.println("</div>");
            out.println("</div>");
            out.println("</div>");
            out.println("</div>");
            out.println("<script src='https://code.jquery.com/jquery-3.3.1.slim.min.js' integrity='sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo' crossorigin='anonymous'></script>");
            out.println("<script src='https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js' integrity='sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49' crossorigin='anonymous'></script>");
            out.println("<script src='https://stackpath.bootstrapcdn.com/bootstrap/4.1.2/js/bootstrap.min.js' integrity='sha384-o+RDsa0aLu++PJvFqy8fFScvbHFLtbvScb8AjopnFD+iEQ7wo/CG0xlczd+2O/em' crossorigin='anonymous'></script>");
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

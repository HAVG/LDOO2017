package com.ldoo.servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class MiniServlet extends HttpServlet {

    private void processRequest(HttpServletRequest request,
                                HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String name = request.getParameter("txt-name");
        String saludo = "Saludo";

        try (PrintWriter out = response.getWriter()) {

            for(int i=0;i < name.length();i++)
            {
                if(name.charAt(i)=='<'||name.charAt(i)=='>'||name.charAt(i)=='='
                        ||name.charAt(i)=='/')
                {
                    name = "Buen intento jajaja";
                }
            }
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head><link rel=\"stylesheet\" href=\"styles.css\">");
            out.println("<title>" + saludo +"</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>" + name+ "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}

package com.mysshell.ldoo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URLEncoder;

/**
 * Created by diego and hector on 17/02/17.
 */
@WebServlet(name = "Registro")
public class Registro extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
        String name = URLEncoder.encode(request.getParameter("txt-name"));
        String email = URLEncoder.encode(request.getParameter("txt-email"));
        String user = URLEncoder.encode(request.getParameter("txt-user"));
        String password = request.getParameter("password");
        int bm = Integer.parseInt(request.getParameter("select-bm"));
        boolean amI18 = Boolean.parseBoolean(request.getParameter("chk-18"));
        String gender = request.getParameter("gender");
        String whoAmI = URLEncoder.encode(request.getParameter("whoami"));


    }

    /*protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {

    }*/
}

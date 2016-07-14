package Beans;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.*;
import javax.servlet.http.*;
import Beans.NewUser;

/**
 *
 * @author juliusabate
 */
public class ProcessForm extends HttpServlet {

    private String fname;
    private String lname;
    private String email;
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
        fname = request.getParameter("fname");
        lname = request.getParameter("lname");
        email = request.getParameter("email");
        NewUser user = new NewUser(fname,lname,email);
        request.setAttribute("user", user);
        getServletContext().getRequestDispatcher("/intro.jsp").forward(request,response);
        }
    
    }

   
  



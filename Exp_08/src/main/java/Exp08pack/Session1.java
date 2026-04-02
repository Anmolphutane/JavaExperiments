package Exp08pack;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.WebServlet;
import java.io.*;

@WebServlet("/Session1")
public class Session1 extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {

        response.setContentType("text/html");

        // Create session
        HttpSession session = request.getSession();
        session.setAttribute("username", "Anmol");

        PrintWriter out = response.getWriter();

        out.println("<html><body>");
        out.println("<h2>Session Created Successfully</h2>");
        out.println("<a href='Session2'>Go to Session2</a>");
        out.println("</body></html>");
    }
}
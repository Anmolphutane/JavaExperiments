package Exp08pack;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.WebServlet;
import java.io.*;

@WebServlet("http://localhost:8082/Exp_08/Cookies1")
public class Cookies1 extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {

        response.setContentType("text/html");

        // ✅ Correct class name
        Cookie c = new Cookie("username", "Anmol");
        response.addCookie(c);

        PrintWriter out = response.getWriter();

        out.println("<html><body>");
        out.println("<h2>Cookie Created</h2>");
        out.println("<a href='Cookies2'>Go to Cookie2</a>");
        out.println("</body></html>");
    }
}
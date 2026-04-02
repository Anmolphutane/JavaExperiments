package Exp08pack;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.WebServlet;
import java.io.*;

@WebServlet("/Session2")
public class Session2 extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {

        response.setContentType("text/html");

        HttpSession session = request.getSession(false); // get existing session

        PrintWriter out = response.getWriter();

        out.println("<html><body>");

        if (session != null) {
            String name = (String) session.getAttribute("username");

            if (name != null) {
                out.println("<h2>Welcome " + name + "</h2>");
            } else {
                out.println("<h2>No Data Found in Session</h2>");
            }
        } else {
            out.println("<h2>No Session Found</h2>");
        }

        out.println("</body></html>");
    }
}
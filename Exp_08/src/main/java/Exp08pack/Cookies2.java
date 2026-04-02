package Exp08pack;


import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

@WebServlet("/Cookie2")
public class Cookies2 extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        Cookie[] cookies = request.getCookies();

        out.println("<html><body>");

        if (cookies != null) {
            for (Cookie c : cookies) {
                if (c.getName().equals("username")) {
                    out.println("<h2>Welcome " + c.getValue() + "</h2>");
                }
            }
        } else {
            out.println("<h2>No Cookies Found</h2>");
        }

        out.println("</body></html>");
    }
}
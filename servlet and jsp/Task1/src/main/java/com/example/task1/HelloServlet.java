package com.example.task1;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        int factorial=1;
        out.println("<html><body>");
        out.println("<h1> factorial number: </h1>");
        out.println("<table border=1  cellpadding=8>");
        out.println("<tr>");
        out.println( "<th bgcolor=#f2f2f2>Number</th>");
        out.println( "<th bgcolor=#f2f2f2>Factorial</th>");
        out.println("</tr>");
        for (int i = 1; i <= 10; i++) {

            factorial*=i;
            out.println("<tr>");
            out.println( "<td bgcolor=#ffffff>"+i+"</th>");
            out.println( "<td bgcolor=#ffffff>"+factorial+"</th>");
            out.println("</tr>");

        }

        out.println("</table>");
        out.println("</body></html>");
    }

    public void destroy() {
    }
}
package ru.geekbrains;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(name = "OrderServlet", urlPatterns = "/catalog/order")

public class OrderHttpServlet extends HttpServlet {

    private static Logger logger = LoggerFactory.getLogger(OrderHttpServlet.class);

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {



        logger.info("OrderServlet");
        resp.getWriter().printf("<h1>OrderServlet</h1>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        logger.info("OrderServlet");

        resp.getWriter().printf("<h1>OrderServlet</h1>");
    }
}
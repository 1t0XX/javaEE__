package ru.geekbrains;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(name = "CartServlet", urlPatterns = "/cart")
public class CartHttpServlet extends HttpServlet {

    private static Logger logger = LoggerFactory.getLogger(CartHttpServlet.class);

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {



        logger.info("Cart Servlet");
        resp.getWriter().printf("<h1>Корзина</h1>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        logger.info("CartServlet");

        resp.getWriter().printf("<h1>Корзина</h1>");
    }
}
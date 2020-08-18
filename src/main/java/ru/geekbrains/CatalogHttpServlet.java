package ru.geekbrains;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(name = "CatalogServlet", urlPatterns = "/catalog/*")

public class CatalogHttpServlet extends HttpServlet {

    private static Logger logger = LoggerFactory.getLogger(CatalogHttpServlet.class);

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {



        logger.info("CatalogServlet");
        resp.getWriter().printf("<h1>CatalogServlet</h1>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        logger.info("CatalogServlet");

        resp.getWriter().printf("<h1>CatalogServlet</h1>");
    }
}
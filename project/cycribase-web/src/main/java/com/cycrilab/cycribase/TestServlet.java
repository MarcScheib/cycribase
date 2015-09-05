package com.cycrilab.cycribase;

import org.slf4j.Logger;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "TestServlet", urlPatterns = {"/TestServlet"})
public class TestServlet extends HttpServlet {
    private static final long serialVersionUID = -7238481086155456650L;

    @Inject
    protected Logger logger;

    @Override
    protected final void doGet(HttpServletRequest request, HttpServletResponse response) {
        try (ServletOutputStream outputStream = response.getOutputStream()) {
            this.logger.info("Oha");
            outputStream.print("Hello World");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
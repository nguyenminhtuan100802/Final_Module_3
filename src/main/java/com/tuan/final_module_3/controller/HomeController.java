package com.tuan.final_module_3.controller;

import com.tuan.final_module_3.model.entity.NguoiThueTro;
import com.tuan.final_module_3.model.service.INguoiThueTroService;
import com.tuan.final_module_3.model.service.impl.NguoiThueTroService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(urlPatterns = {"/home"})
public class HomeController extends HttpServlet {
    INguoiThueTroService nguoiThueTroService = new NguoiThueTroService();
    RequestDispatcher requestDispatcher;
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "add":
                requestDispatcher = req.getRequestDispatcher("WEB-INF/view/form.jsp");
                requestDispatcher.forward(req, resp);
                break;
            case "delete":
                nguoiThueTroService.deleteUserById(Integer.parseInt(req.getParameter("id")));
                req.setAttribute("nguoiThueTroList", nguoiThueTroService.findAll());
                requestDispatcher = req.getRequestDispatcher("WEB-INF/view/home.jsp");
                requestDispatcher.forward(req, resp);
                break;
            default:
                req.setAttribute("nguoiThueTroList", nguoiThueTroService.findAll());
                requestDispatcher = req.getRequestDispatcher("WEB-INF/view/home.jsp");
                requestDispatcher.forward(req, resp);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "add":

                req.setAttribute("nguoiThueTroList", nguoiThueTroService.findAll());
                requestDispatcher = req.getRequestDispatcher("WEB-INF/view/home.jsp");
                requestDispatcher.forward(req, resp);
                break;
        }
    }
}

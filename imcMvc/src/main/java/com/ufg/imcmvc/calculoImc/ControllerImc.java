/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ufg.imcmvc.calculoImc;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Wallace
 */
@WebServlet("/imc")
public class ControllerImc extends HttpServlet {

    private String valor(
            HttpServletRequest req, String param, String padrao) {

        String result = req.getParameter(param);
        if (result == null) {
            result = padrao;
        }
        return result;
    }

    private int toInt(
            HttpServletRequest req, String param) {
        String padrao = null;

        return Integer.parseInt(valor(req, param, padrao));
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        float peso = toInt(req, "valorpeso");
        float altura = toInt(req, "valoraltura");
        int sexo = toInt(req, "valorsexo");

        float resultadocalculo = calculadoraImc.calcular(altura, peso, sexo);

        //Passando parâmetro para o JSP.
        req.setAttribute(
                "calculo",
                resultadocalculo);

        req.getRequestDispatcher("index.jsp").forward(req, resp);
    }
}

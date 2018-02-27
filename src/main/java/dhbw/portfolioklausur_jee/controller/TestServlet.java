package dhbw.portfolioklausur_jee.controller;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import dhbw.portfolioklausur_jee.ejb.BenutzerBean;
import dhbw.portfolioklausur_jee.jpa.Benutzer;
import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author larau
 */
@WebServlet(urlPatterns = {"/index.html"})
public class TestServlet extends HttpServlet {

    public static final String URL = "/index.html";
    
    @EJB
    BenutzerBean benutzerBean;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        Benutzer b = new Benutzer();
        b.setBenutzername("LaWe");
        b.setNachname("Weber");
        b.setVorname("Lara");
        b.setEmail("lara.u.weber@web.de");
        b.setStrasse("Freiburger Str. ");
        b.setHausnr(6);
        b.setOrt("Waldbronn");
        b.setLand("Deutschland");
        b.setPlz(76337);
        b.setTelefonnr("015156454");
        b.setPasswordHash("pswrd");
        
        
        b = this.benutzerBean.saveNew(b);
        
        request.getRequestDispatcher("/WEB-INF/index.jsp").forward(request, response);
    }
}

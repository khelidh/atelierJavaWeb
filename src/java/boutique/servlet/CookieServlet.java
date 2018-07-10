/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boutique.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Administrateur
 */
@WebServlet(name = "CookieServlet", urlPatterns = {"/CookieServlet"})
public class CookieServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        String mdp = req.getParameter("mdp");
        
        resp.addCookie(new Cookie("mdp", "123"));
        resp.addCookie(new Cookie("categoriePref", "SF"));
        resp.addCookie(new Cookie("dernierAchat", "KFP"));
        resp.addCookie(new Cookie("dernierePageVisitee", "lien12"));
        
        Cookie cookie = new Cookie("parfum", "vanille");
        cookie.setValue("chocolat");
        cookie.setMaxAge(1000000);
        resp.addCookie(cookie);
        
        //tableau des cookies -> itération dessus
//        req.getCookies();
    }
    
    
    
}

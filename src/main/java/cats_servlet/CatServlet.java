package cats_servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CatServlet extends HttpServlet {

    List<Cat> listOfCats = new ArrayList<>();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

            if(null != req.getParameter("btn1")) {

                String catName = req.getParameter("name");
                String catRace = req.getParameter("race");
                String catColor = req.getParameter("color");
                listOfCats.add(new Cat(catName, catRace, catColor));
                resp.sendRedirect("cats");
            }
            else if(null != req.getParameter("btn3")){
                String searchColor = req.getParameter("search");
                List<Cat> resultList = new ArrayList<>();
                for(Cat c : listOfCats){
                    if(c.getColor().equals(searchColor)){
                        resultList.add(c);
                    }
                }
                req.setAttribute("allcats",resultList);
                req.getRequestDispatcher("all_cats.jsp").forward(req,resp);

            }
            else{
                req.setAttribute("allcats",listOfCats);
                req.getRequestDispatcher("all_cats.jsp").forward(req,resp);
            }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            req.getRequestDispatcher("index.jsp").forward(req, resp);
    }
}

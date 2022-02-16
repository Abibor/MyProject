package servlets;

import entitles.Array;
import model.Model;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;

public class AddServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("views/add.jsp");
        requestDispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //Вытащим из запроса параметры
        String first = req.getParameter("first");
        String second = req.getParameter("second");
        String third = req.getParameter("third");
        String fourth = req.getParameter("fourth");
        String fifth = req.getParameter("fifth");
        int[] myArray;

        if (!first.isEmpty() && !second.isEmpty() && !third.isEmpty() && !fourth.isEmpty() && !fifth.isEmpty()){
            //Создаем класс Array
            Array array = new Array(first, second, third, fourth, fifth);
            //Обращаемся к единственному объекту model
            Model model = Model.getInstance();
            //добавляем объект массива array в БД
            model.add(array);

            myArray = array.getArray();
            req.setAttribute("myArray", Arrays.toString(myArray));
        }
        doGet(req, resp);
    }
}
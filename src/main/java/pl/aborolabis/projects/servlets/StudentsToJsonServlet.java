package pl.aborolabis.projects.servlets;

import pl.aborolabis.projects.elements.StudentsServices;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "tojson", value="/tojson")
public class StudentsToJsonServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        StudentsServices studentsServices = new StudentsServices();
        studentsServices.generateListOfStudents();

        String studentsToJSON = studentsServices.getStudentsToJSON();

        PrintWriter out = resp.getWriter();

        out.println("<html>\n" +
                "<head>\n" +
                "    <title>School Informator</title>\n" +
                "</head>\n" +
                "<link rel=\"Stylesheet\" type=\"text/css\" href=\"Style.css\" />\n" +
                "<body>\n" +
                "<div class=\"main\">\n" +
                "<h1 class=\"centre\">School informator</h1>\n" +
                "    <br/><div class=\"centre\">\n" +
                "    <img src=\"https://www.westlothian.gov.uk/media/13044/School-Holidays-Banner/image/school-holidays-banner.jpg\" alt=\"schoolPicture\"/><br/><br/>\n"+
                "    <p>Students in JSON:</p> <br/>" + studentsToJSON + "</div></body> </html>");

    }
}


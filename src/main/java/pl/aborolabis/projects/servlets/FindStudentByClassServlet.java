package pl.aborolabis.projects.servlets;

import pl.aborolabis.projects.elements.Student;
import pl.aborolabis.projects.elements.StudentsServices;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet(name = "findbyclass", value = "/findbyclass")
public class FindStudentByClassServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setContentType("text/html");

        int classNumber = Integer.parseInt(req.getParameter("classNumber"));
        String classLetter = req.getParameter("classLetter");

        StudentsServices studentsServices = new StudentsServices();
        studentsServices.generateListOfStudents();
        List<Student> studentByHisClass = studentsServices.findStudentByHisClass(classNumber, classLetter);

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
                "    <p>Students found by class (" + classNumber + classLetter + "):</p>" +
                "<table id=\"tablee\">\n" +
                "<tr>\n" +
                "<th>Name:</th>\n" +
                "<th>Class Number:</th>\n" +
                "<th>Class Letter:</th>\n" +
                "<th>Number of absence: </th>\n" +
                "</tr>");

        for(Student student : studentByHisClass){
            out.println("    <tr>\n" +
                    "        <td>" + student.getName() +"</td>\n" +
                    "        <td>" + student.getClassNumber() + "</td>\n" +
                    "        <td>" + student.getClassLetter() + "</td>\n" +
                    "        <td>" + student.getNumberOfAbsence() +"</td>\n" +
                    "    </tr>");
        }

        out.println("</table></div></body>\n" +
                "</html>");

    }
}
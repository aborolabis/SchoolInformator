package pl.aborolabis.projects.elements;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StudentsServices {

    private List<Student> listOfStudents = new ArrayList<>();

    public List<Student> addNewStudent(Student student){
        listOfStudents.add(student);
        return listOfStudents;
    }

    public List<Student> removeStudentByHisName(String name){
        List<Student> studentByHisName = findStudentByHisName(name);
        int index = 0;
        for(int i=0; i<studentByHisName.size(); i++){
            index = i;
        }
        listOfStudents.remove(index);
        return listOfStudents;
    }

    public List<Student> getListOfStudents() {
        return listOfStudents;
    }

    public List<Student> findStudentByHisName(String name){
        List<Student> foundStudents = listOfStudents.stream().filter(student -> student.getName().contains(name)).collect(Collectors.toList());
        return foundStudents;
    }

    public List<Student> findStudentByHisClass(int classNumber, String classLetter){
        List<Student> foundStudents = listOfStudents.stream().filter(st -> st.getClassNumber() == classNumber
                && st.getClassLetter().equals(classLetter)).collect(Collectors.toList());
        return foundStudents;
    }

    public String getStudentsToJSON(){
        Gson gson = new Gson();
        String json = "";
        for(Student student : listOfStudents){
            json += gson.toJson(student) + "<br/>";
        }
        return json;
    }

    public void generateListOfStudents(){
        Student student1 = new Student("Eric Wayne", 3, "a", 0);
        listOfStudents.add(student1);
        Student student2 = new Student("Christina Pew", 3, "a", 5);
        listOfStudents.add(student2);
        Student student3 = new Student("Michael Thomson", 3, "a", 2);
        listOfStudents.add(student3);
        Student student4 = new Student("Dave Dail", 3, "b", 6);
        listOfStudents.add(student4);
        Student student5 = new Student("Marica Gomez", 3, "b", 10);
        listOfStudents.add(student5);
        Student student6 = new Student("Robert White", 3, "b", 1);
        listOfStudents.add(student6);
    }

}

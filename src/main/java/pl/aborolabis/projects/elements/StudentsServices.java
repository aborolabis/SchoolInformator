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

}

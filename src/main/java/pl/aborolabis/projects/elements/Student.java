package pl.aborolabis.projects.elements;

public class Student {

    private String name;
    private int classNumber;
    private String classLetter;
    private int numberOfAbsence;

    public Student() {
    }

    public Student(String name, int classNumber, String classLetter, int numberOfAbsence) {
        this.name = name;
        this.classNumber = classNumber;
        this.classLetter = classLetter;
        this.numberOfAbsence = numberOfAbsence;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getClassNumber() {
        return classNumber;
    }

    public void setClassNumber(int classNumber) {
        this.classNumber = classNumber;
    }

    public String getClassLetter() {
        return classLetter;
    }

    public void setClassLetter(String classLetter) {
        this.classLetter = classLetter;
    }

    public int getNumberOfAbsence() {
        return numberOfAbsence;
    }

    public void setNumberOfAbsence(int numberOfAbsence) {
        this.numberOfAbsence = numberOfAbsence;
    }

}

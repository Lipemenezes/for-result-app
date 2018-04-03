package model;

/**
 * Created by Felipe on 02/04/2018.
 */

public class Exam {
    private String name;
    private Double grade;

    public Exam() {

    }

    public Exam(String name, Double grade) {
        this.name = name;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getGrade() {
        return grade;
    }

    public void setGrade(Double grade) {
        this.grade = grade;
    }
}

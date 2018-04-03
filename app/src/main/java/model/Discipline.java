package model;

/**
 * Created by Felipe on 02/04/2018.
 */

public class Discipline {
    private String name;
    private String teacher;

    public Discipline() {

    }

    public Discipline(String name, String teacher) {
        this.name = name;
        this.teacher = teacher;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }
}

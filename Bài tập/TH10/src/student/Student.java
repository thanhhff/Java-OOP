package student;

import java.util.Date;
import java.util.Scanner;

public class Student {
    private int studentID;
    private String studentName;
    private Date birthday;
    private float gpa;

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public float getGpa() {
        return gpa;
    }


    public void setGpa(float gpa) {
        try {
            isGpa(gpa);
            this.gpa = gpa;
        } catch (IllegalGPAException e) {
            e.printStackTrace();
        }
    }

    public boolean isGpa(float gpa) throws IllegalGPAException {
        if (gpa > 4.0f || gpa < 0f) {
            throw (new IllegalGPAException("Not is a gpa"));
        }
        return true;
    }
}

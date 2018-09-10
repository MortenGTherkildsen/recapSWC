package dk.mth;

import java.util.ArrayList;

public class Students {

    ArrayList<Student> studerende = new ArrayList<>();


    public void listAllStudents(){
        for (Student s:studerende
        ) {
            System.out.println(s.studentNumber + " " + s.navn);

        }

    }
    public Student getStudentByStudentNumber(int ID){

        for (Student t:studerende
                ) {
            if(t.studentNumber==ID) {
                return t;
            }
        }
        return null;

    }
}

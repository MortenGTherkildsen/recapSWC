package dk.mth;

import java.util.ArrayList;

public class Students {

    ArrayList<Student> studerende;


    public void listAllStudents(){
        for (Student s:studerende
        ) {
            System.out.println(s.navn);

        }
    }
}

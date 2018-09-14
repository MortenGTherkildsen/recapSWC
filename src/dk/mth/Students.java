package dk.mth;

import java.util.ArrayList;
import java.util.Scanner;

public class Students {

    ArrayList<Student> studerende = new ArrayList<>();


    public void listAllStudents(){
        for (Student s:studerende
        ) {
            System.out.println(s.studentNumber + " " + s.navn);

        }

    }

    public void addStudent(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Opret studerende");
        int nytStudieID = studerende.size()+1;

        System.out.println("Navn");
        String navn = sc.nextLine();

        studerende.add(new Student(nytStudieID, navn));

        listAllStudents();
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

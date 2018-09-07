package dk.mth;

import java.util.ArrayList;
import java.util.Scanner;

public class Kursus {

    int kursusNumber;
    String navn;
    ArrayList<Teacher> undervisere = new ArrayList<>();
    ArrayList<Student> studerende = new ArrayList<>();


    public Kursus() {

    }

    public void addTeacher(Teachers teachers){


        teachers.listAllTeachers();
        System.out.println("Hvilken underviser vil du tilføje til kurset?");

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println("Du har valgt " + teachers.getTeacherByID(x).navn);
        undervisere.add(teachers.getTeacherByID(x));
    }
}

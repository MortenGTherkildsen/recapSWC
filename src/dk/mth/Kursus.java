package dk.mth;

import java.util.ArrayList;
import java.util.Scanner;

public class Kursus {

    int kursusNumber;
    String navn;
    ArrayList<Teacher> undervisere = new ArrayList<>();
    ArrayList<Student> studerende = new ArrayList<>();
    int svar =1;
    int svar2=1;

    public Kursus() {

    }

    public void addTeacher(Teachers teachers){

        while (svar==1) {
            teachers.listAllTeachers();
            System.out.println("Hvilken underviser vil du tilføje til kurset?");

            Scanner sc = new Scanner(System.in);
            int x = sc.nextInt();
            System.out.println("Du har valgt " + teachers.getTeacherByID(x).navn);
            undervisere.add(teachers.getTeacherByID(x));

            System.out.println("vil du tilføje flere lærere til kurset?");
            System.out.println("1: ja");
            System.out.println("2: nej");
            svar=sc.nextInt();

        }

    }

    public void addStudents(Students students){
        while (svar2==1) {
            System.out.println("liste med studerende:");
            students.listAllStudents();
            System.out.println("tilføj studerende");
            Scanner sc = new Scanner(System.in);
            int x = sc.nextInt();
            System.out.println("Du har valgt " + students.getStudentByStudentNumber(x).navn);
            studerende.add(students.getStudentByStudentNumber(x));

            System.out.println("vil du tilføje flere studerende til kurset?");
            System.out.println("1: ja");
            System.out.println("2: nej");
            svar2=sc.nextInt();
        }

    }
}

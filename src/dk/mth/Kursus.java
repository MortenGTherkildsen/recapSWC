package dk.mth;

import java.util.ArrayList;
import java.util.Scanner;

public class Kursus {

    int kursusNumber;
    String navn;
    String eksamen;
    ArrayList<Teacher> undervisere = new ArrayList<>();
    ArrayList<Student> studerende = new ArrayList<>();
    int svar =1;
    int svar2=1;

    public Kursus() {

    }

    public void listAllStudents(){
        for(int x=0; x<studerende.size(); x++){
            System.out.println(x+1 + " " + studerende.get(x).navn);
        }
    }
    public void deleteStudentsFromKursus(){

        int svar2 = 1;
        while(svar2==1) {
            listAllStudents();
            Scanner sc = new Scanner(System.in);
            int svar = sc.nextInt();
            studerende.remove(svar - 1);

            System.out.println("vil du fjerne flere elever fra kurset?");
            System.out.println("1: ja");
            System.out.println("2: nej");
            svar2=sc.nextInt();
        }
    }


    public String eleverToString(){
        String test = "";

        for (Student s:studerende
             ) {test = test + s.navn + ", ";

        }
        return test;
    }

    public String undervisereToString(){

        String test = "";

        for (Teacher t:undervisere
             ) {test = test + t.navn + ", ";
        }
        return test;
    }
    public void addTeacher(Teachers teachers){

        svar = 1;
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
        svar2 = 1;
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

    public void changeInfoOmEksamen(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Info om eksamen er nu: " + eksamen);
        System.out.println("Skriv ny info om eksamen:");
        eksamen = sc.nextLine();
    }
}

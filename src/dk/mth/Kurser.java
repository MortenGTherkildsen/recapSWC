package dk.mth;

import java.util.ArrayList;
import java.util.Scanner;

public class Kurser {

    ArrayList<Kursus> kurser;

    public void listAllKurser(){
        for (Kursus k:kurser
             ) {
            System.out.println(k.navn);

        }
    }

    public void addKursus(Teachers teachers, Students students){

        Kursus kursus = new Kursus();

        Scanner sc = new Scanner(System.in);

        System.out.println("Kursus-navn:");
        kursus.navn = sc.nextLine();


        while (kursus.undervisere)
        System.out.println("Liste med tilgængelige undervisere:");
        teachers.listAllTeachers();
        System.out.println("Tilføj underviser:");
        kursus.undervisere.add(teachers.teachers[sc.nextInt()]);


        System.out.println("Liste med elever:");
        students.listAllStudents();
        System.out.println("Tilføj studerende");


    }
}

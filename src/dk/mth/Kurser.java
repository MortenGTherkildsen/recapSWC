package dk.mth;

import java.util.ArrayList;
import java.util.Scanner;

public class Kurser {

    ArrayList<Kursus> kurser = new ArrayList<>();

    public void listAllKurser(){
        if(kurser.size()>0) {
            System.out.println("Kursusliste:");
            for (Kursus k : kurser
            ) {
                System.out.println(k.navn);
            }
        }
        else if(kurser.size()==0){
            System.out.println("Kursuslisten er tom.");
        }
    }

    public void addKursus(Teachers teachers, Students students){

        Kursus kursus = new Kursus();

        kurser.add(kursus);
        Scanner sc = new Scanner(System.in);

        System.out.println("Kursus-navn:");
        kursus.navn = sc.nextLine();

        System.out.println("Tilføj underviser:");

        kursus.addTeacher(teachers);


        System.out.println("Liste med elever:");
        students.listAllStudents();
        System.out.println("Tilføj studerende");



    }
}

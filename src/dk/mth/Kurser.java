package dk.mth;

import java.util.ArrayList;
import java.util.Scanner;

public class Kurser {

    ArrayList<Kursus> kurser = new ArrayList<>();

    public void listAllKurser(){
        if(kurser.size()>0) {
            System.out.println("Kursusliste:");
            for (int x=0; x<kurser.size(); x++){

                System.out.println(x+1 + "  " + kurser.get(x).navn);
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

        kursus.navn = sc.next();

        System.out.println("Tilføj underviser:");

        kursus.addTeacher(teachers);


        kursus.addStudents(students);



    }
    public void deleteKursus(){
        listAllKurser();

        Scanner sc = new Scanner(System.in);
        int svar=sc.nextInt();

        kurser.remove(svar-1);

    }
}

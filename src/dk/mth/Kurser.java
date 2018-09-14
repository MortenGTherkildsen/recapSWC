package dk.mth;

import java.util.ArrayList;
import java.util.Scanner;

public class Kurser {

    ArrayList<Kursus> kurser = new ArrayList<>();

    public void listAllKurser(){
        if(kurser.size()>0) {
            System.out.println("Kursusliste:");
            for (int x=0; x<kurser.size(); x++){

                System.out.println(x+1 + "  " + kurser.get(x).navn + " Info om eksamen: " + kurser.get(x).eksamen + " Undervisere/Eksaminatorer: " + kurser.get(x).undervisereToString() + "  Elever:" + kurser.get(x).eleverToString());
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

        System.out.println("Info om eksamen");

        kursus.eksamen = sc.next();

    }
    public void deleteKursus(){
        listAllKurser();

        Scanner sc = new Scanner(System.in);
        int svar=sc.nextInt();

        kurser.remove(svar-1);

    }
    public void addStudentsToKursus(Students students){
        System.out.println("Hvilket kursus vil du tilføje elever til?");
        listAllKurser();
        Scanner sc = new Scanner(System.in);
        int svar = sc.nextInt();
        kurser.get(svar-1).addStudents(students);

    }
    public void deleteStudentsFromKursus(){
        System.out.println("Fra hvilket kursus vil du slette elever?");
        listAllKurser();
        Scanner sc = new Scanner(System.in);
        int svar = sc.nextInt();
        Kursus k = kurser.get(svar-1);
        k.deleteStudentsFromKursus();
    }
    public void changeInfoOmEksamen(){
        System.out.println("For hvilket kursus vil du ændre info om eksamen?");
        listAllKurser();
        Scanner sc = new Scanner(System.in);
        int svar = sc.nextInt();
        Kursus k = kurser.get(svar-1);
        k.changeInfoOmEksamen();
    }
}

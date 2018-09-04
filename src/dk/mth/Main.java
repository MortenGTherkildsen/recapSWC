package dk.mth;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Students studerende = new Students();
        Teachers teachers = new Teachers();
        Kurser kurser = new Kurser();



        int menuSvar = 0;
        Scanner scanner = new Scanner(System.in);

        while (menuSvar==0){
            System.out.println("0. Se Alle Kurser");
            System.out.println("1. Opret Kursus");
            System.out.println("2. Rediger Kursus");
            System.out.println("3. Slet Kursus");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("10. Se alle Studerende");
            System.out.println("11. Opret ny Studerende");
            System.out.println("12. Rediger Studerende");
            System.out.println("13. Slet Studerende");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("20. Se alle Lærere");
            System.out.println("21. Opret ny Lærer");
            System.out.println("22. Rediger Lærer");
            System.out.println("23. Slet Lærer");

            menuSvar = scanner.nextInt();

            switch (menuSvar){
                case 0: kurser.listAllKurser();

                case 1: kurser.addKursus(studerende, teachers);

                case 10: studerende.listAllStudents();

                case 20: teachers.listAllTeachers();


            }
        }


    }
}

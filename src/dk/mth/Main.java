package dk.mth;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Students students = new Students();
        Teachers teachers = new Teachers();
        Kurser kurser = new Kurser();

        // Tilføj testdata
        teachers.teacherList.add(new Teacher(1, "Adam"));
        teachers.teacherList.add(new Teacher(2, "Eva"));
        teachers.teacherList.add(new Teacher(3, "Peter"));
        teachers.teacherList.add(new Teacher(4, "Jesus"));
        teachers.teacherList.add(new Teacher(5, "Moses"));

        students.studerende.add(new Student(1, "Adil"));
        students.studerende.add(new Student(2, "Christian"));
        students.studerende.add(new Student(3, "Morten"));
        students.studerende.add(new Student(4, "Ulla"));
        students.studerende.add(new Student(5, "Yvonne"));
        students.studerende.add(new Student(6, "Peter"));


        int menuSvar = -1;
        Scanner scanner = new Scanner(System.in);

        while (menuSvar == -1) {
            System.out.print("0. Se Alle Kurser" + "        ");
            System.out.print("1. Opret Kursus" + "           ");
            System.out.print("2. Slet Kursus" + "        ");
            System.out.print("4. Tilføj underviser [til kursus]" + "  ");
            System.out.print("5. Slet underviser [fra kursus]" + "  ");
            System.out.print("6. Tilføj studerende [til kursus]");
            System.out.print("7. Slet studerende [fra kursus]  (ikke implementeret)");
            System.out.print("8. Redigér eksamensinfo");
            System.out.println("");
            System.out.print("10. Se alle Studerende" + "   ");
            System.out.print("11. Opret ny Studerende" + "   ");
            System.out.print("12. Rediger Studerende (ikke implementeret)" + "   ");
            System.out.print("13. Slet Studerende (ikke implementeret)");
            System.out.println("");
            System.out.print("20. Se alle Lærere" + "       ");
            System.out.print("21. Opret ny Lærer" + "        ");
            System.out.print("22. Rediger Lærer" + "        ");
            System.out.println("23. Slet Lærer");

            menuSvar = scanner.nextInt();

            switch (menuSvar) {
                case 0:
                    kurser.listAllKurser();
                    break;
                case 1:
                    kurser.addKursus(teachers, students);
                    break;
                case 2:
                    kurser.deleteKursus();
                    break;
                case 6:
                    kurser.addStudentsToKursus(students);
                    break;
                case 7:
                    kurser.deleteStudentsFromKursus();
                    break;
                case 10:
                    students.listAllStudents();
                    break;
                case 20:
                    teachers.listAllTeachers();
                    break;

            }
            menuSvar = -1;
        }


    }
}

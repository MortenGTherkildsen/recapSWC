package dk.mth;

import java.util.ArrayList;
import java.util.Scanner;

public class Teachers {

    ArrayList<Teacher> teacherList = new ArrayList<>();

    public void listAllTeachers(){

        System.out.println("Lærerliste:");
        if(teacherList.size()>0) {
            for (Teacher t : teacherList
            ) {
                System.out.println(t.teacherID + "   " + t.navn);

            }
        }
        else if(teacherList.size()==0){
            System.out.println("Der er ingen lærere på lærerlisten!");
        }
    }

    public Teacher getTeacherByID(int ID){

        for (Teacher t:teacherList
             ) {
            if(t.teacherID==ID) {
                return t;
            }
        }
        return null;

    }

    public void addTeacher(){

        int nytTeacherID = teacherList.size()+1;
        System.out.println(nytTeacherID);
        Scanner sc = new Scanner(System.in);
        System.out.println("Tilføj lærer");
        System.out.print("Navn: ");
        String navn = sc.nextLine();
        Teacher teacher = new Teacher(nytTeacherID, navn);
        teacherList.add(teacher);
        System.out.println("Har tilføjet " + teacher.teacherID + " " + teacher.navn + " til lærerlisten");

        listAllTeachers();
    }
}

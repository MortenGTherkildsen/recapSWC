package dk.mth;

import java.util.ArrayList;

public class Teachers {

    ArrayList<Teacher> teacherList = new ArrayList<>();

    public void listAllTeachers(){
        for (Teacher t:teacherList
        ) {
            System.out.println(t.teacherID + "   " + t.navn);

        }
    }

    public Teacher getTeacherByID(int ID){

        System.out.println("Leder efter lærer med ID: " + ID);

        for (Teacher t:teacherList
             ) {
            if(t.teacherID==ID) {
                return t;
            }
        }
        return null;

    }
}

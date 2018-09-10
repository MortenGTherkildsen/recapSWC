package dk.mth;

import java.util.ArrayList;

public class Teachers {

    ArrayList<Teacher> teacherList = new ArrayList<>();

    public void listAllTeachers(){

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
}

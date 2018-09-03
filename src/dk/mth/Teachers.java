package dk.mth;

import java.util.ArrayList;

public class Teachers {

    ArrayList<Teacher> teachers;

    public void listAllTeachers(){
        for (Teacher t:teachers
        ) {
            System.out.println(t.navn);

        }
    }
}

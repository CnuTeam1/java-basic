package kr.ac.cnu.grammer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * Created by rokim on 2017. 5. 25..
 */
public class CnuLecture {
    private List<Teacher> teacherList;

    public CnuLecture() {
        teacherList = new ArrayList<Teacher>();
    }

    public void addTeacher(Teacher teacher) {
        this.teacherList.add(teacher);
    }

    public Teacher getTeacher(String name) {
        for (Teacher teacher : teacherList) {
            if (teacher.getName().equals(name)) {
                return teacher;
            }
        }
        return null;
    }
}

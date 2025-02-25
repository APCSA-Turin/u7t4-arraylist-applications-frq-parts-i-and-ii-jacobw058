package com.example.project.Student;
import java.util.ArrayList;
import java.util.Arrays;

public class Utility {

    public static ArrayList<Student> sortStudents(ArrayList<Student> list) {
        ArrayList<Student> students = new ArrayList<Student>();
        students.add(list.get(0));
        for (int i = 1; i < list.size(); i++) {
            int ind = 0;
            for (int j = students.size() - 1; j >= 0; j--) {
                if (list.get(i).getLastName().compareTo(students.get(j).getLastName()) > 0) {
                    ind++;
                } else if (list.get(i).getLastName().compareTo(students.get(j).getLastName()) == 0) {
                    if (list.get(i).getFirstName().compareTo(students.get(j).getFirstName()) > 0) {
                        ind++;
                    } else if (list.get(i).getFirstName().compareTo(students.get(j).getFirstName()) == 0) {
                        if (list.get(i).getGpa() < (students.get(j).getGpa())) {
                            ind++;
                        }
                    }
                }
            }
            students.add(ind, list.get(i));
        }
        return students;
    }
}

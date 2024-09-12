package org.launchcode;

import java.io.ByteArrayOutputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapPractice {
    public static void main(String[] args) {
        HashMap<String, Integer> students= new HashMap<>();
        Scanner input = new Scanner(System.in);
        String newStudent;
        System.out.println("Enter your students (or ENTER to finish): ");

        do {
            System.out.print("Student: ");
            newStudent = input.nextLine();
            if(!newStudent.equals("")){
                System.out.print("ID: ");
                Integer studentId = input.nextInt();
                students.put(newStudent,studentId);
                input.nextInt();
            }

        } while(!newStudent.equals(""));
        input.close();
        System.out.println("\nClass roster:");

        for(Map.Entry<String, Integer> student : students.entrySet()){
            System.out.println(student.getValue() + "'s ID: " + student.getKey());
        }

        System.out.println("Number of students in roster: " + students.size());
    }
}

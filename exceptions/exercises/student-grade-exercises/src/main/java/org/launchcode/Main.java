package org.launchcode;

import java.util.HashMap;
import java.util.Map;

import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {
//         Test out your Divide() function!
       System.out.println(Divide(5, 0));

        HashMap<String, String> studentFiles = new HashMap<>();
        studentFiles.put("Carl", "Program.java");
        studentFiles.put("Brad", "");
        studentFiles.put("Elizabeth", "MyCode.java");
        studentFiles.put("Stefanie", "CoolProgram.java");

        // Test out your CheckFileExtension() function!
        System.out.println(CheckFileExtension(studentFiles));;
    }

    public static int Divide(int x, int y) {
        int z = y / x;
        if (y == 0) {
            try {
                throw new ArithmeticException("'y' can't equal zero, try another number.");
            } catch (ArithmeticException e) {
                e.printStackTrace();
            }
        }
        return z;
    }

//    TODO: fix this code, might need iteration
    public static int CheckFileExtension(HashMap<String, String> fileName) {
        int studentPoints = 0;

        for (Map.Entry<String,String >entry : fileName.entrySet()) {
            String file = entry.getValue();
        if (file.endsWith(".java")) {
            studentPoints += 1;
        } else if (file == null || file.isEmpty()) {
            try {
                throw new StudentException("Needs to have a file name.");
            } catch (StudentException error) {
                error.printStackTrace();

            }
        } else {
            studentPoints += 0;
        }
    }
        return studentPoints;
    }
}

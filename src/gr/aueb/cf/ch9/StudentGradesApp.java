package gr.aueb.cf.ch9;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class StudentGradesApp {

    public static void main(String[] args) {
        //Read data from input file
        List<String> lines = readLinesFromFile("/Users/elisavet/Desktop/grades.txt");

        if (lines != null) {
            try (PrintWriter out = new PrintWriter(new FileWriter("/Users/elisavet/IdeaProjects/JavaExercisesCF5/JavaExercises/src/gr/aueb/cf/ch9/primOut.txt"));
                    PrintWriter log = new PrintWriter(new FileWriter("/Users/elisavet/IdeaProjects/JavaExercisesCF5/JavaExercises/src/gr/aueb/cf/ch9/log.txt"))) {

                for (String line : lines) {
                    String[] element = line.split(" ");

                    if (element.length >= 4) { // Ensure the array has at least 4 elements
                        String firstname = element[0];
                        String lastname = element[1];
                        int grade1 = Integer.parseInt(element[2]);
                        int grade2 = Integer.parseInt(element[3]);

                        double averageGrade = (grade1 + grade2) / 2.0;

                        if (grade1 < 0 || grade1 > 10 || grade2 < 0 || grade2 > 10) {
                            log.println("Invalid grades for student: " + firstname + " " + lastname);
                        } else {
                            out.println(firstname + " " + lastname + " " + averageGrade);
                        }
                    } else {
                        log.println("Invalid data format in line: " + line);
                    }
                }

            } catch (IOException e) {
                e.printStackTrace();
                throw new RuntimeException(e);
            }
        }
    }

    private static List<String> readLinesFromFile(String filename) {
        List<String> lines = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                lines.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return lines;
    }
}

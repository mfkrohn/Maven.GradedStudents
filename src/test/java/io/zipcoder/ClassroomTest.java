package io.zipcoder;

import org.junit.Test;

import java.util.Arrays;

public class ClassroomTest {

    @Test
    public void getAverageExamScore(){
        Double[] s1Scores = {100.0, 150.0};
        Double[] s2Scores = {50.0, 100.0};

        Student s1 = new Student("Student", "one", s1Scores);
        Student s2 = new Student("Student", "two", s2Scores);

        Student[] students = new Student[]{s1,s2};
        Classroom classroom = new Classroom(students);

        double output = classroom.getAverageExamScore();

        System.out.println(output);
    }
    @Test
            public void addStudentTest() {
        // : Given
        int maxNumberOfStudents = 1;
        Classroom classroom = new Classroom(maxNumberOfStudents);
        Double[] examScores = {100.0, 150.0, 250.0, 0.0};
        Student s1 = new Student("Mike", "Krohn", examScores);

        // When
        String preEnrollment = classroom.getStudents();
        classroom.addStudent(s1);
        String postEnrollment = classroom.getStudents();

        // Then



        System.out.println(preEnrollment);

        System.out.println(postEnrollment);
    }

    @Test
    public void removeStudentTest(){
        Double[] s1Scores = {100.0, 150.0};
        Double[] s2Scores = {50.0, 100.0};

        Student s1 = new Student("Student", "one", s1Scores);
        Student s2 = new Student("Student", "two", s2Scores);

        Student[] students = new Student[]{s1,s2};
        Classroom classroom = new Classroom(students);
        String preRemoval = classroom.getStudents();
        classroom.removeStudent("Student", "one");
        String postRemoval = classroom.getStudents();

        System.out.println(preRemoval);
        System.out.println(postRemoval);


    }

    @Test
    public void getStudentsByScoreTest(){
        Double[] s1Scores = {100.0, 150.0};
        Double[] s2Scores = {50.0, 100.0};
        Double[] s3Scores = {100.0,50.0};

        Student s1 = new Student("Student", "one", s1Scores);
        Student s2 = new Student("Student", "two", s2Scores);
        Student s3 = new Student("Student", "three", s3Scores);

        Student[] students = new Student[]{s1,s2,s3};
        Classroom classroom = new Classroom(students);

        String sortedStudents= classroom.getStudentsByScore().toString();


        System.out.println(sortedStudents);
    }

    @Test
    public void getGradeBook(){
        Double[] s1Scores = {100.0, 100.0};
        Double[] s2Scores = {10.0, 10.0};
        Double[] s3Scores = {80.0,80.0};
        Double[] s4Scores = {70.0,70.0};
        Double[] s5Scores = {30.0,30.0};
        Double[] s6Scores = {50.0,50.0};
        Double[] s7Scores = {40.0,40.0};
        Double[] s8Scores = {60.0,60.0};
        Double[] s9Scores = {20.0,20.0};
        Double[] s10Scores = {90.0,90.0};


        Student s1 = new Student("Student", "one", s1Scores);
        Student s2 = new Student("Student", "two", s2Scores);
        Student s3 = new Student("Student", "three", s3Scores);
        Student s4 = new Student("Student", "four", s4Scores);
        Student s5 = new Student("Student", "five", s5Scores);
        Student s6 = new Student("Student", "six", s6Scores);
        Student s7 = new Student("Student", "seven", s7Scores);
        Student s8 = new Student("Student", "eight", s8Scores);
        Student s9 = new Student("Student", "nine", s9Scores);
        Student s10 = new Student("Student", "ten", s10Scores);

        Student[] students = new Student[]{s1,s2,s3,s4,s5,s6,s7,s8,s9,s10};
        Classroom classroom = new Classroom(students);

        String gradeBook = classroom.getGradeBook();


        System.out.println(gradeBook);

    }
}

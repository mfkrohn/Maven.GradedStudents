package io.zipcoder;

import org.junit.Test;

public class StudentTest {


    @Test
    public void getExamScoresTest(){
        String firstName = "Mike";
        String lastName = "Krohn";
        Double[] examScores = {100.0,62.0,88.0,99.9};
        Student student = new Student(firstName,lastName,examScores);

        String output = student.getExamScores();

        System.out.println(output);
    }

    @Test
    public void addExamScoresTest(){
        String firstName = "Mike";
        String lastName = "Krohn";
        Double[] examScores = {};
        Student student = new Student(firstName,lastName,examScores);
        student.addExamScores(100.0);
        String output = student.getExamScores();

        System.out.println(output);
    }

    @Test
    public void setExamScoresTest(){
        String firstName = "Mike";
        String lastName = "Krohn";
        Double[] examScores = {100.0,62.0,88.0,99.9};
        Student student = new Student(firstName,lastName,examScores);
        student.setExamScores(3, 150.0);
        String output = student.getExamScores();

        System.out.println(output);
    }

    @Test
    public void getAverageExamScoreTest(){
        String firstName = "Mike";
        String lastName = "Krohn";
        Double[] examScores = {100.0,50.0,100.0,50.0};
        Student student = new Student(firstName,lastName,examScores);
        Double output = student.getAverageExamScore();


        System.out.println(output);
    }

    @Test
    public void toStringTest(){
        String firstName = "Mike";
        String lastName = "Krohn";
        Double[] examScores = {100.0,62.0,88.0,99.9};
        Student student = new Student(firstName,lastName,examScores);
        String output = student.toString();


        System.out.println(output);
    }

}
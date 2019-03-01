package io.zipcoder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Student {
    String firstName;
    String lastName;
    ArrayList<Double> examScores;

    public Student(String firstName, String lastName, Double[] examScores) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.examScores = new ArrayList<>(Arrays.asList(examScores));
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getExamScores() {
        StringBuilder stringBuilder = new StringBuilder();
        Integer counter = 1;
        for(Double score : examScores){
            stringBuilder.append("    Exam " + counter + " -> " + score + "\n");
            counter++;
        }

        return stringBuilder.toString();
    }

    public Integer getNumberOfExamsTaken(){
        return 0;
    }


    public void addExamScores(Double score) {
        examScores.add(score);

    }

    public void setExamScores(Integer testNumber, Double testScore) {
        examScores.remove(testNumber -1);
        examScores.add(testNumber -1,testScore);

    }

    public Double getAverageExamScore() {
        return (examScores.stream().mapToDouble(Double::doubleValue).sum())/examScores.size();
    }

    @Override
    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Student Name: " + getFirstName() +" " + getLastName()+"\n");
        stringBuilder.append("> Average Score: " + getAverageExamScore()+"\n");
        stringBuilder.append("> Exam Scores:\n");
        stringBuilder.append(getExamScores());

        return stringBuilder.toString();
    }
}

package io.zipcoder;

import java.util.*;

public class Classroom implements Comparator<Student>{
    Student [] students;

    public Classroom(Student[] students) {
        this.students = students;
    }

    public Classroom(int maxNumberOfStudents) {
        this.students = new Student[maxNumberOfStudents];
    }

    public Classroom() {
        this.students = new Student[30];
    }

    public String getStudents() {
        StringBuilder stringBuilder = new StringBuilder();

        for ( Student currentStudent : students){
            stringBuilder.append("========================\n");
            try{
            stringBuilder.append(currentStudent.toString());}
            catch (Exception e){
                stringBuilder.append("No Students Enrolled\n");
            }
            stringBuilder.append("========================\n\n");
        }

        return stringBuilder.toString();
    }


    public double getAverageExamScore() {
        Double avgSum = 0.0;
        for(Student currentStudent : students){
            avgSum += currentStudent.getAverageExamScore();
        }


        return avgSum/students.length;
    }

    public void addStudent(Student student) {
        List<Student> studentList = new ArrayList<>(Arrays.asList(students));
        studentList.add(student);
        studentList.remove(null);
        students = studentList.toArray(new Student[0]);

    }

    public void removeStudent(String firstName, String lastName) {
        List<Student> studentList = new ArrayList<>(Arrays.asList(students));
        for(Student currentStudent : studentList) {
            if(currentStudent.getFirstName().equalsIgnoreCase(firstName) && currentStudent.getLastName().equalsIgnoreCase(lastName)) {
                studentList.remove(currentStudent);
            }
        }
        for (Student nullChecker : studentList){
            if(nullChecker == null){
                studentList.remove(nullChecker);
            }
        }
        students = studentList.toArray(new Student[0]);
    }

    public ArrayList<Student> getStudentsByScore() {
        ArrayList<Student> studentList = new ArrayList<>(Arrays.asList(students));
        studentList.sort(this);
        return studentList;
    }

    @Override
    public int compare(Student s1, Student s2) {
        if(s2.getAverageExamScore().compareTo(s1.getAverageExamScore()) == 0){
            return s1.getLastName().compareTo(s2.getLastName());
        }

        return s2.getAverageExamScore().compareTo(s1.getAverageExamScore());
    }

    public String getGradeBook() {
        Map<String,ArrayList<Student>> gradeBook = new TreeMap<>();
        ArrayList<Student> sortedStudentList = getStudentsByScore();
        Integer binSize = sortedStudentList.size()/5;
        gradeBook.put("A",new ArrayList<>(sortedStudentList.subList(0,binSize)));
        gradeBook.put("B",new ArrayList<>(sortedStudentList.subList(binSize,binSize*2)));
        gradeBook.put("C",new ArrayList<>(sortedStudentList.subList(binSize*2,binSize*3+1)));
        gradeBook.put("D",new ArrayList<>(sortedStudentList.subList(binSize*3+1,binSize*4+1)));
        gradeBook.put("F",new ArrayList<>(sortedStudentList.subList(binSize*4+1,sortedStudentList.size())));

        StringBuilder stringBuilder = new StringBuilder();
        for(Map.Entry thisEntry : gradeBook.entrySet()) {
            stringBuilder.append("" + thisEntry.getKey() + " Students: \n\n\n" + thisEntry.getValue().toString()+ "\n");
        }

        return stringBuilder.toString();
    }
}

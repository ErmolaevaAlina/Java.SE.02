package com.company;

import java.util.*;
import java.util.stream.Collectors;

public class Student {
    private String name;
    private Map<SubjectTracker.Subject, List<Number>> grades;
    private List<StudentGroup> groups;

    public Student(String name) {
        this.name = name;
        this.grades = new HashMap<>();
        this.groups = new LinkedList<>();
    }

    public Student addGrade(SubjectTracker.Subject subject, Number grade) {
        if(subject.getMaxRating().doubleValue() >= grade.doubleValue() && grade.doubleValue() >= 0) {
            grades.get(subject).add(grade);
        } else {
            throw new IllegalArgumentException("Grade is greater then maximum available grade.");
        }
        return this;
    }

    public Student addSubject(SubjectTracker.Subject subject) {
        if(!grades.containsKey(subject))
            grades.put(subject, new LinkedList<>());
        return this;
    }

    public Student addGroup(StudentGroup group) {
        groups.add(group);
        return this;
    }

    public List<StudentGroup> getGroups() {

        return groups;
    }

    public List<Number> getGrades(SubjectTracker.Subject subject) {
        return grades.get(subject);
    }

    public List<SubjectTracker.Subject> getStudiedSubjects() {

        return new LinkedList<>(grades.keySet());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || this.getClass() != obj.getClass())
            return false;

        Student student = (Student) obj;

        return name != null ? this.name.equals(student.name) : student.name == null;

    }

    @Override
    public int hashCode() {

        return name != null ? name.hashCode() : 0;
    }

    public String getName() {

        return name;
    }

    @Override
    public String toString() {
        List<String> output = new LinkedList<String>();
        output.add(name + "\n");


        Set<SubjectTracker.Subject> keyList = grades.keySet();

        for(SubjectTracker.Subject i: keyList)
        {
            List<Number> list = grades.get(i);
            String gr = list.stream().map(p -> String.valueOf(p)).collect(Collectors.joining(","));
            output.add(i.toString() + " [" + gr + "]");
        }

        return String.join("\n", output);

    }
}

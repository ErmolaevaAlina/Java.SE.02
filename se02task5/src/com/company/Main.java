package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        StudentGroup mathGroup = new StudentGroup("Math", SubjectTracker.Subject.Mathematics);
        StudentGroup physicsGroup = new StudentGroup("Physics", SubjectTracker.Subject.Physics);

	    Student s1 = new Student("Alina");
        Student s2 = new Student("Alexander");
        Student s3 = new Student("Nikita");


        mathGroup.add(s1);
        s1.addGrade(SubjectTracker.Subject.Mathematics, 5);
        s1.addGrade(SubjectTracker.Subject.Mathematics, 5);
        s1.addGrade(SubjectTracker.Subject.Mathematics, 4);

        mathGroup.add(s2);
        s2.addGrade(SubjectTracker.Subject.Mathematics, 3);
        s2.addGrade(SubjectTracker.Subject.Mathematics, 2);
        s2.addGrade(SubjectTracker.Subject.Mathematics, 2);

        physicsGroup.add(s1);
        s1.addGrade(SubjectTracker.Subject.Physics, 3);
        s1.addGrade(SubjectTracker.Subject.Physics, 2);
        s1.addGrade(SubjectTracker.Subject.Physics, 4);
        physicsGroup.add(s3);
        s3.addGrade(SubjectTracker.Subject.Physics, 5);
        s3.addGrade(SubjectTracker.Subject.Physics, 5);
        s3.addGrade(SubjectTracker.Subject.Physics, 5);

        SubjectTracker university = new SubjectTracker();
        university.registerGroup(mathGroup);
        university.registerGroup(physicsGroup);

        List<StudentGroup> groups = university.getGroups("Alina");
        for (int i = 0; i < groups.size(); i++)
        {
            System.out.println(groups.get(i));
        }

        Student s = university.get("Alina");
        System.out.println(s);

    }
}

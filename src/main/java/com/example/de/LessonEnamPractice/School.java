package com.example.de.LessonEnamPractice;

public class School {

    public static void main(String[] args) {

        Student alex = new Student("Alex");
        Student[] students = {
                new Student("Sonja"),
                new Student("Petr"),
                new Student("Kate")
        };

        Teacher teacherOfArt = new Teacher(Subject.ART);

        teacherOfArt.teach(alex);
        alex.printSubjectList();

        Teacher teacherOfMath = new Teacher(Subject.MATH);
        teacherOfMath.teach(alex);
        alex.printSubjectList();

        System.out.println("Does " + alex.getName() + " knows " + Subject.MATH + "? " + alex.knowsSubject(Subject.MATH));
        System.out.println("Does " + alex.getName() + " knows " + Subject.ENGLISH + "? " + alex.knowsSubject(Subject.ENGLISH));

        Teacher teacherOfSport = new Teacher(Subject.SPORT);
        teacherOfSport.teach(students);
    }
}

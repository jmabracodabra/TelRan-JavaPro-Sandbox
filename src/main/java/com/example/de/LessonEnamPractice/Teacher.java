package com.example.de.LessonEnamPractice;

public class Teacher {

    private Subject subject;

    public Teacher(Subject subject) {
        this.subject = subject;
    }

    public void teach(Student student) {
        System.out.println("Teacher of " + this.getSubject() + " teaches " + student.getName());
        student.addKnowledge(subject);
    }

    public void teach(Student[] students) {
        for (Student student : students) {
            student.addKnowledge(subject);
        }
    }

    public Subject getSubject() {
        return subject;
    }
}

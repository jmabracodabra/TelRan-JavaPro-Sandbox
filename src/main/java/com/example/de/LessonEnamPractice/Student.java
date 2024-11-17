package com.example.de.LessonEnamPractice;

import java.util.Arrays;

public class Student {

    private String name;

    private Subject[] subjects = new Subject[Subject.values().length];

    public Student(String name) {
        this.name = name;
    }

    public void addKnowledge(Subject subject) {
        int i = subject.ordinal();
        subjects[i] = subject;
    }

    public void printSubjectList() {
        System.out.println(Arrays.toString(subjects));
    }

    public boolean knowsSubject(Subject subject) {
        Subject sub = subjects[subject.ordinal()];

        return subject.equals(sub);
    }

    public String getName() {
        return name;
    }
}

package com.example.de.lesson2Practice;

public class Robot extends Creature {

    private String description;
    private int version;
    private static int totalRobotCount = 0;

    private static final int ROBOT_DEFAULT_VERSION = 1;

    public Robot(String name, String description) {
        super(name);
        this.description = description;
        this.version = ROBOT_DEFAULT_VERSION;
        totalRobotCount++;
    }

    public void printCurrentRobotInfo() {
        System.out.println(this);
    }

    public static void printTotalRobotCount() {
        System.out.println("Total robot count: " + totalRobotCount);
    }

    @Override
    public String toString() {
        return "Robot{" +
                "name='" + getName() + '\'' +
                ", description='" + description + '\'' +
                ", version=" + version +
                '}';
    }

    @Override
    public void sayHello() {
        System.out.println("Hello! I'm Robot. My name is " + super.getName());
    }
}

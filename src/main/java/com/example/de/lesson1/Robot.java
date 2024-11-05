package com.example.de.lesson1;

public class Robot {
    private String name;
    private String description;
    private int version;
    private static int totalRobotCount;
    private static final int ROBOT_DEFAULT_VERSION = 1;

    public Robot(String name, String description) {
        this.name = name;
        this.description = description;
        this.version = ROBOT_DEFAULT_VERSION;
        totalRobotCount++;
    }

    public void printCurrentRobotInfo() {
        System.out.println("Name: " + this.name + ", description: " + description +  ", version: " + version);
    }

    public static void printTotalRobotCount(){
        System.out.println("total count is " + totalRobotCount);
    }
}

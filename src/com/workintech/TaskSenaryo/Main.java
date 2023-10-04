package com.workintech.TaskSenaryo;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Task task1 = new Task("Java Collections", "Write List Interface", "Ann", Priority.LOW, Status.IN_QUEUE);
        Task task2 = new Task("Java Collections", "Write Set Interface", "Ann", Priority.MED, Status.ASSIGNED);
        Task task3 = new Task("Java Collections", "Write Map Interface", "Bob", Priority.LOW, Status.ASSIGNED);
        Task task4 = new Task("Java Collections", "Write Queue Interface", "Bob", Priority.HIGH, Status.IN_PROGRESS);
        Task task5 = new Task("Java Collections", "Write Stack Interface", "Carol", Priority.LOW, Status.ASSIGNED);
        Task task6 = new Task("Java Collections", "Write OOP Interface", "Gulsu", Priority.LOW, Status.IN_PROGRESS);


        Set<Task> totalTasks = new HashSet<>();
        totalTasks.add(task1);
        totalTasks.add(task2);
        totalTasks.add(task3);
        totalTasks.add(task4);
        totalTasks.add(task5);
        totalTasks.add(task6);


        Set<Task> annsTasks = new HashSet<>();
        annsTasks.add(task1);
        annsTasks.add(task2);

        Set<Task> bobsTasks = new HashSet<>();
        bobsTasks.add(task3);
        bobsTasks.add(task4);

        Set<Task> carolsTasks = new HashSet<>();
        carolsTasks.add(task5);

        Set<Task> unassignedTasks = new HashSet<>();
        unassignedTasks.add(task6);

        TaskData taskData = new TaskData(annsTasks, bobsTasks, carolsTasks, unassignedTasks);
        System.out.println("Ann: " + annsTasks + "Bob: " + bobsTasks + "Carol: " + carolsTasks + "Unassigned Tasks: " + unassignedTasks);
        System.out.println("**********");
        System.out.println("All tasks: " + taskData.getTasks("all"));
        System.out.println("**********");
        System.out.println("Intersection: " + taskData.getIntersection(bobsTasks, annsTasks));
        System.out.println("**********");
        System.out.println("Difference: " + taskData.getDifferences(carolsTasks, annsTasks));
        System.out.println("**********");
        System.out.println("Unionize: " + taskData.getUnion(bobsTasks, carolsTasks));

    }
}
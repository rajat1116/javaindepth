package com.semanticsquare.basics.BasicsDemo;

class Student {
    int id;
    String name;
    String gender = "male";


    Student(int id, String name){
        this(name);
        this.id = id;

    }
    Student(String name){
        this.name = name;
    }

    boolean updateProfile(String name){
        this.name = name;
        return true;
    }
}
class StudentTest {
    public static void main(String[] args) {
        int[] studentIds = new int[]{1001, 1002, 1003};
        Student student1 = new Student(studentIds[0], "joan");
        student1.gender = "male";

        Student student2 = new Student(studentIds[1], "raj");
        student2.gender = "male";

        Student student3 = new Student(studentIds[2], "anita");
        student3.gender = "female";

        System.out.println("Name of Student1: " + student1.name);
        System.out.println("Name of Student2: " + student2.name);
        System.out.println("Name of Student3: " + student3.name);

        student1.updateProfile("John");
        System.out.println("Updated Name of Student1: " + student1.name);

        Student student4 = student1;
        System.out.println("Name of Student4: " + student4.name);

        student4.updateProfile("Mike");
        System.out.println("Updated Student4 name: " + student4.name);
        System.out.println("Student1 name: " + student1.name);

        student4 = student2;
        System.out.println("Name of student4: " + student4.name);
        System.out.println("Name of student2: " + student2.name);

        student2 = student1;
        System.out.println("Name of student2: " + student2.name);
        System.out.println("Name of student1: " + student1.name);

        student4 = new Student("Alex");
        System.out.println("Name of student4: "+student4.name);
        System.out.println("Name of student2: "+student2.name);
        System.out.println("Name of student1: "+student1.name);
    }
}

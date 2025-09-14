package com.x2space.lambda;

public class Student {
    private String name;
    private int age;
    private double height;
    private String grade;

    public Student(String name, int age, double height, String grade) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", grade='" + grade + '\'' +
                '}';
    }

    public static int compareByAge(Student s1, Student s2) {
        return s1.getAge() - s2.getAge();
    }


    public static int compareByHeight(Student s1, Student s2) {
        return Double.compare(s1.getHeight(), s2.getHeight());
    }
}

package com.x2space.lambda;

import java.util.Arrays;

public class LambdaDemo2 {
    public static void main(String[] args) {
        // 定义一个长度为6的列表Student
        Student[] students = new Student[6];
        students[0] = new Student("yinsusu", 35, 171.5, "女");
        students[1] = new Student("yangmi", 28, 168.5, "女");
        students[2] = new Student("zhangwuji", 25, 181.5, "男");
        students[3] = new Student("xiaozhao", 19, 165.5, "女");
        students[4] = new Student("zhaomin", 27, 167.5, "女");
        students[5] = new Student("liuyifei", 36, 188, "女");

//        Arrays.sort(students, (s1, s2) -> s1.getAge() - s2.getAge());
        Arrays.sort(students, Student::compareByAge);

         for (Student s : students) {
            System.out.println(s);
        }
    }
}

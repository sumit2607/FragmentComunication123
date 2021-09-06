package com.sumit.fragmentcomunication;

import java.io.Serializable;

public class ModelClass implements Serializable {
    private  String name;
    private  String grade;
    private  int age;
    private  String percentage;

    public ModelClass(String name, String grade, int age, String percentage) {
        this.name = name;
        this.grade = grade;
        this.age = age;
        this.percentage = percentage;
    }

    public String getName() {
        return name;
    }

    public String getGrade() {
        return grade;
    }

    public int getAge() {
        return age;
    }

    public String getPercentage() {
        return percentage;
    }
}

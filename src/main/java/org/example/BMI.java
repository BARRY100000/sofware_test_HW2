package org.example;

public class BMI {
    //BMI算法體重/(身高*身饕)
    public static double calculateBMI(double height, double weight) {
        return weight / (height * height);
    }
}


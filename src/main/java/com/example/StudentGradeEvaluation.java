package com.example;

import java.util.Scanner;

public class StudentGradeEvaluation {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter their name & have the scanner read the value
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        

        // Prompt the user to enter their age & have the scanner read the value
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        
        
        // Prompt the user to enter their exam marks & have the scanner read the value
        System.out.print("Enter your marks: ");
        double marks = scanner.nextDouble();

        //initialize the variable for Grade to be able to provide the grading for the entered marks
        String grade;

        //using control flow for determing the grade based on the marks
        if (marks >= 90) {
            grade = "A";
        } else if (marks > 80 && marks < 90) {
            grade = "B";
        } else if (marks > 70 && marks < 80) {
            grade = "C";
        } else if (marks > 60 && marks < 70) {
            grade = "D";
        } else {
            grade = "F";
        }
        

        // Print the student's details
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + grade);

        //determine if the student is eligible for scholarship
        if (age < 25 && grade == "A") {
            System.out.println("You are eligible for a scholarship");
         } else if (age < 25 && grade == "B") {
                System.out.println("You are eligible for a scholarship");
            } else {
                System.out.println("You are not eligible for a scholarship");
                }
            }
        }

package com.company;

import java.util.Scanner;

class Student {
    public String regNo;
    public String name;
    public String gender;

    Student(String kRegNo, String kName, String kGender) {
        this.regNo = kRegNo;
        this.name = kName;
        this.gender = kGender;
    }

    public void getStudentDetails() {
        Scanner studentScanner = new Scanner(System.in);
        System.out.println("Enter student's registration number: \n");
        this.regNo = studentScanner.nextLine();
        System.out.println("Enter student's full name: \n");
        this.name = studentScanner.nextLine();
        System.out.println("Enter student's gender: \n");
        this.gender = studentScanner.nextLine();
    }
}

class Bachelor_Student extends Student {
    Bachelor_Student(String kRegNo, String kName, String kGender) {
        super(kRegNo, kName, kGender);
    }

    public void display() {
        System.out.println("COURSE LEVEL: BACHELOR");
        System.out.println("REGISTRATION NO.: " + this.regNo);
        System.out.println("STUDENT NAME    : " + this.name);
        System.out.println("STUDENT GENDER  : " + this.gender);
        System.out.println("\n");
    }
}

class Diploma_Student extends Student {
    Diploma_Student(String kRegNo, String kName, String kGender) {
        super(kRegNo, kName, kGender);
    }

    public void display() {
        System.out.println("COURSE LEVEL: DIPLOMA");
        System.out.println("REGISTRATION NO.: " + this.regNo);
        System.out.println("STUDENT NAME    : " + this.name);
        System.out.println("STUDENT GENDER  : " + this.gender);
        System.out.println("\n");
    }
}

public class Main {

    public static void main(String[] args) {
        Diploma_Student newDiplomaStudent = new Diploma_Student("SCT121-0244/2019", "Michael Bruno", "male");
        newDiplomaStudent.display();
        Bachelor_Student newBachelorStudent = new Bachelor_Student("SCT121-0244/2019", "Jane Doe", "female");
        newBachelorStudent.display();
    }
}

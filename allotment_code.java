import java.util.Scanner;

class Allotment {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your GRE marks percentage: ");
        double GRE_Marks = sc.nextDouble();

        System.out.print("Enter your TOEFL marks percentage: ");
        double TOEFL_Marks = sc.nextDouble();

        String output;

        if (GRE_Marks >= 70 && GRE_Marks <= 100) {

            if (TOEFL_Marks > 70 && TOEFL_Marks <= 100) {
                output = "Oxford University (Computer Science and Engineering)";
            } 
            else if (TOEFL_Marks > 60 && TOEFL_Marks <= 70) {
                output = "Oxford University (Electronics Engineering)";
            } 
            else if (TOEFL_Marks > 50 && TOEFL_Marks <= 60) {
                output = "Oxford University (Electrical Engineering)";
            } 
            else {
                output = "Sorry, you were not selected for any university.";
            }

        } 
        else if (GRE_Marks >= 60 && GRE_Marks < 70) {

            if (TOEFL_Marks > 50 && TOEFL_Marks <= 100) {
                output = "MIT (Computer Science and Engineering)";
            } 
            else {
                output = "Sorry, you were not selected for any university.";
            }

        } 
        else if (GRE_Marks > 50 && GRE_Marks < 60) {

            if (TOEFL_Marks > 50 && TOEFL_Marks <= 100) {
                output = "MIT (Chemical Engineering)";
            } 
            else {
                output = "Sorry, you were not selected for any university.";
            }

        } 
        else if (GRE_Marks == 50) {

            if (TOEFL_Marks > 50 && TOEFL_Marks <= 100) {
                output = "MIT (Civil Engineering)";
            } 
            else {
                output = "Sorry, you were not selected for any university.";
            }

        } 
        else {

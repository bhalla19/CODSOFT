import java.util.Scanner;

class StudentGradeInfo {
    String StudentName, grade;
    int DataScience, WebTech, Maths, Accounts, totalMarks;
    double AveragePercentage;

    public StudentGradeInfo(Scanner sc) {
        System.out.println("Enter Student Name : ");
        StudentName = sc.next();
        System.out.println("Marks Scored by " + this.StudentName + " in DataScience out of 100: ");
        DataScience = sc.nextInt();
        System.out.println("Marks Scored by " + this.StudentName + " in WebTech out of 100: ");
        WebTech = sc.nextInt();
        System.out.println("Marks Scored by " + this.StudentName + " in Maths out of 100: ");
        Maths = sc.nextInt();
        System.out.println("Marks Scored by " + this.StudentName + " in Accounts out of 100: ");
        Accounts = sc.nextInt();
    }

    public void calculateAveragePercentage() {
        AveragePercentage = (int) (this.totalMarks / 4.0);
    }

    public void calculateTotalMarks() {
        totalMarks = this.DataScience + this.WebTech + this.Maths + this.Accounts;
    }

    public void calculateGrade() {
        if (AveragePercentage >= 85) {
            grade = "A";
        } else if (AveragePercentage >= 70) {
            grade = "B";
        } else if (AveragePercentage >= 60) {
            grade = "C";
        } else if (AveragePercentage >= 40) {
            grade = "D";
        } else if (AveragePercentage >= 33) {
            grade = "Pass";
        } else {
            grade = "F";
        }
    }

    public void printDetails() {
        calculateTotalMarks();
        calculateAveragePercentage();
        calculateGrade();
        System.out.println("Student name : " + this.StudentName);
        System.out.println("Marks in DataScience : " + this.DataScience + "/100");
        System.out.println("Marks in WebTech : " + this.WebTech + "/100");
        System.out.println("Marks in Maths : " + this.Maths + "/100");
        System.out.println("Marks in Science : " + this.Accounts + "/100");
        System.out.println("Total marks of " + this.StudentName + " : " + this.totalMarks + "/400");
        System.out.println("Average percentage of " + this.StudentName + " : " + this.AveragePercentage + "%");
        System.out.println("Grade of " + this.StudentName + ": " + this.grade);
    }
}

public class Index {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentGradeInfo studentA = new StudentGradeInfo(sc);
        StudentGradeInfo studentB = new StudentGradeInfo(sc);
        studentA.printDetails();
        studentB.printDetails();
    }
}
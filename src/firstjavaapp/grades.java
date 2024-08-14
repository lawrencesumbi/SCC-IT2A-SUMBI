package firstjavaapp;

import java.util.Scanner;

public class grades {
    
    public void getGrade(){
    
    Scanner input = new Scanner(System.in);
        
        String name;
        int math, science, english, computer;
        int marks;
        float average;
        
        System.out.print("Enter your full name: ");
            name = input.nextLine();
        System.out.print("-Enter Marks in: ");
        System.out.print("\nMath: ");
            math = input.nextInt();
        System.out.print("Science: ");
            science = input.nextInt();
        System.out.print("English: ");
            english = input.nextInt();
        System.out.print("Computer: ");
            computer = input.nextInt();
        
        System.out.println("----------------------------------");
        System.out.println("Grade Detail");
        System.out.println("----------------------------------");
        
        marks = math + science + english + computer;
        average = marks / 4;
        
        System.out.println("Name: "+name+"\nTotal Marks: "+marks);
        System.out.println(String.format("%.2f", average));
        
    }
}

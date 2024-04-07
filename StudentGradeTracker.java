package studentgradetracker;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class StudentGradeTracker {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> grades = new ArrayList<Integer>();
        
        System.out.print("Enter No. of grades : ");
        int noOfGrades = sc.nextInt();
        
        System.out.print("Enter student's grades : ");
        int stGrade;
        for(int i = 0;i<noOfGrades;i++){
            stGrade = sc.nextInt();
            grades.add(stGrade);
        }
        
        Collections.sort(grades);
        
        int sum = 0;
        
        for(int i: grades){
            sum=sum+i;
        }
        
        int min = grades.get(0);
        int max = grades.get(noOfGrades-1);
        int avg = sum/noOfGrades;
        
        System.out.println("Average scores : "+ avg);
        System.out.println("Highest scores : "+ max);
        System.out.println("Lowest scores : "+ min);
        
    }
    
}

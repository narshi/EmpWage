  
import java.io.*;
import java.util.Random;
import java.util.ArrayList;

public class Attendance{

  int empWagePerHrs,empHrs,empSalary;

 Attendance()
 {
   System.out.println("Default Constructor called");
 }

  //Parameterized constructor
 public Attendance(int wagePerHrs, int Hrs)
 {
      empWagePerHrs=wagePerHrs;
      empHrs=Hrs;
      empSalary=0;
 }

 public int empAttendance()
 {
   Random myRan=new Random();
   int myRanVar=myRan.nextInt(3); 
   System.out.println("Random Integers: "+myRanVar);
   return myRanVar;
 }

  public void calSalary()
 {
   empSalary=empWagePerHrs*empHrs;
   System.out.println("Salary of the employee:" + empSalary);
 }



public static void main (String args[]){
     System.out.println("---------------------------------------------------");
     System.out.println("WELCOME TO EMPLOYEE WAGE PROBLEM");
     System.out.println("---------------------------------------------------");
     Attendance ewc=new Attendance();
     int resultAttendance=ewc.empAttendance();
     if(resultAttendance==0)
       {
         System.out.println("Employee is Absent");
         Attendance ewc1=new Attendance(20,0);
         ewc1.calSalary();
       }
       if(resultAttendance==1)
       {
         System.out.println("Part time employee");
         Attendance ewc1=new Attendance(20,4);
         ewc1.calSalary();
       }
      if(resultAttendance==2)
       {
         System.out.println("Employee is Present");
         Attendance ewc1=new Attendance(20,8);
         ewc1.calSalary();
       }
 }

}


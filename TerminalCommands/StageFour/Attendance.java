  
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
       switch(resultAttendance){
           case 0:
            System.out.println("Employee is Absent");
                  EmployeeWageComputation ewc0=new EmployeeWageComputation(20,0);
                  ewc0.calSalary();
                  break;
           case 1:
                  System.out.println("Employee is Present: PART TIME");
                  EmployeeWageComputation ewc1=new EmployeeWageComputation(20,4);
                  ewc1.calSalary();
                  break;
           case 2:
                  System.out.println("Employee is Present: FULL TIME");
                  EmployeeWageComputation ewc2=new EmployeeWageComputation(20,8);
                  ewc2.calSalary();
                  break;
          default : System.out.println("Invalid");
     }
 }

}

  
import java.io.*;
import java.util.Random;
import java.util.ArrayList;

public class Attendance{

   int empWagePerHrs,empHrs,empSalary,daysPerMonth,TotalEmpSalary,totalMaxHr,i,totalHr;

 Attendance()
 {
   System.out.println("Default Constructor called");
 }

  //Parameterized constructor
 public Attendance(int wagePerHrs, int monthDays, int maxHrs)
 {
    this.empWagePerHrs=wagePerHrs;
    this.daysPerMonth=monthDays;
    this.totalMaxHr=maxHrs;
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
    empHrs=0;
    empSalary=0;
    TotalEmpSalary=0;
    totalHr=0;
    i=0;

    while(totalHr <= totalMaxHr && i < daysPerMonth)
    {
      int resultAttendance=empAttendance();
      i++;
      switch(resultAttendance){
           case 0:
                  System.out.println("Employee is Absent");
                  empHrs=0;
                  break;
           case 1:
                  System.out.println("Employee is Present: PART TIME");
                  empHrs=4;
                  break;
           case 2:
                  System.out.println("Employee is Present: FULL TIME");
                  empHrs=8;
                  break;
          default : System.out.println("Invalid");
      }
     totalHr=totalHr+empHrs;
     System.out.println("DAY"+i+" : Empolyee Hours: "+empHrs);
     //empSalary=empWagePerHrs*totalHr;
     //TotalEmpSalary=empSalary+TotalEmpSalary;
    }
    empSalary=empWagePerHrs*totalHr;
    System.out.println("----------------------------------------------");
    System.out.println("Total Hours: "+ totalHr);
    System.out.println("Total Salary: "+ empSalary);
 }

 public static void main (String args[]){
     System.out.println("---------------------------------------------------");
     System.out.println("WELCOME TO EMPLOYEE WAGE PROBLEM");
     System.out.println("---------------------------------------------------");
     Attendance ewc=new Attendance(20,20,100);
     ewc.calSalary();
 }

}


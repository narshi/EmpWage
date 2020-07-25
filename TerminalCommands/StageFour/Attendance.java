  
import java.io.*;
import java.util.Random;
import java.util.ArrayList;
import wages.EmployeeBuilder;

public class Attendance{

 int empWagePerHrs;
 int daysPerMonth;
 int totalMaxHr;
 int partTimeHrs;
 int fullTimeHrs;

  //Parameterized constructor
 //  public Attendance(int empWagePerHrs, int daysPerMonth, int totalMaxHr, int partTimeHrs, int fullTimeHrs, String companyName)
 // {
 //   this.empWagePerHrs=empWagePerHrs;
 //   this.daysPerMonth=daysPerMonth;
 //   this.totalMaxHr=totalMaxHr;
 //   this.partTimeHrs=partTimeHrs;
 //   this.fullTimeHrs=fullTimeHrs;
 //   this.companyName=companyName;
 // }

 // public int empAttendance()
 // {
 //   Random myRan=new Random();
 //   int myRanVar=myRan.nextInt(3);
 //   //System.out.println("\nRandom Integers: "+myRanVar);
 //   return myRanVar;
 // }

 public int calSalary(EmployeeBuilder eb1)
 {
    int empHrs=0,empSalary=0,TotalEmpSalary=0,totalHr=0,i=0;

    while(totalHr <= eb1.totalMaxHr && i < eb1.daysPerMonth)
    {
      Random myRan=new Random();
      int resultAttendance=myRan.nextInt(3);
      i++;
      switch(resultAttendance){
           case 0:
                  //System.out.println("Employee is Absent");
                  empHrs=0;
                  break;
           case 1:
                  //System.out.println("Employee is Present: PART TIME");
                  empHrs=eb1.partTimeHrs;
                  break;
           case 2:
                  //System.out.println("Employee is Present: FULL TIME");
                  empHrs=eb1.fullTimeHrs;
                  break;
          default : System.out.println("Invalid");
      }
     totalHr=totalHr+empHrs;
    }
    empSalary=eb1.empWagePerHrs*totalHr;
    return empSalary;
 }

 public static void main (String args[]){
     System.out.println("------------**********  WELCOME TO WAGE CALCULATION  *****------------------");

      Attendance ewc=new Attendance();
     EmployeeBuilder eb1=new EmployeeBuilder();
     eb1.companyName="Tata Consultancy service";
     eb1.empWagePerHrs=20;
     eb1.daysPerMonth=20;
     eb1.totalMaxHr=100;
     eb1.partTimeHrs=4;
     eb1.fullTimeHrs=8;

     int result1=ewc.calSalary(eb1);
     System.out.println("Company Name: "+eb1.companyName);
     System.out.println("The Employee Wage for company: "+result1);
     System.out.println("---------------------------***************----------------------------------");

 }

}

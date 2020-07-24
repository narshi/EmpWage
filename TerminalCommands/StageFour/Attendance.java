  
import java.io.*;
import java.util.Random;
import java.util.ArrayList;

public class Attendance{

 Attendance()
 {
   System.out.println("Default Constructor called");
 }

 public void empAttendance()
 {
   Random myRan=new Random();
   int myRanVar=myRan.nextInt(2);
   System.out.println("Random Integers: "+myRanVar);

	    if(myRanVar==0)
       {
         System.out.println("Employee Absent");
       }
      else
       {
         System.out.println("Employee Present");
       }
 }

 public static void main (String args[]){
     System.out.println("WELCOME TO CHECK THE WAGES OF EMPLOYEES");
     System.out.println("RANDOM aTTENDANCE CHECK OF EMPLOYEES");
     Attendance ewc=new Attendance();
     ewc.empAttendance();
 }

}

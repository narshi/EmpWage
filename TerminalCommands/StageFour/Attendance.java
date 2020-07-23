

package wages;  
import java.io.*;
import java.util.Random;
import java.util.ArrayList;

public class Attendance{

	static int count = 0;
	
	public static void main(String[] args) {
		int upperbound = 2;
			ArrayList<Integer> present = new ArrayList<Integer>();
    ArrayList<Integer> absent = new ArrayList<Integer>();
	Random rand = new Random();
	int int_random = rand.nextInt(upperbound);
	double double_random=rand.nextFloat();
	if(int_random==1){
		present.add(int_random);
		count++;
	}else{
		absent.add(int_random);
		count++;
	}
	System.out.println("Total employees = "+count);
	System.out.println("No. of people present = "+present.size());
	System.out.println("No. of people absent = "+absent.size());
		
	}


}

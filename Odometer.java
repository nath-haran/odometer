/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Odometer
{
	public static boolean isOdometerNumber(int num){
		int previous,current;
		previous=Integer.MAX_VALUE;
		while(num>0){
			current=num%10;
			if(current>=1&&current<=9&&(current<previous)){
				previous=current;
				num/=10;
			}
			else{
				return false;
			}
			
		}
		return true;
	}
	public static int getFirstNumber(int len){
		int firstNumber=0;
		for(int i=1;i<=len;i++){
			firstNumber=firstNumber*10+i;
		}
		return firstNumber;
	}
	public static boolean isLast(int num){
		
		int current,previous;
		previous=10;
		while(num>0){
			current=num%10;
			num/=10;
			if(previous-current!=1)
				return false;
			previous=current;
		}
		return true;
		
	}
	 public static ArrayList getList(int len){
		 	int firstNumber;
		 	ArrayList<Integer> odometerList=new ArrayList<Integer>();
		 	firstNumber=getFirstNumber(len);
		 	
		 	for(int i=firstNumber;;i++){
		 		if(isOdometerNumber(i))
		 			odometerList.add(i);
		 		if(isLast(i))
		 			return odometerList;
		 	}
		 	
	 }
	
}

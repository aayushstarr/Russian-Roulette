import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class RussianRoulette {
    static int min=0,max=0;
    static int[] revisedRussianRoulette(int[] doors) {
       
        
        for(int i=0 ; i<doors.length ; i++)
        {
            if(doors[i]==0)
            {
            	
                continue;
                
            }
                
            else
            {
            	min++;
            	max++;
                doors[i]=0;
                if((i+1)==doors.length)
                	break;
                if(doors[i+1]==1)
                {
                	max++;
                	doors[i+1]=0;
                }
               
            }
        }
        return doors;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the no. of doors");
        int n = in.nextInt();
        int[] doors = new int[n];
        System.out.println("Enter the status of door.. 0 for unlock and 1 for locked");
        for(int doors_i = 0; doors_i < n; doors_i++){
        	System.out.println("Status of door "+(doors_i+1));
            doors[doors_i] = in.nextInt();
        }
        int[] result = revisedRussianRoulette(doors);
       /* for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
        }*/
        System.out.println(min+" "+max);


        in.close();
    }
}


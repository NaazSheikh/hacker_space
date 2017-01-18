import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        
        //Read in input
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int q = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        //Initialize and change head and tail positions according to k-array rotations
        int head = 0;
        int tail = n-1;
        
        head -= k;
        tail -= k;
        
        do{
           head+= n; 
        }
        while(head < 0);
        
        do{
           tail+= n; 
        }
        while(tail < 0);
        
        for(int a0 = 0; a0 < q; a0++){
            int m = in.nextInt();
            System.out.println(a[(head+m)%n]);
        }
        
    }
}

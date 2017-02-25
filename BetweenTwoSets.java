import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] a = new int[n];
        int maxA = 0;
        int minB = 101;
        int counter = 0;
        
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
            if(a[a_i] > maxA) maxA = a[a_i];
        }
        int[] b = new int[m];
        for(int b_i=0; b_i < m; b_i++){
            b[b_i] = in.nextInt();
            if(b[b_i] < minB) minB = b[b_i];
        }
        
        for(int i = maxA; i <= minB; i++){
            boolean bool1 = false;
            boolean broke = false;
            for(int x: a){
                if(!(i % x == 0)){
                    broke = true;
                    break;
                }
            }
            if(broke) continue;
            for(int y: b){
                if(!(y % i == 0)){
                    broke = true;
                    break;
                }
            }
            if(broke) continue;
            counter++;
        }
        
        System.out.println(counter);
    }
}

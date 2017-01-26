import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int v1 = in.nextInt();
        int x2 = in.nextInt();
        int v2 = in.nextInt();
    
        double k = ((double) x2 - (double) x1)/ ((double) v1 - (double) v2);
        
        if(k == (int) k && k > 0) System.out.println("YES");
        else System.out.println("NO");
}
}

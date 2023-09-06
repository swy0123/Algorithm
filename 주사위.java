package algo;

import java.lang.*;
import java.io.*;
import java.util.*;

// 주사위 1041
public class 주사위 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        int N = Integer.parseInt(br.readLine());
        
        int[] page = new int[6];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<6; i++) {
        	page[i] = Integer.parseInt(st.nextToken());
        }
        
        if(N==1) {
            Arrays.sort(page);
        	System.out.println(page[0]+page[1]+page[2]+page[3]+page[4]);
        }
        else {
        	int[] min = new int[3];
            min[0] = Math.min(page[0], page[5]);
            min[1] = Math.min(page[1], page[4]);
            min[2] = Math.min(page[2], page[3]);
            Arrays.sort(min);
            
            long thr, two, one;
            thr = 4L * (min[0] + min[1] + min[2]);
            two = (8L * N - 12) * (min[0] + min[1]);
            one = ((N-2) * ((N-2) * 5L + 4)) * min[0];
            
            System.out.println(thr + two + one);
        }
    }
}
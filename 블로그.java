package algo;

import java.lang.*;
import java.io.*;
import java.util.*;

// 주사위 1041
public class 블로그 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());
        
        long max = 0;
        int cnt = 0;

        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++) {
        	arr[i] = Integer.parseInt(st.nextToken());
        }
        for(int i=0; i<X; i++) {
        	max += arr[i];
        }
        if(max != 0) cnt = 1;
        long cur = max;
        for(int i=X; i<N; i++) {
        	cur = cur + arr[i] - arr[i-X];
        	if(cur == max && cur!=0) cnt++;
        	else if(cur > max) {
        		max = cur;
        		cnt = 1;
        	}
        }
        if(cnt==0) System.out.println("SAD");
        else {
            System.out.println(max);
            System.out.println(cnt);
        }
        
        
    }
}
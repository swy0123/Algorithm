package algo;

import java.lang.*;
import java.io.*;
import java.util.*;

// 용액 합성하기 14921
public class 용액합성하기 {
	static int min = Integer.MAX_VALUE;
	static int res = Integer.MAX_VALUE;
	static int[] arr;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        int N = Integer.parseInt(br.readLine());
        
        arr = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++) {
        	arr[i] = Integer.parseInt(st.nextToken());
        }
        
        int start = 0;
        int end = N-1;
        
        while(start<end) {
//        	System.out.println(arr[start] +" "+ arr[end]);
        	if(arr[end] + arr[start]>0) {
        		if(min>Math.abs(arr[end] + arr[start])) {
        			min = Math.abs(arr[end] + arr[start]);
        			res = arr[end] + arr[start];
        			if(min==0) break;
        		}
    			end--;
        	}
        	else if(arr[end] + arr[start]<0) {
        		if(min>Math.abs(arr[end] + arr[start])) {
        			min = Math.abs(arr[end] + arr[start]);
        			res = arr[end] + arr[start];
        			if(min==0) break;
        		}
        		start++;
        	}
        	else {
        		res = 0;
        		break;
        	}
        }
        System.out.println(res);
    }
}
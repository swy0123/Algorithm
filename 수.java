package algo;

import java.lang.*;
import java.io.*;
import java.util.*;

// 수 22943
public class 수 {
	static int K, M, size, res;
	static boolean[] check, sum, mul;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        K = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        size = (int)Math.pow(10, K);
        
        check = new boolean[size];
        check[0] = true;
        check[1] = true;
        for(int i=2; i<size; i++) {
        	if(check[i]) continue;
        	for(int j=i; j<size; j+=i) {
        		if(j==i)continue;
        		check[j] = true;
        	}
        }
        sum = new boolean[size];
        L: for(int i=2; i<size; i++) {
        	if(check[i]) continue;
        	for(int j=i+1; j<size; j++) {
            	if(check[j]) continue;
            	if(i+j>=size) continue L;
        		sum[i+j] = true;
        	}
        }
        mul = new boolean[size];
        L: for(int i=2; i<size; i++) {
        	if(check[i]) continue;
        	for(int j=i; j<size; j++) {
            	if(check[j]) continue;
            	if((long)i*j>=size) continue L;
            	mul[i*j] = true;
        	}
        }
        back(0, 0, new boolean[10]);
        System.out.println(res);
    }
    
    private static void back(int depth, int n, boolean[] v) {
    	if(depth == K) {
    		if(sum[n]) {
    			int tmp = n;
    			while(tmp%M==0) {
    				tmp/=M;
    			}
    			if(mul[tmp]) res++;
    		}
    		return;
    	}
    	for(int i=0; i<=9; i++) {
    		if(i==0 && depth==0) continue;
    		if(v[i]) continue;
    		v[i] = true;
    		back(depth+1, n*10+i, v);
    		v[i] = false;
    	}
    }
}
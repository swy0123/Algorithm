package algo;

import java.lang.*;
import java.io.*;
import java.util.*;

// 과제는끝나지않아 17952
public class 과제는끝나지않아 {
	private static class node{
		int A, T;
		public node(int A, int T) {
			this.A = A;
			this.T = T;
		}
	}
    public static void main(String[] args) throws Exception{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st;
    	int N = Integer.parseInt(br.readLine());
    	int score = 0;
    	Deque<node> stack = new ArrayDeque<>();
    	
    	for(int i=0; i<N; i++) {
    		st = new StringTokenizer(br.readLine());
    		int flag = Integer.parseInt(st.nextToken());
    		if(flag==1) {
    			stack.add(new node(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())));
    		}
    		if(!stack.isEmpty()) {
    			node cur = stack.pollLast();
        		if(cur.T-1 == 0) score += cur.A;
        		else stack.add(new node(cur.A, cur.T-1));
    		}
    	}
    	System.out.println(score);
    }
}
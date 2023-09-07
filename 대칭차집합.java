package algo;

import java.lang.*;
import java.io.*;
import java.util.*;

// 대칭차집합 1269
public class 대칭차집합 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        
        Set<Integer> setA = new HashSet<>();
        Set<Integer> setB = new HashSet<>();
        Set<Integer> setC = new HashSet<>();
        
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<A; i++) {
        	int tmp = Integer.parseInt(st.nextToken());
        	setA.add(tmp);
        	setC.add(tmp);
        }
        
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<B; i++) {
        	int tmp = Integer.parseInt(st.nextToken());
        	setB.add(tmp);
        	setC.add(tmp);
        }
        
        System.out.println(setA.size()+setB.size()-(setA.size()+setB.size()-setC.size())*2);
    }
}
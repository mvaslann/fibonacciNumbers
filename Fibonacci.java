/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacci;

/**
 *
 * @author MVA
 */
public class Fibonacci {

    /**
     * @param args the command line arguments
     */
    
    public static long fib(long n) {

	  if(n <= 1) return n;
	  else return fib(n-1) + fib(n-2);
    }
    
    
    public static void main(String[] args) {
        
        int n = Integer.parseInt(args[0]);
	      for(int i = 1; i <= n; i++)
		        System.out.println(fib(i) + " ");
        
    /* Non-Recursive Fibonacci Method
        long first = 0, second = 1, next;
        int range = Integer.parseInt(args[0]);
        for(int j=0; j<=range; j++) {
            if(j <= 1)
                next = j;
            else {
                next = first + second;
                first = second;
                second = next;
            }
            System.out.println(next);
        }
    */
        
    }
    
}

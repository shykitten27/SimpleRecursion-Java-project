// Simple Recursion Example
package simplerecursion;

import java.util.*;

class SimpleRecursion {
  public static void main (String[] args) {
	Scanner sc = new Scanner(System.in);
	int r = 0;

   System.out.println("This program shows how recursion works by counting down a simple integer.");
   System.out.println("\nPlease enter your counter (small int, e.g.2-5): ");
   r = sc.nextInt();

   System.out.println("\nThis is in main, just before the start of the recursion.  r currently = " + r);
   recur(r);
   System.out.println("\nBack in main to finish; r here is = " + r);
}

static void recur(int r) {

   System.out.println("Have entered recur routine: r this iteration = " + r);
   if (r > 0) {
	   recur(r-1);
   } else {
	   System.out.println("\nInside the else clause of recur; r = " + r + "\n");
   }
   System.out.println("Leaving this iteration of recur; r = " + r);
}
}


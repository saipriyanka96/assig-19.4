package empd;
//Package is a grouping of related types providing access protection and name

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriortyQueueDemo { //creating main class 
	

public static void main(String[] args) {  //creating main method 
	// creating an instance of PriorityQueue in Java
	// Its better to define initial capacity because 
	// its backed by array
	//creating an object with size
	PriorityQueue<Integer> pq = new PriorityQueue<Integer>(16);
	// adding numbers into PriorityQueue in arbitrary order
	pq.add(3); 
	pq.add(7);
	pq.add(2);
	pq.add(4);
	pq.add(1);
	pq.add(5);
	
	  
    	System.out.println("PriorityQueue list"+pq);
    	//system is final class
	      //out is a static member of system class and type printStream
	      //println is method of printStream class.ln means nextline
	   

	// Now, let's if PriorityQueue keeps the smallest
	// element in head or not. Let's use peek method
	// to check that, peek() returns the head of the
	// queue 
	             Integer head = pq.peek();
	
	                System.out.println("head of the PriorityQueue : " + head); // 1 
	// Now, let's remove the head and see what comes
	// next, you can use poll() method to remove
	// element from head
	    head = pq.poll(); // 1
     	head = pq.peek();
            	System.out.println("Current value of head : " + head);
	
	// Iterating over PriorityQueue, iterator returned 
	// by PriorityQueue doesn't guarantee any order
	
	         Iterator<Integer> iterator = pq.iterator(); 
              	System.out.println("Iterating over PriorityQueue");
	// object next() :it returns the element and moves the cursor pointer to next element.
    			
              	while(iterator.hasNext()){
		System.out.println(iterator.next());
	    } 
	}

}
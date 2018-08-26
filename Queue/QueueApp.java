package Queue;
import java.util.*;

class Queue{
	
	private int maxSize;
	private int[] queArray;
	private int front;
	private int rear;
	private int nItems;
	
	public Queue(int s)		// constructor
	{
		maxSize = s;
		queArray = new int[maxSize];
		front = 0;
		rear = -1;
		nItems = 0;
	}
	
	public void insert (int j)		// put item at rear of queue
	{
		if (rear == maxSize -1)		// deal with wraparound
			rear = -1;
		queArray[++rear] =j;		// increment rear and insert
		
		nItems++;					// one more item
	}
	
	public int remove() 
	{
		int temp = queArray[front++];	// take item from front of queue 
		if (front == maxSize)			// deal with wraparound
			front = 0;
		nItems--;						// one less item
		return temp;
	}
	
	public int peekFront()				// peek at front of queue
	{
		return queArray[front];
	}
	
	public boolean isEmpty()			// true if queue is empty
	{
		return (nItems == 0);
	}
	
	public boolean isFull()				// true if queue is full
	
	{
		return (nItems == maxSize);
	}
	
	public int size()					// number of items in queue
	
	{
		return nItems;
	}
}
public class QueueApp {
	
	public static void main (String[] args)
	{
		Queue theQueue = new Queue(5);
		
		theQueue.insert(10);	// insert 4 items
		theQueue.insert(20);
		theQueue.insert(30);
		theQueue.insert(40);
		
		theQueue.remove();		// remove 2 items (10, 20 )
		theQueue.remove();
		
		theQueue.insert(50);	// insert 4 more items
		theQueue.insert(60);
		theQueue.insert(70);
		theQueue.insert(80);
		
		while (!theQueue.isEmpty())
		{
			int n = theQueue.remove();	// remove and dispaly all items
			System.out.println(n);
			System.out.println(" ");
		}
		System.out.println("");
	}

}

import static org.junit.Assert.*;

import org.junit.*;
import org.junit.Test;

public class CircularLinkedListTest {

	private  CircularLinkedList obj;
	@Before
	public  void initialize()
	{
		obj = new CircularLinkedList();	
	}
	
	@Test
	public void pushFrontTest()
	{
		int[] ExpectedArray = {4,13,7,11,10};
	     
   		
   			
   		
   		CircularLinkedList.pushFront(10);
   		CircularLinkedList.pushFront(11);
   		CircularLinkedList.pushFront(7);
   		CircularLinkedList.pushFront(13);
   		CircularLinkedList.pushFront(4);
   		
   		for (int i =0; i < CircularLinkedList.size ; i++)
		{
			assertEquals(ExpectedArray[i], CircularLinkedList.head.key );
			CircularLinkedList.head=CircularLinkedList.head.next;
			//CircularLinkedList.popFront();
		}
   		for(int i=0; i<6 ;i++)
   		{
   		 CircularLinkedList.popFront();
   		}
   	    
	}
	
	
	@Test 
	public void pushBackTest()
	{
		int[] ExpectedArray = {10,11,7,13,4};
	     
		CircularLinkedList.pushBack(10);
		CircularLinkedList.pushBack(11);
		CircularLinkedList.pushBack(7);
		CircularLinkedList.pushBack(13);
		CircularLinkedList.pushBack(4);
   		
   		for (int i =0; i < CircularLinkedList.size ; i++)
		{
			assertEquals(ExpectedArray[i], CircularLinkedList.head.key);
			CircularLinkedList.head=CircularLinkedList.head.next;
			//CircularLinkedList.popFront();
		}	
	}
	
	
	@Test 
	public void popBackTest()
	{
		int[] ExpectedArray = {13};
	     
		CircularLinkedList.pushFront(10);
		CircularLinkedList.pushFront(11);
		CircularLinkedList.pushFront(7);
		CircularLinkedList.pushFront(13);
		CircularLinkedList.pushFront(4);
   		
		CircularLinkedList.popBack();
		CircularLinkedList.popBack();
		CircularLinkedList.popBack();
		CircularLinkedList.popBack();
		CircularLinkedList.popBack();
  		for (int i =0; i < CircularLinkedList.size; i++)
   		{
	  			assertEquals(ExpectedArray[i], CircularLinkedList.head.key);
	            CircularLinkedList.head=CircularLinkedList.head.next;
   		}
	
	

   }
	
	
}
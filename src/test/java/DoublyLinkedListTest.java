import static org.junit.Assert.*;

import org.junit.*;
import org.junit.Test;

public class DoublyLinkedListTest {

	private  DoublyLinkedList obj;
	@Before
	public  void initialize()
	{
		obj = new DoublyLinkedList();	
	}
	
	@Test
	public void pushFrontTest()
	{
		int[] ExpectedArray = {4,13,7,11,10};
	     
   		
   			
   		
		DoublyLinkedList.pushFront(10);
		DoublyLinkedList.pushFront(11);
		DoublyLinkedList.pushFront(7);
		DoublyLinkedList.pushFront(13);
		DoublyLinkedList.pushFront(4);
   		
   		for (int i =0; i < DoublyLinkedList.size ; i++)
		{
			assertEquals(ExpectedArray[i], DoublyLinkedList.head.key );
			DoublyLinkedList.head=DoublyLinkedList.head.next;
			//DoublyLinkedList.popFront();
		}
   		for(int i=0; i<5 ;i++)
   		{
   			DoublyLinkedList.popFront();
   		}
   	    
	}
	
	
	@Test 
	public void pushBackTest()
	{
		int[] ExpectedArray = {10,11,7,13,4};
	     
         DoublyLinkedList.pushBack(10);
         DoublyLinkedList.pushBack(11);
         DoublyLinkedList.pushBack(7);
         DoublyLinkedList.pushBack(13);
         DoublyLinkedList.pushBack(4);
   		
   		for (int i =0; i < DoublyLinkedList.size ; i++)
		{
			assertEquals(ExpectedArray[i], DoublyLinkedList.head.key);
			DoublyLinkedList.head=DoublyLinkedList.head.next;
			//CircularLinkedList.popFront();
		}	
	}
	
	@Test 
	public void popBackTest()
	{
		int[] ExpectedArray = {13};
	     
		DoublyLinkedList.pushFront(10);
		DoublyLinkedList.pushFront(11);
		DoublyLinkedList.pushFront(7);
		DoublyLinkedList.pushFront(13);
		DoublyLinkedList.pushFront(4);
   		
		DoublyLinkedList.popBack();
		DoublyLinkedList.popBack();
		DoublyLinkedList.popBack();
		DoublyLinkedList.popBack();
		DoublyLinkedList.popBack();
  		for (int i =0; i < DoublyLinkedList.size; i++)
   		{
	  			assertEquals(ExpectedArray[i], DoublyLinkedList.head.key);
	  			DoublyLinkedList.head=DoublyLinkedList.head.next;
   		}
	
  		for(int i=0; i<5 ;i++)
   		{
   			DoublyLinkedList.popFront();
   		}

	}
	}

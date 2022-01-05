import static org.junit.Assert.*;

import org.junit.*;
import org.junit.Test;

public class LinkedListTest {

	private  LinkedList obj;
	@Before
	public  void initialize()
	{
		obj = new LinkedList();	
	}
	
	@Test
	public void pushFrontTest()
	{
   		int[] ExpectedArray = {4,13,7,11,10};
     
   		LinkedList.pushFront(10);
   		LinkedList.pushFront(11);
   		LinkedList.pushFront(7);
   		LinkedList.pushFront(13);
   		LinkedList.pushFront(4);
   		
   		for (int i =0; i < LinkedList.size ; i++)
		{
			assertEquals(ExpectedArray[i], LinkedList.head.key );
			LinkedList.popFront();
		}
       
   	//	LinkedList.popFront();
   	//	LinkedList.popFront();
   	//	LinkedList.popFront();
   	//	LinkedList.popFront();

    		
   		
	
	}
	
	@Test
	public void pushBacktTest()
	{
   		int[] ExpectedArray = {10,11,7,13,4};
     
   		LinkedList.pushBack(10);
   		LinkedList.pushBack(11);
   		LinkedList.pushBack(7);
   		LinkedList.pushBack(13);
   		LinkedList.pushBack(4);
   		
   		for (int i =0; i < LinkedList.size ; i++)
		{
			assertEquals(ExpectedArray[i], LinkedList.head.key);
			LinkedList.popFront();
		}
        
	}
	
	@Test 
	public void popBackTest()
	{
		int[] ExpectedArray = {4,13};
	     
   		LinkedList.pushFront(10);
   		LinkedList.pushFront(11);
   		LinkedList.pushFront(7);
   		LinkedList.pushFront(13);
   		LinkedList.pushFront(4);
   		
   		LinkedList.popBack();
   		LinkedList.popBack();
   		LinkedList.popBack();
   		for (int i =0; i < LinkedList.size ; i++)
   		{
   			assertEquals(ExpectedArray[i], LinkedList.head.key);
			LinkedList.head=LinkedList.head.next;
   		}
	}
	

	@Test 
	public void popTest()
	{	
		int[] ExpectedArray = {11};
	     
   		LinkedList.pushFront(10);
   		LinkedList.pushFront(11);
   		LinkedList.pushFront(7);
   		
   		LinkedList.pop(0);
   		LinkedList.pop(1);
   		for (int i =0; i < LinkedList.size ; i++)
   		{
   			assertEquals(ExpectedArray[i], LinkedList.head.key);
   			LinkedList.head=LinkedList.head.next;
   		}
	}
	
	
}	

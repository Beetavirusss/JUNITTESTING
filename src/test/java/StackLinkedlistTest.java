import static org.junit.Assert.*;

import org.junit.*;
import org.junit.Test;

public class StackLinkedlistTest {

	
	private  StackLinkedlist obj;
	@Before
	public  void initialize()
	{
		obj = new StackLinkedlist();	
	}
	@Test
	
	public void  pushTest()
	{
		int[] expectedArray1= {650,45,23,11,10};
	//	int[] expectedArray2= {10,11,23, 45};
		StackLinkedlist.push(10);
		StackLinkedlist.push(11);
		StackLinkedlist.push(23);
		StackLinkedlist.push(45);
		StackLinkedlist.push(650);
		
		for (int i=0; i < StackLinkedlist.size ; i++)
		{
			assertEquals(expectedArray1[i], StackLinkedlist.top());
			StackLinkedlist.pop();
		}
	 
		StackLinkedlist.top();
		StackLinkedlist.pop();
		StackLinkedlist.pop();
	    

		assertEquals(-1, StackLinkedlist.top());
		StackLinkedlist.pop();

		
	
	}
	
	

}

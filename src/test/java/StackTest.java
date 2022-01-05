import static org.junit.Assert.*;

import org.junit.*;
import org.junit.Test;

public class StackTest {

	
	
	private  Stack obj;
	@Before
	public  void initialize()
	{
		obj = new Stack();	
	}
	@Test
	
	public void  pushTest()
	{
		int[] expectedArray1= {10,11,23, 45, 650};
		int[] expectedArray2= {10,11,23, 45};
		Stack.push(10);
		Stack.push(11);
		Stack.push(23);
		Stack.push(45);
		Stack.push(650);
		
		for (int i =0; i < Stack.size ; i++)
		{
			assertEquals(expectedArray1[i], Stack.array[i]);
		}
	
		Stack.pop();
		Stack.pop();
		Stack.pop();
		Stack.pop();
		Stack.pop();
		
	
	}
	
    @Test
	public void  popTest()
	{
		int[] expectedArray1= {10,11,23, 45};
		int[] expectedArray2= {10,11,23, 45};
		Stack.push(10);
		Stack.push(11);
     	Stack.push(23);
		Stack.push(45);
		Stack.push(650);
		
		Stack.pop();
		
		for (int i =0; i < Stack.size ; i++)
		{
			assertEquals(expectedArray1[i], Stack.array[i]);
		}
	
		Stack.pop();
		Stack.pop();
		Stack.pop();
		Stack.pop();
		Stack.pop();
		
	
	}
	

}

import static org.junit.Assert.*;

import org.junit.*;
import org.junit.Test;

public class ArrayTest {

	private  Array obj;
	@Before
	public  void initialize()
	{
		obj = new Array();	
	}
	@Test
	public void insertTest()
	{
		int[] ExpectedArray = {10,11,7,13,4,12};
		
		
	
		Array.insert(10, 0);
		Array.insert(11, 1);
		Array.insert(7, 2);
		Array.insert(13, 3);
		Array.insert(12, 4);
		Array.insert(4, 4);
		
		
		for (int i =0; i < Array.size ; i++)
		{
			assertEquals(ExpectedArray[i], Array.array[i] );
		}
	}
	
	
	
	@Test
	public void deletionTTest()
	{
		int[] ExpectedArray = {10,11,12,12};
		Array.insert(10, 0);
		Array.insert(11, 1);
		Array.insert(12, 2);
		Array.insert(12, 2);
		
		Array.delete(2);
		
		for (int i=0; i <Array.size ; i++)
		{
			assertEquals(ExpectedArray[i], Array.array[i] );
		}
	}
	
	@Test
	public void deletionFTest()
	{
		int[] ExpectedArray = {10,4,5};
		Array.insert(6, 0);
		Array.insert(5, 1);
		Array.insert(6, 2);
		Array.insert(5, 2);
		Array.delete(2);
		
		for (int i=0; i <Array.size ; i++)
		{
			assertNotEquals(ExpectedArray[i], Array.array[i] );
		}
	}
	
	@Test 
	public void linearSearchPosTest()
	{
		int check = 1;
		Array.insert(5,0);
		Array.insert(4,1);
		Array.insert(1,2);
		Array.insert(3,3);
		
		Array.linearSearch(check);
		
		assertTrue(Array.linearSearch(check));
		
		
		
		
	}
	
	@Test 
	public void linearSearchNegTest()
	{
		int[] exp = {1,2,3};
		assertFalse(Array.linearSearch(7));
	}
	
	@Test 
	public void binarySearchPosTest()
	{
		int check = 1;
		int HIGH= 3;
		int LOW=0;
		Array.insert(1,0);
		Array.insert(2,1);
		Array.insert(3,2);
		Array.insert(4,3);
		
		Array.binarySearch(check, LOW, HIGH);
		
		assertTrue(Array.binarySearch(check, LOW, HIGH));
	}
	
	@Test
	public void binarySearchnegTest()
	{
		int check = 5;
		int HIGH= 3;
		int LOW=0;
		Array.insert(0,0);
		Array.insert(3,1);
		Array.insert(2,2);
		Array.insert(4,3);
		
		Array.binarySearch(check, LOW, HIGH);
		
		assertFalse(Array.binarySearch(check, LOW, HIGH));

	}
	
	
	@Test 
	public void bubbleSortTest()
	{
		int[] expected= {1,2,3,4,5};
		
		Array.insert(5, 0);
		Array.insert(3, 1);
		Array.insert(2, 2);
		Array.insert(1, 3);
		Array.insert(4, 4);
		
		Array.bubbleSort();
		for (int i=0; i <Array.size ; i++)
		{
			assertEquals(expected[i], Array.array[i] );
		}
	}
	
	
	@Test 
	public void add()
	{
		int[] expected= {5};
		Array.insert(0,0);
		Array.insert(3,1);
		Array.add(0,3);
	   
		for (int i=0; i <Array.size ; i++)
		{
			assertEquals(expected[i], Array.array[i] );
		}
	}

}

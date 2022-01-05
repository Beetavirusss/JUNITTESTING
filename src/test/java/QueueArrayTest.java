import static org.junit.Assert.*;

import org.junit.*;
import org.junit.Test;

public class QueueArrayTest {

	private  QueueArray obj;
	@Before
	public  void initialize()
	{
		obj = new QueueArray(5);	
	}
	
	@Test
	public void enqueueTest()
	{
		int[] ExpectedArray = {10,11,7,13,4};
		
		
		QueueArray.enqueue(10);
		QueueArray.enqueue(11);
		QueueArray.enqueue(7);
		QueueArray.enqueue(13);
		QueueArray.enqueue(4);
		QueueArray.enqueue(4);
		
		
		for (int i =0; i < QueueArray.size ; i++)
		{
			assertEquals(ExpectedArray[i], QueueArray.array[i] );
		}
		
		QueueArray.dequeue();
		QueueArray.dequeue();
		QueueArray.dequeue();
		QueueArray.dequeue();
		QueueArray.dequeue();
		QueueArray.dequeue();
		
	}
	
	
	
	

}

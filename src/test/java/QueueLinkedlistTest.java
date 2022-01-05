import static org.junit.Assert.*;

import org.junit.*;
import org.junit.Test;

public class QueueLinkedlistTest {

	private  QueueLinkedlist obj;
	@Before
	public  void initialize()
	{
		obj = new QueueLinkedlist();	
	}
	@Test
	public void insertTest()
	{
		int[] ExpectedArray = {10,11,7,13,4,12};
		QueueLinkedlist.enqueue(10);
		QueueLinkedlist.enqueue(11);
		QueueLinkedlist.enqueue(7);
		QueueLinkedlist.enqueue(13);
		QueueLinkedlist.enqueue(4);
		QueueLinkedlist.enqueue(4);
		
		
		for (int i =0; i < QueueLinkedlist.size ; i++)
		{
			assertEquals(ExpectedArray[i], QueueLinkedlist.head.key );
		//	QueueLinkedlist.head=QueueLinkedlist.head.next;
			QueueLinkedlist.dequeue();
		}
		
		QueueLinkedlist.dequeue();
		QueueLinkedlist.dequeue();
		QueueLinkedlist.dequeue();
		QueueLinkedlist.dequeue();
		QueueLinkedlist.dequeue();
		QueueLinkedlist.dequeue();
	 	
	}

}

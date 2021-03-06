public class DoublyLinkedList{
	static class Node{
		int key;   //data value
		Node next; //points to next element in the list.
		Node prev; //points to previous element in the list.
		
		public Node(int data){
			this.key=data;
			this.next=null;
			this.prev=null;
		}
	}
	//
	static Node head;  //head of the list i.e first element
	static Node tail;  //tail of the list i.e last element
	static int size;   //number of elements in the list.

	public DoublyLinkedList(){
		head=null;
		tail=null;
		size=0;		
	}

	//function to add elements at the front of the list.
	public static void pushFront(int number){
		System.out.println("Inserting data at front : " + number);
		Node node = new Node(number);
		if(head==null){
			head=node;
			tail=node;
			size++;
			return;
		}

		node.next=head;
		head.prev=node;
		head=node;
		size++;
	}

	//function to add elements at the back of the list.
	public static void pushBack(int number){
		System.out.println("Inserting data at back  : " + number);
		Node node =new Node(number);
		if(head==null){
			head=node;
			tail=node;
			size++;
			return;
		}
		
		Node temp=head;
		while(temp.next!=null){
			temp=temp.next;
		}
		temp.next=node;
		node.prev=temp;
		tail=node;
		size++;
	}

	//function to remove element from the front of list.
	public static void popFront(){
		System.out.println("PopFront Operation.");
		if(head==null){
			System.out.println("Empty List.");
			return;
		}
		if(head.next==null){
			head=null;
			tail=null;
			size--;
			return;
		}
		head=head.next;
		head.prev=null;
		size--;
	}
	
	//function to remove elements from the back of the list.
	public static void popBack(){
		System.out.println("PopBack Operation.");
		if(head==null){
			System.out.println("Empty List.");
			return;
		}

		if(head.next==null){
			head=null;
			tail=null;
			size--;
			return;
		}
		
		Node temp=head;
		while(temp.next.next!=null){
			temp=temp.next;
		}
		temp.next.prev=null;
		temp.next=null;
		tail=temp;
		size--;
	}

	
	
}
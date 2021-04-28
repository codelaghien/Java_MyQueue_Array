
public class MyQueue {
	private int maxSize;
	private int size;
	private int head;
	private int tail;
	private Node[] queue;
	
	public MyQueue(int maxSize) {
		this.maxSize = maxSize;
		this.size = 0;
		this.head = 0;
		this.tail = 0;
		this.queue = new Node[maxSize];
	}

	public void enqueue(Node node) { 
		if (this.isFull()) {
			System.out.print("Queue is full \n"); 
			return;
		}  
		this.size++;
		this.queue[this.tail] = node;
		this.tail++;
		if (this.tail == this.maxSize) {
			this.tail = 0;
		}
	}

	public Node dequeue() {
		if (this.isEmpty()) {
			System.out.print("Queue is empty \n"); 
			return null;
		}
		this.size--; 
		Node node = this.queue[this.head];
		this.head++;
		return node;
	} 

	public boolean isEmpty() {  
		return (this.size == 0);
	}  

	public boolean isFull() {  
		return (this.size == this.maxSize);
	}  
	
	public void print() {
		System.out.print("Queue: \n");  
		if (this.isEmpty()) {
			System.out.print("Queue is empty \n"); 
			return;
		} 
		int temp = this.head;
		while (true) {
			this.queue[temp].printData();
			temp++;
			if (temp == this.maxSize) {
				temp = 0;
			}
			if (temp == this.tail) {
				break;
			}
		}
		
		for (int i = 0; i < this.maxSize; i++) {
			if (this.queue[i] != null) {
				System.out.print("i = " + i + ": "); 
				this.queue[i].printData();
			}
		}
	} 
}

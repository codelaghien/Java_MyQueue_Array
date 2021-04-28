
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Queue - Java \n");
		
		MyQueue queue = new MyQueue(3);

		queue.enqueue(new Node(100));
		queue.enqueue(new Node(200));
		queue.enqueue(new Node(300));
		System.out.print("\n");
		queue.print();
		System.out.print("\n"); 
		System.out.print("\n"); 
		queue.enqueue(new Node(400));
		
		Node node = queue.dequeue();
		if (node != null) {
			System.out.print("dequeue\n");
			node.printData();
		} 
		
		queue.enqueue(new Node(400));

		System.out.print("\n");
		queue.print();
	}
	
}

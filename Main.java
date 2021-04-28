
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Queue - Java \n"); 
		
		MyQueue stack = new MyQueue(3);

		stack.enqueue(new Node(100));
		stack.enqueue(new Node(200));
		stack.enqueue(new Node(300));
		System.out.print("\n");  
		stack.print();
		System.out.print("\n"); 
		System.out.print("\n"); 
		stack.enqueue(new Node(400));
		
		Node node = stack.dequeue();
		if (node != null) {
			System.out.print("dequeue\n");  
			node.printData();
		} 
		
		stack.enqueue(new Node(400));

		System.out.print("\n");
		stack.print();
	}
	
}

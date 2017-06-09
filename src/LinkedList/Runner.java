package LinkedList;

public class Runner {
	public static void main(String[] args) {
		linkedList LL = new linkedList();
		Node n = new Node();
		n.setData("Hello");
		Node n1 = new Node();
		n1.setData("Mr. Lewis,");
		Node n2 = new Node();
		n2.setData("Mrs. Stock,");
		Node n3 = new Node();
		n3.setData("And Profe");
		Node n4 = new Node();
		n4.setData("Can't teach...");
		LL.add(n);
		LL.add(n1);
		LL.add(n2);
		LL.add(n3);
		LL.add(n4);
		LL.print();
	}
}

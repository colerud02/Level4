package LinkedList;

public class Runner {
	public static void main(String[] args) {
		linkedList LL = new linkedList();
		Node n = new Node();
		n.setData("0");
		Node n1 = new Node();
		n1.setData("1");
		Node n2 = new Node();
		n2.setData("2");
		Node n3 = new Node();
		n3.setData("3");
		Node n4 = new Node();
		n4.setData("4");
		Node n5 = new Node();
		n5.setData("5");
		Node n6 = new Node();
		n6.setData("6");
		LL.add(n);
		LL.add(n1);
		LL.add(n2);
		LL.add(n3);
		LL.add(n4);
		LL.add(n5);
		LL.add(n6);
		// LL.remove(3);
		LL.get(3);
		LL.print();
	}
}

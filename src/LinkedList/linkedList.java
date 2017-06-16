package LinkedList;

public class linkedList implements LinkedInterface {
	Node first;

	@Override
	public void add(Node node) {
		Node temp;
		temp = first;
		if (first == null) {
			first = node;
		} else {
			while (temp.getNext() != null) {
				temp = temp.getNext();
			}
			if (temp.getNext() == null) {
				temp.setNext(node);
			}
		}
	}

	@Override
	public Node remove(int num) {
		Node temp = null;
		Node temp1 = null;
		Node before = null;
		Node after = null;
		temp1 = first;
		for (int i = 0; i < num; i++) {
			before = temp1;
			temp = before.getNext();
			after = temp.getNext();
			temp1 = temp;
		}
		before.setNext(after);
		return temp;
	}

	@Override
	public Node get(int num) {
		Node temp = first;
		for (int i = 0; i <= num; i++) {
			if (i == num) {
				System.out.println("The data you requsted is: " + temp.getData());
				return temp;
			}
			temp = temp.getNext();
		}

		return temp;
	}

	@Override
	public void print() {
		Node temp = first;
		while (temp != null) {
			System.out.println(temp.getData());
			temp = temp.getNext();
		}
	}

}

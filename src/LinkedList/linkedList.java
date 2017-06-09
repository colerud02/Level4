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

		return null;
	}

	@Override
	public Node get(int num) {
		return null;
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

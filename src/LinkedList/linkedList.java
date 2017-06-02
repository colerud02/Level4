package LinkedList;

public class linkedList implements LinkedInterface {
	Node first;
	Node temp;

	@Override
	public void add(Node node) {
		first = node;
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
	}

}

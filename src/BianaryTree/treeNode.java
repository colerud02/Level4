package BianaryTree;

public class treeNode implements Comparable {
	treeNode right;
	treeNode left;
	Object data;

	public treeNode getRight() {
		return right;
	}

	public void setRight(treeNode right) {
		this.right = right;
	}

	public treeNode getLeft() {
		return left;
	}

	public void setLeft(treeNode left) {
		this.left = left;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
}

package GenericBST;

public class Node<T extends Comparable> implements Comparable<Node<T>>{

	private T data;
	private Node<T> left;
	private Node<T> right;
	
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	
	public Node<T> getLeft() {
		return left;
	}
	public Node<T> getRight() {
		return right;
	}
	public void setLeft(Node<T> left) {
		this.left = left;
	}
	public void setRight(Node<T> right) {
		this.right = right;
	}
	@Override
	public int compareTo(Node<T> o) {
		return ((getData()).compareTo(o.getData()));
		
	}

	
	
}


package dsa;

public class MyLinkedList {
	Node head;
	int size;

	public MyLinkedList() {
		this.head = null;
		this.size = 0;
	}

	public void add(int value) {
		Node newNode = new Node(value);
		if (head == null) {
			head = newNode;
		} else {
			Node current = head;
			while (current.next != null) {
				current = current.next;
			}
			current.next = newNode;
		}
		size++;

	}

	public Node getNode(int index) {
		Node current = head;
		for (int i = 0; i < index; i++) {
			current = current.next;
		}
		return current;
	}

	public int getIndex(int value) {
		Node current = head;
		int index = 0;
		while (current != null) {
			if (current.value == value) {
				return index;
			}
			current = current.next;
			index++;
		}
		return -1;
	}

	public Node addNode(int value, int index) {
		if (index > size || index < 0) {
			return null;
		}
		Node newNode = new Node(value);
		if (index == 0) {
			newNode.next = head;
			head = newNode;
		} else {
			Node current = head;
			for (int i = 0; i < index - 1; i++) {
				current = current.next;
			}
			newNode.next = current.next;
			current.next = newNode;
		}
		size++;
		return newNode;
	}
}

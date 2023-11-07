package dsa;

public class Main {
	public static void main(String[] args) {
		MyLinkedList linkedList = new MyLinkedList();
		linkedList.add(1);
		linkedList.add(2);
		linkedList.add(3);
		linkedList.add(4);

		int indexToFind = 2;
		Node nodeIndexTwo = linkedList.getNode(indexToFind);
		System.out.println("Node at index " + indexToFind + ": " + nodeIndexTwo);

		int valueToFind = 2;
		int indexOfValue = linkedList.getIndex(valueToFind);
		System.out.println("Index of " + valueToFind + ": " + indexOfValue);

		linkedList.addNode(5, 2);
		Node current = linkedList.head;
		if(current != null) {
			System.out.print(current.value);
			current = current.next;
		}
		while (current != null) {
		    System.out.print(" - " + current.value);
		    current = current.next;
		}
		System.out.println();
	}

}

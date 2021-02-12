package edu.evacodekitchen.queuewithtdd;

import java.util.ArrayList;
import java.util.List;

public class Queue {

	List<String> elements = new ArrayList<>();

	public boolean isEmpty() {
		return elements.isEmpty();
	}

	public void add(String element) {
		elements.add(element);
	}

	public int size() {
		return elements.size();
	}

	public String getFirst() {
		throwExceptionIfQueueIsEmpty();
		return elements.get(0);
	}


	public void leaveFirst() {
		throwExceptionIfQueueIsEmpty();
		elements.remove(0);
	}

	private void throwExceptionIfQueueIsEmpty() {
		if (isEmpty()) {
			throw new QueueEmptyException();
		}
	}

}

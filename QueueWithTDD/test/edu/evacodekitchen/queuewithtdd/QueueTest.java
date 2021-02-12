package edu.evacodekitchen.queuewithtdd;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class QueueTest {

	private Queue queueUnderTest;

	@BeforeEach
	void beforeEachTestMethod() {
		queueUnderTest = new Queue();
	}

	@Test
	void emptyQueueCanBeCreated() {
		// when
		boolean isEmpty = queueUnderTest.isEmpty();

		// then
		assertTrue(isEmpty);
	}

	@Test
	void elementShouldBeAdded() {
		// when
		queueUnderTest.add("someElement");

		// then
		assertEquals(1, queueUnderTest.size());
	}

	@Test
	void queueShouldNotBeEmptyAfterElementIsAdded() {
		// when
		queueUnderTest.add("someElement");

		// then
		assertFalse(queueUnderTest.isEmpty());
	}

	@Test
	void firstElementShouldBeRetrieved() {
		// when
		queueUnderTest.add("someElement");

		// then
		assertEquals("someElement", queueUnderTest.getFirst());
	}

	@Test
	void firstElementShouldBeDeleted() {
		//given
		queueUnderTest.add("someElement1");
		queueUnderTest.add("someElement2");
		queueUnderTest.add("someElement3");
		
		// when
		queueUnderTest.leaveFirst();
		
		// then
		assertEquals("someElement2", queueUnderTest.getFirst());
	}

	@Test
	void exceptionShouldBeThrownWhenFirstElementIsTriedToBeRemovedFromEmptyQueue() {
		// then
		assertThrows(QueueEmptyException.class, () -> queueUnderTest.leaveFirst());
	}

	@Test
	void exceptionShouldBeThrownWhenFirstElementIsTriedToBeRetrievedFromEmptyQueue() {
		// then
		assertThrows(QueueEmptyException.class, () -> queueUnderTest.getFirst());
	}

}

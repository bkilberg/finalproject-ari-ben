package edu.luc.cs271.wordcount;

import static org.junit.Assert.*;

import java.util.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestWordCounter {

  // Done complete this test class

  // Done declare a reference to the SUT (system under test), i.e., WordCounter
  WordCounter counter;

  @Before
  public void setUp() {
    // Done create the SUT instance
    Map<String, Integer> map = new HashMap<String, Integer>();
    counter = new WordCounter(map);
  }

  @After
  public void tearDown() {
    // Done set the SUT instance to null
    counter = null;
  }

  @Test
  public void testGetCountEmpty() {

    // Done verify that the SUT initially returns an empty map
    assertTrue(counter.getCounts().isEmpty());
  }

  @Test
  public void testGetCountNonEmpty() {

    // Done run the SUT on a specific String iterator with some repeated words,
    // then use assertions to verify the correct counts
    // do this for at least two words in the iterator and two not in the iterator

    counter.countWords(Arrays.asList("Ariane", "Ben", "data", "peace").iterator());

    assertEquals(counter.getCount("data"), 1);
    assertEquals(counter.getCount("Ben"), 1);
    assertNotEquals(counter.getCount("heart"), -1); // need to work on this
    assertNotEquals(counter.getCount("success"), 3); // need to work on this
  }
}

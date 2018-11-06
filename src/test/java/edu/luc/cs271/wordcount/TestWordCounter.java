package edu.luc.cs271.wordcount;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestWordCounter {

  // TODO complete this test class
  private Map<String, Integer> wordMap;;
  private WordCounter fixture;
  // TODO declare a reference to the SUT (system under test), i.e., WordCounter

  @Before
  public void setUp() {
    wordMap = new HashMap<>();
    fixture = new WordCounter(wordMap);
    // TODO create the SUT instance
  }

  @After
  public void tearDown() {
    // TODO set the SUT instance to null
    wordMap = null;
    fixture = null;
  }

  @Test
  public void testGetCountEmpty() {
    assertEquals(true, fixture.getCounts().isEmpty());

    // TODO verify that the SUT initially returns an empty map
    //fail();

  }

  @Test
  public void testGetCountNonEmpty() {

    // TODO run the SUT on a specific String iterator with some repeated words,
    // then use assertions to verify the correct counts
    // do this for at least two words in the iterator and two not in the iterator
    //fail();
   Iterator<String> wordList = Arrays.asList("asdf", "oiu", "qwer", "asdf").iterator();
    fixture.countWords(wordList);
    assertEquals(false, fixture.getCounts().isEmpty());
    assertEquals(2, fixture.getCount("asdf"));
    assertEquals(1, fixture.getCount("qwer"));
    assertEquals(3, fixture.getCounts().size());

    Iterator<String> wordList2 = Arrays.asList("dog", "cat", "dog").iterator();
    fixture.countWords(wordList2);
    assertEquals(5, fixture.getCounts().size());

    try {
      fixture.getCount("apple");
      fixture.getCount("banana");
      fail("java.lang.NullPointerException expected");
    } catch (final NullPointerException ex) {
      // exception occurred => all good
    }
  }
  }


package edu.luc.cs271.wordcount;

import java.util.*;

public class Main {

  public static void main(final String[] args) throws InterruptedException {

    // set up the scanner so that it separates words based on space and punctuation
    final Scanner input = new Scanner(System.in).useDelimiter("[^\\p{Alnum}]+");

    // TODO complete this main program
    // 1. create a WordCounter instance
    // 2. use this to count the words in the input
    // 3. determine the size of the resulting map
    // 4. create an ArrayList of that size and
    // 5. store the map's entries in it (these are of type Map.Entry<String, Integer>
    // 6. sort the ArrayList in descending order by count
    //    using Arrays.sort and an instance of the provided comparator (after fixing the latter)
    // 7. print the (up to) ten most frequent words in the text

    Map<String, Integer> data = new HashMap<String, Integer>();
    
    WordCounter wCount = new WordCounter(data);
    wCount.countWords(input);
    
    int size = wCount.getCounts().size(); // 3
    
    List<Map.Entry<String, Integer>> mEntries = new ArrayList<>(size);
    mEntries.addAll(wCount.getCounts().entrySet()); //5
    
    Collections.sort(mEntries, new DescendingByCount());
    
    if (wCount.getCount().size() <= 10) {
      for (int i =0; i < wCount.getCounts().size(); i++) {
        System.out.println(mEntries.get(i));
      }
    }
    else {
      for (int i = 0; i < wCount.getCounts().size(); i++) {
        System.out.println(mEntries.get(i));
      }
    }
  }
}
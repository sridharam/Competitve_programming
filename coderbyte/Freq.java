/* the frequency of words in the given command line arguments
 * pass the words through cmd
 * 
 * if you want to display the words in alphabetical order then Change HashMap to TreeMap
 * 
 * Similarly, you could make the program print the frequency table in the order the words first 
 * appear on the command line simply by changing the implementation type of the map to
 *  LinkedHashMap
 * */
package coderbyte;
import java.util.*;

public class Freq {
    public static void main(String[] args) {
        Map<String, Integer> m = new HashMap<String, Integer>();

        // Initialize frequency table from command line
        for (String a : args) {
            Integer freq = m.get(a);
            m.put(a, (freq == null) ? 1 : freq + 1);
        }

        System.out.println(m.size() + " distinct words:");
        System.out.println(m);
    }
}
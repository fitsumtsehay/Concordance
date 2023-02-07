import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class WordCount {
    public static void main(String[] args) throws FileNotFoundException {
        //Use a hashmap to store words
//        HashMap <String, Integer> map = new HashMap<String, Integer>();

        //You can use TreeMap to sort the list of words
        TreeMap<String, Integer> map = new TreeMap<String, Integer>();
        //Use Scanner class to read a text file
        Scanner txtFile = new Scanner(new File("C:\\Users\\fitsu\\IdeaProjects\\Organized\\wordcount.txt"));
        while(txtFile.hasNext ()) {
            String word = txtFile.next ();
            if (map.containsKey(word)) {
                //increase count  to 1 if this word has already existed in map
                int count = map.get (word) + 1;
                map.put(word, count);
            }
            else {
                map.put (word, 1);
            }

        }
        txtFile.close();
        for (Map.Entry<String, Integer>entry : map.entrySet()) {
            System.out.println(entry);
        }
    }
}

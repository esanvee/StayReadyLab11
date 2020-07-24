import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class FileReader {

  public static void main(String[] args) {
    //readFile("/Users/es/dev/stayReadyLabs/StayReadyLab11/letter_from_gandhi.txt");

  }

  public static Set<String> readFile(String fileName) {

    Set<String> words = new HashSet<String>();

    try {

      File file = new File(fileName);
      Scanner in = new Scanner(file);

      in.useDelimiter("[^a-zA-Z]+");

      while (in.hasNext()) {

        words.add(in.next().toLowerCase());

      }

      in.close();

    } catch (FileNotFoundException exception) {
      System.out.println("There's no file!!!");

    }

    //System.out.println(words);

    return words;
  }

  

}

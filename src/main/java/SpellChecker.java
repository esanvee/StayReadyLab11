import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class SpellChecker {




    public static void main (String args[]){

        String filePath = "/Users/es/dev/stayReadyLabs/StayReadyLab11/letter_from_gandhi.txt";

        //FileReader.readFile(filePath);

        String dictionaryPath = "/Users/es/dev/stayReadyLabs/StayReadyLab11/words_alpha.txt";

        
        

        Set<String> wordsToCheck = FileReader.readFile(filePath);
        Set<String> dictionary = FileReader.readFile(dictionaryPath);

        List<String> misspelledList = new ArrayList<String>(); //temporary

        for (String word: wordsToCheck){

            if(!dictionary.contains(word)){

                //System.out.println(word + " is misspelled.");
                misspelledList.add(word);

            }
        }


        suggest(misspelledList, dictionary);

    }

    public static String suggest(List<String> misspelledList, Set<String> dictionary){

        System.out.println(misspelledList);
        

        for(String word: misspelledList){

            String msg = word + " is misspelled. Suggestions: ";
            
            for(String reference: dictionary){


                int compare = word.compareTo(reference);

                if(compare == 25){

                    msg += reference + ", ";

                }

                
            }

            System.out.println(msg + "\n\n");

            

            

           
        }

        return null;
    }
}

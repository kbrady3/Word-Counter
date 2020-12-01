//Kabrina Brady

import java.util.Scanner;

public class WordCounterBrady {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Write a sentence.");
        String sentence = input.nextLine();
        int count = countWords(sentence);
        System.out.println("Word count: " + count);
    }

    public static int countWords(String str){
        int count = 0;
        int length = str.length();
        for (int i = 0; i < length; i++){
            String current = str.substring(i, i+1);
            if (current.equals(" ")){
                count++;
                continue;
            }
        }

        //Accounts for the last word in the sentence, which won't have a space after it
        return count + 1;
    }
}
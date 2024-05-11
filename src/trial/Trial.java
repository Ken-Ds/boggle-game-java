package trial;

import java.util.ArrayList;
import java.util.Random;

public class Trial {
    public static void main(String[] args) {
        ArrayList<Character> characters = generateRandomLetters();
        int x = 1;
        for (char letter : characters){
            System.out.println(x+". " +letter);
            x++;
        }
    }

    public static ArrayList<Character> generateRandomLetters(){
        ArrayList<Character> characters = new ArrayList<>();
        Random random = new Random();
        for (int x = 0; x < 20; x++){
            characters.add((char) (random.nextInt(26)+'A'));
        }
        return characters;
    }
}

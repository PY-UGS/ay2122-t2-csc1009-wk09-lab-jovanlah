import java.util.Random;

public class RandomCharacter {
    private char character;
    Random rand = new Random();

    public char getRandomLowerCaseLetter() {
        character = (char) (rand.nextInt(26) + 'a');
        return character;
    }

    public char getRandomUpperCaseLetter() {
        character = (char) (rand.nextInt(26) + 'A');
        return character;
    }

    public char getRandomDigitCharacter() {
        int i = rand.nextInt(10);
        character = Character.forDigit(i, 10);
        return character;
    }

    public char getRandomCharacter(){
        int selected=0;
        selected=rand.nextInt(3);
        if(selected==0){
            return getRandomLowerCaseLetter();
        }
        else if(selected==1){
            return getRandomUpperCaseLetter();
        }
        else if(selected==2){
            return getRandomDigitCharacter();
        }
        else
            return '1';
    }
}
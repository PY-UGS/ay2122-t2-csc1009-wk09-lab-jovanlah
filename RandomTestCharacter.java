import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class RandomTestCharacter {

    static RandomCharacter rand;

    @BeforeAll
    public static void setup() {
        rand = new RandomCharacter();
    }

    @Test
    void getRandomLowerCaseLetter() {
        char check = rand.getRandomLowerCaseLetter();
        assertTrue(Character.isLowerCase(check));
    }

    @Test
    void getRandomUpperCaseLetter() {
        char check = rand.getRandomUpperCaseLetter();
        assertTrue(Character.isUpperCase(check));
    }

    @Test
    void getRandomDigitCharacter() {
        char check = rand.getRandomDigitCharacter();
        assertTrue(Character.isDigit(check));
    }

    @Test
    void getRandomCharacter() {
        char check = rand.getRandomCharacter();
        assertTrue(Character.isLetterOrDigit(check));
    }

    @Test
    void getPrime() {
        //check-48= int val
        int check = (int) rand.getRandomDigitCharacter() - '0';
        System.out.println("Generated number: " + check);
        boolean isPrime = true;
        for (int i = 2; i <= check / 2; i++) {
            if (check % i == 0) {
                isPrime = false;
                break;
            }
        }
        assertTrue(isPrime);
    }
}

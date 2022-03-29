public class RandomCharacterMain {
    public static final int MAXVALUE = 15;

    public static void main(String[] args) {

        RandomCharacter rand = new RandomCharacter();

        System.out.println("Generated Random Lower Case Characters:");

        for (int i = 0; i < MAXVALUE; ++i) {
            System.out.print(rand.getRandomLowerCaseLetter());
        }
        System.out.println("\n ");
        System.out.println("Generated Random Upper Case Characters: ");
        for (int i = 0; i < MAXVALUE; ++i) {
            System.out.print(rand.getRandomUpperCaseLetter());
        }
        System.out.println("\n ");
        System.out.println("Generated Random Digit Characters: ");
        for (int i = 0; i < MAXVALUE; ++i) {
            System.out.print(rand.getRandomDigitCharacter());
        }
        System.out.println("\n ");
        System.out.println("Generated Random Characters: ");
        for (int i = 0; i < MAXVALUE; ++i) {
            System.out.print(rand.getRandomCharacter());
        }
    }
}

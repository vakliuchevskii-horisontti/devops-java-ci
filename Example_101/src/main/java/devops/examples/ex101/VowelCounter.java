package devops.examples.ex101;

public final class VowelCounter {

    public static int countVowels(String text) {
        if (text == null) {
            throw new IllegalArgumentException("Input string cannot be null.");
        }

        int count = 0;

        for (char character : text.toLowerCase().toCharArray()) {
            if ("aeiou".indexOf(character) >= 0) {
                count++;
            }
        }

        return count;
    }
}
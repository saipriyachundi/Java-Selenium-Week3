public class CountVowels {
    public static void main(String[] args) {
        String text = "Automation Testing";
        int vowels = 0, consonants = 0;
        text = text.toLowerCase();

        for (char c : text.toCharArray()) {
            if (Character.isLetter(c)) {
                if ("aeiou".indexOf(c) != -1)
                    vowels++;
                else
                    consonants++;
            }
        }
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }
}

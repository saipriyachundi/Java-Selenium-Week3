public class ReplaceTrimUppercase {
    public static void main(String[] args) {
        String sentence = "  welcome to selenium  ";
        sentence = sentence.trim().replace("selenium", "Java").toUpperCase();
        System.out.println(sentence);
    }
}

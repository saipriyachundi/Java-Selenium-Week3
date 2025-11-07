public class StringBasics {
    public static void main(String[] args) {
        String firstName = "Sai";
        String lastName = "Priya";

        String fullName = firstName + " " + lastName;
        System.out.println("Full Name: " + fullName);

        System.out.println("Length: " + fullName.length());
        System.out.println("First Character: " + fullName.charAt(0));
        System.out.println("Last Character: " + fullName.charAt(fullName.length() - 1));
    }
}

import java.util.Scanner;

class DigitFrequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the integer from the user
        int num = scanner.nextInt();

    
        String numStr = String.valueOf(num);

        // Initialize an array to hold the frequency of each digit
        int[] frequency = new int[10];

        
        for (char c : numStr.toCharArray()) {
            if (Character.isDigit(c)) {
                frequency[c - '0']++;
            }
        }

        // Display the frequency of each digit
        for (int i = 0; i < frequency.length; i++) {
            System.out.println(i + " occurs " + frequency[i] + " times");
        }
    }
}

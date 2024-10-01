/*
Question : You are given a string S and your task is to find and return the count of permutation formed by
           fixing the positions of the vowels present in the string. 
Note     : Ensure the result is non-negative 
		         If there are no consonants then return 0.
			e.q - ybghjahebuyitob
			  solution - 10!/(2! 3! 2!)
*/
class VowelPermutationCombination {
    public static void main(String[] args) {
        // Example string
        Permutation("ybghjahebuyitob");
    }

    // Factorial function
    public static int fact(int n) {
        int factorial = 1;
        while (n > 0) {
            factorial = factorial * n--;
        }
        return factorial;
    }

    // Function to check if a character is a vowel
    public static boolean isVowel(char c) {
        return (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U');
    }

    // Function to calculate permutations
    public static void Permutation(String str) {
        int consonantCount = 0; // Count of consonants
        int[] charCount = new int[256]; // Array to store counts of each consonant
        
        // Loop through the string and count consonants
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (!isVowel(c)) { // If it's not a vowel, it's a consonant
                consonantCount++; // Increase consonant count
                charCount[c]++; // Increase the count for this consonant
            }
        }

        // If there are no consonants, return 0
        if (consonantCount == 0) {
            System.out.println(0);
            return;
        }

        // Calculate the total number of permutations (consonantCount!)
        int totalPermutations = fact(consonantCount);

        // Divide by the factorial of each repeated consonant count
        for (int i = 0; i < 256; i++) {
            if (charCount[i] > 1) { // If there are repeated consonants
                totalPermutations /= fact(charCount[i]); // Divide by their factorial
            }
        }

        // Print the result
        System.out.println(totalPermutations);
    }
}

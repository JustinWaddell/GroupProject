package palindrome;

public class Palindrome3 {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.println("Enter a value:");
        String str = input.nextLine();
        String str2 = "";
        //examples of combination of for loop and while loop

        //this task is to replace all the non-alphanumeric characters with an empty string.
        for(int i = 0; i < str.length() ; i++){
            char currentChar = str.charAt(i);

            if( str.charAt(i)< 'A' || str.charAt(i) > 'Z' && str.charAt(i) < 'a' || str.charAt(i) > 'z'){
                continue;
            }
            str2 += str.charAt(i) + "";
        }
        int low = 0;
        int high = str2.length();

        boolean isPalindrome = true;
        while(low < high) {
            if(str2.charAt(low) != str2.charAt(high)){
                isPalindrome = false;
                break;
            }
            low++;
            high--;
        }
        System.out.println();

    }
}

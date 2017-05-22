import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        boolean isPalindrome = false;
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        int length = A.length();
        int count = 0;
        for(int i = 0; i <= A.length()-1; i++) {
            if (A.charAt(i) == A.charAt(A.length()-i-1)) {
                isPalindrome = true;
            } else{
                isPalindrome = false;
            break;
        }
            count++;
        }

        if(isPalindrome){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
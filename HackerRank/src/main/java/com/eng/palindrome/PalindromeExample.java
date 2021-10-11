package com.eng.palindrome;

public class PalindromeExample {
    public static void main(String[] args) {
        int r,sum=0,temp;
        int n=4554;//It is the number variable to be checked for palindrome
        temp=n;
        while(n>0){
            r=n%10;  //getting remainder birler
            sum=(sum*10)+r;
            n=n/10;
        }
        if(temp==sum)
            System.out.println("palindrome number ");
        else
            System.out.println("not palindrome");
    }
}

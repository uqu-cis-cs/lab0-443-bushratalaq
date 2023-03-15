package edu.uqu.cs;
/*
 * Lab 0 
 * CS 1312
 */

/*
* Make sure to complete and submit your lab
*/


public class App{

/**  
* Complete method "twisters" definition below. The method prints all numbers from 1 to 110, 11 numbers per line. 
* Also, it does the following:
* - If the number is a multiple of 2, print "Tweetle"
* - If the number is a multiple of 4, print "Beetle"
* - If the number is a multiple of 6, print "Poodle"
* - Otherwise just print the number
* 
* Output: 
*        1 Tweetle 3 TweetleBeetle 5 TweetlePoodle 7 TweetleBeetle 9 Tweetle 11
*        TweetleBeetlePoodle 13 Tweetle 15 TweetleBeetle 17 TweetlePoodle 19 TweetleBeetle 
*/
public static void twisters() {
  
        for (int num =1; num<=110;num++){
        if (num%2==0){
            System.out.print("Tweetle");}
        if(num%4==0){
            System.out.print("Beetle");
        }
        if (num%6==0){
            System.out.print("poodle");}
        if(num%2!=0 & num%4!=0 & num%6!=0)
        System.out.print("  "+num+" ");
        
        if (num%11==0){
        System.out.println("");}
        }
}
/**
* Write a method named "phoneKeypad" that takes a string parameter (str)
* then it replaces each letter in (str) by a number that represnts it 
* in a phone keypad as follows: 
* ABC = 2;
* DEF = 3;
* GHI = 4;
* JKL = 5;
* MNO = 6;
* PQRS = 7;
* TUV = 8; 
* WXYZ = 9
*
* Example:
* Input: calling batman
* Output: 2255464228626
*
*/
 
  public static void main(String [] args) {
        

        /* Write your code here */
     
      twisters();
       }
       //call method twisters()
       //prompt user to enter a string 
       //call method phoneKeypad(string)


 }
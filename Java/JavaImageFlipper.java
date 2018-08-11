/*
Kevin Nguyen
Basic Java program that takes an integer binary matrix in order to flip and invert it.

How to run (linux):
	1.) open command line and cd into directory folder of where this code is
	2.) type in "javac *.java" to compile java files
	3.) type in "java JavaImageFlipper"
*/

//imports
import java.io.*;
import java.util.*;

//class
class JavaImageFlipper {
	//Global Declarations

	//main driver
	public static void main(String[] args) {
		//local Declarations
		System.out.println("HelloWorld");
	}

	//flipAndInvertImage will flip the image and invert it
	public int[][] flipAndInvertImage(int[][] A) {
        //local declarations
        int i = 0, j = A[0].length-1, k = 0;
        int[][] B = new int[A.length][A[0].length];
        
        //iterate over rows
        while(i < A.length) {
            //iterate backwards from right to left columns
            while(j >= 0) {
                //condition to reverse value between 1 and 0 respectively
                B[i][k] = A[i][j] ^ 1;
                // if(A[i][j] == 1) {
                //     B[i][j] = 0;
                // }
                // else {
                //     B[i][j] = 1;
                // }
                j--; k++;
            }
            i++; j=A[0].length-1; k=0; //reset iterations
        }
        
        return B;
    }	
}
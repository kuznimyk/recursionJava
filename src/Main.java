/*
<<<<<<< HEAD

                                                Ý Æ Ã-Ø Œ ¿

Code description:
     Main goals:  use recursion and interfaces to print out triangles and to move elements in the array.
     No "for" or "while" keywords are allowed.

Authors:
    * Mykyta Kuznietsov

Class:
    * AUCSC 112 LAB 1H04

ID numbers:
    * 1796900

Date:
    * April 2nd, 2024

*/

public class Main {
    public static void main(String[] args) {

        RecursionSolver rec= new RecursionSolver();
        rec.printTriangles(10);
        int[] arr = new int[]{0, -3, 5, -2, 0, 7, -8, 4, 0};
        rec.posBeforeNeg(arr);
        for(int i = 0; i < arr.length;i++){
            System.out.print(arr[i]);
            System.out.print(" ");
        }
    }
}
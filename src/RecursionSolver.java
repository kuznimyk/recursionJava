
public class RecursionSolver implements RecursionLabInterface {



    /*a constructor that sets values to default */
    public RecursionSolver(){
        counter = 0;
        flag1 = true;
        flag2 = true;
        flag3 = true;
        end = false;
        triangSize = 1;
        triangCounter = 0;
        pointer1= 0;
        pointer2 = 0;

    }
    int pointer1;
    int pointer2;
    int counter;
    int starcounter;
    boolean flag1;
    boolean flag2;
    boolean flag3 ;
    boolean flag4;
    boolean end ;
    int triangSize;
    int triangCounter;




    public void printTriangles(int size){
        /*purpose of this if to set the triangle size so it does not change during the recursion*/
        if (flag3){
            triangSize = size;
            flag3 = false;
        }
        /*
        counter serves as amount of rows in the triangles
        starcounter is the amount of stars that will be printed in each row
        this if sets the values at start of each recursion cycle (recursion cycle happens on each new row)
        * */
        if (flag1){
            counter = size;
            starcounter = triangSize;
            starcounter = starcounter - counter +1;
            flag1 = false;
        }
        /*checks for the size, if it's zero then recursion rolls back*/
        if (size > 0 ) {
            /*prints out the spaces before stars */
            if (flag2) {
                System.out.print(" ");
                printTriangles(size - 1);


            }
            /*flag that blocks printing spaces afer certain amount is printed out */
            flag2 = false;
            /* the end flag represents the end of each triangle. If the end is true then it skips
            * all the steps when recursion rolls back. When recursion rolls back, at the last step the size goes back
            *to initial, which means that the triangle of that size is printed out
            * therefore another recursion is called that sets all variables and flags to default meaning that
            * the printing of triangles starts all over again, but this time a triangle of size one less
            *  */
            if (end && size == triangSize){flag1 = true;flag2 = true;flag3 = true; end = false;printTriangles(--triangSize);}
            else if (end){return;}
            else{}


            /* statement that prints out stars  */
            if (starcounter > 0 && !end) {

                System.out.print("* ");

                printTriangles(--starcounter);
            }
            /* checks for the end statement so the method does not go further */
            if (end){return;}

            System.out.println();
            /* sets flags true for the next line so that spaces can be printed out */
            flag2 = true;
            flag1 = true;

            /* recursion that moves to the next line */
            printTriangles(--counter);

            /* after all the lines are printed out sets end to true so no extra characted are pinted out */
            end = true;

        }
        else{

            return;}
    }
    public void posBeforeNeg(int arr[]){

        /*a basic two pointer algorithm that searches for the negative value at left with pointer 1 and searches
        * for the positive value on the right with pointer 2. When found positive and negative elements
        * then swaps them */
        if (pointer1 < arr.length && pointer2 < arr.length && pointer1 <= pointer2){
            if (arr[pointer1] < 0 && arr[pointer2] > 0){
                int temp = arr[pointer2];
                arr[pointer2] = arr[pointer1];
                arr[pointer1]= temp;
                posBeforeNeg(arr);
            }
            else if(arr[pointer2] < 0){
                pointer2++;
                posBeforeNeg(arr);
            }
            else if(arr[pointer1] > 0){
                pointer1++;
                posBeforeNeg(arr);
            }
            else{
                if (arr[pointer1] < 0){
                    pointer2++;
                }
                else{
                    pointer1++;
                    pointer2++;
                }
                posBeforeNeg(arr);
            }
        }
        else if (pointer2 < arr.length && pointer1 > pointer2){
            pointer2++;
            posBeforeNeg(arr);
        }
        else{
            return;
        }
    }

}

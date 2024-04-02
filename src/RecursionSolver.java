
public class RecursionSolver implements RecursionLabInterface {


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
        if (flag3){
            triangSize = size;
            flag3 = false;
        }
        if (flag1){
            counter = size;
            starcounter = triangSize;
            starcounter = starcounter - counter +1;
            flag1 = false;
        }
        if (size > 0 ) {
            if (flag2) {
                System.out.print(" ");
                printTriangles(size - 1);


            }
            flag2 = false;
            if (end && size == triangSize){flag1 = true;flag2 = true;flag3 = true; end = false;printTriangles(--triangSize);}
            else if (end){return;}
            else{}

            if (starcounter > 0 && !end) {

                System.out.print("* ");

                printTriangles(--starcounter);
            }
            if (end){return;}
            System.out.println();
            flag2 = true;
            flag1 = true;
            printTriangles(--counter);
            end = true;

        }
        else{

            return;}
    }
    public void posBeforeNeg(int arr[]){

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


public class RecursionSolver implements RecursionLabInterface {


    public RecursionSolver(){
        counter = 0;
        flag1 = true;
        flag2 = true;
        flag3 = true;
        end = false;
        triangSize = 1;
        triangCounter = 0;
    }
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

    }

}

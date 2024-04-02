
public class RecursionSolver implements RecursionLabInterface {


    public RecursionSolver(){
        counter = 0;
        flag1 = true;
        flag2 = true;
        flag3 = true;
        end = false;
    }
    int counter;
    int starcounter;
    boolean flag1;
    boolean flag2;
    boolean flag3 ;
    boolean flag4;
    boolean end ;
    int triangSize;
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
                System.out.print("_");
                printTriangles(size - 1);


            }
            flag2 = false;
            if (end){return;}

            if (starcounter > 0) {

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

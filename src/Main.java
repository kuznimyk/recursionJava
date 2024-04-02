//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        RecursionSolver rec= new RecursionSolver();
        rec.printTriangles(8);
        int[] arr = new int[]{1,2,3,4,0,5,6,8};
        rec.posBeforeNeg(arr);
        for(int i = 0; i < arr.length;i++){
            System.out.print(arr[i]);
            System.out.print(" ");
        }
    }
}
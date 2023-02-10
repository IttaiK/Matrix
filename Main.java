public class Main{
    public static void main(String[] args) throws Exception{

        int[][] A = new int[2][2];
        A[0][0] = 4;
        A[0][1] = 2;
        A[1][0] = 0;
        A[1][1] = 1;

        int[][] B = new int[2][1];
        B[0][0] = 2;
        B[1][0] = 1;

        ArrayCombination arr = new ArrayCombination(A,B);

        //test toString
        System.out.println(arr);

        //test add
        arr.rowAdd(0, 1);
        System.out.println("row 1 added to row 0");
        System.out.println(arr);

        arr.rowAdd(0, 0);
        System.out.println("row 0 added to row 0");
        System.out.println(arr);

        arr.rowAdd(1, 0);
        System.out.println("row 0 added to row 1");
        System.out.println(arr);

        //test mult
        arr.rowMult(0, 1);
        System.out.println("row 0 multiplied by 1");
        System.out.println(arr);

        arr.rowMult(0, 3);
        System.out.println("row 0 multiplied by 1");
        System.out.println(arr);

        arr.rowMult(1, -2);
        System.out.println("row 0 multiplied by 1");
        System.out.println(arr);

        //test zeroOut
        arr.zeroOut(1, 0);
        System.out.println("zeroed r=1, c=0");
        System.out.println(arr);
    }
}
public class ArrayCombination {

    int[][] A;
    int[][] B;
    
    public ArrayCombination(int[][] _A, int[][] _B){
        A = _A;
        B = _B;
    }

    public void rowAdd(int a, int b){
        for (int col = 0; col < A[a].length; col++) {
            A[a][col] = A[a][col] + A[b][col];
        }
        B[a][0] = B[a][0] + B[b][0];
    }

    public void rowMult(int row, double val){
        for (int col = 0; col < A[row].length; col++) {
            A[row][col] = (int) Math.round(A[row][col]*val);
        }
        B[row][0] *= val;
    }

    public void zeroOut(int row, int col) throws Exception{
        if(row < 1){
            throw new Exception("RequestRowLessThan1");
        }
        int modRow = 0;//just uses row 0 as the row to be modified for now. Can be optimized later
        double multNum = (double)(0-A[row][col]) / A[modRow][col]; //inverse of zerod num / current num
        rowMult(modRow,multNum);
        rowAdd(row,modRow);
    }

    public String toString(){
        String out = "";
        for (int r = 0; r < A.length; r++) {
            out += "[";
            for (int c = 0; c < A[r].length-1; c++) {
                out += A[r][c] + ", ";
            }
            out += A[r][A[r].length-1];
            out += "] " + "[" + B[r][0] + "]" + "\n";
        }
        return out;
    }
}

package Aabstarction.Exercises.JediGalaxy.jediGalaxy;

public class Field {
    private int [][] matrix;

    public Field(int rows, int cols){
        this.matrix = new int[rows][cols];
        this.fillTheMatrix(0);
    }


    private void fillTheMatrix(int beganValue){
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                matrix[row][col] = beganValue++;
            }
        }
    }
    public  boolean isInBond(int row, int col){
        return row >= 0 && col >=0 && row < matrix.length && col < matrix[row].length;
    }
    public void setValue(int row, int col, int newValue){
        this.matrix[row][col] = newValue;
    }

    public int getValue(int row, int col){
       return this.matrix[row][col];
    }

    public int getColLength (int row){
        return this.matrix[row].length;
    }

}

package Aabstarction.Exercises.JediGalaxy.jediGalaxy;


public class Galaxy {
    private Field field;

    public Galaxy(Field field) {
        this.field = field;
    }

    public void moveEvil(int row, int col){
        while (row >= 0 && col >= 0) {
            if (this.field.isInBond(row,col)) {
                this.field.setValue(row,col,0);
            }

            row--;
            col--;
        }
    }
    public long moveJedi(int row, int col) {
        long starCollected = 0;
        while (row >= 0 && col < this.field.getColLength(1)) {

            if (this.field.isInBond(row, col)) {
                starCollected += this.field.getValue(row, col);
            }

            col++;
            row--;
        }
        return starCollected;
    }

}

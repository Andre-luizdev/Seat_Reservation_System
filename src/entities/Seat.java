package entities;

public class Seat {

    private int row;
    private int collumn;
    private boolean isReserved;

    public Seat(int row, int collumn, boolean isReserved) {
        this.row = row;
        this.collumn = collumn;
        this.isReserved = isReserved;
    }

    public Seat() {

    }

    public Seat(int i, int j) {
    }

    public int getRow() {
        return row;
    }

    public int getCollumn() {
        return collumn;
    }

    public boolean isReserved() {
        return isReserved;
    }

}

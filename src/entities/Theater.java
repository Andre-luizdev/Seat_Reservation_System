package entities;

public class Theater {

    private Seat[][] seats = new Seat[5][8];

    public Theater() {
        initializeSeats();
    }

    private void initializeSeats() {
        for (int i = 0; i < seats.length; i++) {
            for (int j = 0; j < seats[i].length; j++) {
                seats[i][j] = new Seat(i, j);
            }
        }
    }

}

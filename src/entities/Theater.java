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

    public void displayMap() {
        // 1. Imprime o cabeçalho das colunas (0 1 2 3...)
        System.out.print("   "); // Espaço inicial para alinhar com a lateral
        for (int j = 0; j < seats[0].length; j++) {
            System.out.print(" " + j + " ");
        }
        System.out.println(); // Pula linha após o cabeçalho

        // 2. Imprime as linhas com o índice lateral
        for (int i = 0; i < seats.length; i++) {
            System.out.print(i + " |"); // Número da linha e uma barra separadora

            for (int j = 0; j < seats[i].length; j++) {
                if (seats[i][j].isReserved()) {
                    System.out.print("[X]");
                } else {
                    System.out.print("[ ]");
                }
            }
            System.out.println(); // Pula para a próxima fileira
        }
    }

    public void reserve(int row, int collumn) {
        if (row < 0 || row > seats.length || collumn < 0 || collumn >= seats[0].length) {
            System.out.println("Erro: Posição inválida!");
            return;
        }

        Seat s = seats[row][collumn];

        if (s.isReserved()) {
            System.out.println("Erro: O assento [" + row + "][" + collumn + "]");
        } else {
            s.setReserved(true);
            System.out.println("Sucesso: Assento reservado com sucesso!");
        }
    }

}

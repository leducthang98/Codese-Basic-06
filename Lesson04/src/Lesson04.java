import java.util.Scanner;

public class Lesson04 {
    static Scanner sc = new Scanner(System.in);
    static int PLAYERX, PLAYERY;
    static int ENDX, ENDY;
    static char[][] MAP = new char[5][5];
    static int TURN = 10;

    //global, static
    public static void main(String[] args) {
        PLAYERX = 2;
        PLAYERY = 2;

        do {
            ENDX = (int) (Math.random() * 4);
            ENDY = (int) (Math.random() * 4);
        } while (ENDX == PLAYERX && ENDY == PLAYERY);

        for (int x = 0; x < MAP.length; x++) {
            for (int y = 0; y < MAP[0].length; y++) {
                if (x == PLAYERX && y == PLAYERY) {
                    MAP[x][y] = 'X';
                } else if (x == ENDX && y == ENDY) {
                    MAP[x][y] = 'O';
                } else {
                    MAP[x][y] = '-';
                }
            }
        }

        while (true) {
            loadMap();
            char input = input();
            move(input);
            check();
        }
    }

    private static char input() {
        System.out.println("Nhap vao WASD:");
        String value = sc.nextLine();
        return value.charAt(0);
    }

    private static void check() {

    }

    private static void move(char input) {
        switch (input) {
            case 'W':
                MAP[PLAYERX][PLAYERY] = '-';
                PLAYERX--;
                MAP[PLAYERX][PLAYERY] = 'X';
                break;
            case 'S':
                MAP[PLAYERX][PLAYERY] = '-';
                PLAYERX++;
                MAP[PLAYERX][PLAYERY] = 'X';
                break;
            case 'A':
                MAP[PLAYERX][PLAYERY] = '-';
                PLAYERY = (PLAYERY - 1 + 5) % 5;
                MAP[PLAYERX][PLAYERY] = 'X';
                break;
            case 'D':
                MAP[PLAYERX][PLAYERY] = '-';
                PLAYERY = (PLAYERY + 1) % 5;
                MAP[PLAYERX][PLAYERY] = 'X';
                break;
        }
        TURN--;
    }

    private static void loadMap() {
        for (int x = 0; x < MAP.length; x++) {
            for (int y = 0; y < MAP[0].length; y++) {
                System.out.print(MAP[x][y] + " ");
            }
            System.out.println();
        }
    }

}

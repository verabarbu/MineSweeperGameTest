import mineSweeper.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("\nWelcome to Minesweeper!");
        Scanner myScanner = new Scanner(System.in);

        int choice;
        while (true) { //main loop, game is in progress until user chooses exit
            System.out.println("\nMain Menu");
            System.out.println("1. Start new easy game");
            System.out.println("2. Start new medium game");
            System.out.println("3. Start new hard game");
            System.out.println("4. Start new customized game");
            System.out.println("5. Exit");

            choice = myScanner.nextInt();
            switch (choice) { //menu input
                case 1: //easy
                    System.out.println();
                    System.out.println("Beginner level: 100 tiles and 10 mines");
                    System.out.println("The game plays based on coordinates. Let's start...");
                    System.out.println();
                    Game mineSweeper = new Game();
                    mineSweeper.display();
                    int r; //rows
                    int c; //columns
                    while (mineSweeper.getGameStatus()) { //loops game progress
                        System.out.println("Please enter row and column tile number to uncover (separated by space): ");
                        boolean check = true; //try-catch block
                        do {
                            try {
                                r = myScanner.nextInt();
                                c = myScanner.nextInt();
                                System.out.println();
                                mineSweeper.uncover(r, c);
                                mineSweeper.display();
                                check = false;
                            } catch (Exception e) {
                                System.out.println("Please input two integers separated by space: ");
                                myScanner.next();
                            }
                        }
                        while (check);
                    }
                    System.out.println("Game over!");
                    System.out.println();
                    break;
                case 2: //medium game
                    System.out.println();
                    System.out.println("Intermediate level: 266 tiles and 40 mines");
                    System.out.println("The game plays based on coordinates. Let's start...");
                    System.out.println();
                    mineSweeper = new Game(16, 16, 40);
                    mineSweeper.display();
                    while (mineSweeper.getGameStatus()) { //loops game progress
                        System.out.println("Please enter row and column tile number to uncover (separated by space): ");
                        boolean check = true; //try-catch block
                        do {
                            try {
                                r = myScanner.nextInt();
                                c = myScanner.nextInt();
                                System.out.println();
                                mineSweeper.uncover(r, c);
                                mineSweeper.display();
                                check = false;
                            } catch (Exception e) {
                                System.out.println("Please input two integers separated by space: ");
                                myScanner.next();
                            }
                        }
                        while (check);
                    }
                    System.out.println("Game over!");
                    System.out.println();
                    break;
                case 3:
                    System.out.println();
                    System.out.println("Expert level: 576 tiles and 99 mines");
                    System.out.println("The game plays based on coordinates. Let's start...");
                    System.out.println();
                    mineSweeper = new Game(24, 24, 99);
                    mineSweeper.display();
                    while (mineSweeper.getGameStatus()) { //loops game progress
                        System.out.println("Please enter row and column tile number to uncover (separated by space): ");
                        boolean check = true; //try-catch block
                        do {
                            try {
                                r = myScanner.nextInt();
                                c = myScanner.nextInt();
                                System.out.println();
                                mineSweeper.uncover(r, c);
                                mineSweeper.display();
                                check = false;
                            } catch (Exception e) {
                                System.out.println("Please input two integers separated by space: ");
                                myScanner.next();
                            }
                        }
                        while (check);
                    }
                    System.out.println("Game over!");
                    System.out.println();
                    break;
                case 4: //customized game
                    System.out.println();
                    System.out.println("Create your own game!");
                    System.out.println("The game plays based on coordinates. Let's start...");
                    System.out.println();
                    System.out.println("Please enter three positive integers: no of rows, no of columns and no of mines, separated by space: ");
                    mineSweeper = new Game(myScanner.nextInt(), myScanner.nextInt(), myScanner.nextInt());
                    mineSweeper.display();
                    while (mineSweeper.getGameStatus()) { //loops game progress
                        System.out.println("Please enter row and column tile number to uncover (separated by space): ");
                        boolean check = true; //try-catch block
                        do {
                            try {
                                r = myScanner.nextInt();
                                c = myScanner.nextInt();
                                System.out.println();
                                mineSweeper.uncover(r, c);
                                mineSweeper.display();
                                check = false;
                            } catch (Exception e) {
                                System.out.println("Please input two integers separated by space: ");
                                myScanner.next();
                            }
                        }
                        while (check);
                    }
                    System.out.println("Game over!");
                    System.out.println();
                    break;
                case 5: //exit game
                    System.out.println("Exiting game...");
                    System.exit(0);
                    break;
                default: //invalid input
                    System.out.println("Invalid option. Please select an option from 1 to 5!");
                    System.out.println();
                    break;
            }
        }
    }
}

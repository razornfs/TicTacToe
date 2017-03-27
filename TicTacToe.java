import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int move = -1;
    System.out.println("Welcome to Tic Tac Toe!");
    System.out.println("You're playing as X");

    System.out.println("   |   |   ");
    System.out.println("   |   |   ");
    System.out.println("   |   |   ");
    System.out.println("---+---+---");
    System.out.println("   |   |   ");
    System.out.println("   |   |   ");
    System.out.println("   |   |   ");
    System.out.println("---+---+---");
    System.out.println("   |   |   ");
    System.out.println("   |   |   ");
    System.out.println("   |   |   ");

    System.out.println("Enter the number of your move");
    System.out.println("0|1|2");
    System.out.println("-+-+-");
    System.out.println("3|4|5");
    System.out.println("-+-+-");
    System.out.println("6|7|8");
    move = Integer.parseInt(in.nextLine());
    
        if (move == 0) {

            System.out.println("   |   |   ");
            System.out.println(" X |   |   ");
            System.out.println("   |   |   ");
            System.out.println("---+---+---");
            System.out.println("   |   |   ");
            System.out.println("   |   |   ");
            System.out.println("   |   |   ");
            System.out.println("---+---+---");
            System.out.println("   |   |   ");
            System.out.println("   |   |   ");
            System.out.println("   |   |   ");
            System.out.println("O moves on the top space.");

            System.out.println("   |   |   ");
            System.out.println(" X | O |   ");
            System.out.println("   |   |   ");
            System.out.println("---+---+---");
            System.out.println("   |   |   ");
            System.out.println("   |   |   ");
            System.out.println("   |   |   ");
            System.out.println("---+---+---");
            System.out.println("   |   |   ");
            System.out.println("   |   |   ");
            System.out.println("   |   |   ");

            System.out.println("Enter the number of your move");
            System.out.println("0|1|2");
            System.out.println("-+-+-");
            System.out.println("3|4|5");
            System.out.println("-+-+-");
            System.out.println("6|7|8");
            move = Integer.parseInt(in.nextLine());
            
            if (move == 2) {

                System.out.println("   |   |   ");
                System.out.println(" X | O | X ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println("   |   |   ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println("   |   |   ");
                System.out.println("   |   |   ");
                System.out.println("O moves on the center space.");

                System.out.println("   |   |   ");
                System.out.println(" X | O | X ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println("   | O |   ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println("   |   |   ");
                System.out.println("   |   |   ");

                System.out.println("Enter the number of your move");
                System.out.println("0|1|2");
                System.out.println("-+-+-");
                System.out.println("3|4|5");
                System.out.println("-+-+-");
                System.out.println("6|7|8");
                move = Integer.parseInt(in.nextLine());
                
                if (move == 3) {

                    System.out.println("   |   |   ");
                    System.out.println(" X | O | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | O |   ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println("   |   |   ");
                    System.out.println("   |   |   ");
                    System.out.println("O moves on the bottom space.");

                    System.out.println("   |   |   ");
                    System.out.println(" X | O | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | O |   ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println("   | O |   ");
                    System.out.println("   |   |   ");
                    System.out.println("The computer wins!");
                    System.exit(0);
                }
                if (move == 5) {

                    System.out.println("   |   |   ");
                    System.out.println(" X | O | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | O | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println("   | O |   ");
                    System.out.println("   |   |   ");
                    System.out.println("O moves on the bottom-left space.");

                    System.out.println("   |   |   ");
                    System.out.println(" X | O | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | O | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" O | O |   ");
                    System.out.println("   |   |   ");
                    System.out.println("The computer wins!");
                    System.exit(0);
                }
                if (move == 8) {

                    System.out.println("   |   |   ");
                    System.out.println(" X | O | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | O | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" O | O | X ");
                    System.out.println("   |   |   ");
                    System.out.println("You win!");
                    System.exit(0);
                }
            }
            if (move == 3) {

                System.out.println("   |   |   ");
                System.out.println(" X | O |   ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println(" X |   |   ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println("   |   |   ");
                System.out.println("   |   |   ");
                System.out.println("O moves on the center space.");

                System.out.println("   |   |   ");
                System.out.println(" X | O |   ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println(" X | O |   ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println("   |   |   ");
                System.out.println("   |   |   ");

                System.out.println("Enter the number of your move");
                System.out.println("0|1|2");
                System.out.println("-+-+-");
                System.out.println("3|4|5");
                System.out.println("-+-+-");
                System.out.println("6|7|8");
                move = Integer.parseInt(in.nextLine());
                
                if (move == 2) {

                    System.out.println("   |   |   ");
                    System.out.println(" X | O | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | O |   ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println("   |   |   ");
                    System.out.println("   |   |   ");
                    System.out.println("O moves on the bottom space.");

                    System.out.println("   |   |   ");
                    System.out.println(" X | O | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | O |   ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println("   | O |   ");
                    System.out.println("   |   |   ");
                    System.out.println("The computer wins!");
                    System.exit(0);
                }
                if (move == 5) {

                    System.out.println("   |   |   ");
                    System.out.println(" X | O | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | O | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println("   | O |   ");
                    System.out.println("   |   |   ");
                    System.out.println("O moves on the bottom-left space.");

                    System.out.println("   |   |   ");
                    System.out.println(" X | O | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | O | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" O | O |   ");
                    System.out.println("   |   |   ");
                    System.out.println("The computer wins!");
                    System.exit(0);
                }
                if (move == 8) {

                    System.out.println("   |   |   ");
                    System.out.println(" X | O | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | O | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" O | O | X ");
                    System.out.println("   |   |   ");
                    System.out.println("You win!");
                    System.exit(0);
                }
            }
            if (move == 4) {

                System.out.println("   |   |   ");
                System.out.println(" X | O |   ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println("   | X |   ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println("   |   |   ");
                System.out.println("   |   |   ");
                System.out.println("O moves on the top-right space.");

                System.out.println("   |   |   ");
                System.out.println(" X | O | O ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println("   | X |   ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println("   |   |   ");
                System.out.println("   |   |   ");

                System.out.println("Enter the number of your move");
                System.out.println("0|1|2");
                System.out.println("-+-+-");
                System.out.println("3|4|5");
                System.out.println("-+-+-");
                System.out.println("6|7|8");
                move = Integer.parseInt(in.nextLine());
                
                if (move == 3) {

                    System.out.println("   |   |   ");
                    System.out.println(" X | O | O ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | X |   ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println("   |   |   ");
                    System.out.println("   |   |   ");
                    System.out.println("O moves on the right space.");

                    System.out.println("   |   |   ");
                    System.out.println(" X | O | O ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | X | O ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println("   |   |   ");
                    System.out.println("   |   |   ");

                    System.out.println("Enter the number of your move");
                    System.out.println("0|1|2");
                    System.out.println("-+-+-");
                    System.out.println("3|4|5");
                    System.out.println("-+-+-");
                    System.out.println("6|7|8");
                    move = Integer.parseInt(in.nextLine());
                    
                    if (move == 6) {

                        System.out.println("   |   |   ");
                        System.out.println(" X | O | O ");
                        System.out.println("   |   |   ");
                        System.out.println("---+---+---");
                        System.out.println("   |   |   ");
                        System.out.println(" X | X | O ");
                        System.out.println("   |   |   ");
                        System.out.println("---+---+---");
                        System.out.println("   |   |   ");
                        System.out.println(" X |   |   ");
                        System.out.println("   |   |   ");
                        System.out.println("You win!");
                        System.exit(0);
                    }
                    if (move == 7) {

                        System.out.println("   |   |   ");
                        System.out.println(" X | O | O ");
                        System.out.println("   |   |   ");
                        System.out.println("---+---+---");
                        System.out.println("   |   |   ");
                        System.out.println(" X | X | O ");
                        System.out.println("   |   |   ");
                        System.out.println("---+---+---");
                        System.out.println("   |   |   ");
                        System.out.println(" X | X |   ");
                        System.out.println("   |   |   ");
                        System.out.println("You win!");
                        System.exit(0);
                    }
                    if (move == 8) {

                        System.out.println("   |   |   ");
                        System.out.println(" X | O | O ");
                        System.out.println("   |   |   ");
                        System.out.println("---+---+---");
                        System.out.println("   |   |   ");
                        System.out.println(" X | X | O ");
                        System.out.println("   |   |   ");
                        System.out.println("---+---+---");
                        System.out.println("   |   |   ");
                        System.out.println(" X | X | X ");
                        System.out.println("   |   |   ");
                        System.out.println("You win!");
                        System.exit(0);
                    }
                }
                if (move == 5) {

                    System.out.println("   |   |   ");
                    System.out.println(" X | O | O ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println("   | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println("   |   |   ");
                    System.out.println("   |   |   ");
                    System.out.println("O moves on the left space.");

                    System.out.println("   |   |   ");
                    System.out.println(" X | O | O ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" O | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println("   |   |   ");
                    System.out.println("   |   |   ");

                    System.out.println("Enter the number of your move");
                    System.out.println("0|1|2");
                    System.out.println("-+-+-");
                    System.out.println("3|4|5");
                    System.out.println("-+-+-");
                    System.out.println("6|7|8");
                    move = Integer.parseInt(in.nextLine());
                    
                    if (move == 6) {

                        System.out.println("   |   |   ");
                        System.out.println(" X | O | O ");
                        System.out.println("   |   |   ");
                        System.out.println("---+---+---");
                        System.out.println("   |   |   ");
                        System.out.println(" O | X | X ");
                        System.out.println("   |   |   ");
                        System.out.println("---+---+---");
                        System.out.println("   |   |   ");
                        System.out.println(" X |   |   ");
                        System.out.println("   |   |   ");
                        System.out.println("O moves on the bottom-right space.");

                        System.out.println("   |   |   ");
                        System.out.println(" X | O | O ");
                        System.out.println("   |   |   ");
                        System.out.println("---+---+---");
                        System.out.println("   |   |   ");
                        System.out.println(" O | X | X ");
                        System.out.println("   |   |   ");
                        System.out.println("---+---+---");
                        System.out.println("   |   |   ");
                        System.out.println(" X |   | O ");
                        System.out.println("   |   |   ");

                        System.out.println("Enter the number of your move");
                        System.out.println("0|1|2");
                        System.out.println("-+-+-");
                        System.out.println("3|4|5");
                        System.out.println("-+-+-");
                        System.out.println("6|7|8");
                        move = Integer.parseInt(in.nextLine());
                        
                        if (move == 7) {

                            System.out.println("   |   |   ");
                            System.out.println(" X | O | O ");
                            System.out.println("   |   |   ");
                            System.out.println("---+---+---");
                            System.out.println("   |   |   ");
                            System.out.println(" O | X | X ");
                            System.out.println("   |   |   ");
                            System.out.println("---+---+---");
                            System.out.println("   |   |   ");
                            System.out.println(" X | X | O ");
                            System.out.println("   |   |   ");
                            System.out.println("It's a tie!");
                            System.exit(0);
                        }
                    }
                    if (move == 7) {

                        System.out.println("   |   |   ");
                        System.out.println(" X | O | O ");
                        System.out.println("   |   |   ");
                        System.out.println("---+---+---");
                        System.out.println("   |   |   ");
                        System.out.println(" O | X | X ");
                        System.out.println("   |   |   ");
                        System.out.println("---+---+---");
                        System.out.println("   |   |   ");
                        System.out.println("   | X |   ");
                        System.out.println("   |   |   ");
                        System.out.println("O moves on the bottom-right space.");

                        System.out.println("   |   |   ");
                        System.out.println(" X | O | O ");
                        System.out.println("   |   |   ");
                        System.out.println("---+---+---");
                        System.out.println("   |   |   ");
                        System.out.println(" O | X | X ");
                        System.out.println("   |   |   ");
                        System.out.println("---+---+---");
                        System.out.println("   |   |   ");
                        System.out.println("   | X | O ");
                        System.out.println("   |   |   ");

                        System.out.println("Enter the number of your move");
                        System.out.println("0|1|2");
                        System.out.println("-+-+-");
                        System.out.println("3|4|5");
                        System.out.println("-+-+-");
                        System.out.println("6|7|8");
                        move = Integer.parseInt(in.nextLine());
                        
                        if (move == 6) {

                            System.out.println("   |   |   ");
                            System.out.println(" X | O | O ");
                            System.out.println("   |   |   ");
                            System.out.println("---+---+---");
                            System.out.println("   |   |   ");
                            System.out.println(" O | X | X ");
                            System.out.println("   |   |   ");
                            System.out.println("---+---+---");
                            System.out.println("   |   |   ");
                            System.out.println(" X | X | O ");
                            System.out.println("   |   |   ");
                            System.out.println("It's a tie!");
                            System.exit(0);
                        }
                    }
                    if (move == 8) {

                        System.out.println("   |   |   ");
                        System.out.println(" X | O | O ");
                        System.out.println("   |   |   ");
                        System.out.println("---+---+---");
                        System.out.println("   |   |   ");
                        System.out.println(" O | X | X ");
                        System.out.println("   |   |   ");
                        System.out.println("---+---+---");
                        System.out.println("   |   |   ");
                        System.out.println("   |   | X ");
                        System.out.println("   |   |   ");
                        System.out.println("You win!");
                        System.exit(0);
                    }
                }
                if (move == 6) {

                    System.out.println("   |   |   ");
                    System.out.println(" X | O | O ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println("   | X |   ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X |   |   ");
                    System.out.println("   |   |   ");
                    System.out.println("O moves on the right space.");

                    System.out.println("   |   |   ");
                    System.out.println(" X | O | O ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println("   | X | O ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X |   |   ");
                    System.out.println("   |   |   ");

                    System.out.println("Enter the number of your move");
                    System.out.println("0|1|2");
                    System.out.println("-+-+-");
                    System.out.println("3|4|5");
                    System.out.println("-+-+-");
                    System.out.println("6|7|8");
                    move = Integer.parseInt(in.nextLine());
                    
                    if (move == 3) {

                        System.out.println("   |   |   ");
                        System.out.println(" X | O | O ");
                        System.out.println("   |   |   ");
                        System.out.println("---+---+---");
                        System.out.println("   |   |   ");
                        System.out.println(" X | X | O ");
                        System.out.println("   |   |   ");
                        System.out.println("---+---+---");
                        System.out.println("   |   |   ");
                        System.out.println(" X |   |   ");
                        System.out.println("   |   |   ");
                        System.out.println("You win!");
                        System.exit(0);
                    }
                    if (move == 7) {

                        System.out.println("   |   |   ");
                        System.out.println(" X | O | O ");
                        System.out.println("   |   |   ");
                        System.out.println("---+---+---");
                        System.out.println("   |   |   ");
                        System.out.println(" X | X | O ");
                        System.out.println("   |   |   ");
                        System.out.println("---+---+---");
                        System.out.println("   |   |   ");
                        System.out.println(" X | X |   ");
                        System.out.println("   |   |   ");
                        System.out.println("You win!");
                        System.exit(0);
                    }
                    if (move == 8) {

                        System.out.println("   |   |   ");
                        System.out.println(" X | O | O ");
                        System.out.println("   |   |   ");
                        System.out.println("---+---+---");
                        System.out.println("   |   |   ");
                        System.out.println(" X | X | O ");
                        System.out.println("   |   |   ");
                        System.out.println("---+---+---");
                        System.out.println("   |   |   ");
                        System.out.println(" X | X | X ");
                        System.out.println("   |   |   ");
                        System.out.println("You win!");
                        System.exit(0);
                    }
                }
                if (move == 7) {

                    System.out.println("   |   |   ");
                    System.out.println(" X | O | O ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println("   | X |   ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println("   | X |   ");
                    System.out.println("   |   |   ");
                    System.out.println("O moves on the right space.");

                    System.out.println("   |   |   ");
                    System.out.println(" X | O | O ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println("   | X | O ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println("   | X |   ");
                    System.out.println("   |   |   ");

                    System.out.println("Enter the number of your move");
                    System.out.println("0|1|2");
                    System.out.println("-+-+-");
                    System.out.println("3|4|5");
                    System.out.println("-+-+-");
                    System.out.println("6|7|8");
                    move = Integer.parseInt(in.nextLine());
                    
                    if (move == 3) {

                        System.out.println("   |   |   ");
                        System.out.println(" X | O | O ");
                        System.out.println("   |   |   ");
                        System.out.println("---+---+---");
                        System.out.println("   |   |   ");
                        System.out.println(" X | X | O ");
                        System.out.println("   |   |   ");
                        System.out.println("---+---+---");
                        System.out.println("   |   |   ");
                        System.out.println("   | X |   ");
                        System.out.println("   |   |   ");
                        System.out.println("O moves on the bottom-right space.");

                        System.out.println("   |   |   ");
                        System.out.println(" X | O | O ");
                        System.out.println("   |   |   ");
                        System.out.println("---+---+---");
                        System.out.println("   |   |   ");
                        System.out.println(" X | X | O ");
                        System.out.println("   |   |   ");
                        System.out.println("---+---+---");
                        System.out.println("   |   |   ");
                        System.out.println("   | X | O ");
                        System.out.println("   |   |   ");
                        System.out.println("The computer wins!");
                        System.exit(0);
                    }
                    if (move == 6) {

                        System.out.println("   |   |   ");
                        System.out.println(" X | O | O ");
                        System.out.println("   |   |   ");
                        System.out.println("---+---+---");
                        System.out.println("   |   |   ");
                        System.out.println(" X | X | O ");
                        System.out.println("   |   |   ");
                        System.out.println("---+---+---");
                        System.out.println("   |   |   ");
                        System.out.println(" X | X | O ");
                        System.out.println("   |   |   ");
                        System.out.println("You win!");
                        System.exit(0);
                    }
                }
                if (move == 8) {

                    System.out.println("   |   |   ");
                    System.out.println(" X | O | O ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println("   | X |   ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println("   |   | X ");
                    System.out.println("   |   |   ");
                    System.out.println("You win!");
                    System.exit(0);
                }
            }
            if (move == 5) {

                System.out.println("   |   |   ");
                System.out.println(" X | O |   ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println("   |   | X ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println("   |   |   ");
                System.out.println("   |   |   ");
                System.out.println("O moves on the center space.");

                System.out.println("   |   |   ");
                System.out.println(" X | O |   ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println("   | O | X ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println("   |   |   ");
                System.out.println("   |   |   ");

                System.out.println("Enter the number of your move");
                System.out.println("0|1|2");
                System.out.println("-+-+-");
                System.out.println("3|4|5");
                System.out.println("-+-+-");
                System.out.println("6|7|8");
                move = Integer.parseInt(in.nextLine());
                
                if (move == 2) {

                    System.out.println("   |   |   ");
                    System.out.println(" X | O | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println("   | O | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println("   |   |   ");
                    System.out.println("   |   |   ");
                    System.out.println("O moves on the bottom space.");

                    System.out.println("   |   |   ");
                    System.out.println(" X | O | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println("   | O | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println("   | O |   ");
                    System.out.println("   |   |   ");
                    System.out.println("The computer wins!");
                    System.exit(0);
                }
                if (move == 3) {

                    System.out.println("   |   |   ");
                    System.out.println(" X | O | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | O | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println("   | O |   ");
                    System.out.println("   |   |   ");
                    System.out.println("O moves on the bottom-left space.");

                    System.out.println("   |   |   ");
                    System.out.println(" X | O | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | O | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" O | O |   ");
                    System.out.println("   |   |   ");
                    System.out.println("The computer wins!");
                    System.exit(0);
                }
                if (move == 8) {

                    System.out.println("   |   |   ");
                    System.out.println(" X | O | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | O | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" O | O | X ");
                    System.out.println("   |   |   ");
                    System.out.println("You win!");
                    System.exit(0);
                }
            }
            if (move == 6) {

                System.out.println("   |   |   ");
                System.out.println(" X | O |   ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println("   |   |   ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println(" X |   |   ");
                System.out.println("   |   |   ");
                System.out.println("O moves on the center space.");

                System.out.println("   |   |   ");
                System.out.println(" X | O |   ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println("   | O |   ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println(" X |   |   ");
                System.out.println("   |   |   ");

                System.out.println("Enter the number of your move");
                System.out.println("0|1|2");
                System.out.println("-+-+-");
                System.out.println("3|4|5");
                System.out.println("-+-+-");
                System.out.println("6|7|8");
                move = Integer.parseInt(in.nextLine());
                
                if (move == 2) {

                    System.out.println("   |   |   ");
                    System.out.println(" X | O | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println("   | O |   ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X |   |   ");
                    System.out.println("   |   |   ");
                    System.out.println("O moves on the bottom space.");

                    System.out.println("   |   |   ");
                    System.out.println(" X | O | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println("   | O |   ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | O |   ");
                    System.out.println("   |   |   ");
                    System.out.println("The computer wins!");
                    System.exit(0);
                }
                if (move == 3) {

                    System.out.println("   |   |   ");
                    System.out.println(" X | O | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | O |   ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | O |   ");
                    System.out.println("   |   |   ");
                    System.out.println("You win!");
                    System.exit(0);
                }
                if (move == 5) {

                    System.out.println("   |   |   ");
                    System.out.println(" X | O | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | O | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | O |   ");
                    System.out.println("   |   |   ");
                    System.out.println("You win!");
                    System.exit(0);
                }
                if (move == 8) {

                    System.out.println("   |   |   ");
                    System.out.println(" X | O | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | O | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | O | X ");
                    System.out.println("   |   |   ");
                    System.out.println("You win!");
                    System.exit(0);
                }
            }
            if (move == 7) {

                System.out.println("   |   |   ");
                System.out.println(" X | O |   ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println("   |   |   ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println("   | X |   ");
                System.out.println("   |   |   ");
                System.out.println("O moves on the top-right space.");

                System.out.println("   |   |   ");
                System.out.println(" X | O | O ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println("   |   |   ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println("   | X |   ");
                System.out.println("   |   |   ");

                System.out.println("Enter the number of your move");
                System.out.println("0|1|2");
                System.out.println("-+-+-");
                System.out.println("3|4|5");
                System.out.println("-+-+-");
                System.out.println("6|7|8");
                move = Integer.parseInt(in.nextLine());
                
                if (move == 3) {

                    System.out.println("   |   |   ");
                    System.out.println(" X | O | O ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X |   |   ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println("   | X |   ");
                    System.out.println("   |   |   ");
                    System.out.println("O moves on the center space.");

                    System.out.println("   |   |   ");
                    System.out.println(" X | O | O ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | O |   ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println("   | X |   ");
                    System.out.println("   |   |   ");

                    System.out.println("Enter the number of your move");
                    System.out.println("0|1|2");
                    System.out.println("-+-+-");
                    System.out.println("3|4|5");
                    System.out.println("-+-+-");
                    System.out.println("6|7|8");
                    move = Integer.parseInt(in.nextLine());
                    
                    if (move == 5) {

                        System.out.println("   |   |   ");
                        System.out.println(" X | O | O ");
                        System.out.println("   |   |   ");
                        System.out.println("---+---+---");
                        System.out.println("   |   |   ");
                        System.out.println(" X | O | X ");
                        System.out.println("   |   |   ");
                        System.out.println("---+---+---");
                        System.out.println("   |   |   ");
                        System.out.println("   | X |   ");
                        System.out.println("   |   |   ");
                        System.out.println("O moves on the bottom-left space.");

                        System.out.println("   |   |   ");
                        System.out.println(" X | O | O ");
                        System.out.println("   |   |   ");
                        System.out.println("---+---+---");
                        System.out.println("   |   |   ");
                        System.out.println(" X | O | X ");
                        System.out.println("   |   |   ");
                        System.out.println("---+---+---");
                        System.out.println("   |   |   ");
                        System.out.println(" O | X |   ");
                        System.out.println("   |   |   ");
                        System.out.println("The computer wins!");
                        System.exit(0);
                    }
                    if (move == 8) {

                        System.out.println("   |   |   ");
                        System.out.println(" X | O | O ");
                        System.out.println("   |   |   ");
                        System.out.println("---+---+---");
                        System.out.println("   |   |   ");
                        System.out.println(" X | O | X ");
                        System.out.println("   |   |   ");
                        System.out.println("---+---+---");
                        System.out.println("   |   |   ");
                        System.out.println(" O | X | X ");
                        System.out.println("   |   |   ");
                        System.out.println("It's a tie!");
                        System.exit(0);
                    }
                }
                if (move == 4) {

                    System.out.println("   |   |   ");
                    System.out.println(" X | O | O ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println("   | X |   ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println("   | X |   ");
                    System.out.println("   |   |   ");
                    System.out.println("O moves on the right space.");

                    System.out.println("   |   |   ");
                    System.out.println(" X | O | O ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println("   | X | O ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println("   | X |   ");
                    System.out.println("   |   |   ");

                    System.out.println("Enter the number of your move");
                    System.out.println("0|1|2");
                    System.out.println("-+-+-");
                    System.out.println("3|4|5");
                    System.out.println("-+-+-");
                    System.out.println("6|7|8");
                    move = Integer.parseInt(in.nextLine());
                    
                    if (move == 3) {

                        System.out.println("   |   |   ");
                        System.out.println(" X | O | O ");
                        System.out.println("   |   |   ");
                        System.out.println("---+---+---");
                        System.out.println("   |   |   ");
                        System.out.println(" X | X | O ");
                        System.out.println("   |   |   ");
                        System.out.println("---+---+---");
                        System.out.println("   |   |   ");
                        System.out.println("   | X |   ");
                        System.out.println("   |   |   ");
                        System.out.println("O moves on the bottom-right space.");

                        System.out.println("   |   |   ");
                        System.out.println(" X | O | O ");
                        System.out.println("   |   |   ");
                        System.out.println("---+---+---");
                        System.out.println("   |   |   ");
                        System.out.println(" X | X | O ");
                        System.out.println("   |   |   ");
                        System.out.println("---+---+---");
                        System.out.println("   |   |   ");
                        System.out.println("   | X | O ");
                        System.out.println("   |   |   ");
                        System.out.println("The computer wins!");
                        System.exit(0);
                    }
                    if (move == 6) {

                        System.out.println("   |   |   ");
                        System.out.println(" X | O | O ");
                        System.out.println("   |   |   ");
                        System.out.println("---+---+---");
                        System.out.println("   |   |   ");
                        System.out.println(" X | X | O ");
                        System.out.println("   |   |   ");
                        System.out.println("---+---+---");
                        System.out.println("   |   |   ");
                        System.out.println(" X | X | O ");
                        System.out.println("   |   |   ");
                        System.out.println("You win!");
                        System.exit(0);
                    }
                }
                if (move == 5) {

                    System.out.println("   |   |   ");
                    System.out.println(" X | O | O ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println("   |   | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println("   | X |   ");
                    System.out.println("   |   |   ");
                    System.out.println("O moves on the center space.");

                    System.out.println("   |   |   ");
                    System.out.println(" X | O | O ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println("   | O | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println("   | X |   ");
                    System.out.println("   |   |   ");

                    System.out.println("Enter the number of your move");
                    System.out.println("0|1|2");
                    System.out.println("-+-+-");
                    System.out.println("3|4|5");
                    System.out.println("-+-+-");
                    System.out.println("6|7|8");
                    move = Integer.parseInt(in.nextLine());
                    
                    if (move == 3) {

                        System.out.println("   |   |   ");
                        System.out.println(" X | O | O ");
                        System.out.println("   |   |   ");
                        System.out.println("---+---+---");
                        System.out.println("   |   |   ");
                        System.out.println(" X | O | X ");
                        System.out.println("   |   |   ");
                        System.out.println("---+---+---");
                        System.out.println("   |   |   ");
                        System.out.println("   | X |   ");
                        System.out.println("   |   |   ");
                        System.out.println("O moves on the bottom-left space.");

                        System.out.println("   |   |   ");
                        System.out.println(" X | O | O ");
                        System.out.println("   |   |   ");
                        System.out.println("---+---+---");
                        System.out.println("   |   |   ");
                        System.out.println(" X | O | X ");
                        System.out.println("   |   |   ");
                        System.out.println("---+---+---");
                        System.out.println("   |   |   ");
                        System.out.println(" O | X |   ");
                        System.out.println("   |   |   ");
                        System.out.println("The computer wins!");
                        System.exit(0);
                    }
                    if (move == 8) {

                        System.out.println("   |   |   ");
                        System.out.println(" X | O | O ");
                        System.out.println("   |   |   ");
                        System.out.println("---+---+---");
                        System.out.println("   |   |   ");
                        System.out.println(" X | O | X ");
                        System.out.println("   |   |   ");
                        System.out.println("---+---+---");
                        System.out.println("   |   |   ");
                        System.out.println(" O | X | X ");
                        System.out.println("   |   |   ");
                        System.out.println("It's a tie!");
                        System.exit(0);
                    }
                }
                if (move == 6) {

                    System.out.println("   |   |   ");
                    System.out.println(" X | O | O ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println("   |   |   ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | X |   ");
                    System.out.println("   |   |   ");
                    System.out.println("O moves on the right space.");

                    System.out.println("   |   |   ");
                    System.out.println(" X | O | O ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println("   |   | O ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | X |   ");
                    System.out.println("   |   |   ");

                    System.out.println("Enter the number of your move");
                    System.out.println("0|1|2");
                    System.out.println("-+-+-");
                    System.out.println("3|4|5");
                    System.out.println("-+-+-");
                    System.out.println("6|7|8");
                    move = Integer.parseInt(in.nextLine());
                    
                    if (move == 3) {

                        System.out.println("   |   |   ");
                        System.out.println(" X | O | O ");
                        System.out.println("   |   |   ");
                        System.out.println("---+---+---");
                        System.out.println("   |   |   ");
                        System.out.println(" X |   | O ");
                        System.out.println("   |   |   ");
                        System.out.println("---+---+---");
                        System.out.println("   |   |   ");
                        System.out.println(" X | X |   ");
                        System.out.println("   |   |   ");
                        System.out.println("You win!");
                        System.exit(0);
                    }
                    if (move == 4) {

                        System.out.println("   |   |   ");
                        System.out.println(" X | O | O ");
                        System.out.println("   |   |   ");
                        System.out.println("---+---+---");
                        System.out.println("   |   |   ");
                        System.out.println(" X | X | O ");
                        System.out.println("   |   |   ");
                        System.out.println("---+---+---");
                        System.out.println("   |   |   ");
                        System.out.println(" X | X |   ");
                        System.out.println("   |   |   ");
                        System.out.println("You win!");
                        System.exit(0);
                    }
                    if (move == 8) {

                        System.out.println("   |   |   ");
                        System.out.println(" X | O | O ");
                        System.out.println("   |   |   ");
                        System.out.println("---+---+---");
                        System.out.println("   |   |   ");
                        System.out.println(" X | X | O ");
                        System.out.println("   |   |   ");
                        System.out.println("---+---+---");
                        System.out.println("   |   |   ");
                        System.out.println(" X | X | X ");
                        System.out.println("   |   |   ");
                        System.out.println("You win!");
                        System.exit(0);
                    }
                }
                if (move == 8) {

                    System.out.println("   |   |   ");
                    System.out.println(" X | O | O ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println("   |   |   ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println("   | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("O moves on the center space.");

                    System.out.println("   |   |   ");
                    System.out.println(" X | O | O ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println("   | O |   ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println("   | X | X ");
                    System.out.println("   |   |   ");

                    System.out.println("Enter the number of your move");
                    System.out.println("0|1|2");
                    System.out.println("-+-+-");
                    System.out.println("3|4|5");
                    System.out.println("-+-+-");
                    System.out.println("6|7|8");
                    move = Integer.parseInt(in.nextLine());
                    
                    if (move == 3) {

                        System.out.println("   |   |   ");
                        System.out.println(" X | O | O ");
                        System.out.println("   |   |   ");
                        System.out.println("---+---+---");
                        System.out.println("   |   |   ");
                        System.out.println(" X | O |   ");
                        System.out.println("   |   |   ");
                        System.out.println("---+---+---");
                        System.out.println("   |   |   ");
                        System.out.println("   | X | X ");
                        System.out.println("   |   |   ");
                        System.out.println("O moves on the bottom-left space.");

                        System.out.println("   |   |   ");
                        System.out.println(" X | O | O ");
                        System.out.println("   |   |   ");
                        System.out.println("---+---+---");
                        System.out.println("   |   |   ");
                        System.out.println(" X | O |   ");
                        System.out.println("   |   |   ");
                        System.out.println("---+---+---");
                        System.out.println("   |   |   ");
                        System.out.println(" O | X | X ");
                        System.out.println("   |   |   ");
                        System.out.println("The computer wins!");
                        System.exit(0);
                    }
                    if (move == 5) {

                        System.out.println("   |   |   ");
                        System.out.println(" X | O | O ");
                        System.out.println("   |   |   ");
                        System.out.println("---+---+---");
                        System.out.println("   |   |   ");
                        System.out.println(" X | O | X ");
                        System.out.println("   |   |   ");
                        System.out.println("---+---+---");
                        System.out.println("   |   |   ");
                        System.out.println(" O | X | X ");
                        System.out.println("   |   |   ");
                        System.out.println("It's a tie!");
                        System.exit(0);
                    }
                }
            }
            if (move == 8) {

                System.out.println("   |   |   ");
                System.out.println(" X | O |   ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println("   |   |   ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println("   |   | X ");
                System.out.println("   |   |   ");
                System.out.println("O moves on the center space.");

                System.out.println("   |   |   ");
                System.out.println(" X | O |   ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println("   | O |   ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println("   |   | X ");
                System.out.println("   |   |   ");

                System.out.println("Enter the number of your move");
                System.out.println("0|1|2");
                System.out.println("-+-+-");
                System.out.println("3|4|5");
                System.out.println("-+-+-");
                System.out.println("6|7|8");
                move = Integer.parseInt(in.nextLine());
                
                if (move == 2) {

                    System.out.println("   |   |   ");
                    System.out.println(" X | O | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println("   | O |   ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println("   |   | X ");
                    System.out.println("   |   |   ");
                    System.out.println("O moves on the bottom space.");

                    System.out.println("   |   |   ");
                    System.out.println(" X | O | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println("   | O |   ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println("   | O | X ");
                    System.out.println("   |   |   ");
                    System.out.println("The computer wins!");
                    System.exit(0);
                }
                if (move == 3) {

                    System.out.println("   |   |   ");
                    System.out.println(" X | O | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | O |   ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println("   | O | X ");
                    System.out.println("   |   |   ");
                    System.out.println("O moves on the right space.");

                    System.out.println("   |   |   ");
                    System.out.println(" X | O | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | O | O ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println("   | O | X ");
                    System.out.println("   |   |   ");
                    System.out.println("The computer wins!");
                    System.exit(0);
                }
                if (move == 6) {

                    System.out.println("   |   |   ");
                    System.out.println(" X | O | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | O | O ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | O | X ");
                    System.out.println("   |   |   ");
                    System.out.println("You win!");
                    System.exit(0);
                }
            }
        }
        if (move == 1) {

            System.out.println("   |   |   ");
            System.out.println("   | X |   ");
            System.out.println("   |   |   ");
            System.out.println("---+---+---");
            System.out.println("   |   |   ");
            System.out.println("   |   |   ");
            System.out.println("   |   |   ");
            System.out.println("---+---+---");
            System.out.println("   |   |   ");
            System.out.println("   |   |   ");
            System.out.println("   |   |   ");
            System.out.println("O moves on the top-left space.");

            System.out.println("   |   |   ");
            System.out.println(" O | X |   ");
            System.out.println("   |   |   ");
            System.out.println("---+---+---");
            System.out.println("   |   |   ");
            System.out.println("   |   |   ");
            System.out.println("   |   |   ");
            System.out.println("---+---+---");
            System.out.println("   |   |   ");
            System.out.println("   |   |   ");
            System.out.println("   |   |   ");

            System.out.println("Enter the number of your move");
            System.out.println("0|1|2");
            System.out.println("-+-+-");
            System.out.println("3|4|5");
            System.out.println("-+-+-");
            System.out.println("6|7|8");
            move = Integer.parseInt(in.nextLine());
            
            if (move == 2) {

                System.out.println("   |   |   ");
                System.out.println(" O | X | X ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println("   |   |   ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println("   |   |   ");
                System.out.println("   |   |   ");
                System.out.println("O moves on the left space.");

                System.out.println("   |   |   ");
                System.out.println(" O | X | X ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println(" O |   |   ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println("   |   |   ");
                System.out.println("   |   |   ");

                System.out.println("Enter the number of your move");
                System.out.println("0|1|2");
                System.out.println("-+-+-");
                System.out.println("3|4|5");
                System.out.println("-+-+-");
                System.out.println("6|7|8");
                move = Integer.parseInt(in.nextLine());
                
                if (move == 4) {

                    System.out.println("   |   |   ");
                    System.out.println(" O | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" O | X |   ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println("   |   |   ");
                    System.out.println("   |   |   ");
                    System.out.println("O moves on the bottom-left space.");

                    System.out.println("   |   |   ");
                    System.out.println(" O | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" O | X |   ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" O |   |   ");
                    System.out.println("   |   |   ");
                    System.out.println("The computer wins!");
                    System.exit(0);
                }
                if (move == 5) {

                    System.out.println("   |   |   ");
                    System.out.println(" O | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" O | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" O |   |   ");
                    System.out.println("   |   |   ");
                    System.out.println("O moves on the bottom space.");

                    System.out.println("   |   |   ");
                    System.out.println(" O | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" O | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" O | O |   ");
                    System.out.println("   |   |   ");
                    System.out.println("The computer wins!");
                    System.exit(0);
                }
                if (move == 8) {

                    System.out.println("   |   |   ");
                    System.out.println(" O | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" O | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" O | O | X ");
                    System.out.println("   |   |   ");
                    System.out.println("You win!");
                    System.exit(0);
                }
            }
            if (move == 3) {

                System.out.println("   |   |   ");
                System.out.println(" O | X |   ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println(" X |   |   ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println("   |   |   ");
                System.out.println("   |   |   ");
                System.out.println("O moves on the center space.");

                System.out.println("   |   |   ");
                System.out.println(" O | X |   ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println(" X | O |   ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println("   |   |   ");
                System.out.println("   |   |   ");

                System.out.println("Enter the number of your move");
                System.out.println("0|1|2");
                System.out.println("-+-+-");
                System.out.println("3|4|5");
                System.out.println("-+-+-");
                System.out.println("6|7|8");
                move = Integer.parseInt(in.nextLine());
                
                if (move == 2) {

                    System.out.println("   |   |   ");
                    System.out.println(" O | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | O |   ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println("   |   |   ");
                    System.out.println("   |   |   ");
                    System.out.println("O moves on the bottom-right space.");

                    System.out.println("   |   |   ");
                    System.out.println(" O | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | O |   ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println("   |   | O ");
                    System.out.println("   |   |   ");
                    System.out.println("The computer wins!");
                    System.exit(0);
                }
                if (move == 5) {

                    System.out.println("   |   |   ");
                    System.out.println(" O | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | O | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println("   |   | O ");
                    System.out.println("   |   |   ");
                    System.out.println("O moves on the bottom-left space.");

                    System.out.println("   |   |   ");
                    System.out.println(" O | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | O | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" O |   | O ");
                    System.out.println("   |   |   ");
                    System.out.println("The computer wins!");
                    System.exit(0);
                }
                if (move == 7) {

                    System.out.println("   |   |   ");
                    System.out.println(" O | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | O | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" O | X | O ");
                    System.out.println("   |   |   ");
                    System.out.println("It's a tie!");
                    System.exit(0);
                }
            }
            if (move == 4) {

                System.out.println("   |   |   ");
                System.out.println(" O | X |   ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println("   | X |   ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println("   |   |   ");
                System.out.println("   |   |   ");
                System.out.println("O moves on the left space.");

                System.out.println("   |   |   ");
                System.out.println(" O | X |   ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println(" O | X |   ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println("   |   |   ");
                System.out.println("   |   |   ");

                System.out.println("Enter the number of your move");
                System.out.println("0|1|2");
                System.out.println("-+-+-");
                System.out.println("3|4|5");
                System.out.println("-+-+-");
                System.out.println("6|7|8");
                move = Integer.parseInt(in.nextLine());
                
                if (move == 2) {

                    System.out.println("   |   |   ");
                    System.out.println(" O | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" O | X |   ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println("   |   |   ");
                    System.out.println("   |   |   ");
                    System.out.println("O moves on the bottom-left space.");

                    System.out.println("   |   |   ");
                    System.out.println(" O | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" O | X |   ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" O |   |   ");
                    System.out.println("   |   |   ");
                    System.out.println("The computer wins!");
                    System.exit(0);
                }
                if (move == 5) {

                    System.out.println("   |   |   ");
                    System.out.println(" O | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" O | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" O |   |   ");
                    System.out.println("   |   |   ");
                    System.out.println("O moves on the bottom space.");

                    System.out.println("   |   |   ");
                    System.out.println(" O | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" O | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" O | O |   ");
                    System.out.println("   |   |   ");
                    System.out.println("The computer wins!");
                    System.exit(0);
                }
                if (move == 8) {

                    System.out.println("   |   |   ");
                    System.out.println(" O | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" O | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" O | O | X ");
                    System.out.println("   |   |   ");
                    System.out.println("You win!");
                    System.exit(0);
                }
            }
            if (move == 5) {

                System.out.println("   |   |   ");
                System.out.println(" O | X |   ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println("   |   | X ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println("   |   |   ");
                System.out.println("   |   |   ");
                System.out.println("O moves on the left space.");

                System.out.println("   |   |   ");
                System.out.println(" O | X |   ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println(" O |   | X ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println("   |   |   ");
                System.out.println("   |   |   ");

                System.out.println("Enter the number of your move");
                System.out.println("0|1|2");
                System.out.println("-+-+-");
                System.out.println("3|4|5");
                System.out.println("-+-+-");
                System.out.println("6|7|8");
                move = Integer.parseInt(in.nextLine());
                
                if (move == 2) {

                    System.out.println("   |   |   ");
                    System.out.println(" O | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" O |   | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println("   |   |   ");
                    System.out.println("   |   |   ");
                    System.out.println("O moves on the bottom-left space.");

                    System.out.println("   |   |   ");
                    System.out.println(" O | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" O |   | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" O |   |   ");
                    System.out.println("   |   |   ");
                    System.out.println("The computer wins!");
                    System.exit(0);
                }
                if (move == 4) {

                    System.out.println("   |   |   ");
                    System.out.println(" O | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" O | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" O |   |   ");
                    System.out.println("   |   |   ");
                    System.out.println("O moves on the bottom space.");

                    System.out.println("   |   |   ");
                    System.out.println(" O | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" O | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" O | O |   ");
                    System.out.println("   |   |   ");
                    System.out.println("The computer wins!");
                    System.exit(0);
                }
                if (move == 8) {

                    System.out.println("   |   |   ");
                    System.out.println(" O | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" O | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" O | O | X ");
                    System.out.println("   |   |   ");
                    System.out.println("You win!");
                    System.exit(0);
                }
            }
            if (move == 6) {

                System.out.println("   |   |   ");
                System.out.println(" O | X |   ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println("   |   |   ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println(" X |   |   ");
                System.out.println("   |   |   ");
                System.out.println("O moves on the center space.");

                System.out.println("   |   |   ");
                System.out.println(" O | X |   ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println("   | O |   ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println(" X |   |   ");
                System.out.println("   |   |   ");

                System.out.println("Enter the number of your move");
                System.out.println("0|1|2");
                System.out.println("-+-+-");
                System.out.println("3|4|5");
                System.out.println("-+-+-");
                System.out.println("6|7|8");
                move = Integer.parseInt(in.nextLine());
                
                if (move == 2) {

                    System.out.println("   |   |   ");
                    System.out.println(" O | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println("   | O |   ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X |   |   ");
                    System.out.println("   |   |   ");
                    System.out.println("O moves on the bottom-right space.");

                    System.out.println("   |   |   ");
                    System.out.println(" O | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println("   | O |   ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X |   | O ");
                    System.out.println("   |   |   ");
                    System.out.println("The computer wins!");
                    System.exit(0);
                }
                if (move == 3) {

                    System.out.println("   |   |   ");
                    System.out.println(" O | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | O |   ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X |   | O ");
                    System.out.println("   |   |   ");
                    System.out.println("O moves on the right space.");

                    System.out.println("   |   |   ");
                    System.out.println(" O | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | O | O ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X |   | O ");
                    System.out.println("   |   |   ");
                    System.out.println("The computer wins!");
                    System.exit(0);
                }
                if (move == 7) {

                    System.out.println("   |   |   ");
                    System.out.println(" O | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | O | O ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | X | O ");
                    System.out.println("   |   |   ");
                    System.out.println("It's a tie!");
                    System.exit(0);
                }
            }
            if (move == 7) {

                System.out.println("   |   |   ");
                System.out.println(" O | X |   ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println("   |   |   ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println("   | X |   ");
                System.out.println("   |   |   ");
                System.out.println("O moves on the left space.");

                System.out.println("   |   |   ");
                System.out.println(" O | X |   ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println(" O |   |   ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println("   | X |   ");
                System.out.println("   |   |   ");

                System.out.println("Enter the number of your move");
                System.out.println("0|1|2");
                System.out.println("-+-+-");
                System.out.println("3|4|5");
                System.out.println("-+-+-");
                System.out.println("6|7|8");
                move = Integer.parseInt(in.nextLine());
                
                if (move == 2) {

                    System.out.println("   |   |   ");
                    System.out.println(" O | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" O |   |   ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println("   | X |   ");
                    System.out.println("   |   |   ");
                    System.out.println("O moves on the bottom-left space.");

                    System.out.println("   |   |   ");
                    System.out.println(" O | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" O |   |   ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" O | X |   ");
                    System.out.println("   |   |   ");
                    System.out.println("The computer wins!");
                    System.exit(0);
                }
                if (move == 4) {

                    System.out.println("   |   |   ");
                    System.out.println(" O | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" O | X |   ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" O | X |   ");
                    System.out.println("   |   |   ");
                    System.out.println("You win!");
                    System.exit(0);
                }
                if (move == 5) {

                    System.out.println("   |   |   ");
                    System.out.println(" O | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" O | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" O | X |   ");
                    System.out.println("   |   |   ");
                    System.out.println("You win!");
                    System.exit(0);
                }
                if (move == 8) {

                    System.out.println("   |   |   ");
                    System.out.println(" O | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" O | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" O | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("You win!");
                    System.exit(0);
                }
            }
            if (move == 8) {

                System.out.println("   |   |   ");
                System.out.println(" O | X |   ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println("   |   |   ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println("   |   | X ");
                System.out.println("   |   |   ");
                System.out.println("O moves on the left space.");

                System.out.println("   |   |   ");
                System.out.println(" O | X |   ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println(" O |   |   ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println("   |   | X ");
                System.out.println("   |   |   ");

                System.out.println("Enter the number of your move");
                System.out.println("0|1|2");
                System.out.println("-+-+-");
                System.out.println("3|4|5");
                System.out.println("-+-+-");
                System.out.println("6|7|8");
                move = Integer.parseInt(in.nextLine());
                
                if (move == 2) {

                    System.out.println("   |   |   ");
                    System.out.println(" O | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" O |   |   ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println("   |   | X ");
                    System.out.println("   |   |   ");
                    System.out.println("O moves on the bottom-left space.");

                    System.out.println("   |   |   ");
                    System.out.println(" O | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" O |   |   ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" O |   | X ");
                    System.out.println("   |   |   ");
                    System.out.println("The computer wins!");
                    System.exit(0);
                }
                if (move == 4) {

                    System.out.println("   |   |   ");
                    System.out.println(" O | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" O | X |   ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" O |   | X ");
                    System.out.println("   |   |   ");
                    System.out.println("O moves on the right space.");

                    System.out.println("   |   |   ");
                    System.out.println(" O | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" O | X | O ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" O |   | X ");
                    System.out.println("   |   |   ");
                    System.out.println("The computer wins!");
                    System.exit(0);
                }
                if (move == 7) {

                    System.out.println("   |   |   ");
                    System.out.println(" O | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" O | X | O ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" O | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("You win!");
                    System.exit(0);
                }
            }
        }
        if (move == 2) {

            System.out.println("   |   |   ");
            System.out.println("   |   | X ");
            System.out.println("   |   |   ");
            System.out.println("---+---+---");
            System.out.println("   |   |   ");
            System.out.println("   |   |   ");
            System.out.println("   |   |   ");
            System.out.println("---+---+---");
            System.out.println("   |   |   ");
            System.out.println("   |   |   ");
            System.out.println("   |   |   ");
            System.out.println("O moves on the top-left space.");

            System.out.println("   |   |   ");
            System.out.println(" O |   | X ");
            System.out.println("   |   |   ");
            System.out.println("---+---+---");
            System.out.println("   |   |   ");
            System.out.println("   |   |   ");
            System.out.println("   |   |   ");
            System.out.println("---+---+---");
            System.out.println("   |   |   ");
            System.out.println("   |   |   ");
            System.out.println("   |   |   ");

            System.out.println("Enter the number of your move");
            System.out.println("0|1|2");
            System.out.println("-+-+-");
            System.out.println("3|4|5");
            System.out.println("-+-+-");
            System.out.println("6|7|8");
            move = Integer.parseInt(in.nextLine());
            
            if (move == 1) {

                System.out.println("   |   |   ");
                System.out.println(" O | X | X ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println("   |   |   ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println("   |   |   ");
                System.out.println("   |   |   ");
                System.out.println("O moves on the left space.");

                System.out.println("   |   |   ");
                System.out.println(" O | X | X ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println(" O |   |   ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println("   |   |   ");
                System.out.println("   |   |   ");

                System.out.println("Enter the number of your move");
                System.out.println("0|1|2");
                System.out.println("-+-+-");
                System.out.println("3|4|5");
                System.out.println("-+-+-");
                System.out.println("6|7|8");
                move = Integer.parseInt(in.nextLine());
                
                if (move == 4) {

                    System.out.println("   |   |   ");
                    System.out.println(" O | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" O | X |   ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println("   |   |   ");
                    System.out.println("   |   |   ");
                    System.out.println("O moves on the bottom-left space.");

                    System.out.println("   |   |   ");
                    System.out.println(" O | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" O | X |   ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" O |   |   ");
                    System.out.println("   |   |   ");
                    System.out.println("The computer wins!");
                    System.exit(0);
                }
                if (move == 5) {

                    System.out.println("   |   |   ");
                    System.out.println(" O | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" O | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" O |   |   ");
                    System.out.println("   |   |   ");
                    System.out.println("O moves on the bottom space.");

                    System.out.println("   |   |   ");
                    System.out.println(" O | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" O | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" O | O |   ");
                    System.out.println("   |   |   ");
                    System.out.println("The computer wins!");
                    System.exit(0);
                }
                if (move == 8) {

                    System.out.println("   |   |   ");
                    System.out.println(" O | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" O | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" O | O | X ");
                    System.out.println("   |   |   ");
                    System.out.println("You win!");
                    System.exit(0);
                }
            }
            if (move == 3) {

                System.out.println("   |   |   ");
                System.out.println(" O |   | X ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println(" X |   |   ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println("   |   |   ");
                System.out.println("   |   |   ");
                System.out.println("O moves on the center space.");

                System.out.println("   |   |   ");
                System.out.println(" O |   | X ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println(" X | O |   ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println("   |   |   ");
                System.out.println("   |   |   ");

                System.out.println("Enter the number of your move");
                System.out.println("0|1|2");
                System.out.println("-+-+-");
                System.out.println("3|4|5");
                System.out.println("-+-+-");
                System.out.println("6|7|8");
                move = Integer.parseInt(in.nextLine());
                
                if (move == 1) {

                    System.out.println("   |   |   ");
                    System.out.println(" O | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | O |   ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println("   |   |   ");
                    System.out.println("   |   |   ");
                    System.out.println("O moves on the bottom-right space.");

                    System.out.println("   |   |   ");
                    System.out.println(" O | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | O |   ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println("   |   | O ");
                    System.out.println("   |   |   ");
                    System.out.println("The computer wins!");
                    System.exit(0);
                }
                if (move == 5) {

                    System.out.println("   |   |   ");
                    System.out.println(" O | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | O | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println("   |   | O ");
                    System.out.println("   |   |   ");
                    System.out.println("O moves on the bottom-left space.");

                    System.out.println("   |   |   ");
                    System.out.println(" O | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | O | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" O |   | O ");
                    System.out.println("   |   |   ");
                    System.out.println("The computer wins!");
                    System.exit(0);
                }
                if (move == 7) {

                    System.out.println("   |   |   ");
                    System.out.println(" O | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | O | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" O | X | O ");
                    System.out.println("   |   |   ");
                    System.out.println("It's a tie!");
                    System.exit(0);
                }
            }
            if (move == 4) {

                System.out.println("   |   |   ");
                System.out.println(" O |   | X ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println("   | X |   ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println("   |   |   ");
                System.out.println("   |   |   ");
                System.out.println("O moves on the left space.");

                System.out.println("   |   |   ");
                System.out.println(" O |   | X ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println(" O | X |   ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println("   |   |   ");
                System.out.println("   |   |   ");

                System.out.println("Enter the number of your move");
                System.out.println("0|1|2");
                System.out.println("-+-+-");
                System.out.println("3|4|5");
                System.out.println("-+-+-");
                System.out.println("6|7|8");
                move = Integer.parseInt(in.nextLine());
                
                if (move == 1) {

                    System.out.println("   |   |   ");
                    System.out.println(" O | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" O | X |   ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println("   |   |   ");
                    System.out.println("   |   |   ");
                    System.out.println("O moves on the bottom-left space.");

                    System.out.println("   |   |   ");
                    System.out.println(" O | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" O | X |   ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" O |   |   ");
                    System.out.println("   |   |   ");
                    System.out.println("The computer wins!");
                    System.exit(0);
                }
                if (move == 5) {

                    System.out.println("   |   |   ");
                    System.out.println(" O | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" O | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" O |   |   ");
                    System.out.println("   |   |   ");
                    System.out.println("O moves on the bottom space.");

                    System.out.println("   |   |   ");
                    System.out.println(" O | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" O | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" O | O |   ");
                    System.out.println("   |   |   ");
                    System.out.println("The computer wins!");
                    System.exit(0);
                }
                if (move == 8) {

                    System.out.println("   |   |   ");
                    System.out.println(" O | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" O | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" O | O | X ");
                    System.out.println("   |   |   ");
                    System.out.println("You win!");
                    System.exit(0);
                }
            }
            if (move == 5) {

                System.out.println("   |   |   ");
                System.out.println(" O |   | X ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println("   |   | X ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println("   |   |   ");
                System.out.println("   |   |   ");
                System.out.println("O moves on the left space.");

                System.out.println("   |   |   ");
                System.out.println(" O |   | X ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println(" O |   | X ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println("   |   |   ");
                System.out.println("   |   |   ");

                System.out.println("Enter the number of your move");
                System.out.println("0|1|2");
                System.out.println("-+-+-");
                System.out.println("3|4|5");
                System.out.println("-+-+-");
                System.out.println("6|7|8");
                move = Integer.parseInt(in.nextLine());
                
                if (move == 1) {

                    System.out.println("   |   |   ");
                    System.out.println(" O | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" O |   | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println("   |   |   ");
                    System.out.println("   |   |   ");
                    System.out.println("O moves on the bottom-left space.");

                    System.out.println("   |   |   ");
                    System.out.println(" O | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" O |   | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" O |   |   ");
                    System.out.println("   |   |   ");
                    System.out.println("The computer wins!");
                    System.exit(0);
                }
                if (move == 4) {

                    System.out.println("   |   |   ");
                    System.out.println(" O | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" O | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" O |   |   ");
                    System.out.println("   |   |   ");
                    System.out.println("O moves on the bottom space.");

                    System.out.println("   |   |   ");
                    System.out.println(" O | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" O | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" O | O |   ");
                    System.out.println("   |   |   ");
                    System.out.println("The computer wins!");
                    System.exit(0);
                }
                if (move == 8) {

                    System.out.println("   |   |   ");
                    System.out.println(" O | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" O | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" O | O | X ");
                    System.out.println("   |   |   ");
                    System.out.println("You win!");
                    System.exit(0);
                }
            }
            if (move == 6) {

                System.out.println("   |   |   ");
                System.out.println(" O |   | X ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println("   |   |   ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println(" X |   |   ");
                System.out.println("   |   |   ");
                System.out.println("O moves on the center space.");

                System.out.println("   |   |   ");
                System.out.println(" O |   | X ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println("   | O |   ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println(" X |   |   ");
                System.out.println("   |   |   ");

                System.out.println("Enter the number of your move");
                System.out.println("0|1|2");
                System.out.println("-+-+-");
                System.out.println("3|4|5");
                System.out.println("-+-+-");
                System.out.println("6|7|8");
                move = Integer.parseInt(in.nextLine());
                
                if (move == 1) {

                    System.out.println("   |   |   ");
                    System.out.println(" O | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println("   | O |   ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X |   |   ");
                    System.out.println("   |   |   ");
                    System.out.println("O moves on the bottom-right space.");

                    System.out.println("   |   |   ");
                    System.out.println(" O | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println("   | O |   ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X |   | O ");
                    System.out.println("   |   |   ");
                    System.out.println("The computer wins!");
                    System.exit(0);
                }
                if (move == 3) {

                    System.out.println("   |   |   ");
                    System.out.println(" O | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | O |   ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X |   | O ");
                    System.out.println("   |   |   ");
                    System.out.println("O moves on the right space.");

                    System.out.println("   |   |   ");
                    System.out.println(" O | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | O | O ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X |   | O ");
                    System.out.println("   |   |   ");
                    System.out.println("The computer wins!");
                    System.exit(0);
                }
                if (move == 7) {

                    System.out.println("   |   |   ");
                    System.out.println(" O | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | O | O ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | X | O ");
                    System.out.println("   |   |   ");
                    System.out.println("It's a tie!");
                    System.exit(0);
                }
            }
            if (move == 7) {

                System.out.println("   |   |   ");
                System.out.println(" O |   | X ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println("   |   |   ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println("   | X |   ");
                System.out.println("   |   |   ");
                System.out.println("O moves on the left space.");

                System.out.println("   |   |   ");
                System.out.println(" O |   | X ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println(" O |   |   ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println("   | X |   ");
                System.out.println("   |   |   ");

                System.out.println("Enter the number of your move");
                System.out.println("0|1|2");
                System.out.println("-+-+-");
                System.out.println("3|4|5");
                System.out.println("-+-+-");
                System.out.println("6|7|8");
                move = Integer.parseInt(in.nextLine());
                
                if (move == 1) {

                    System.out.println("   |   |   ");
                    System.out.println(" O | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" O |   |   ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println("   | X |   ");
                    System.out.println("   |   |   ");
                    System.out.println("O moves on the bottom-left space.");

                    System.out.println("   |   |   ");
                    System.out.println(" O | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" O |   |   ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" O | X |   ");
                    System.out.println("   |   |   ");
                    System.out.println("The computer wins!");
                    System.exit(0);
                }
                if (move == 4) {

                    System.out.println("   |   |   ");
                    System.out.println(" O | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" O | X |   ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" O | X |   ");
                    System.out.println("   |   |   ");
                    System.out.println("You win!");
                    System.exit(0);
                }
                if (move == 5) {

                    System.out.println("   |   |   ");
                    System.out.println(" O | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" O | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" O | X |   ");
                    System.out.println("   |   |   ");
                    System.out.println("You win!");
                    System.exit(0);
                }
                if (move == 8) {

                    System.out.println("   |   |   ");
                    System.out.println(" O | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" O | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" O | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("You win!");
                    System.exit(0);
                }
            }
            if (move == 8) {

                System.out.println("   |   |   ");
                System.out.println(" O |   | X ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println("   |   |   ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println("   |   | X ");
                System.out.println("   |   |   ");
                System.out.println("O moves on the left space.");

                System.out.println("   |   |   ");
                System.out.println(" O |   | X ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println(" O |   |   ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println("   |   | X ");
                System.out.println("   |   |   ");

                System.out.println("Enter the number of your move");
                System.out.println("0|1|2");
                System.out.println("-+-+-");
                System.out.println("3|4|5");
                System.out.println("-+-+-");
                System.out.println("6|7|8");
                move = Integer.parseInt(in.nextLine());
                
                if (move == 1) {

                    System.out.println("   |   |   ");
                    System.out.println(" O | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" O |   |   ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println("   |   | X ");
                    System.out.println("   |   |   ");
                    System.out.println("O moves on the bottom-left space.");

                    System.out.println("   |   |   ");
                    System.out.println(" O | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" O |   |   ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" O |   | X ");
                    System.out.println("   |   |   ");
                    System.out.println("The computer wins!");
                    System.exit(0);
                }
                if (move == 4) {

                    System.out.println("   |   |   ");
                    System.out.println(" O | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" O | X |   ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" O |   | X ");
                    System.out.println("   |   |   ");
                    System.out.println("O moves on the right space.");

                    System.out.println("   |   |   ");
                    System.out.println(" O | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" O | X | O ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" O |   | X ");
                    System.out.println("   |   |   ");
                    System.out.println("The computer wins!");
                    System.exit(0);
                }
                if (move == 7) {

                    System.out.println("   |   |   ");
                    System.out.println(" O | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" O | X | O ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" O | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("You win!");
                    System.exit(0);
                }
            }
        }
        if (move == 3) {

            System.out.println("   |   |   ");
            System.out.println("   |   |   ");
            System.out.println("   |   |   ");
            System.out.println("---+---+---");
            System.out.println("   |   |   ");
            System.out.println(" X |   |   ");
            System.out.println("   |   |   ");
            System.out.println("---+---+---");
            System.out.println("   |   |   ");
            System.out.println("   |   |   ");
            System.out.println("   |   |   ");
            System.out.println("O moves on the top-left space.");

            System.out.println("   |   |   ");
            System.out.println(" O |   |   ");
            System.out.println("   |   |   ");
            System.out.println("---+---+---");
            System.out.println("   |   |   ");
            System.out.println(" X |   |   ");
            System.out.println("   |   |   ");
            System.out.println("---+---+---");
            System.out.println("   |   |   ");
            System.out.println("   |   |   ");
            System.out.println("   |   |   ");

            System.out.println("Enter the number of your move");
            System.out.println("0|1|2");
            System.out.println("-+-+-");
            System.out.println("3|4|5");
            System.out.println("-+-+-");
            System.out.println("6|7|8");
            move = Integer.parseInt(in.nextLine());
            
            if (move == 1) {

                System.out.println("   |   |   ");
                System.out.println(" O | X |   ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println(" X |   |   ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println("   |   |   ");
                System.out.println("   |   |   ");
                System.out.println("O moves on the center space.");

                System.out.println("   |   |   ");
                System.out.println(" O | X |   ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println(" X | O |   ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println("   |   |   ");
                System.out.println("   |   |   ");

                System.out.println("Enter the number of your move");
                System.out.println("0|1|2");
                System.out.println("-+-+-");
                System.out.println("3|4|5");
                System.out.println("-+-+-");
                System.out.println("6|7|8");
                move = Integer.parseInt(in.nextLine());
                
                if (move == 2) {

                    System.out.println("   |   |   ");
                    System.out.println(" O | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | O |   ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println("   |   |   ");
                    System.out.println("   |   |   ");
                    System.out.println("O moves on the bottom-right space.");

                    System.out.println("   |   |   ");
                    System.out.println(" O | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | O |   ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println("   |   | O ");
                    System.out.println("   |   |   ");
                    System.out.println("The computer wins!");
                    System.exit(0);
                }
                if (move == 5) {

                    System.out.println("   |   |   ");
                    System.out.println(" O | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | O | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println("   |   | O ");
                    System.out.println("   |   |   ");
                    System.out.println("O moves on the bottom-left space.");

                    System.out.println("   |   |   ");
                    System.out.println(" O | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | O | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" O |   | O ");
                    System.out.println("   |   |   ");
                    System.out.println("The computer wins!");
                    System.exit(0);
                }
                if (move == 7) {

                    System.out.println("   |   |   ");
                    System.out.println(" O | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | O | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" O | X | O ");
                    System.out.println("   |   |   ");
                    System.out.println("It's a tie!");
                    System.exit(0);
                }
            }
            if (move == 2) {

                System.out.println("   |   |   ");
                System.out.println(" O |   | X ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println(" X |   |   ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println("   |   |   ");
                System.out.println("   |   |   ");
                System.out.println("O moves on the center space.");

                System.out.println("   |   |   ");
                System.out.println(" O |   | X ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println(" X | O |   ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println("   |   |   ");
                System.out.println("   |   |   ");

                System.out.println("Enter the number of your move");
                System.out.println("0|1|2");
                System.out.println("-+-+-");
                System.out.println("3|4|5");
                System.out.println("-+-+-");
                System.out.println("6|7|8");
                move = Integer.parseInt(in.nextLine());
                
                if (move == 1) {

                    System.out.println("   |   |   ");
                    System.out.println(" O | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | O |   ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println("   |   |   ");
                    System.out.println("   |   |   ");
                    System.out.println("O moves on the bottom-right space.");

                    System.out.println("   |   |   ");
                    System.out.println(" O | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | O |   ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println("   |   | O ");
                    System.out.println("   |   |   ");
                    System.out.println("The computer wins!");
                    System.exit(0);
                }
                if (move == 5) {

                    System.out.println("   |   |   ");
                    System.out.println(" O | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | O | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println("   |   | O ");
                    System.out.println("   |   |   ");
                    System.out.println("O moves on the bottom-left space.");

                    System.out.println("   |   |   ");
                    System.out.println(" O | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | O | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" O |   | O ");
                    System.out.println("   |   |   ");
                    System.out.println("The computer wins!");
                    System.exit(0);
                }
                if (move == 7) {

                    System.out.println("   |   |   ");
                    System.out.println(" O | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | O | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" O | X | O ");
                    System.out.println("   |   |   ");
                    System.out.println("It's a tie!");
                    System.exit(0);
                }
            }
            if (move == 4) {

                System.out.println("   |   |   ");
                System.out.println(" O |   |   ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println(" X | X |   ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println("   |   |   ");
                System.out.println("   |   |   ");
                System.out.println("O moves on the top space.");

                System.out.println("   |   |   ");
                System.out.println(" O | O |   ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println(" X | X |   ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println("   |   |   ");
                System.out.println("   |   |   ");

                System.out.println("Enter the number of your move");
                System.out.println("0|1|2");
                System.out.println("-+-+-");
                System.out.println("3|4|5");
                System.out.println("-+-+-");
                System.out.println("6|7|8");
                move = Integer.parseInt(in.nextLine());
                
                if (move == 2) {

                    System.out.println("   |   |   ");
                    System.out.println(" O | O | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | X |   ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println("   |   |   ");
                    System.out.println("   |   |   ");
                    System.out.println("O moves on the right space.");

                    System.out.println("   |   |   ");
                    System.out.println(" O | O | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | X | O ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println("   |   |   ");
                    System.out.println("   |   |   ");

                    System.out.println("Enter the number of your move");
                    System.out.println("0|1|2");
                    System.out.println("-+-+-");
                    System.out.println("3|4|5");
                    System.out.println("-+-+-");
                    System.out.println("6|7|8");
                    move = Integer.parseInt(in.nextLine());
                    
                    if (move == 6) {

                        System.out.println("   |   |   ");
                        System.out.println(" O | O | X ");
                        System.out.println("   |   |   ");
                        System.out.println("---+---+---");
                        System.out.println("   |   |   ");
                        System.out.println(" X | X | O ");
                        System.out.println("   |   |   ");
                        System.out.println("---+---+---");
                        System.out.println("   |   |   ");
                        System.out.println(" X |   |   ");
                        System.out.println("   |   |   ");
                        System.out.println("You win!");
                        System.exit(0);
                    }
                    if (move == 7) {

                        System.out.println("   |   |   ");
                        System.out.println(" O | O | X ");
                        System.out.println("   |   |   ");
                        System.out.println("---+---+---");
                        System.out.println("   |   |   ");
                        System.out.println(" X | X | O ");
                        System.out.println("   |   |   ");
                        System.out.println("---+---+---");
                        System.out.println("   |   |   ");
                        System.out.println(" X | X |   ");
                        System.out.println("   |   |   ");
                        System.out.println("You win!");
                        System.exit(0);
                    }
                    if (move == 8) {

                        System.out.println("   |   |   ");
                        System.out.println(" O | O | X ");
                        System.out.println("   |   |   ");
                        System.out.println("---+---+---");
                        System.out.println("   |   |   ");
                        System.out.println(" X | X | O ");
                        System.out.println("   |   |   ");
                        System.out.println("---+---+---");
                        System.out.println("   |   |   ");
                        System.out.println(" X | X | X ");
                        System.out.println("   |   |   ");
                        System.out.println("You win!");
                        System.exit(0);
                    }
                }
                if (move == 5) {

                    System.out.println("   |   |   ");
                    System.out.println(" O | O |   ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println("   |   |   ");
                    System.out.println("   |   |   ");
                    System.out.println("You win!");
                    System.exit(0);
                }
                if (move == 6) {

                    System.out.println("   |   |   ");
                    System.out.println(" O | O |   ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X |   |   ");
                    System.out.println("   |   |   ");
                    System.out.println("You win!");
                    System.exit(0);
                }
                if (move == 7) {

                    System.out.println("   |   |   ");
                    System.out.println(" O | O |   ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | X |   ");
                    System.out.println("   |   |   ");
                    System.out.println("You win!");
                    System.exit(0);
                }
                if (move == 8) {

                    System.out.println("   |   |   ");
                    System.out.println(" O | O |   ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("You win!");
                    System.exit(0);
                }
            }
            if (move == 5) {

                System.out.println("   |   |   ");
                System.out.println(" O |   |   ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println(" X |   | X ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println("   |   |   ");
                System.out.println("   |   |   ");
                System.out.println("O moves on the top space.");

                System.out.println("   |   |   ");
                System.out.println(" O | O |   ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println(" X |   | X ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println("   |   |   ");
                System.out.println("   |   |   ");

                System.out.println("Enter the number of your move");
                System.out.println("0|1|2");
                System.out.println("-+-+-");
                System.out.println("3|4|5");
                System.out.println("-+-+-");
                System.out.println("6|7|8");
                move = Integer.parseInt(in.nextLine());
                
                if (move == 2) {

                    System.out.println("   |   |   ");
                    System.out.println(" O | O | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X |   | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println("   |   |   ");
                    System.out.println("   |   |   ");
                    System.out.println("O moves on the center space.");

                    System.out.println("   |   |   ");
                    System.out.println(" O | O | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | O | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println("   |   |   ");
                    System.out.println("   |   |   ");

                    System.out.println("Enter the number of your move");
                    System.out.println("0|1|2");
                    System.out.println("-+-+-");
                    System.out.println("3|4|5");
                    System.out.println("-+-+-");
                    System.out.println("6|7|8");
                    move = Integer.parseInt(in.nextLine());
                    
                    if (move == 6) {

                        System.out.println("   |   |   ");
                        System.out.println(" O | O | X ");
                        System.out.println("   |   |   ");
                        System.out.println("---+---+---");
                        System.out.println("   |   |   ");
                        System.out.println(" X | O | X ");
                        System.out.println("   |   |   ");
                        System.out.println("---+---+---");
                        System.out.println("   |   |   ");
                        System.out.println(" X |   |   ");
                        System.out.println("   |   |   ");
                        System.out.println("O moves on the bottom space.");

                        System.out.println("   |   |   ");
                        System.out.println(" O | O | X ");
                        System.out.println("   |   |   ");
                        System.out.println("---+---+---");
                        System.out.println("   |   |   ");
                        System.out.println(" X | O | X ");
                        System.out.println("   |   |   ");
                        System.out.println("---+---+---");
                        System.out.println("   |   |   ");
                        System.out.println(" X | O |   ");
                        System.out.println("   |   |   ");
                        System.out.println("The computer wins!");
                        System.exit(0);
                    }
                    if (move == 8) {

                        System.out.println("   |   |   ");
                        System.out.println(" O | O | X ");
                        System.out.println("   |   |   ");
                        System.out.println("---+---+---");
                        System.out.println("   |   |   ");
                        System.out.println(" X | O | X ");
                        System.out.println("   |   |   ");
                        System.out.println("---+---+---");
                        System.out.println("   |   |   ");
                        System.out.println(" X | O | X ");
                        System.out.println("   |   |   ");
                        System.out.println("You win!");
                        System.exit(0);
                    }
                }
                if (move == 4) {

                    System.out.println("   |   |   ");
                    System.out.println(" O | O |   ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println("   |   |   ");
                    System.out.println("   |   |   ");
                    System.out.println("You win!");
                    System.exit(0);
                }
                if (move == 6) {

                    System.out.println("   |   |   ");
                    System.out.println(" O | O |   ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X |   |   ");
                    System.out.println("   |   |   ");
                    System.out.println("You win!");
                    System.exit(0);
                }
                if (move == 7) {

                    System.out.println("   |   |   ");
                    System.out.println(" O | O |   ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | X |   ");
                    System.out.println("   |   |   ");
                    System.out.println("You win!");
                    System.exit(0);
                }
                if (move == 8) {

                    System.out.println("   |   |   ");
                    System.out.println(" O | O |   ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("You win!");
                    System.exit(0);
                }
            }
            if (move == 6) {

                System.out.println("   |   |   ");
                System.out.println(" O |   |   ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println(" X |   |   ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println(" X |   |   ");
                System.out.println("   |   |   ");
                System.out.println("O moves on the top space.");

                System.out.println("   |   |   ");
                System.out.println(" O | O |   ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println(" X |   |   ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println(" X |   |   ");
                System.out.println("   |   |   ");

                System.out.println("Enter the number of your move");
                System.out.println("0|1|2");
                System.out.println("-+-+-");
                System.out.println("3|4|5");
                System.out.println("-+-+-");
                System.out.println("6|7|8");
                move = Integer.parseInt(in.nextLine());
                
                if (move == 2) {

                    System.out.println("   |   |   ");
                    System.out.println(" O | O | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X |   |   ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X |   |   ");
                    System.out.println("   |   |   ");
                    System.out.println("O moves on the center space.");

                    System.out.println("   |   |   ");
                    System.out.println(" O | O | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | O |   ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X |   |   ");
                    System.out.println("   |   |   ");

                    System.out.println("Enter the number of your move");
                    System.out.println("0|1|2");
                    System.out.println("-+-+-");
                    System.out.println("3|4|5");
                    System.out.println("-+-+-");
                    System.out.println("6|7|8");
                    move = Integer.parseInt(in.nextLine());
                    
                    if (move == 5) {

                        System.out.println("   |   |   ");
                        System.out.println(" O | O | X ");
                        System.out.println("   |   |   ");
                        System.out.println("---+---+---");
                        System.out.println("   |   |   ");
                        System.out.println(" X | O | X ");
                        System.out.println("   |   |   ");
                        System.out.println("---+---+---");
                        System.out.println("   |   |   ");
                        System.out.println(" X |   |   ");
                        System.out.println("   |   |   ");
                        System.out.println("O moves on the bottom space.");

                        System.out.println("   |   |   ");
                        System.out.println(" O | O | X ");
                        System.out.println("   |   |   ");
                        System.out.println("---+---+---");
                        System.out.println("   |   |   ");
                        System.out.println(" X | O | X ");
                        System.out.println("   |   |   ");
                        System.out.println("---+---+---");
                        System.out.println("   |   |   ");
                        System.out.println(" X | O |   ");
                        System.out.println("   |   |   ");
                        System.out.println("The computer wins!");
                        System.exit(0);
                    }
                    if (move == 8) {

                        System.out.println("   |   |   ");
                        System.out.println(" O | O | X ");
                        System.out.println("   |   |   ");
                        System.out.println("---+---+---");
                        System.out.println("   |   |   ");
                        System.out.println(" X | O | X ");
                        System.out.println("   |   |   ");
                        System.out.println("---+---+---");
                        System.out.println("   |   |   ");
                        System.out.println(" X | O | X ");
                        System.out.println("   |   |   ");
                        System.out.println("You win!");
                        System.exit(0);
                    }
                }
                if (move == 4) {

                    System.out.println("   |   |   ");
                    System.out.println(" O | O |   ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | X |   ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X |   |   ");
                    System.out.println("   |   |   ");
                    System.out.println("O moves on the top-right space.");

                    System.out.println("   |   |   ");
                    System.out.println(" O | O | O ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | X |   ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X |   |   ");
                    System.out.println("   |   |   ");
                    System.out.println("The computer wins!");
                    System.exit(0);
                }
                if (move == 5) {

                    System.out.println("   |   |   ");
                    System.out.println(" O | O | O ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X |   |   ");
                    System.out.println("   |   |   ");
                    System.out.println("You win!");
                    System.exit(0);
                }
                if (move == 7) {

                    System.out.println("   |   |   ");
                    System.out.println(" O | O | O ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | X |   ");
                    System.out.println("   |   |   ");
                    System.out.println("You win!");
                    System.exit(0);
                }
                if (move == 8) {

                    System.out.println("   |   |   ");
                    System.out.println(" O | O | O ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("You win!");
                    System.exit(0);
                }
            }
            if (move == 7) {

                System.out.println("   |   |   ");
                System.out.println(" O |   |   ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println(" X |   |   ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println("   | X |   ");
                System.out.println("   |   |   ");
                System.out.println("O moves on the top space.");

                System.out.println("   |   |   ");
                System.out.println(" O | O |   ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println(" X |   |   ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println("   | X |   ");
                System.out.println("   |   |   ");

                System.out.println("Enter the number of your move");
                System.out.println("0|1|2");
                System.out.println("-+-+-");
                System.out.println("3|4|5");
                System.out.println("-+-+-");
                System.out.println("6|7|8");
                move = Integer.parseInt(in.nextLine());
                
                if (move == 2) {

                    System.out.println("   |   |   ");
                    System.out.println(" O | O | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X |   |   ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println("   | X |   ");
                    System.out.println("   |   |   ");
                    System.out.println("O moves on the center space.");

                    System.out.println("   |   |   ");
                    System.out.println(" O | O | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | O |   ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println("   | X |   ");
                    System.out.println("   |   |   ");

                    System.out.println("Enter the number of your move");
                    System.out.println("0|1|2");
                    System.out.println("-+-+-");
                    System.out.println("3|4|5");
                    System.out.println("-+-+-");
                    System.out.println("6|7|8");
                    move = Integer.parseInt(in.nextLine());
                    
                    if (move == 5) {

                        System.out.println("   |   |   ");
                        System.out.println(" O | O | X ");
                        System.out.println("   |   |   ");
                        System.out.println("---+---+---");
                        System.out.println("   |   |   ");
                        System.out.println(" X | O | X ");
                        System.out.println("   |   |   ");
                        System.out.println("---+---+---");
                        System.out.println("   |   |   ");
                        System.out.println("   | X |   ");
                        System.out.println("   |   |   ");
                        System.out.println("O moves on the bottom-right space.");

                        System.out.println("   |   |   ");
                        System.out.println(" O | O | X ");
                        System.out.println("   |   |   ");
                        System.out.println("---+---+---");
                        System.out.println("   |   |   ");
                        System.out.println(" X | O | X ");
                        System.out.println("   |   |   ");
                        System.out.println("---+---+---");
                        System.out.println("   |   |   ");
                        System.out.println("   | X | O ");
                        System.out.println("   |   |   ");
                        System.out.println("The computer wins!");
                        System.exit(0);
                    }
                    if (move == 6) {

                        System.out.println("   |   |   ");
                        System.out.println(" O | O | X ");
                        System.out.println("   |   |   ");
                        System.out.println("---+---+---");
                        System.out.println("   |   |   ");
                        System.out.println(" X | O | X ");
                        System.out.println("   |   |   ");
                        System.out.println("---+---+---");
                        System.out.println("   |   |   ");
                        System.out.println(" X | X | O ");
                        System.out.println("   |   |   ");
                        System.out.println("It's a tie!");
                        System.exit(0);
                    }
                }
                if (move == 4) {

                    System.out.println("   |   |   ");
                    System.out.println(" O | O |   ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | X |   ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println("   | X |   ");
                    System.out.println("   |   |   ");
                    System.out.println("O moves on the top-right space.");

                    System.out.println("   |   |   ");
                    System.out.println(" O | O | O ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | X |   ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println("   | X |   ");
                    System.out.println("   |   |   ");
                    System.out.println("The computer wins!");
                    System.exit(0);
                }
                if (move == 5) {

                    System.out.println("   |   |   ");
                    System.out.println(" O | O | O ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println("   | X |   ");
                    System.out.println("   |   |   ");
                    System.out.println("You win!");
                    System.exit(0);
                }
                if (move == 6) {

                    System.out.println("   |   |   ");
                    System.out.println(" O | O | O ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | X |   ");
                    System.out.println("   |   |   ");
                    System.out.println("You win!");
                    System.exit(0);
                }
                if (move == 8) {

                    System.out.println("   |   |   ");
                    System.out.println(" O | O | O ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("You win!");
                    System.exit(0);
                }
            }
            if (move == 8) {

                System.out.println("   |   |   ");
                System.out.println(" O |   |   ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println(" X |   |   ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println("   |   | X ");
                System.out.println("   |   |   ");
                System.out.println("O moves on the top space.");

                System.out.println("   |   |   ");
                System.out.println(" O | O |   ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println(" X |   |   ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println("   |   | X ");
                System.out.println("   |   |   ");

                System.out.println("Enter the number of your move");
                System.out.println("0|1|2");
                System.out.println("-+-+-");
                System.out.println("3|4|5");
                System.out.println("-+-+-");
                System.out.println("6|7|8");
                move = Integer.parseInt(in.nextLine());
                
                if (move == 2) {

                    System.out.println("   |   |   ");
                    System.out.println(" O | O | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X |   |   ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println("   |   | X ");
                    System.out.println("   |   |   ");
                    System.out.println("O moves on the center space.");

                    System.out.println("   |   |   ");
                    System.out.println(" O | O | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | O |   ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println("   |   | X ");
                    System.out.println("   |   |   ");

                    System.out.println("Enter the number of your move");
                    System.out.println("0|1|2");
                    System.out.println("-+-+-");
                    System.out.println("3|4|5");
                    System.out.println("-+-+-");
                    System.out.println("6|7|8");
                    move = Integer.parseInt(in.nextLine());
                    
                    if (move == 5) {

                        System.out.println("   |   |   ");
                        System.out.println(" O | O | X ");
                        System.out.println("   |   |   ");
                        System.out.println("---+---+---");
                        System.out.println("   |   |   ");
                        System.out.println(" X | O | X ");
                        System.out.println("   |   |   ");
                        System.out.println("---+---+---");
                        System.out.println("   |   |   ");
                        System.out.println("   |   | X ");
                        System.out.println("   |   |   ");
                        System.out.println("You win!");
                        System.exit(0);
                    }
                    if (move == 6) {

                        System.out.println("   |   |   ");
                        System.out.println(" O | O | X ");
                        System.out.println("   |   |   ");
                        System.out.println("---+---+---");
                        System.out.println("   |   |   ");
                        System.out.println(" X | O | X ");
                        System.out.println("   |   |   ");
                        System.out.println("---+---+---");
                        System.out.println("   |   |   ");
                        System.out.println(" X |   | X ");
                        System.out.println("   |   |   ");
                        System.out.println("You win!");
                        System.exit(0);
                    }
                    if (move == 7) {

                        System.out.println("   |   |   ");
                        System.out.println(" O | O | X ");
                        System.out.println("   |   |   ");
                        System.out.println("---+---+---");
                        System.out.println("   |   |   ");
                        System.out.println(" X | O | X ");
                        System.out.println("   |   |   ");
                        System.out.println("---+---+---");
                        System.out.println("   |   |   ");
                        System.out.println(" X | X | X ");
                        System.out.println("   |   |   ");
                        System.out.println("You win!");
                        System.exit(0);
                    }
                }
                if (move == 4) {

                    System.out.println("   |   |   ");
                    System.out.println(" O | O |   ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | X |   ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println("   |   | X ");
                    System.out.println("   |   |   ");
                    System.out.println("O moves on the top-right space.");

                    System.out.println("   |   |   ");
                    System.out.println(" O | O | O ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | X |   ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println("   |   | X ");
                    System.out.println("   |   |   ");
                    System.out.println("The computer wins!");
                    System.exit(0);
                }
                if (move == 5) {

                    System.out.println("   |   |   ");
                    System.out.println(" O | O | O ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println("   |   | X ");
                    System.out.println("   |   |   ");
                    System.out.println("You win!");
                    System.exit(0);
                }
                if (move == 6) {

                    System.out.println("   |   |   ");
                    System.out.println(" O | O | O ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X |   | X ");
                    System.out.println("   |   |   ");
                    System.out.println("You win!");
                    System.exit(0);
                }
                if (move == 7) {

                    System.out.println("   |   |   ");
                    System.out.println(" O | O | O ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("You win!");
                    System.exit(0);
                }
            }
        }
        if (move == 4) {

            System.out.println("   |   |   ");
            System.out.println("   |   |   ");
            System.out.println("   |   |   ");
            System.out.println("---+---+---");
            System.out.println("   |   |   ");
            System.out.println("   | X |   ");
            System.out.println("   |   |   ");
            System.out.println("---+---+---");
            System.out.println("   |   |   ");
            System.out.println("   |   |   ");
            System.out.println("   |   |   ");
            System.out.println("O moves on the top-left space.");

            System.out.println("   |   |   ");
            System.out.println(" O |   |   ");
            System.out.println("   |   |   ");
            System.out.println("---+---+---");
            System.out.println("   |   |   ");
            System.out.println("   | X |   ");
            System.out.println("   |   |   ");
            System.out.println("---+---+---");
            System.out.println("   |   |   ");
            System.out.println("   |   |   ");
            System.out.println("   |   |   ");

            System.out.println("Enter the number of your move");
            System.out.println("0|1|2");
            System.out.println("-+-+-");
            System.out.println("3|4|5");
            System.out.println("-+-+-");
            System.out.println("6|7|8");
            move = Integer.parseInt(in.nextLine());
            
            if (move == 1) {

                System.out.println("   |   |   ");
                System.out.println(" O | X |   ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println("   | X |   ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println("   |   |   ");
                System.out.println("   |   |   ");
                System.out.println("O moves on the left space.");

                System.out.println("   |   |   ");
                System.out.println(" O | X |   ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println(" O | X |   ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println("   |   |   ");
                System.out.println("   |   |   ");

                System.out.println("Enter the number of your move");
                System.out.println("0|1|2");
                System.out.println("-+-+-");
                System.out.println("3|4|5");
                System.out.println("-+-+-");
                System.out.println("6|7|8");
                move = Integer.parseInt(in.nextLine());
                
                if (move == 2) {

                    System.out.println("   |   |   ");
                    System.out.println(" O | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" O | X |   ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println("   |   |   ");
                    System.out.println("   |   |   ");
                    System.out.println("O moves on the bottom-left space.");

                    System.out.println("   |   |   ");
                    System.out.println(" O | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" O | X |   ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" O |   |   ");
                    System.out.println("   |   |   ");
                    System.out.println("The computer wins!");
                    System.exit(0);
                }
                if (move == 5) {

                    System.out.println("   |   |   ");
                    System.out.println(" O | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" O | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" O |   |   ");
                    System.out.println("   |   |   ");
                    System.out.println("O moves on the bottom space.");

                    System.out.println("   |   |   ");
                    System.out.println(" O | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" O | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" O | O |   ");
                    System.out.println("   |   |   ");
                    System.out.println("The computer wins!");
                    System.exit(0);
                }
                if (move == 8) {

                    System.out.println("   |   |   ");
                    System.out.println(" O | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" O | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" O | O | X ");
                    System.out.println("   |   |   ");
                    System.out.println("You win!");
                    System.exit(0);
                }
            }
            if (move == 2) {

                System.out.println("   |   |   ");
                System.out.println(" O |   | X ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println("   | X |   ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println("   |   |   ");
                System.out.println("   |   |   ");
                System.out.println("O moves on the left space.");

                System.out.println("   |   |   ");
                System.out.println(" O |   | X ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println(" O | X |   ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println("   |   |   ");
                System.out.println("   |   |   ");

                System.out.println("Enter the number of your move");
                System.out.println("0|1|2");
                System.out.println("-+-+-");
                System.out.println("3|4|5");
                System.out.println("-+-+-");
                System.out.println("6|7|8");
                move = Integer.parseInt(in.nextLine());
                
                if (move == 1) {

                    System.out.println("   |   |   ");
                    System.out.println(" O | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" O | X |   ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println("   |   |   ");
                    System.out.println("   |   |   ");
                    System.out.println("O moves on the bottom-left space.");

                    System.out.println("   |   |   ");
                    System.out.println(" O | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" O | X |   ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" O |   |   ");
                    System.out.println("   |   |   ");
                    System.out.println("The computer wins!");
                    System.exit(0);
                }
                if (move == 5) {

                    System.out.println("   |   |   ");
                    System.out.println(" O | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" O | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" O |   |   ");
                    System.out.println("   |   |   ");
                    System.out.println("O moves on the bottom space.");

                    System.out.println("   |   |   ");
                    System.out.println(" O | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" O | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" O | O |   ");
                    System.out.println("   |   |   ");
                    System.out.println("The computer wins!");
                    System.exit(0);
                }
                if (move == 8) {

                    System.out.println("   |   |   ");
                    System.out.println(" O | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" O | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" O | O | X ");
                    System.out.println("   |   |   ");
                    System.out.println("You win!");
                    System.exit(0);
                }
            }
            if (move == 3) {

                System.out.println("   |   |   ");
                System.out.println(" O |   |   ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println(" X | X |   ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println("   |   |   ");
                System.out.println("   |   |   ");
                System.out.println("O moves on the top space.");

                System.out.println("   |   |   ");
                System.out.println(" O | O |   ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println(" X | X |   ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println("   |   |   ");
                System.out.println("   |   |   ");

                System.out.println("Enter the number of your move");
                System.out.println("0|1|2");
                System.out.println("-+-+-");
                System.out.println("3|4|5");
                System.out.println("-+-+-");
                System.out.println("6|7|8");
                move = Integer.parseInt(in.nextLine());
                
                if (move == 2) {

                    System.out.println("   |   |   ");
                    System.out.println(" O | O | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | X |   ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println("   |   |   ");
                    System.out.println("   |   |   ");
                    System.out.println("O moves on the right space.");

                    System.out.println("   |   |   ");
                    System.out.println(" O | O | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | X | O ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println("   |   |   ");
                    System.out.println("   |   |   ");

                    System.out.println("Enter the number of your move");
                    System.out.println("0|1|2");
                    System.out.println("-+-+-");
                    System.out.println("3|4|5");
                    System.out.println("-+-+-");
                    System.out.println("6|7|8");
                    move = Integer.parseInt(in.nextLine());
                    
                    if (move == 6) {

                        System.out.println("   |   |   ");
                        System.out.println(" O | O | X ");
                        System.out.println("   |   |   ");
                        System.out.println("---+---+---");
                        System.out.println("   |   |   ");
                        System.out.println(" X | X | O ");
                        System.out.println("   |   |   ");
                        System.out.println("---+---+---");
                        System.out.println("   |   |   ");
                        System.out.println(" X |   |   ");
                        System.out.println("   |   |   ");
                        System.out.println("You win!");
                        System.exit(0);
                    }
                    if (move == 7) {

                        System.out.println("   |   |   ");
                        System.out.println(" O | O | X ");
                        System.out.println("   |   |   ");
                        System.out.println("---+---+---");
                        System.out.println("   |   |   ");
                        System.out.println(" X | X | O ");
                        System.out.println("   |   |   ");
                        System.out.println("---+---+---");
                        System.out.println("   |   |   ");
                        System.out.println(" X | X |   ");
                        System.out.println("   |   |   ");
                        System.out.println("You win!");
                        System.exit(0);
                    }
                    if (move == 8) {

                        System.out.println("   |   |   ");
                        System.out.println(" O | O | X ");
                        System.out.println("   |   |   ");
                        System.out.println("---+---+---");
                        System.out.println("   |   |   ");
                        System.out.println(" X | X | O ");
                        System.out.println("   |   |   ");
                        System.out.println("---+---+---");
                        System.out.println("   |   |   ");
                        System.out.println(" X | X | X ");
                        System.out.println("   |   |   ");
                        System.out.println("You win!");
                        System.exit(0);
                    }
                }
                if (move == 5) {

                    System.out.println("   |   |   ");
                    System.out.println(" O | O |   ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println("   |   |   ");
                    System.out.println("   |   |   ");
                    System.out.println("You win!");
                    System.exit(0);
                }
                if (move == 6) {

                    System.out.println("   |   |   ");
                    System.out.println(" O | O |   ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X |   |   ");
                    System.out.println("   |   |   ");
                    System.out.println("You win!");
                    System.exit(0);
                }
                if (move == 7) {

                    System.out.println("   |   |   ");
                    System.out.println(" O | O |   ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | X |   ");
                    System.out.println("   |   |   ");
                    System.out.println("You win!");
                    System.exit(0);
                }
                if (move == 8) {

                    System.out.println("   |   |   ");
                    System.out.println(" O | O |   ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("You win!");
                    System.exit(0);
                }
            }
            if (move == 5) {

                System.out.println("   |   |   ");
                System.out.println(" O |   |   ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println("   | X | X ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println("   |   |   ");
                System.out.println("   |   |   ");
                System.out.println("O moves on the top space.");

                System.out.println("   |   |   ");
                System.out.println(" O | O |   ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println("   | X | X ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println("   |   |   ");
                System.out.println("   |   |   ");

                System.out.println("Enter the number of your move");
                System.out.println("0|1|2");
                System.out.println("-+-+-");
                System.out.println("3|4|5");
                System.out.println("-+-+-");
                System.out.println("6|7|8");
                move = Integer.parseInt(in.nextLine());
                
                if (move == 2) {

                    System.out.println("   |   |   ");
                    System.out.println(" O | O | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println("   | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println("   |   |   ");
                    System.out.println("   |   |   ");
                    System.out.println("O moves on the left space.");

                    System.out.println("   |   |   ");
                    System.out.println(" O | O | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" O | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println("   |   |   ");
                    System.out.println("   |   |   ");

                    System.out.println("Enter the number of your move");
                    System.out.println("0|1|2");
                    System.out.println("-+-+-");
                    System.out.println("3|4|5");
                    System.out.println("-+-+-");
                    System.out.println("6|7|8");
                    move = Integer.parseInt(in.nextLine());
                    
                    if (move == 6) {

                        System.out.println("   |   |   ");
                        System.out.println(" O | O | X ");
                        System.out.println("   |   |   ");
                        System.out.println("---+---+---");
                        System.out.println("   |   |   ");
                        System.out.println(" O | X | X ");
                        System.out.println("   |   |   ");
                        System.out.println("---+---+---");
                        System.out.println("   |   |   ");
                        System.out.println(" X |   |   ");
                        System.out.println("   |   |   ");
                        System.out.println("You win!");
                        System.exit(0);
                    }
                    if (move == 7) {

                        System.out.println("   |   |   ");
                        System.out.println(" O | O | X ");
                        System.out.println("   |   |   ");
                        System.out.println("---+---+---");
                        System.out.println("   |   |   ");
                        System.out.println(" O | X | X ");
                        System.out.println("   |   |   ");
                        System.out.println("---+---+---");
                        System.out.println("   |   |   ");
                        System.out.println(" X | X |   ");
                        System.out.println("   |   |   ");
                        System.out.println("You win!");
                        System.exit(0);
                    }
                    if (move == 8) {

                        System.out.println("   |   |   ");
                        System.out.println(" O | O | X ");
                        System.out.println("   |   |   ");
                        System.out.println("---+---+---");
                        System.out.println("   |   |   ");
                        System.out.println(" O | X | X ");
                        System.out.println("   |   |   ");
                        System.out.println("---+---+---");
                        System.out.println("   |   |   ");
                        System.out.println(" X | X | X ");
                        System.out.println("   |   |   ");
                        System.out.println("You win!");
                        System.exit(0);
                    }
                }
                if (move == 3) {

                    System.out.println("   |   |   ");
                    System.out.println(" O | O |   ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println("   |   |   ");
                    System.out.println("   |   |   ");
                    System.out.println("You win!");
                    System.exit(0);
                }
                if (move == 6) {

                    System.out.println("   |   |   ");
                    System.out.println(" O | O |   ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X |   |   ");
                    System.out.println("   |   |   ");
                    System.out.println("You win!");
                    System.exit(0);
                }
                if (move == 7) {

                    System.out.println("   |   |   ");
                    System.out.println(" O | O |   ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | X |   ");
                    System.out.println("   |   |   ");
                    System.out.println("You win!");
                    System.exit(0);
                }
                if (move == 8) {

                    System.out.println("   |   |   ");
                    System.out.println(" O | O |   ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("You win!");
                    System.exit(0);
                }
            }
            if (move == 6) {

                System.out.println("   |   |   ");
                System.out.println(" O |   |   ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println("   | X |   ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println(" X |   |   ");
                System.out.println("   |   |   ");
                System.out.println("O moves on the top space.");

                System.out.println("   |   |   ");
                System.out.println(" O | O |   ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println("   | X |   ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println(" X |   |   ");
                System.out.println("   |   |   ");

                System.out.println("Enter the number of your move");
                System.out.println("0|1|2");
                System.out.println("-+-+-");
                System.out.println("3|4|5");
                System.out.println("-+-+-");
                System.out.println("6|7|8");
                move = Integer.parseInt(in.nextLine());
                
                if (move == 2) {

                    System.out.println("   |   |   ");
                    System.out.println(" O | O | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println("   | X |   ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X |   |   ");
                    System.out.println("   |   |   ");
                    System.out.println("You win!");
                    System.exit(0);
                }
                if (move == 3) {

                    System.out.println("   |   |   ");
                    System.out.println(" O | O | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | X |   ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X |   |   ");
                    System.out.println("   |   |   ");
                    System.out.println("You win!");
                    System.exit(0);
                }
                if (move == 5) {

                    System.out.println("   |   |   ");
                    System.out.println(" O | O | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X |   |   ");
                    System.out.println("   |   |   ");
                    System.out.println("You win!");
                    System.exit(0);
                }
                if (move == 7) {

                    System.out.println("   |   |   ");
                    System.out.println(" O | O | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | X |   ");
                    System.out.println("   |   |   ");
                    System.out.println("You win!");
                    System.exit(0);
                }
                if (move == 8) {

                    System.out.println("   |   |   ");
                    System.out.println(" O | O | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("You win!");
                    System.exit(0);
                }
            }
            if (move == 7) {

                System.out.println("   |   |   ");
                System.out.println(" O |   |   ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println("   | X |   ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println("   | X |   ");
                System.out.println("   |   |   ");
                System.out.println("O moves on the top space.");

                System.out.println("   |   |   ");
                System.out.println(" O | O |   ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println("   | X |   ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println("   | X |   ");
                System.out.println("   |   |   ");

                System.out.println("Enter the number of your move");
                System.out.println("0|1|2");
                System.out.println("-+-+-");
                System.out.println("3|4|5");
                System.out.println("-+-+-");
                System.out.println("6|7|8");
                move = Integer.parseInt(in.nextLine());
                
                if (move == 2) {

                    System.out.println("   |   |   ");
                    System.out.println(" O | O | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println("   | X |   ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println("   | X |   ");
                    System.out.println("   |   |   ");
                    System.out.println("O moves on the left space.");

                    System.out.println("   |   |   ");
                    System.out.println(" O | O | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" O | X |   ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println("   | X |   ");
                    System.out.println("   |   |   ");

                    System.out.println("Enter the number of your move");
                    System.out.println("0|1|2");
                    System.out.println("-+-+-");
                    System.out.println("3|4|5");
                    System.out.println("-+-+-");
                    System.out.println("6|7|8");
                    move = Integer.parseInt(in.nextLine());
                    
                    if (move == 5) {

                        System.out.println("   |   |   ");
                        System.out.println(" O | O | X ");
                        System.out.println("   |   |   ");
                        System.out.println("---+---+---");
                        System.out.println("   |   |   ");
                        System.out.println(" O | X | X ");
                        System.out.println("   |   |   ");
                        System.out.println("---+---+---");
                        System.out.println("   |   |   ");
                        System.out.println("   | X |   ");
                        System.out.println("   |   |   ");
                        System.out.println("O moves on the bottom-left space.");

                        System.out.println("   |   |   ");
                        System.out.println(" O | O | X ");
                        System.out.println("   |   |   ");
                        System.out.println("---+---+---");
                        System.out.println("   |   |   ");
                        System.out.println(" O | X | X ");
                        System.out.println("   |   |   ");
                        System.out.println("---+---+---");
                        System.out.println("   |   |   ");
                        System.out.println(" O | X |   ");
                        System.out.println("   |   |   ");
                        System.out.println("The computer wins!");
                        System.exit(0);
                    }
                    if (move == 8) {

                        System.out.println("   |   |   ");
                        System.out.println(" O | O | X ");
                        System.out.println("   |   |   ");
                        System.out.println("---+---+---");
                        System.out.println("   |   |   ");
                        System.out.println(" O | X | X ");
                        System.out.println("   |   |   ");
                        System.out.println("---+---+---");
                        System.out.println("   |   |   ");
                        System.out.println(" O | X | X ");
                        System.out.println("   |   |   ");
                        System.out.println("You win!");
                        System.exit(0);
                    }
                }
                if (move == 3) {

                    System.out.println("   |   |   ");
                    System.out.println(" O | O |   ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | X |   ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println("   | X |   ");
                    System.out.println("   |   |   ");
                    System.out.println("O moves on the top-right space.");

                    System.out.println("   |   |   ");
                    System.out.println(" O | O | O ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | X |   ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println("   | X |   ");
                    System.out.println("   |   |   ");
                    System.out.println("The computer wins!");
                    System.exit(0);
                }
                if (move == 5) {

                    System.out.println("   |   |   ");
                    System.out.println(" O | O | O ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println("   | X |   ");
                    System.out.println("   |   |   ");
                    System.out.println("You win!");
                    System.exit(0);
                }
                if (move == 6) {

                    System.out.println("   |   |   ");
                    System.out.println(" O | O | O ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | X |   ");
                    System.out.println("   |   |   ");
                    System.out.println("You win!");
                    System.exit(0);
                }
                if (move == 8) {

                    System.out.println("   |   |   ");
                    System.out.println(" O | O | O ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("You win!");
                    System.exit(0);
                }
            }
            if (move == 8) {

                System.out.println("   |   |   ");
                System.out.println(" O |   |   ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println("   | X |   ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println("   |   | X ");
                System.out.println("   |   |   ");
                System.out.println("O moves on the top space.");

                System.out.println("   |   |   ");
                System.out.println(" O | O |   ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println("   | X |   ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println("   |   | X ");
                System.out.println("   |   |   ");

                System.out.println("Enter the number of your move");
                System.out.println("0|1|2");
                System.out.println("-+-+-");
                System.out.println("3|4|5");
                System.out.println("-+-+-");
                System.out.println("6|7|8");
                move = Integer.parseInt(in.nextLine());
                
                if (move == 2) {

                    System.out.println("   |   |   ");
                    System.out.println(" O | O | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println("   | X |   ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println("   |   | X ");
                    System.out.println("   |   |   ");
                    System.out.println("O moves on the left space.");

                    System.out.println("   |   |   ");
                    System.out.println(" O | O | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" O | X |   ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println("   |   | X ");
                    System.out.println("   |   |   ");

                    System.out.println("Enter the number of your move");
                    System.out.println("0|1|2");
                    System.out.println("-+-+-");
                    System.out.println("3|4|5");
                    System.out.println("-+-+-");
                    System.out.println("6|7|8");
                    move = Integer.parseInt(in.nextLine());
                    
                    if (move == 5) {

                        System.out.println("   |   |   ");
                        System.out.println(" O | O | X ");
                        System.out.println("   |   |   ");
                        System.out.println("---+---+---");
                        System.out.println("   |   |   ");
                        System.out.println(" O | X | X ");
                        System.out.println("   |   |   ");
                        System.out.println("---+---+---");
                        System.out.println("   |   |   ");
                        System.out.println("   |   | X ");
                        System.out.println("   |   |   ");
                        System.out.println("You win!");
                        System.exit(0);
                    }
                    if (move == 6) {

                        System.out.println("   |   |   ");
                        System.out.println(" O | O | X ");
                        System.out.println("   |   |   ");
                        System.out.println("---+---+---");
                        System.out.println("   |   |   ");
                        System.out.println(" O | X | X ");
                        System.out.println("   |   |   ");
                        System.out.println("---+---+---");
                        System.out.println("   |   |   ");
                        System.out.println(" X |   | X ");
                        System.out.println("   |   |   ");
                        System.out.println("You win!");
                        System.exit(0);
                    }
                    if (move == 7) {

                        System.out.println("   |   |   ");
                        System.out.println(" O | O | X ");
                        System.out.println("   |   |   ");
                        System.out.println("---+---+---");
                        System.out.println("   |   |   ");
                        System.out.println(" O | X | X ");
                        System.out.println("   |   |   ");
                        System.out.println("---+---+---");
                        System.out.println("   |   |   ");
                        System.out.println(" X | X | X ");
                        System.out.println("   |   |   ");
                        System.out.println("You win!");
                        System.exit(0);
                    }
                }
                if (move == 3) {

                    System.out.println("   |   |   ");
                    System.out.println(" O | O |   ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | X |   ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println("   |   | X ");
                    System.out.println("   |   |   ");
                    System.out.println("O moves on the top-right space.");

                    System.out.println("   |   |   ");
                    System.out.println(" O | O | O ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | X |   ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println("   |   | X ");
                    System.out.println("   |   |   ");
                    System.out.println("The computer wins!");
                    System.exit(0);
                }
                if (move == 5) {

                    System.out.println("   |   |   ");
                    System.out.println(" O | O | O ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println("   |   | X ");
                    System.out.println("   |   |   ");
                    System.out.println("You win!");
                    System.exit(0);
                }
                if (move == 6) {

                    System.out.println("   |   |   ");
                    System.out.println(" O | O | O ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X |   | X ");
                    System.out.println("   |   |   ");
                    System.out.println("You win!");
                    System.exit(0);
                }
                if (move == 7) {

                    System.out.println("   |   |   ");
                    System.out.println(" O | O | O ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("You win!");
                    System.exit(0);
                }
            }
        }
        if (move == 5) {

            System.out.println("   |   |   ");
            System.out.println("   |   |   ");
            System.out.println("   |   |   ");
            System.out.println("---+---+---");
            System.out.println("   |   |   ");
            System.out.println("   |   | X ");
            System.out.println("   |   |   ");
            System.out.println("---+---+---");
            System.out.println("   |   |   ");
            System.out.println("   |   |   ");
            System.out.println("   |   |   ");
            System.out.println("O moves on the top-left space.");

            System.out.println("   |   |   ");
            System.out.println(" O |   |   ");
            System.out.println("   |   |   ");
            System.out.println("---+---+---");
            System.out.println("   |   |   ");
            System.out.println("   |   | X ");
            System.out.println("   |   |   ");
            System.out.println("---+---+---");
            System.out.println("   |   |   ");
            System.out.println("   |   |   ");
            System.out.println("   |   |   ");

            System.out.println("Enter the number of your move");
            System.out.println("0|1|2");
            System.out.println("-+-+-");
            System.out.println("3|4|5");
            System.out.println("-+-+-");
            System.out.println("6|7|8");
            move = Integer.parseInt(in.nextLine());
            
            if (move == 1) {

                System.out.println("   |   |   ");
                System.out.println(" O | X |   ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println("   |   | X ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println("   |   |   ");
                System.out.println("   |   |   ");
                System.out.println("O moves on the left space.");

                System.out.println("   |   |   ");
                System.out.println(" O | X |   ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println(" O |   | X ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println("   |   |   ");
                System.out.println("   |   |   ");

                System.out.println("Enter the number of your move");
                System.out.println("0|1|2");
                System.out.println("-+-+-");
                System.out.println("3|4|5");
                System.out.println("-+-+-");
                System.out.println("6|7|8");
                move = Integer.parseInt(in.nextLine());
                
                if (move == 2) {

                    System.out.println("   |   |   ");
                    System.out.println(" O | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" O |   | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println("   |   |   ");
                    System.out.println("   |   |   ");
                    System.out.println("O moves on the bottom-left space.");

                    System.out.println("   |   |   ");
                    System.out.println(" O | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" O |   | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" O |   |   ");
                    System.out.println("   |   |   ");
                    System.out.println("The computer wins!");
                    System.exit(0);
                }
                if (move == 4) {

                    System.out.println("   |   |   ");
                    System.out.println(" O | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" O | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" O |   |   ");
                    System.out.println("   |   |   ");
                    System.out.println("O moves on the bottom space.");

                    System.out.println("   |   |   ");
                    System.out.println(" O | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" O | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" O | O |   ");
                    System.out.println("   |   |   ");
                    System.out.println("The computer wins!");
                    System.exit(0);
                }
                if (move == 8) {

                    System.out.println("   |   |   ");
                    System.out.println(" O | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" O | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" O | O | X ");
                    System.out.println("   |   |   ");
                    System.out.println("You win!");
                    System.exit(0);
                }
            }
            if (move == 2) {

                System.out.println("   |   |   ");
                System.out.println(" O |   | X ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println("   |   | X ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println("   |   |   ");
                System.out.println("   |   |   ");
                System.out.println("O moves on the left space.");

                System.out.println("   |   |   ");
                System.out.println(" O |   | X ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println(" O |   | X ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println("   |   |   ");
                System.out.println("   |   |   ");

                System.out.println("Enter the number of your move");
                System.out.println("0|1|2");
                System.out.println("-+-+-");
                System.out.println("3|4|5");
                System.out.println("-+-+-");
                System.out.println("6|7|8");
                move = Integer.parseInt(in.nextLine());
                
                if (move == 1) {

                    System.out.println("   |   |   ");
                    System.out.println(" O | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" O |   | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println("   |   |   ");
                    System.out.println("   |   |   ");
                    System.out.println("O moves on the bottom-left space.");

                    System.out.println("   |   |   ");
                    System.out.println(" O | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" O |   | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" O |   |   ");
                    System.out.println("   |   |   ");
                    System.out.println("The computer wins!");
                    System.exit(0);
                }
                if (move == 4) {

                    System.out.println("   |   |   ");
                    System.out.println(" O | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" O | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" O |   |   ");
                    System.out.println("   |   |   ");
                    System.out.println("O moves on the bottom space.");

                    System.out.println("   |   |   ");
                    System.out.println(" O | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" O | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" O | O |   ");
                    System.out.println("   |   |   ");
                    System.out.println("The computer wins!");
                    System.exit(0);
                }
                if (move == 8) {

                    System.out.println("   |   |   ");
                    System.out.println(" O | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" O | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" O | O | X ");
                    System.out.println("   |   |   ");
                    System.out.println("You win!");
                    System.exit(0);
                }
            }
            if (move == 3) {

                System.out.println("   |   |   ");
                System.out.println(" O |   |   ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println(" X |   | X ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println("   |   |   ");
                System.out.println("   |   |   ");
                System.out.println("O moves on the top space.");

                System.out.println("   |   |   ");
                System.out.println(" O | O |   ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println(" X |   | X ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println("   |   |   ");
                System.out.println("   |   |   ");

                System.out.println("Enter the number of your move");
                System.out.println("0|1|2");
                System.out.println("-+-+-");
                System.out.println("3|4|5");
                System.out.println("-+-+-");
                System.out.println("6|7|8");
                move = Integer.parseInt(in.nextLine());
                
                if (move == 2) {

                    System.out.println("   |   |   ");
                    System.out.println(" O | O | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X |   | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println("   |   |   ");
                    System.out.println("   |   |   ");
                    System.out.println("O moves on the center space.");

                    System.out.println("   |   |   ");
                    System.out.println(" O | O | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | O | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println("   |   |   ");
                    System.out.println("   |   |   ");

                    System.out.println("Enter the number of your move");
                    System.out.println("0|1|2");
                    System.out.println("-+-+-");
                    System.out.println("3|4|5");
                    System.out.println("-+-+-");
                    System.out.println("6|7|8");
                    move = Integer.parseInt(in.nextLine());
                    
                    if (move == 6) {

                        System.out.println("   |   |   ");
                        System.out.println(" O | O | X ");
                        System.out.println("   |   |   ");
                        System.out.println("---+---+---");
                        System.out.println("   |   |   ");
                        System.out.println(" X | O | X ");
                        System.out.println("   |   |   ");
                        System.out.println("---+---+---");
                        System.out.println("   |   |   ");
                        System.out.println(" X |   |   ");
                        System.out.println("   |   |   ");
                        System.out.println("O moves on the bottom space.");

                        System.out.println("   |   |   ");
                        System.out.println(" O | O | X ");
                        System.out.println("   |   |   ");
                        System.out.println("---+---+---");
                        System.out.println("   |   |   ");
                        System.out.println(" X | O | X ");
                        System.out.println("   |   |   ");
                        System.out.println("---+---+---");
                        System.out.println("   |   |   ");
                        System.out.println(" X | O |   ");
                        System.out.println("   |   |   ");
                        System.out.println("The computer wins!");
                        System.exit(0);
                    }
                    if (move == 8) {

                        System.out.println("   |   |   ");
                        System.out.println(" O | O | X ");
                        System.out.println("   |   |   ");
                        System.out.println("---+---+---");
                        System.out.println("   |   |   ");
                        System.out.println(" X | O | X ");
                        System.out.println("   |   |   ");
                        System.out.println("---+---+---");
                        System.out.println("   |   |   ");
                        System.out.println(" X | O | X ");
                        System.out.println("   |   |   ");
                        System.out.println("You win!");
                        System.exit(0);
                    }
                }
                if (move == 4) {

                    System.out.println("   |   |   ");
                    System.out.println(" O | O |   ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println("   |   |   ");
                    System.out.println("   |   |   ");
                    System.out.println("You win!");
                    System.exit(0);
                }
                if (move == 6) {

                    System.out.println("   |   |   ");
                    System.out.println(" O | O |   ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X |   |   ");
                    System.out.println("   |   |   ");
                    System.out.println("You win!");
                    System.exit(0);
                }
                if (move == 7) {

                    System.out.println("   |   |   ");
                    System.out.println(" O | O |   ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | X |   ");
                    System.out.println("   |   |   ");
                    System.out.println("You win!");
                    System.exit(0);
                }
                if (move == 8) {

                    System.out.println("   |   |   ");
                    System.out.println(" O | O |   ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("You win!");
                    System.exit(0);
                }
            }
            if (move == 4) {

                System.out.println("   |   |   ");
                System.out.println(" O |   |   ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println("   | X | X ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println("   |   |   ");
                System.out.println("   |   |   ");
                System.out.println("O moves on the top space.");

                System.out.println("   |   |   ");
                System.out.println(" O | O |   ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println("   | X | X ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println("   |   |   ");
                System.out.println("   |   |   ");

                System.out.println("Enter the number of your move");
                System.out.println("0|1|2");
                System.out.println("-+-+-");
                System.out.println("3|4|5");
                System.out.println("-+-+-");
                System.out.println("6|7|8");
                move = Integer.parseInt(in.nextLine());
                
                if (move == 2) {

                    System.out.println("   |   |   ");
                    System.out.println(" O | O | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println("   | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println("   |   |   ");
                    System.out.println("   |   |   ");
                    System.out.println("O moves on the left space.");

                    System.out.println("   |   |   ");
                    System.out.println(" O | O | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" O | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println("   |   |   ");
                    System.out.println("   |   |   ");

                    System.out.println("Enter the number of your move");
                    System.out.println("0|1|2");
                    System.out.println("-+-+-");
                    System.out.println("3|4|5");
                    System.out.println("-+-+-");
                    System.out.println("6|7|8");
                    move = Integer.parseInt(in.nextLine());
                    
                    if (move == 6) {

                        System.out.println("   |   |   ");
                        System.out.println(" O | O | X ");
                        System.out.println("   |   |   ");
                        System.out.println("---+---+---");
                        System.out.println("   |   |   ");
                        System.out.println(" O | X | X ");
                        System.out.println("   |   |   ");
                        System.out.println("---+---+---");
                        System.out.println("   |   |   ");
                        System.out.println(" X |   |   ");
                        System.out.println("   |   |   ");
                        System.out.println("You win!");
                        System.exit(0);
                    }
                    if (move == 7) {

                        System.out.println("   |   |   ");
                        System.out.println(" O | O | X ");
                        System.out.println("   |   |   ");
                        System.out.println("---+---+---");
                        System.out.println("   |   |   ");
                        System.out.println(" O | X | X ");
                        System.out.println("   |   |   ");
                        System.out.println("---+---+---");
                        System.out.println("   |   |   ");
                        System.out.println(" X | X |   ");
                        System.out.println("   |   |   ");
                        System.out.println("You win!");
                        System.exit(0);
                    }
                    if (move == 8) {

                        System.out.println("   |   |   ");
                        System.out.println(" O | O | X ");
                        System.out.println("   |   |   ");
                        System.out.println("---+---+---");
                        System.out.println("   |   |   ");
                        System.out.println(" O | X | X ");
                        System.out.println("   |   |   ");
                        System.out.println("---+---+---");
                        System.out.println("   |   |   ");
                        System.out.println(" X | X | X ");
                        System.out.println("   |   |   ");
                        System.out.println("You win!");
                        System.exit(0);
                    }
                }
                if (move == 3) {

                    System.out.println("   |   |   ");
                    System.out.println(" O | O |   ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println("   |   |   ");
                    System.out.println("   |   |   ");
                    System.out.println("You win!");
                    System.exit(0);
                }
                if (move == 6) {

                    System.out.println("   |   |   ");
                    System.out.println(" O | O |   ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X |   |   ");
                    System.out.println("   |   |   ");
                    System.out.println("You win!");
                    System.exit(0);
                }
                if (move == 7) {

                    System.out.println("   |   |   ");
                    System.out.println(" O | O |   ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | X |   ");
                    System.out.println("   |   |   ");
                    System.out.println("You win!");
                    System.exit(0);
                }
                if (move == 8) {

                    System.out.println("   |   |   ");
                    System.out.println(" O | O |   ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("You win!");
                    System.exit(0);
                }
            }
            if (move == 6) {

                System.out.println("   |   |   ");
                System.out.println(" O |   |   ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println("   |   | X ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println(" X |   |   ");
                System.out.println("   |   |   ");
                System.out.println("O moves on the top space.");

                System.out.println("   |   |   ");
                System.out.println(" O | O |   ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println("   |   | X ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println(" X |   |   ");
                System.out.println("   |   |   ");

                System.out.println("Enter the number of your move");
                System.out.println("0|1|2");
                System.out.println("-+-+-");
                System.out.println("3|4|5");
                System.out.println("-+-+-");
                System.out.println("6|7|8");
                move = Integer.parseInt(in.nextLine());
                
                if (move == 2) {

                    System.out.println("   |   |   ");
                    System.out.println(" O | O | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println("   |   | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X |   |   ");
                    System.out.println("   |   |   ");
                    System.out.println("O moves on the center space.");

                    System.out.println("   |   |   ");
                    System.out.println(" O | O | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println("   | O | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X |   |   ");
                    System.out.println("   |   |   ");

                    System.out.println("Enter the number of your move");
                    System.out.println("0|1|2");
                    System.out.println("-+-+-");
                    System.out.println("3|4|5");
                    System.out.println("-+-+-");
                    System.out.println("6|7|8");
                    move = Integer.parseInt(in.nextLine());
                    
                    if (move == 3) {

                        System.out.println("   |   |   ");
                        System.out.println(" O | O | X ");
                        System.out.println("   |   |   ");
                        System.out.println("---+---+---");
                        System.out.println("   |   |   ");
                        System.out.println(" X | O | X ");
                        System.out.println("   |   |   ");
                        System.out.println("---+---+---");
                        System.out.println("   |   |   ");
                        System.out.println(" X |   |   ");
                        System.out.println("   |   |   ");
                        System.out.println("O moves on the bottom space.");

                        System.out.println("   |   |   ");
                        System.out.println(" O | O | X ");
                        System.out.println("   |   |   ");
                        System.out.println("---+---+---");
                        System.out.println("   |   |   ");
                        System.out.println(" X | O | X ");
                        System.out.println("   |   |   ");
                        System.out.println("---+---+---");
                        System.out.println("   |   |   ");
                        System.out.println(" X | O |   ");
                        System.out.println("   |   |   ");
                        System.out.println("The computer wins!");
                        System.exit(0);
                    }
                    if (move == 8) {

                        System.out.println("   |   |   ");
                        System.out.println(" O | O | X ");
                        System.out.println("   |   |   ");
                        System.out.println("---+---+---");
                        System.out.println("   |   |   ");
                        System.out.println(" X | O | X ");
                        System.out.println("   |   |   ");
                        System.out.println("---+---+---");
                        System.out.println("   |   |   ");
                        System.out.println(" X | O | X ");
                        System.out.println("   |   |   ");
                        System.out.println("You win!");
                        System.exit(0);
                    }
                }
                if (move == 3) {

                    System.out.println("   |   |   ");
                    System.out.println(" O | O |   ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X |   | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X |   |   ");
                    System.out.println("   |   |   ");
                    System.out.println("O moves on the top-right space.");

                    System.out.println("   |   |   ");
                    System.out.println(" O | O | O ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X |   | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X |   |   ");
                    System.out.println("   |   |   ");
                    System.out.println("The computer wins!");
                    System.exit(0);
                }
                if (move == 4) {

                    System.out.println("   |   |   ");
                    System.out.println(" O | O | O ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X |   |   ");
                    System.out.println("   |   |   ");
                    System.out.println("You win!");
                    System.exit(0);
                }
                if (move == 7) {

                    System.out.println("   |   |   ");
                    System.out.println(" O | O | O ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | X |   ");
                    System.out.println("   |   |   ");
                    System.out.println("You win!");
                    System.exit(0);
                }
                if (move == 8) {

                    System.out.println("   |   |   ");
                    System.out.println(" O | O | O ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("You win!");
                    System.exit(0);
                }
            }
            if (move == 7) {

                System.out.println("   |   |   ");
                System.out.println(" O |   |   ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println("   |   | X ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println("   | X |   ");
                System.out.println("   |   |   ");
                System.out.println("O moves on the top space.");

                System.out.println("   |   |   ");
                System.out.println(" O | O |   ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println("   |   | X ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println("   | X |   ");
                System.out.println("   |   |   ");

                System.out.println("Enter the number of your move");
                System.out.println("0|1|2");
                System.out.println("-+-+-");
                System.out.println("3|4|5");
                System.out.println("-+-+-");
                System.out.println("6|7|8");
                move = Integer.parseInt(in.nextLine());
                
                if (move == 2) {

                    System.out.println("   |   |   ");
                    System.out.println(" O | O | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println("   |   | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println("   | X |   ");
                    System.out.println("   |   |   ");
                    System.out.println("O moves on the left space.");

                    System.out.println("   |   |   ");
                    System.out.println(" O | O | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" O |   | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println("   | X |   ");
                    System.out.println("   |   |   ");

                    System.out.println("Enter the number of your move");
                    System.out.println("0|1|2");
                    System.out.println("-+-+-");
                    System.out.println("3|4|5");
                    System.out.println("-+-+-");
                    System.out.println("6|7|8");
                    move = Integer.parseInt(in.nextLine());
                    
                    if (move == 4) {

                        System.out.println("   |   |   ");
                        System.out.println(" O | O | X ");
                        System.out.println("   |   |   ");
                        System.out.println("---+---+---");
                        System.out.println("   |   |   ");
                        System.out.println(" O | X | X ");
                        System.out.println("   |   |   ");
                        System.out.println("---+---+---");
                        System.out.println("   |   |   ");
                        System.out.println("   | X |   ");
                        System.out.println("   |   |   ");
                        System.out.println("O moves on the bottom-left space.");

                        System.out.println("   |   |   ");
                        System.out.println(" O | O | X ");
                        System.out.println("   |   |   ");
                        System.out.println("---+---+---");
                        System.out.println("   |   |   ");
                        System.out.println(" O | X | X ");
                        System.out.println("   |   |   ");
                        System.out.println("---+---+---");
                        System.out.println("   |   |   ");
                        System.out.println(" O | X |   ");
                        System.out.println("   |   |   ");
                        System.out.println("The computer wins!");
                        System.exit(0);
                    }
                    if (move == 8) {

                        System.out.println("   |   |   ");
                        System.out.println(" O | O | X ");
                        System.out.println("   |   |   ");
                        System.out.println("---+---+---");
                        System.out.println("   |   |   ");
                        System.out.println(" O | X | X ");
                        System.out.println("   |   |   ");
                        System.out.println("---+---+---");
                        System.out.println("   |   |   ");
                        System.out.println(" O | X | X ");
                        System.out.println("   |   |   ");
                        System.out.println("You win!");
                        System.exit(0);
                    }
                }
                if (move == 3) {

                    System.out.println("   |   |   ");
                    System.out.println(" O | O |   ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X |   | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println("   | X |   ");
                    System.out.println("   |   |   ");
                    System.out.println("O moves on the top-right space.");

                    System.out.println("   |   |   ");
                    System.out.println(" O | O | O ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X |   | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println("   | X |   ");
                    System.out.println("   |   |   ");
                    System.out.println("The computer wins!");
                    System.exit(0);
                }
                if (move == 4) {

                    System.out.println("   |   |   ");
                    System.out.println(" O | O | O ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println("   | X |   ");
                    System.out.println("   |   |   ");
                    System.out.println("You win!");
                    System.exit(0);
                }
                if (move == 6) {

                    System.out.println("   |   |   ");
                    System.out.println(" O | O | O ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | X |   ");
                    System.out.println("   |   |   ");
                    System.out.println("You win!");
                    System.exit(0);
                }
                if (move == 8) {

                    System.out.println("   |   |   ");
                    System.out.println(" O | O | O ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("You win!");
                    System.exit(0);
                }
            }
            if (move == 8) {

                System.out.println("   |   |   ");
                System.out.println(" O |   |   ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println("   |   | X ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println("   |   | X ");
                System.out.println("   |   |   ");
                System.out.println("O moves on the top space.");

                System.out.println("   |   |   ");
                System.out.println(" O | O |   ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println("   |   | X ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println("   |   | X ");
                System.out.println("   |   |   ");

                System.out.println("Enter the number of your move");
                System.out.println("0|1|2");
                System.out.println("-+-+-");
                System.out.println("3|4|5");
                System.out.println("-+-+-");
                System.out.println("6|7|8");
                move = Integer.parseInt(in.nextLine());
                
                if (move == 2) {

                    System.out.println("   |   |   ");
                    System.out.println(" O | O | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println("   |   | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println("   |   | X ");
                    System.out.println("   |   |   ");
                    System.out.println("You win!");
                    System.exit(0);
                }
                if (move == 3) {

                    System.out.println("   |   |   ");
                    System.out.println(" O | O | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X |   | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println("   |   | X ");
                    System.out.println("   |   |   ");
                    System.out.println("You win!");
                    System.exit(0);
                }
                if (move == 4) {

                    System.out.println("   |   |   ");
                    System.out.println(" O | O | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println("   |   | X ");
                    System.out.println("   |   |   ");
                    System.out.println("You win!");
                    System.exit(0);
                }
                if (move == 6) {

                    System.out.println("   |   |   ");
                    System.out.println(" O | O | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X |   | X ");
                    System.out.println("   |   |   ");
                    System.out.println("You win!");
                    System.exit(0);
                }
                if (move == 7) {

                    System.out.println("   |   |   ");
                    System.out.println(" O | O | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("You win!");
                    System.exit(0);
                }
            }
        }
        if (move == 6) {

            System.out.println("   |   |   ");
            System.out.println("   |   |   ");
            System.out.println("   |   |   ");
            System.out.println("---+---+---");
            System.out.println("   |   |   ");
            System.out.println("   |   |   ");
            System.out.println("   |   |   ");
            System.out.println("---+---+---");
            System.out.println("   |   |   ");
            System.out.println(" X |   |   ");
            System.out.println("   |   |   ");
            System.out.println("O moves on the top-left space.");

            System.out.println("   |   |   ");
            System.out.println(" O |   |   ");
            System.out.println("   |   |   ");
            System.out.println("---+---+---");
            System.out.println("   |   |   ");
            System.out.println("   |   |   ");
            System.out.println("   |   |   ");
            System.out.println("---+---+---");
            System.out.println("   |   |   ");
            System.out.println(" X |   |   ");
            System.out.println("   |   |   ");

            System.out.println("Enter the number of your move");
            System.out.println("0|1|2");
            System.out.println("-+-+-");
            System.out.println("3|4|5");
            System.out.println("-+-+-");
            System.out.println("6|7|8");
            move = Integer.parseInt(in.nextLine());
            
            if (move == 1) {

                System.out.println("   |   |   ");
                System.out.println(" O | X |   ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println("   |   |   ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println(" X |   |   ");
                System.out.println("   |   |   ");
                System.out.println("O moves on the center space.");

                System.out.println("   |   |   ");
                System.out.println(" O | X |   ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println("   | O |   ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println(" X |   |   ");
                System.out.println("   |   |   ");

                System.out.println("Enter the number of your move");
                System.out.println("0|1|2");
                System.out.println("-+-+-");
                System.out.println("3|4|5");
                System.out.println("-+-+-");
                System.out.println("6|7|8");
                move = Integer.parseInt(in.nextLine());
                
                if (move == 2) {

                    System.out.println("   |   |   ");
                    System.out.println(" O | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println("   | O |   ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X |   |   ");
                    System.out.println("   |   |   ");
                    System.out.println("O moves on the bottom-right space.");

                    System.out.println("   |   |   ");
                    System.out.println(" O | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println("   | O |   ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X |   | O ");
                    System.out.println("   |   |   ");
                    System.out.println("The computer wins!");
                    System.exit(0);
                }
                if (move == 3) {

                    System.out.println("   |   |   ");
                    System.out.println(" O | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | O |   ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X |   | O ");
                    System.out.println("   |   |   ");
                    System.out.println("O moves on the right space.");

                    System.out.println("   |   |   ");
                    System.out.println(" O | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | O | O ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X |   | O ");
                    System.out.println("   |   |   ");
                    System.out.println("The computer wins!");
                    System.exit(0);
                }
                if (move == 7) {

                    System.out.println("   |   |   ");
                    System.out.println(" O | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | O | O ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | X | O ");
                    System.out.println("   |   |   ");
                    System.out.println("It's a tie!");
                    System.exit(0);
                }
            }
            if (move == 2) {

                System.out.println("   |   |   ");
                System.out.println(" O |   | X ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println("   |   |   ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println(" X |   |   ");
                System.out.println("   |   |   ");
                System.out.println("O moves on the center space.");

                System.out.println("   |   |   ");
                System.out.println(" O |   | X ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println("   | O |   ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println(" X |   |   ");
                System.out.println("   |   |   ");

                System.out.println("Enter the number of your move");
                System.out.println("0|1|2");
                System.out.println("-+-+-");
                System.out.println("3|4|5");
                System.out.println("-+-+-");
                System.out.println("6|7|8");
                move = Integer.parseInt(in.nextLine());
                
                if (move == 1) {

                    System.out.println("   |   |   ");
                    System.out.println(" O | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println("   | O |   ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X |   |   ");
                    System.out.println("   |   |   ");
                    System.out.println("O moves on the bottom-right space.");

                    System.out.println("   |   |   ");
                    System.out.println(" O | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println("   | O |   ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X |   | O ");
                    System.out.println("   |   |   ");
                    System.out.println("The computer wins!");
                    System.exit(0);
                }
                if (move == 3) {

                    System.out.println("   |   |   ");
                    System.out.println(" O | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | O |   ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X |   | O ");
                    System.out.println("   |   |   ");
                    System.out.println("O moves on the right space.");

                    System.out.println("   |   |   ");
                    System.out.println(" O | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | O | O ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X |   | O ");
                    System.out.println("   |   |   ");
                    System.out.println("The computer wins!");
                    System.exit(0);
                }
                if (move == 7) {

                    System.out.println("   |   |   ");
                    System.out.println(" O | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | O | O ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | X | O ");
                    System.out.println("   |   |   ");
                    System.out.println("It's a tie!");
                    System.exit(0);
                }
            }
            if (move == 3) {

                System.out.println("   |   |   ");
                System.out.println(" O |   |   ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println(" X |   |   ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println(" X |   |   ");
                System.out.println("   |   |   ");
                System.out.println("O moves on the top space.");

                System.out.println("   |   |   ");
                System.out.println(" O | O |   ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println(" X |   |   ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println(" X |   |   ");
                System.out.println("   |   |   ");

                System.out.println("Enter the number of your move");
                System.out.println("0|1|2");
                System.out.println("-+-+-");
                System.out.println("3|4|5");
                System.out.println("-+-+-");
                System.out.println("6|7|8");
                move = Integer.parseInt(in.nextLine());
                
                if (move == 2) {

                    System.out.println("   |   |   ");
                    System.out.println(" O | O | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X |   |   ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X |   |   ");
                    System.out.println("   |   |   ");
                    System.out.println("O moves on the center space.");

                    System.out.println("   |   |   ");
                    System.out.println(" O | O | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | O |   ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X |   |   ");
                    System.out.println("   |   |   ");

                    System.out.println("Enter the number of your move");
                    System.out.println("0|1|2");
                    System.out.println("-+-+-");
                    System.out.println("3|4|5");
                    System.out.println("-+-+-");
                    System.out.println("6|7|8");
                    move = Integer.parseInt(in.nextLine());
                    
                    if (move == 5) {

                        System.out.println("   |   |   ");
                        System.out.println(" O | O | X ");
                        System.out.println("   |   |   ");
                        System.out.println("---+---+---");
                        System.out.println("   |   |   ");
                        System.out.println(" X | O | X ");
                        System.out.println("   |   |   ");
                        System.out.println("---+---+---");
                        System.out.println("   |   |   ");
                        System.out.println(" X |   |   ");
                        System.out.println("   |   |   ");
                        System.out.println("O moves on the bottom space.");

                        System.out.println("   |   |   ");
                        System.out.println(" O | O | X ");
                        System.out.println("   |   |   ");
                        System.out.println("---+---+---");
                        System.out.println("   |   |   ");
                        System.out.println(" X | O | X ");
                        System.out.println("   |   |   ");
                        System.out.println("---+---+---");
                        System.out.println("   |   |   ");
                        System.out.println(" X | O |   ");
                        System.out.println("   |   |   ");
                        System.out.println("The computer wins!");
                        System.exit(0);
                    }
                    if (move == 8) {

                        System.out.println("   |   |   ");
                        System.out.println(" O | O | X ");
                        System.out.println("   |   |   ");
                        System.out.println("---+---+---");
                        System.out.println("   |   |   ");
                        System.out.println(" X | O | X ");
                        System.out.println("   |   |   ");
                        System.out.println("---+---+---");
                        System.out.println("   |   |   ");
                        System.out.println(" X | O | X ");
                        System.out.println("   |   |   ");
                        System.out.println("You win!");
                        System.exit(0);
                    }
                }
                if (move == 4) {

                    System.out.println("   |   |   ");
                    System.out.println(" O | O |   ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | X |   ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X |   |   ");
                    System.out.println("   |   |   ");
                    System.out.println("O moves on the top-right space.");

                    System.out.println("   |   |   ");
                    System.out.println(" O | O | O ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | X |   ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X |   |   ");
                    System.out.println("   |   |   ");
                    System.out.println("The computer wins!");
                    System.exit(0);
                }
                if (move == 5) {

                    System.out.println("   |   |   ");
                    System.out.println(" O | O | O ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X |   |   ");
                    System.out.println("   |   |   ");
                    System.out.println("You win!");
                    System.exit(0);
                }
                if (move == 7) {

                    System.out.println("   |   |   ");
                    System.out.println(" O | O | O ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | X |   ");
                    System.out.println("   |   |   ");
                    System.out.println("You win!");
                    System.exit(0);
                }
                if (move == 8) {

                    System.out.println("   |   |   ");
                    System.out.println(" O | O | O ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("You win!");
                    System.exit(0);
                }
            }
            if (move == 4) {

                System.out.println("   |   |   ");
                System.out.println(" O |   |   ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println("   | X |   ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println(" X |   |   ");
                System.out.println("   |   |   ");
                System.out.println("O moves on the top space.");

                System.out.println("   |   |   ");
                System.out.println(" O | O |   ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println("   | X |   ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println(" X |   |   ");
                System.out.println("   |   |   ");

                System.out.println("Enter the number of your move");
                System.out.println("0|1|2");
                System.out.println("-+-+-");
                System.out.println("3|4|5");
                System.out.println("-+-+-");
                System.out.println("6|7|8");
                move = Integer.parseInt(in.nextLine());
                
                if (move == 2) {

                    System.out.println("   |   |   ");
                    System.out.println(" O | O | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println("   | X |   ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X |   |   ");
                    System.out.println("   |   |   ");
                    System.out.println("You win!");
                    System.exit(0);
                }
                if (move == 3) {

                    System.out.println("   |   |   ");
                    System.out.println(" O | O | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | X |   ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X |   |   ");
                    System.out.println("   |   |   ");
                    System.out.println("You win!");
                    System.exit(0);
                }
                if (move == 5) {

                    System.out.println("   |   |   ");
                    System.out.println(" O | O | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X |   |   ");
                    System.out.println("   |   |   ");
                    System.out.println("You win!");
                    System.exit(0);
                }
                if (move == 7) {

                    System.out.println("   |   |   ");
                    System.out.println(" O | O | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | X |   ");
                    System.out.println("   |   |   ");
                    System.out.println("You win!");
                    System.exit(0);
                }
                if (move == 8) {

                    System.out.println("   |   |   ");
                    System.out.println(" O | O | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("You win!");
                    System.exit(0);
                }
            }
            if (move == 5) {

                System.out.println("   |   |   ");
                System.out.println(" O |   |   ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println("   |   | X ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println(" X |   |   ");
                System.out.println("   |   |   ");
                System.out.println("O moves on the top space.");

                System.out.println("   |   |   ");
                System.out.println(" O | O |   ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println("   |   | X ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println(" X |   |   ");
                System.out.println("   |   |   ");

                System.out.println("Enter the number of your move");
                System.out.println("0|1|2");
                System.out.println("-+-+-");
                System.out.println("3|4|5");
                System.out.println("-+-+-");
                System.out.println("6|7|8");
                move = Integer.parseInt(in.nextLine());
                
                if (move == 2) {

                    System.out.println("   |   |   ");
                    System.out.println(" O | O | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println("   |   | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X |   |   ");
                    System.out.println("   |   |   ");
                    System.out.println("O moves on the center space.");

                    System.out.println("   |   |   ");
                    System.out.println(" O | O | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println("   | O | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X |   |   ");
                    System.out.println("   |   |   ");

                    System.out.println("Enter the number of your move");
                    System.out.println("0|1|2");
                    System.out.println("-+-+-");
                    System.out.println("3|4|5");
                    System.out.println("-+-+-");
                    System.out.println("6|7|8");
                    move = Integer.parseInt(in.nextLine());
                    
                    if (move == 3) {

                        System.out.println("   |   |   ");
                        System.out.println(" O | O | X ");
                        System.out.println("   |   |   ");
                        System.out.println("---+---+---");
                        System.out.println("   |   |   ");
                        System.out.println(" X | O | X ");
                        System.out.println("   |   |   ");
                        System.out.println("---+---+---");
                        System.out.println("   |   |   ");
                        System.out.println(" X |   |   ");
                        System.out.println("   |   |   ");
                        System.out.println("O moves on the bottom space.");

                        System.out.println("   |   |   ");
                        System.out.println(" O | O | X ");
                        System.out.println("   |   |   ");
                        System.out.println("---+---+---");
                        System.out.println("   |   |   ");
                        System.out.println(" X | O | X ");
                        System.out.println("   |   |   ");
                        System.out.println("---+---+---");
                        System.out.println("   |   |   ");
                        System.out.println(" X | O |   ");
                        System.out.println("   |   |   ");
                        System.out.println("The computer wins!");
                        System.exit(0);
                    }
                    if (move == 8) {

                        System.out.println("   |   |   ");
                        System.out.println(" O | O | X ");
                        System.out.println("   |   |   ");
                        System.out.println("---+---+---");
                        System.out.println("   |   |   ");
                        System.out.println(" X | O | X ");
                        System.out.println("   |   |   ");
                        System.out.println("---+---+---");
                        System.out.println("   |   |   ");
                        System.out.println(" X | O | X ");
                        System.out.println("   |   |   ");
                        System.out.println("You win!");
                        System.exit(0);
                    }
                }
                if (move == 3) {

                    System.out.println("   |   |   ");
                    System.out.println(" O | O |   ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X |   | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X |   |   ");
                    System.out.println("   |   |   ");
                    System.out.println("O moves on the top-right space.");

                    System.out.println("   |   |   ");
                    System.out.println(" O | O | O ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X |   | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X |   |   ");
                    System.out.println("   |   |   ");
                    System.out.println("The computer wins!");
                    System.exit(0);
                }
                if (move == 4) {

                    System.out.println("   |   |   ");
                    System.out.println(" O | O | O ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X |   |   ");
                    System.out.println("   |   |   ");
                    System.out.println("You win!");
                    System.exit(0);
                }
                if (move == 7) {

                    System.out.println("   |   |   ");
                    System.out.println(" O | O | O ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | X |   ");
                    System.out.println("   |   |   ");
                    System.out.println("You win!");
                    System.exit(0);
                }
                if (move == 8) {

                    System.out.println("   |   |   ");
                    System.out.println(" O | O | O ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("You win!");
                    System.exit(0);
                }
            }
            if (move == 7) {

                System.out.println("   |   |   ");
                System.out.println(" O |   |   ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println("   |   |   ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println(" X | X |   ");
                System.out.println("   |   |   ");
                System.out.println("O moves on the top space.");

                System.out.println("   |   |   ");
                System.out.println(" O | O |   ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println("   |   |   ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println(" X | X |   ");
                System.out.println("   |   |   ");

                System.out.println("Enter the number of your move");
                System.out.println("0|1|2");
                System.out.println("-+-+-");
                System.out.println("3|4|5");
                System.out.println("-+-+-");
                System.out.println("6|7|8");
                move = Integer.parseInt(in.nextLine());
                
                if (move == 2) {

                    System.out.println("   |   |   ");
                    System.out.println(" O | O | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println("   |   |   ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | X |   ");
                    System.out.println("   |   |   ");
                    System.out.println("O moves on the center space.");

                    System.out.println("   |   |   ");
                    System.out.println(" O | O | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println("   | O |   ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | X |   ");
                    System.out.println("   |   |   ");

                    System.out.println("Enter the number of your move");
                    System.out.println("0|1|2");
                    System.out.println("-+-+-");
                    System.out.println("3|4|5");
                    System.out.println("-+-+-");
                    System.out.println("6|7|8");
                    move = Integer.parseInt(in.nextLine());
                    
                    if (move == 3) {

                        System.out.println("   |   |   ");
                        System.out.println(" O | O | X ");
                        System.out.println("   |   |   ");
                        System.out.println("---+---+---");
                        System.out.println("   |   |   ");
                        System.out.println(" X | O |   ");
                        System.out.println("   |   |   ");
                        System.out.println("---+---+---");
                        System.out.println("   |   |   ");
                        System.out.println(" X | X |   ");
                        System.out.println("   |   |   ");
                        System.out.println("O moves on the bottom-right space.");

                        System.out.println("   |   |   ");
                        System.out.println(" O | O | X ");
                        System.out.println("   |   |   ");
                        System.out.println("---+---+---");
                        System.out.println("   |   |   ");
                        System.out.println(" X | O |   ");
                        System.out.println("   |   |   ");
                        System.out.println("---+---+---");
                        System.out.println("   |   |   ");
                        System.out.println(" X | X | O ");
                        System.out.println("   |   |   ");
                        System.out.println("The computer wins!");
                        System.exit(0);
                    }
                    if (move == 5) {

                        System.out.println("   |   |   ");
                        System.out.println(" O | O | X ");
                        System.out.println("   |   |   ");
                        System.out.println("---+---+---");
                        System.out.println("   |   |   ");
                        System.out.println(" X | O | X ");
                        System.out.println("   |   |   ");
                        System.out.println("---+---+---");
                        System.out.println("   |   |   ");
                        System.out.println(" X | X | O ");
                        System.out.println("   |   |   ");
                        System.out.println("It's a tie!");
                        System.exit(0);
                    }
                }
                if (move == 3) {

                    System.out.println("   |   |   ");
                    System.out.println(" O | O |   ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X |   |   ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | X |   ");
                    System.out.println("   |   |   ");
                    System.out.println("O moves on the top-right space.");

                    System.out.println("   |   |   ");
                    System.out.println(" O | O | O ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X |   |   ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | X |   ");
                    System.out.println("   |   |   ");
                    System.out.println("The computer wins!");
                    System.exit(0);
                }
                if (move == 4) {

                    System.out.println("   |   |   ");
                    System.out.println(" O | O | O ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | X |   ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | X |   ");
                    System.out.println("   |   |   ");
                    System.out.println("O moves on the right space.");

                    System.out.println("   |   |   ");
                    System.out.println(" O | O | O ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | X | O ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | X |   ");
                    System.out.println("   |   |   ");
                    System.out.println("The computer wins!");
                    System.exit(0);
                }
                if (move == 8) {

                    System.out.println("   |   |   ");
                    System.out.println(" O | O | O ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | X | O ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("You win!");
                    System.exit(0);
                }
            }
            if (move == 8) {

                System.out.println("   |   |   ");
                System.out.println(" O |   |   ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println("   |   |   ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println(" X |   | X ");
                System.out.println("   |   |   ");
                System.out.println("O moves on the top space.");

                System.out.println("   |   |   ");
                System.out.println(" O | O |   ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println("   |   |   ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println(" X |   | X ");
                System.out.println("   |   |   ");

                System.out.println("Enter the number of your move");
                System.out.println("0|1|2");
                System.out.println("-+-+-");
                System.out.println("3|4|5");
                System.out.println("-+-+-");
                System.out.println("6|7|8");
                move = Integer.parseInt(in.nextLine());
                
                if (move == 2) {

                    System.out.println("   |   |   ");
                    System.out.println(" O | O | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println("   |   |   ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X |   | X ");
                    System.out.println("   |   |   ");
                    System.out.println("O moves on the center space.");

                    System.out.println("   |   |   ");
                    System.out.println(" O | O | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println("   | O |   ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X |   | X ");
                    System.out.println("   |   |   ");

                    System.out.println("Enter the number of your move");
                    System.out.println("0|1|2");
                    System.out.println("-+-+-");
                    System.out.println("3|4|5");
                    System.out.println("-+-+-");
                    System.out.println("6|7|8");
                    move = Integer.parseInt(in.nextLine());
                    
                    if (move == 3) {

                        System.out.println("   |   |   ");
                        System.out.println(" O | O | X ");
                        System.out.println("   |   |   ");
                        System.out.println("---+---+---");
                        System.out.println("   |   |   ");
                        System.out.println(" X | O |   ");
                        System.out.println("   |   |   ");
                        System.out.println("---+---+---");
                        System.out.println("   |   |   ");
                        System.out.println(" X |   | X ");
                        System.out.println("   |   |   ");
                        System.out.println("O moves on the bottom space.");

                        System.out.println("   |   |   ");
                        System.out.println(" O | O | X ");
                        System.out.println("   |   |   ");
                        System.out.println("---+---+---");
                        System.out.println("   |   |   ");
                        System.out.println(" X | O |   ");
                        System.out.println("   |   |   ");
                        System.out.println("---+---+---");
                        System.out.println("   |   |   ");
                        System.out.println(" X | O | X ");
                        System.out.println("   |   |   ");
                        System.out.println("The computer wins!");
                        System.exit(0);
                    }
                    if (move == 5) {

                        System.out.println("   |   |   ");
                        System.out.println(" O | O | X ");
                        System.out.println("   |   |   ");
                        System.out.println("---+---+---");
                        System.out.println("   |   |   ");
                        System.out.println(" X | O | X ");
                        System.out.println("   |   |   ");
                        System.out.println("---+---+---");
                        System.out.println("   |   |   ");
                        System.out.println(" X | O | X ");
                        System.out.println("   |   |   ");
                        System.out.println("You win!");
                        System.exit(0);
                    }
                }
                if (move == 3) {

                    System.out.println("   |   |   ");
                    System.out.println(" O | O |   ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X |   |   ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X |   | X ");
                    System.out.println("   |   |   ");
                    System.out.println("O moves on the top-right space.");

                    System.out.println("   |   |   ");
                    System.out.println(" O | O | O ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X |   |   ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X |   | X ");
                    System.out.println("   |   |   ");
                    System.out.println("The computer wins!");
                    System.exit(0);
                }
                if (move == 4) {

                    System.out.println("   |   |   ");
                    System.out.println(" O | O | O ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | X |   ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X |   | X ");
                    System.out.println("   |   |   ");
                    System.out.println("O moves on the right space.");

                    System.out.println("   |   |   ");
                    System.out.println(" O | O | O ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | X | O ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X |   | X ");
                    System.out.println("   |   |   ");
                    System.out.println("The computer wins!");
                    System.exit(0);
                }
                if (move == 7) {

                    System.out.println("   |   |   ");
                    System.out.println(" O | O | O ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | X | O ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("You win!");
                    System.exit(0);
                }
            }
        }
        if (move == 7) {

            System.out.println("   |   |   ");
            System.out.println("   |   |   ");
            System.out.println("   |   |   ");
            System.out.println("---+---+---");
            System.out.println("   |   |   ");
            System.out.println("   |   |   ");
            System.out.println("   |   |   ");
            System.out.println("---+---+---");
            System.out.println("   |   |   ");
            System.out.println("   | X |   ");
            System.out.println("   |   |   ");
            System.out.println("O moves on the top-left space.");

            System.out.println("   |   |   ");
            System.out.println(" O |   |   ");
            System.out.println("   |   |   ");
            System.out.println("---+---+---");
            System.out.println("   |   |   ");
            System.out.println("   |   |   ");
            System.out.println("   |   |   ");
            System.out.println("---+---+---");
            System.out.println("   |   |   ");
            System.out.println("   | X |   ");
            System.out.println("   |   |   ");

            System.out.println("Enter the number of your move");
            System.out.println("0|1|2");
            System.out.println("-+-+-");
            System.out.println("3|4|5");
            System.out.println("-+-+-");
            System.out.println("6|7|8");
            move = Integer.parseInt(in.nextLine());
            
            if (move == 1) {

                System.out.println("   |   |   ");
                System.out.println(" O | X |   ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println("   |   |   ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println("   | X |   ");
                System.out.println("   |   |   ");
                System.out.println("O moves on the left space.");

                System.out.println("   |   |   ");
                System.out.println(" O | X |   ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println(" O |   |   ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println("   | X |   ");
                System.out.println("   |   |   ");

                System.out.println("Enter the number of your move");
                System.out.println("0|1|2");
                System.out.println("-+-+-");
                System.out.println("3|4|5");
                System.out.println("-+-+-");
                System.out.println("6|7|8");
                move = Integer.parseInt(in.nextLine());
                
                if (move == 2) {

                    System.out.println("   |   |   ");
                    System.out.println(" O | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" O |   |   ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println("   | X |   ");
                    System.out.println("   |   |   ");
                    System.out.println("O moves on the bottom-left space.");

                    System.out.println("   |   |   ");
                    System.out.println(" O | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" O |   |   ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" O | X |   ");
                    System.out.println("   |   |   ");
                    System.out.println("The computer wins!");
                    System.exit(0);
                }
                if (move == 4) {

                    System.out.println("   |   |   ");
                    System.out.println(" O | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" O | X |   ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" O | X |   ");
                    System.out.println("   |   |   ");
                    System.out.println("You win!");
                    System.exit(0);
                }
                if (move == 5) {

                    System.out.println("   |   |   ");
                    System.out.println(" O | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" O | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" O | X |   ");
                    System.out.println("   |   |   ");
                    System.out.println("You win!");
                    System.exit(0);
                }
                if (move == 8) {

                    System.out.println("   |   |   ");
                    System.out.println(" O | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" O | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" O | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("You win!");
                    System.exit(0);
                }
            }
            if (move == 2) {

                System.out.println("   |   |   ");
                System.out.println(" O |   | X ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println("   |   |   ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println("   | X |   ");
                System.out.println("   |   |   ");
                System.out.println("O moves on the left space.");

                System.out.println("   |   |   ");
                System.out.println(" O |   | X ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println(" O |   |   ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println("   | X |   ");
                System.out.println("   |   |   ");

                System.out.println("Enter the number of your move");
                System.out.println("0|1|2");
                System.out.println("-+-+-");
                System.out.println("3|4|5");
                System.out.println("-+-+-");
                System.out.println("6|7|8");
                move = Integer.parseInt(in.nextLine());
                
                if (move == 1) {

                    System.out.println("   |   |   ");
                    System.out.println(" O | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" O |   |   ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println("   | X |   ");
                    System.out.println("   |   |   ");
                    System.out.println("O moves on the bottom-left space.");

                    System.out.println("   |   |   ");
                    System.out.println(" O | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" O |   |   ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" O | X |   ");
                    System.out.println("   |   |   ");
                    System.out.println("The computer wins!");
                    System.exit(0);
                }
                if (move == 4) {

                    System.out.println("   |   |   ");
                    System.out.println(" O | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" O | X |   ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" O | X |   ");
                    System.out.println("   |   |   ");
                    System.out.println("You win!");
                    System.exit(0);
                }
                if (move == 5) {

                    System.out.println("   |   |   ");
                    System.out.println(" O | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" O | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" O | X |   ");
                    System.out.println("   |   |   ");
                    System.out.println("You win!");
                    System.exit(0);
                }
                if (move == 8) {

                    System.out.println("   |   |   ");
                    System.out.println(" O | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" O | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" O | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("You win!");
                    System.exit(0);
                }
            }
            if (move == 3) {

                System.out.println("   |   |   ");
                System.out.println(" O |   |   ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println(" X |   |   ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println("   | X |   ");
                System.out.println("   |   |   ");
                System.out.println("O moves on the top space.");

                System.out.println("   |   |   ");
                System.out.println(" O | O |   ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println(" X |   |   ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println("   | X |   ");
                System.out.println("   |   |   ");

                System.out.println("Enter the number of your move");
                System.out.println("0|1|2");
                System.out.println("-+-+-");
                System.out.println("3|4|5");
                System.out.println("-+-+-");
                System.out.println("6|7|8");
                move = Integer.parseInt(in.nextLine());
                
                if (move == 2) {

                    System.out.println("   |   |   ");
                    System.out.println(" O | O | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X |   |   ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println("   | X |   ");
                    System.out.println("   |   |   ");
                    System.out.println("O moves on the center space.");

                    System.out.println("   |   |   ");
                    System.out.println(" O | O | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | O |   ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println("   | X |   ");
                    System.out.println("   |   |   ");

                    System.out.println("Enter the number of your move");
                    System.out.println("0|1|2");
                    System.out.println("-+-+-");
                    System.out.println("3|4|5");
                    System.out.println("-+-+-");
                    System.out.println("6|7|8");
                    move = Integer.parseInt(in.nextLine());
                    
                    if (move == 5) {

                        System.out.println("   |   |   ");
                        System.out.println(" O | O | X ");
                        System.out.println("   |   |   ");
                        System.out.println("---+---+---");
                        System.out.println("   |   |   ");
                        System.out.println(" X | O | X ");
                        System.out.println("   |   |   ");
                        System.out.println("---+---+---");
                        System.out.println("   |   |   ");
                        System.out.println("   | X |   ");
                        System.out.println("   |   |   ");
                        System.out.println("O moves on the bottom-right space.");

                        System.out.println("   |   |   ");
                        System.out.println(" O | O | X ");
                        System.out.println("   |   |   ");
                        System.out.println("---+---+---");
                        System.out.println("   |   |   ");
                        System.out.println(" X | O | X ");
                        System.out.println("   |   |   ");
                        System.out.println("---+---+---");
                        System.out.println("   |   |   ");
                        System.out.println("   | X | O ");
                        System.out.println("   |   |   ");
                        System.out.println("The computer wins!");
                        System.exit(0);
                    }
                    if (move == 6) {

                        System.out.println("   |   |   ");
                        System.out.println(" O | O | X ");
                        System.out.println("   |   |   ");
                        System.out.println("---+---+---");
                        System.out.println("   |   |   ");
                        System.out.println(" X | O | X ");
                        System.out.println("   |   |   ");
                        System.out.println("---+---+---");
                        System.out.println("   |   |   ");
                        System.out.println(" X | X | O ");
                        System.out.println("   |   |   ");
                        System.out.println("It's a tie!");
                        System.exit(0);
                    }
                }
                if (move == 4) {

                    System.out.println("   |   |   ");
                    System.out.println(" O | O |   ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | X |   ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println("   | X |   ");
                    System.out.println("   |   |   ");
                    System.out.println("O moves on the top-right space.");

                    System.out.println("   |   |   ");
                    System.out.println(" O | O | O ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | X |   ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println("   | X |   ");
                    System.out.println("   |   |   ");
                    System.out.println("The computer wins!");
                    System.exit(0);
                }
                if (move == 5) {

                    System.out.println("   |   |   ");
                    System.out.println(" O | O | O ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println("   | X |   ");
                    System.out.println("   |   |   ");
                    System.out.println("You win!");
                    System.exit(0);
                }
                if (move == 6) {

                    System.out.println("   |   |   ");
                    System.out.println(" O | O | O ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | X |   ");
                    System.out.println("   |   |   ");
                    System.out.println("You win!");
                    System.exit(0);
                }
                if (move == 8) {

                    System.out.println("   |   |   ");
                    System.out.println(" O | O | O ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("You win!");
                    System.exit(0);
                }
            }
            if (move == 4) {

                System.out.println("   |   |   ");
                System.out.println(" O |   |   ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println("   | X |   ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println("   | X |   ");
                System.out.println("   |   |   ");
                System.out.println("O moves on the top space.");

                System.out.println("   |   |   ");
                System.out.println(" O | O |   ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println("   | X |   ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println("   | X |   ");
                System.out.println("   |   |   ");

                System.out.println("Enter the number of your move");
                System.out.println("0|1|2");
                System.out.println("-+-+-");
                System.out.println("3|4|5");
                System.out.println("-+-+-");
                System.out.println("6|7|8");
                move = Integer.parseInt(in.nextLine());
                
                if (move == 2) {

                    System.out.println("   |   |   ");
                    System.out.println(" O | O | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println("   | X |   ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println("   | X |   ");
                    System.out.println("   |   |   ");
                    System.out.println("O moves on the left space.");

                    System.out.println("   |   |   ");
                    System.out.println(" O | O | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" O | X |   ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println("   | X |   ");
                    System.out.println("   |   |   ");

                    System.out.println("Enter the number of your move");
                    System.out.println("0|1|2");
                    System.out.println("-+-+-");
                    System.out.println("3|4|5");
                    System.out.println("-+-+-");
                    System.out.println("6|7|8");
                    move = Integer.parseInt(in.nextLine());
                    
                    if (move == 5) {

                        System.out.println("   |   |   ");
                        System.out.println(" O | O | X ");
                        System.out.println("   |   |   ");
                        System.out.println("---+---+---");
                        System.out.println("   |   |   ");
                        System.out.println(" O | X | X ");
                        System.out.println("   |   |   ");
                        System.out.println("---+---+---");
                        System.out.println("   |   |   ");
                        System.out.println("   | X |   ");
                        System.out.println("   |   |   ");
                        System.out.println("O moves on the bottom-left space.");

                        System.out.println("   |   |   ");
                        System.out.println(" O | O | X ");
                        System.out.println("   |   |   ");
                        System.out.println("---+---+---");
                        System.out.println("   |   |   ");
                        System.out.println(" O | X | X ");
                        System.out.println("   |   |   ");
                        System.out.println("---+---+---");
                        System.out.println("   |   |   ");
                        System.out.println(" O | X |   ");
                        System.out.println("   |   |   ");
                        System.out.println("The computer wins!");
                        System.exit(0);
                    }
                    if (move == 8) {

                        System.out.println("   |   |   ");
                        System.out.println(" O | O | X ");
                        System.out.println("   |   |   ");
                        System.out.println("---+---+---");
                        System.out.println("   |   |   ");
                        System.out.println(" O | X | X ");
                        System.out.println("   |   |   ");
                        System.out.println("---+---+---");
                        System.out.println("   |   |   ");
                        System.out.println(" O | X | X ");
                        System.out.println("   |   |   ");
                        System.out.println("You win!");
                        System.exit(0);
                    }
                }
                if (move == 3) {

                    System.out.println("   |   |   ");
                    System.out.println(" O | O |   ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | X |   ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println("   | X |   ");
                    System.out.println("   |   |   ");
                    System.out.println("O moves on the top-right space.");

                    System.out.println("   |   |   ");
                    System.out.println(" O | O | O ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | X |   ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println("   | X |   ");
                    System.out.println("   |   |   ");
                    System.out.println("The computer wins!");
                    System.exit(0);
                }
                if (move == 5) {

                    System.out.println("   |   |   ");
                    System.out.println(" O | O | O ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println("   | X |   ");
                    System.out.println("   |   |   ");
                    System.out.println("You win!");
                    System.exit(0);
                }
                if (move == 6) {

                    System.out.println("   |   |   ");
                    System.out.println(" O | O | O ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | X |   ");
                    System.out.println("   |   |   ");
                    System.out.println("You win!");
                    System.exit(0);
                }
                if (move == 8) {

                    System.out.println("   |   |   ");
                    System.out.println(" O | O | O ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("You win!");
                    System.exit(0);
                }
            }
            if (move == 5) {

                System.out.println("   |   |   ");
                System.out.println(" O |   |   ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println("   |   | X ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println("   | X |   ");
                System.out.println("   |   |   ");
                System.out.println("O moves on the top space.");

                System.out.println("   |   |   ");
                System.out.println(" O | O |   ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println("   |   | X ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println("   | X |   ");
                System.out.println("   |   |   ");

                System.out.println("Enter the number of your move");
                System.out.println("0|1|2");
                System.out.println("-+-+-");
                System.out.println("3|4|5");
                System.out.println("-+-+-");
                System.out.println("6|7|8");
                move = Integer.parseInt(in.nextLine());
                
                if (move == 2) {

                    System.out.println("   |   |   ");
                    System.out.println(" O | O | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println("   |   | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println("   | X |   ");
                    System.out.println("   |   |   ");
                    System.out.println("O moves on the left space.");

                    System.out.println("   |   |   ");
                    System.out.println(" O | O | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" O |   | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println("   | X |   ");
                    System.out.println("   |   |   ");

                    System.out.println("Enter the number of your move");
                    System.out.println("0|1|2");
                    System.out.println("-+-+-");
                    System.out.println("3|4|5");
                    System.out.println("-+-+-");
                    System.out.println("6|7|8");
                    move = Integer.parseInt(in.nextLine());
                    
                    if (move == 4) {

                        System.out.println("   |   |   ");
                        System.out.println(" O | O | X ");
                        System.out.println("   |   |   ");
                        System.out.println("---+---+---");
                        System.out.println("   |   |   ");
                        System.out.println(" O | X | X ");
                        System.out.println("   |   |   ");
                        System.out.println("---+---+---");
                        System.out.println("   |   |   ");
                        System.out.println("   | X |   ");
                        System.out.println("   |   |   ");
                        System.out.println("O moves on the bottom-left space.");

                        System.out.println("   |   |   ");
                        System.out.println(" O | O | X ");
                        System.out.println("   |   |   ");
                        System.out.println("---+---+---");
                        System.out.println("   |   |   ");
                        System.out.println(" O | X | X ");
                        System.out.println("   |   |   ");
                        System.out.println("---+---+---");
                        System.out.println("   |   |   ");
                        System.out.println(" O | X |   ");
                        System.out.println("   |   |   ");
                        System.out.println("The computer wins!");
                        System.exit(0);
                    }
                    if (move == 8) {

                        System.out.println("   |   |   ");
                        System.out.println(" O | O | X ");
                        System.out.println("   |   |   ");
                        System.out.println("---+---+---");
                        System.out.println("   |   |   ");
                        System.out.println(" O | X | X ");
                        System.out.println("   |   |   ");
                        System.out.println("---+---+---");
                        System.out.println("   |   |   ");
                        System.out.println(" O | X | X ");
                        System.out.println("   |   |   ");
                        System.out.println("You win!");
                        System.exit(0);
                    }
                }
                if (move == 3) {

                    System.out.println("   |   |   ");
                    System.out.println(" O | O |   ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X |   | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println("   | X |   ");
                    System.out.println("   |   |   ");
                    System.out.println("O moves on the top-right space.");

                    System.out.println("   |   |   ");
                    System.out.println(" O | O | O ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X |   | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println("   | X |   ");
                    System.out.println("   |   |   ");
                    System.out.println("The computer wins!");
                    System.exit(0);
                }
                if (move == 4) {

                    System.out.println("   |   |   ");
                    System.out.println(" O | O | O ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println("   | X |   ");
                    System.out.println("   |   |   ");
                    System.out.println("You win!");
                    System.exit(0);
                }
                if (move == 6) {

                    System.out.println("   |   |   ");
                    System.out.println(" O | O | O ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | X |   ");
                    System.out.println("   |   |   ");
                    System.out.println("You win!");
                    System.exit(0);
                }
                if (move == 8) {

                    System.out.println("   |   |   ");
                    System.out.println(" O | O | O ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("You win!");
                    System.exit(0);
                }
            }
            if (move == 6) {

                System.out.println("   |   |   ");
                System.out.println(" O |   |   ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println("   |   |   ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println(" X | X |   ");
                System.out.println("   |   |   ");
                System.out.println("O moves on the top space.");

                System.out.println("   |   |   ");
                System.out.println(" O | O |   ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println("   |   |   ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println(" X | X |   ");
                System.out.println("   |   |   ");

                System.out.println("Enter the number of your move");
                System.out.println("0|1|2");
                System.out.println("-+-+-");
                System.out.println("3|4|5");
                System.out.println("-+-+-");
                System.out.println("6|7|8");
                move = Integer.parseInt(in.nextLine());
                
                if (move == 2) {

                    System.out.println("   |   |   ");
                    System.out.println(" O | O | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println("   |   |   ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | X |   ");
                    System.out.println("   |   |   ");
                    System.out.println("O moves on the center space.");

                    System.out.println("   |   |   ");
                    System.out.println(" O | O | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println("   | O |   ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | X |   ");
                    System.out.println("   |   |   ");

                    System.out.println("Enter the number of your move");
                    System.out.println("0|1|2");
                    System.out.println("-+-+-");
                    System.out.println("3|4|5");
                    System.out.println("-+-+-");
                    System.out.println("6|7|8");
                    move = Integer.parseInt(in.nextLine());
                    
                    if (move == 3) {

                        System.out.println("   |   |   ");
                        System.out.println(" O | O | X ");
                        System.out.println("   |   |   ");
                        System.out.println("---+---+---");
                        System.out.println("   |   |   ");
                        System.out.println(" X | O |   ");
                        System.out.println("   |   |   ");
                        System.out.println("---+---+---");
                        System.out.println("   |   |   ");
                        System.out.println(" X | X |   ");
                        System.out.println("   |   |   ");
                        System.out.println("O moves on the bottom-right space.");

                        System.out.println("   |   |   ");
                        System.out.println(" O | O | X ");
                        System.out.println("   |   |   ");
                        System.out.println("---+---+---");
                        System.out.println("   |   |   ");
                        System.out.println(" X | O |   ");
                        System.out.println("   |   |   ");
                        System.out.println("---+---+---");
                        System.out.println("   |   |   ");
                        System.out.println(" X | X | O ");
                        System.out.println("   |   |   ");
                        System.out.println("The computer wins!");
                        System.exit(0);
                    }
                    if (move == 5) {

                        System.out.println("   |   |   ");
                        System.out.println(" O | O | X ");
                        System.out.println("   |   |   ");
                        System.out.println("---+---+---");
                        System.out.println("   |   |   ");
                        System.out.println(" X | O | X ");
                        System.out.println("   |   |   ");
                        System.out.println("---+---+---");
                        System.out.println("   |   |   ");
                        System.out.println(" X | X | O ");
                        System.out.println("   |   |   ");
                        System.out.println("It's a tie!");
                        System.exit(0);
                    }
                }
                if (move == 3) {

                    System.out.println("   |   |   ");
                    System.out.println(" O | O |   ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X |   |   ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | X |   ");
                    System.out.println("   |   |   ");
                    System.out.println("O moves on the top-right space.");

                    System.out.println("   |   |   ");
                    System.out.println(" O | O | O ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X |   |   ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | X |   ");
                    System.out.println("   |   |   ");
                    System.out.println("The computer wins!");
                    System.exit(0);
                }
                if (move == 4) {

                    System.out.println("   |   |   ");
                    System.out.println(" O | O | O ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | X |   ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | X |   ");
                    System.out.println("   |   |   ");
                    System.out.println("O moves on the right space.");

                    System.out.println("   |   |   ");
                    System.out.println(" O | O | O ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | X | O ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | X |   ");
                    System.out.println("   |   |   ");
                    System.out.println("The computer wins!");
                    System.exit(0);
                }
                if (move == 8) {

                    System.out.println("   |   |   ");
                    System.out.println(" O | O | O ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | X | O ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("You win!");
                    System.exit(0);
                }
            }
            if (move == 8) {

                System.out.println("   |   |   ");
                System.out.println(" O |   |   ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println("   |   |   ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println("   | X | X ");
                System.out.println("   |   |   ");
                System.out.println("O moves on the top space.");

                System.out.println("   |   |   ");
                System.out.println(" O | O |   ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println("   |   |   ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println("   | X | X ");
                System.out.println("   |   |   ");

                System.out.println("Enter the number of your move");
                System.out.println("0|1|2");
                System.out.println("-+-+-");
                System.out.println("3|4|5");
                System.out.println("-+-+-");
                System.out.println("6|7|8");
                move = Integer.parseInt(in.nextLine());
                
                if (move == 2) {

                    System.out.println("   |   |   ");
                    System.out.println(" O | O | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println("   |   |   ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println("   | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("O moves on the left space.");

                    System.out.println("   |   |   ");
                    System.out.println(" O | O | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" O |   |   ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println("   | X | X ");
                    System.out.println("   |   |   ");

                    System.out.println("Enter the number of your move");
                    System.out.println("0|1|2");
                    System.out.println("-+-+-");
                    System.out.println("3|4|5");
                    System.out.println("-+-+-");
                    System.out.println("6|7|8");
                    move = Integer.parseInt(in.nextLine());
                    
                    if (move == 4) {

                        System.out.println("   |   |   ");
                        System.out.println(" O | O | X ");
                        System.out.println("   |   |   ");
                        System.out.println("---+---+---");
                        System.out.println("   |   |   ");
                        System.out.println(" O | X |   ");
                        System.out.println("   |   |   ");
                        System.out.println("---+---+---");
                        System.out.println("   |   |   ");
                        System.out.println("   | X | X ");
                        System.out.println("   |   |   ");
                        System.out.println("O moves on the bottom-left space.");

                        System.out.println("   |   |   ");
                        System.out.println(" O | O | X ");
                        System.out.println("   |   |   ");
                        System.out.println("---+---+---");
                        System.out.println("   |   |   ");
                        System.out.println(" O | X |   ");
                        System.out.println("   |   |   ");
                        System.out.println("---+---+---");
                        System.out.println("   |   |   ");
                        System.out.println(" O | X | X ");
                        System.out.println("   |   |   ");
                        System.out.println("The computer wins!");
                        System.exit(0);
                    }
                    if (move == 5) {

                        System.out.println("   |   |   ");
                        System.out.println(" O | O | X ");
                        System.out.println("   |   |   ");
                        System.out.println("---+---+---");
                        System.out.println("   |   |   ");
                        System.out.println(" O | X | X ");
                        System.out.println("   |   |   ");
                        System.out.println("---+---+---");
                        System.out.println("   |   |   ");
                        System.out.println(" O | X | X ");
                        System.out.println("   |   |   ");
                        System.out.println("You win!");
                        System.exit(0);
                    }
                }
                if (move == 3) {

                    System.out.println("   |   |   ");
                    System.out.println(" O | O |   ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X |   |   ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println("   | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("O moves on the top-right space.");

                    System.out.println("   |   |   ");
                    System.out.println(" O | O | O ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X |   |   ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println("   | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("The computer wins!");
                    System.exit(0);
                }
                if (move == 4) {

                    System.out.println("   |   |   ");
                    System.out.println(" O | O | O ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | X |   ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println("   | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("O moves on the right space.");

                    System.out.println("   |   |   ");
                    System.out.println(" O | O | O ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | X | O ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println("   | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("The computer wins!");
                    System.exit(0);
                }
                if (move == 6) {

                    System.out.println("   |   |   ");
                    System.out.println(" O | O | O ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | X | O ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("You win!");
                    System.exit(0);
                }
            }
        }
        if (move == 8) {

            System.out.println("   |   |   ");
            System.out.println("   |   |   ");
            System.out.println("   |   |   ");
            System.out.println("---+---+---");
            System.out.println("   |   |   ");
            System.out.println("   |   |   ");
            System.out.println("   |   |   ");
            System.out.println("---+---+---");
            System.out.println("   |   |   ");
            System.out.println("   |   | X ");
            System.out.println("   |   |   ");
            System.out.println("O moves on the top-left space.");

            System.out.println("   |   |   ");
            System.out.println(" O |   |   ");
            System.out.println("   |   |   ");
            System.out.println("---+---+---");
            System.out.println("   |   |   ");
            System.out.println("   |   |   ");
            System.out.println("   |   |   ");
            System.out.println("---+---+---");
            System.out.println("   |   |   ");
            System.out.println("   |   | X ");
            System.out.println("   |   |   ");

            System.out.println("Enter the number of your move");
            System.out.println("0|1|2");
            System.out.println("-+-+-");
            System.out.println("3|4|5");
            System.out.println("-+-+-");
            System.out.println("6|7|8");
            move = Integer.parseInt(in.nextLine());
            
            if (move == 1) {

                System.out.println("   |   |   ");
                System.out.println(" O | X |   ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println("   |   |   ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println("   |   | X ");
                System.out.println("   |   |   ");
                System.out.println("O moves on the left space.");

                System.out.println("   |   |   ");
                System.out.println(" O | X |   ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println(" O |   |   ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println("   |   | X ");
                System.out.println("   |   |   ");

                System.out.println("Enter the number of your move");
                System.out.println("0|1|2");
                System.out.println("-+-+-");
                System.out.println("3|4|5");
                System.out.println("-+-+-");
                System.out.println("6|7|8");
                move = Integer.parseInt(in.nextLine());
                
                if (move == 2) {

                    System.out.println("   |   |   ");
                    System.out.println(" O | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" O |   |   ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println("   |   | X ");
                    System.out.println("   |   |   ");
                    System.out.println("O moves on the bottom-left space.");

                    System.out.println("   |   |   ");
                    System.out.println(" O | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" O |   |   ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" O |   | X ");
                    System.out.println("   |   |   ");
                    System.out.println("The computer wins!");
                    System.exit(0);
                }
                if (move == 4) {

                    System.out.println("   |   |   ");
                    System.out.println(" O | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" O | X |   ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" O |   | X ");
                    System.out.println("   |   |   ");
                    System.out.println("O moves on the right space.");

                    System.out.println("   |   |   ");
                    System.out.println(" O | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" O | X | O ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" O |   | X ");
                    System.out.println("   |   |   ");
                    System.out.println("The computer wins!");
                    System.exit(0);
                }
                if (move == 7) {

                    System.out.println("   |   |   ");
                    System.out.println(" O | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" O | X | O ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" O | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("You win!");
                    System.exit(0);
                }
            }
            if (move == 2) {

                System.out.println("   |   |   ");
                System.out.println(" O |   | X ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println("   |   |   ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println("   |   | X ");
                System.out.println("   |   |   ");
                System.out.println("O moves on the left space.");

                System.out.println("   |   |   ");
                System.out.println(" O |   | X ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println(" O |   |   ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println("   |   | X ");
                System.out.println("   |   |   ");

                System.out.println("Enter the number of your move");
                System.out.println("0|1|2");
                System.out.println("-+-+-");
                System.out.println("3|4|5");
                System.out.println("-+-+-");
                System.out.println("6|7|8");
                move = Integer.parseInt(in.nextLine());
                
                if (move == 1) {

                    System.out.println("   |   |   ");
                    System.out.println(" O | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" O |   |   ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println("   |   | X ");
                    System.out.println("   |   |   ");
                    System.out.println("O moves on the bottom-left space.");

                    System.out.println("   |   |   ");
                    System.out.println(" O | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" O |   |   ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" O |   | X ");
                    System.out.println("   |   |   ");
                    System.out.println("The computer wins!");
                    System.exit(0);
                }
                if (move == 4) {

                    System.out.println("   |   |   ");
                    System.out.println(" O | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" O | X |   ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" O |   | X ");
                    System.out.println("   |   |   ");
                    System.out.println("O moves on the right space.");

                    System.out.println("   |   |   ");
                    System.out.println(" O | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" O | X | O ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" O |   | X ");
                    System.out.println("   |   |   ");
                    System.out.println("The computer wins!");
                    System.exit(0);
                }
                if (move == 7) {

                    System.out.println("   |   |   ");
                    System.out.println(" O | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" O | X | O ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" O | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("You win!");
                    System.exit(0);
                }
            }
            if (move == 3) {

                System.out.println("   |   |   ");
                System.out.println(" O |   |   ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println(" X |   |   ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println("   |   | X ");
                System.out.println("   |   |   ");
                System.out.println("O moves on the top space.");

                System.out.println("   |   |   ");
                System.out.println(" O | O |   ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println(" X |   |   ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println("   |   | X ");
                System.out.println("   |   |   ");

                System.out.println("Enter the number of your move");
                System.out.println("0|1|2");
                System.out.println("-+-+-");
                System.out.println("3|4|5");
                System.out.println("-+-+-");
                System.out.println("6|7|8");
                move = Integer.parseInt(in.nextLine());
                
                if (move == 2) {

                    System.out.println("   |   |   ");
                    System.out.println(" O | O | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X |   |   ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println("   |   | X ");
                    System.out.println("   |   |   ");
                    System.out.println("O moves on the center space.");

                    System.out.println("   |   |   ");
                    System.out.println(" O | O | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | O |   ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println("   |   | X ");
                    System.out.println("   |   |   ");

                    System.out.println("Enter the number of your move");
                    System.out.println("0|1|2");
                    System.out.println("-+-+-");
                    System.out.println("3|4|5");
                    System.out.println("-+-+-");
                    System.out.println("6|7|8");
                    move = Integer.parseInt(in.nextLine());
                    
                    if (move == 5) {

                        System.out.println("   |   |   ");
                        System.out.println(" O | O | X ");
                        System.out.println("   |   |   ");
                        System.out.println("---+---+---");
                        System.out.println("   |   |   ");
                        System.out.println(" X | O | X ");
                        System.out.println("   |   |   ");
                        System.out.println("---+---+---");
                        System.out.println("   |   |   ");
                        System.out.println("   |   | X ");
                        System.out.println("   |   |   ");
                        System.out.println("You win!");
                        System.exit(0);
                    }
                    if (move == 6) {

                        System.out.println("   |   |   ");
                        System.out.println(" O | O | X ");
                        System.out.println("   |   |   ");
                        System.out.println("---+---+---");
                        System.out.println("   |   |   ");
                        System.out.println(" X | O | X ");
                        System.out.println("   |   |   ");
                        System.out.println("---+---+---");
                        System.out.println("   |   |   ");
                        System.out.println(" X |   | X ");
                        System.out.println("   |   |   ");
                        System.out.println("You win!");
                        System.exit(0);
                    }
                    if (move == 7) {

                        System.out.println("   |   |   ");
                        System.out.println(" O | O | X ");
                        System.out.println("   |   |   ");
                        System.out.println("---+---+---");
                        System.out.println("   |   |   ");
                        System.out.println(" X | O | X ");
                        System.out.println("   |   |   ");
                        System.out.println("---+---+---");
                        System.out.println("   |   |   ");
                        System.out.println(" X | X | X ");
                        System.out.println("   |   |   ");
                        System.out.println("You win!");
                        System.exit(0);
                    }
                }
                if (move == 4) {

                    System.out.println("   |   |   ");
                    System.out.println(" O | O |   ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | X |   ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println("   |   | X ");
                    System.out.println("   |   |   ");
                    System.out.println("O moves on the top-right space.");

                    System.out.println("   |   |   ");
                    System.out.println(" O | O | O ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | X |   ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println("   |   | X ");
                    System.out.println("   |   |   ");
                    System.out.println("The computer wins!");
                    System.exit(0);
                }
                if (move == 5) {

                    System.out.println("   |   |   ");
                    System.out.println(" O | O | O ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println("   |   | X ");
                    System.out.println("   |   |   ");
                    System.out.println("You win!");
                    System.exit(0);
                }
                if (move == 6) {

                    System.out.println("   |   |   ");
                    System.out.println(" O | O | O ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X |   | X ");
                    System.out.println("   |   |   ");
                    System.out.println("You win!");
                    System.exit(0);
                }
                if (move == 7) {

                    System.out.println("   |   |   ");
                    System.out.println(" O | O | O ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("You win!");
                    System.exit(0);
                }
            }
            if (move == 4) {

                System.out.println("   |   |   ");
                System.out.println(" O |   |   ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println("   | X |   ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println("   |   | X ");
                System.out.println("   |   |   ");
                System.out.println("O moves on the top space.");

                System.out.println("   |   |   ");
                System.out.println(" O | O |   ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println("   | X |   ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println("   |   | X ");
                System.out.println("   |   |   ");

                System.out.println("Enter the number of your move");
                System.out.println("0|1|2");
                System.out.println("-+-+-");
                System.out.println("3|4|5");
                System.out.println("-+-+-");
                System.out.println("6|7|8");
                move = Integer.parseInt(in.nextLine());
                
                if (move == 2) {

                    System.out.println("   |   |   ");
                    System.out.println(" O | O | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println("   | X |   ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println("   |   | X ");
                    System.out.println("   |   |   ");
                    System.out.println("O moves on the left space.");

                    System.out.println("   |   |   ");
                    System.out.println(" O | O | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" O | X |   ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println("   |   | X ");
                    System.out.println("   |   |   ");

                    System.out.println("Enter the number of your move");
                    System.out.println("0|1|2");
                    System.out.println("-+-+-");
                    System.out.println("3|4|5");
                    System.out.println("-+-+-");
                    System.out.println("6|7|8");
                    move = Integer.parseInt(in.nextLine());
                    
                    if (move == 5) {

                        System.out.println("   |   |   ");
                        System.out.println(" O | O | X ");
                        System.out.println("   |   |   ");
                        System.out.println("---+---+---");
                        System.out.println("   |   |   ");
                        System.out.println(" O | X | X ");
                        System.out.println("   |   |   ");
                        System.out.println("---+---+---");
                        System.out.println("   |   |   ");
                        System.out.println("   |   | X ");
                        System.out.println("   |   |   ");
                        System.out.println("You win!");
                        System.exit(0);
                    }
                    if (move == 6) {

                        System.out.println("   |   |   ");
                        System.out.println(" O | O | X ");
                        System.out.println("   |   |   ");
                        System.out.println("---+---+---");
                        System.out.println("   |   |   ");
                        System.out.println(" O | X | X ");
                        System.out.println("   |   |   ");
                        System.out.println("---+---+---");
                        System.out.println("   |   |   ");
                        System.out.println(" X |   | X ");
                        System.out.println("   |   |   ");
                        System.out.println("You win!");
                        System.exit(0);
                    }
                    if (move == 7) {

                        System.out.println("   |   |   ");
                        System.out.println(" O | O | X ");
                        System.out.println("   |   |   ");
                        System.out.println("---+---+---");
                        System.out.println("   |   |   ");
                        System.out.println(" O | X | X ");
                        System.out.println("   |   |   ");
                        System.out.println("---+---+---");
                        System.out.println("   |   |   ");
                        System.out.println(" X | X | X ");
                        System.out.println("   |   |   ");
                        System.out.println("You win!");
                        System.exit(0);
                    }
                }
                if (move == 3) {

                    System.out.println("   |   |   ");
                    System.out.println(" O | O |   ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | X |   ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println("   |   | X ");
                    System.out.println("   |   |   ");
                    System.out.println("O moves on the top-right space.");

                    System.out.println("   |   |   ");
                    System.out.println(" O | O | O ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | X |   ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println("   |   | X ");
                    System.out.println("   |   |   ");
                    System.out.println("The computer wins!");
                    System.exit(0);
                }
                if (move == 5) {

                    System.out.println("   |   |   ");
                    System.out.println(" O | O | O ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println("   |   | X ");
                    System.out.println("   |   |   ");
                    System.out.println("You win!");
                    System.exit(0);
                }
                if (move == 6) {

                    System.out.println("   |   |   ");
                    System.out.println(" O | O | O ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X |   | X ");
                    System.out.println("   |   |   ");
                    System.out.println("You win!");
                    System.exit(0);
                }
                if (move == 7) {

                    System.out.println("   |   |   ");
                    System.out.println(" O | O | O ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("You win!");
                    System.exit(0);
                }
            }
            if (move == 5) {

                System.out.println("   |   |   ");
                System.out.println(" O |   |   ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println("   |   | X ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println("   |   | X ");
                System.out.println("   |   |   ");
                System.out.println("O moves on the top space.");

                System.out.println("   |   |   ");
                System.out.println(" O | O |   ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println("   |   | X ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println("   |   | X ");
                System.out.println("   |   |   ");

                System.out.println("Enter the number of your move");
                System.out.println("0|1|2");
                System.out.println("-+-+-");
                System.out.println("3|4|5");
                System.out.println("-+-+-");
                System.out.println("6|7|8");
                move = Integer.parseInt(in.nextLine());
                
                if (move == 2) {

                    System.out.println("   |   |   ");
                    System.out.println(" O | O | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println("   |   | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println("   |   | X ");
                    System.out.println("   |   |   ");
                    System.out.println("You win!");
                    System.exit(0);
                }
                if (move == 3) {

                    System.out.println("   |   |   ");
                    System.out.println(" O | O | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X |   | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println("   |   | X ");
                    System.out.println("   |   |   ");
                    System.out.println("You win!");
                    System.exit(0);
                }
                if (move == 4) {

                    System.out.println("   |   |   ");
                    System.out.println(" O | O | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println("   |   | X ");
                    System.out.println("   |   |   ");
                    System.out.println("You win!");
                    System.exit(0);
                }
                if (move == 6) {

                    System.out.println("   |   |   ");
                    System.out.println(" O | O | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X |   | X ");
                    System.out.println("   |   |   ");
                    System.out.println("You win!");
                    System.exit(0);
                }
                if (move == 7) {

                    System.out.println("   |   |   ");
                    System.out.println(" O | O | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("You win!");
                    System.exit(0);
                }
            }
            if (move == 6) {

                System.out.println("   |   |   ");
                System.out.println(" O |   |   ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println("   |   |   ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println(" X |   | X ");
                System.out.println("   |   |   ");
                System.out.println("O moves on the top space.");

                System.out.println("   |   |   ");
                System.out.println(" O | O |   ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println("   |   |   ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println(" X |   | X ");
                System.out.println("   |   |   ");

                System.out.println("Enter the number of your move");
                System.out.println("0|1|2");
                System.out.println("-+-+-");
                System.out.println("3|4|5");
                System.out.println("-+-+-");
                System.out.println("6|7|8");
                move = Integer.parseInt(in.nextLine());
                
                if (move == 2) {

                    System.out.println("   |   |   ");
                    System.out.println(" O | O | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println("   |   |   ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X |   | X ");
                    System.out.println("   |   |   ");
                    System.out.println("O moves on the center space.");

                    System.out.println("   |   |   ");
                    System.out.println(" O | O | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println("   | O |   ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X |   | X ");
                    System.out.println("   |   |   ");

                    System.out.println("Enter the number of your move");
                    System.out.println("0|1|2");
                    System.out.println("-+-+-");
                    System.out.println("3|4|5");
                    System.out.println("-+-+-");
                    System.out.println("6|7|8");
                    move = Integer.parseInt(in.nextLine());
                    
                    if (move == 3) {

                        System.out.println("   |   |   ");
                        System.out.println(" O | O | X ");
                        System.out.println("   |   |   ");
                        System.out.println("---+---+---");
                        System.out.println("   |   |   ");
                        System.out.println(" X | O |   ");
                        System.out.println("   |   |   ");
                        System.out.println("---+---+---");
                        System.out.println("   |   |   ");
                        System.out.println(" X |   | X ");
                        System.out.println("   |   |   ");
                        System.out.println("O moves on the bottom space.");

                        System.out.println("   |   |   ");
                        System.out.println(" O | O | X ");
                        System.out.println("   |   |   ");
                        System.out.println("---+---+---");
                        System.out.println("   |   |   ");
                        System.out.println(" X | O |   ");
                        System.out.println("   |   |   ");
                        System.out.println("---+---+---");
                        System.out.println("   |   |   ");
                        System.out.println(" X | O | X ");
                        System.out.println("   |   |   ");
                        System.out.println("The computer wins!");
                        System.exit(0);
                    }
                    if (move == 5) {

                        System.out.println("   |   |   ");
                        System.out.println(" O | O | X ");
                        System.out.println("   |   |   ");
                        System.out.println("---+---+---");
                        System.out.println("   |   |   ");
                        System.out.println(" X | O | X ");
                        System.out.println("   |   |   ");
                        System.out.println("---+---+---");
                        System.out.println("   |   |   ");
                        System.out.println(" X | O | X ");
                        System.out.println("   |   |   ");
                        System.out.println("You win!");
                        System.exit(0);
                    }
                }
                if (move == 3) {

                    System.out.println("   |   |   ");
                    System.out.println(" O | O |   ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X |   |   ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X |   | X ");
                    System.out.println("   |   |   ");
                    System.out.println("O moves on the top-right space.");

                    System.out.println("   |   |   ");
                    System.out.println(" O | O | O ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X |   |   ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X |   | X ");
                    System.out.println("   |   |   ");
                    System.out.println("The computer wins!");
                    System.exit(0);
                }
                if (move == 4) {

                    System.out.println("   |   |   ");
                    System.out.println(" O | O | O ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | X |   ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X |   | X ");
                    System.out.println("   |   |   ");
                    System.out.println("O moves on the right space.");

                    System.out.println("   |   |   ");
                    System.out.println(" O | O | O ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | X | O ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X |   | X ");
                    System.out.println("   |   |   ");
                    System.out.println("The computer wins!");
                    System.exit(0);
                }
                if (move == 7) {

                    System.out.println("   |   |   ");
                    System.out.println(" O | O | O ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | X | O ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("You win!");
                    System.exit(0);
                }
            }
            if (move == 7) {

                System.out.println("   |   |   ");
                System.out.println(" O |   |   ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println("   |   |   ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println("   | X | X ");
                System.out.println("   |   |   ");
                System.out.println("O moves on the top space.");

                System.out.println("   |   |   ");
                System.out.println(" O | O |   ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println("   |   |   ");
                System.out.println("   |   |   ");
                System.out.println("---+---+---");
                System.out.println("   |   |   ");
                System.out.println("   | X | X ");
                System.out.println("   |   |   ");

                System.out.println("Enter the number of your move");
                System.out.println("0|1|2");
                System.out.println("-+-+-");
                System.out.println("3|4|5");
                System.out.println("-+-+-");
                System.out.println("6|7|8");
                move = Integer.parseInt(in.nextLine());
                
                if (move == 2) {

                    System.out.println("   |   |   ");
                    System.out.println(" O | O | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println("   |   |   ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println("   | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("O moves on the left space.");

                    System.out.println("   |   |   ");
                    System.out.println(" O | O | X ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" O |   |   ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println("   | X | X ");
                    System.out.println("   |   |   ");

                    System.out.println("Enter the number of your move");
                    System.out.println("0|1|2");
                    System.out.println("-+-+-");
                    System.out.println("3|4|5");
                    System.out.println("-+-+-");
                    System.out.println("6|7|8");
                    move = Integer.parseInt(in.nextLine());
                    
                    if (move == 4) {

                        System.out.println("   |   |   ");
                        System.out.println(" O | O | X ");
                        System.out.println("   |   |   ");
                        System.out.println("---+---+---");
                        System.out.println("   |   |   ");
                        System.out.println(" O | X |   ");
                        System.out.println("   |   |   ");
                        System.out.println("---+---+---");
                        System.out.println("   |   |   ");
                        System.out.println("   | X | X ");
                        System.out.println("   |   |   ");
                        System.out.println("O moves on the bottom-left space.");

                        System.out.println("   |   |   ");
                        System.out.println(" O | O | X ");
                        System.out.println("   |   |   ");
                        System.out.println("---+---+---");
                        System.out.println("   |   |   ");
                        System.out.println(" O | X |   ");
                        System.out.println("   |   |   ");
                        System.out.println("---+---+---");
                        System.out.println("   |   |   ");
                        System.out.println(" O | X | X ");
                        System.out.println("   |   |   ");
                        System.out.println("The computer wins!");
                        System.exit(0);
                    }
                    if (move == 5) {

                        System.out.println("   |   |   ");
                        System.out.println(" O | O | X ");
                        System.out.println("   |   |   ");
                        System.out.println("---+---+---");
                        System.out.println("   |   |   ");
                        System.out.println(" O | X | X ");
                        System.out.println("   |   |   ");
                        System.out.println("---+---+---");
                        System.out.println("   |   |   ");
                        System.out.println(" O | X | X ");
                        System.out.println("   |   |   ");
                        System.out.println("You win!");
                        System.exit(0);
                    }
                }
                if (move == 3) {

                    System.out.println("   |   |   ");
                    System.out.println(" O | O |   ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X |   |   ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println("   | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("O moves on the top-right space.");

                    System.out.println("   |   |   ");
                    System.out.println(" O | O | O ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X |   |   ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println("   | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("The computer wins!");
                    System.exit(0);
                }
                if (move == 4) {

                    System.out.println("   |   |   ");
                    System.out.println(" O | O | O ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | X |   ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println("   | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("O moves on the right space.");

                    System.out.println("   |   |   ");
                    System.out.println(" O | O | O ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | X | O ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println("   | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("The computer wins!");
                    System.exit(0);
                }
                if (move == 6) {

                    System.out.println("   |   |   ");
                    System.out.println(" O | O | O ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | X | O ");
                    System.out.println("   |   |   ");
                    System.out.println("---+---+---");
                    System.out.println("   |   |   ");
                    System.out.println(" X | X | X ");
                    System.out.println("   |   |   ");
                    System.out.println("You win!");
                    System.exit(0);
                }
            }
        }
    }
}

package com.tictactoe.generator;

public class Messages {

    public static final String[] computerMoveMessages = new String[]{
            "\"O moves on the top-left space.\"",
            "\"O moves on the top space.\"",
            "\"O moves on the top-right space.\"",
            "\"O moves on the left space.\"",
            "\"O moves on the center space.\"",
            "\"O moves on the right space.\"",
            "\"O moves on the bottom-left space.\"",
            "\"O moves on the bottom space.\"",
            "\"O moves on the bottom-right space.\"",
            };
    public static final String boardTemplate = "\nSystem.out.println(\"   |   |   \");" +
                                               "\nSystem.out.println(\" %s | %s | %s \");" +
                                               "\nSystem.out.println(\"   |   |   \");" +
                                               "\nSystem.out.println(\"---+---+---\");" +
                                               "\nSystem.out.println(\"   |   |   \");" +
                                               "\nSystem.out.println(\" %s | %s | %s \");" +
                                               "\nSystem.out.println(\"   |   |   \");" +
                                               "\nSystem.out.println(\"---+---+---\");" +
                                               "\nSystem.out.println(\"   |   |   \");" +
                                               "\nSystem.out.println(\" %s | %s | %s \");" +
                                               "\nSystem.out.println(\"   |   |   \");";

    public static final String start = "import java.util.Scanner;\n" +
                                       "\n" +
                                       "public class TicTacToe {\n" +
                                       "    private static int move = -1;\n" +
                                       "    private static Scanner in = new Scanner(System.in);\n\n" +
                                       "    public static void main(String[] args) {\n" +
                                       "        System.out.println(\"Welcome to Tic Tac Toe!\");\n" +
                                       "        System.out.println(\"You're playing as X\");";


    public static final String message = "\nSystem.out.println(\"Enter the number of your move\");" +
                                         "\nSystem.out.println(\"0|1|2\");" +
                                         "\nSystem.out.println(\"-+-+-\");" +
                                         "\nSystem.out.println(\"3|4|5\");" +
                                         "\nSystem.out.println(\"-+-+-\");" +
                                         "\nSystem.out.println(\"6|7|8\");" +
                                         "\n\nmove = Integer.parseInt(in.nextLine());" +
                                         "\n";


}

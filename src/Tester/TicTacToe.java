package Tester;
import java.util.*;

public class TicTacToe {
    static ArrayList<Integer> playerPositions = new ArrayList<>();
    static ArrayList<Integer> CPUPositions = new ArrayList<>();

    public static void main(String[] args){
        char[] [] gameBoard= {{' ', '|', ' ', '|', ' '},
                {'-', '+', '-', '+', '-'},
                {' ', '|', ' ', '|', ' '},
                {'-', '+', '-', '+', '-'},
                {' ', '|', ' ', '|', ' '}};
        printGameBoard(gameBoard);

        while (true){
            Scanner sc = new Scanner(System.in);

            System.out.println("Entre com sua jogada(1-9): ");
            int playerPosition = sc.nextInt();
            while (playerPositions.contains(playerPosition) || CPUPositions.contains(playerPositions)){
                System.out.println("Posição usada! Entre com outra: ");
                playerPosition = sc.nextInt();
            }

            placePiece(gameBoard, playerPosition, "Player");

            String result = checkWinner();
            if(result.length() > 0) {
                System.out.println(result);
                break;
            }

            //Jogada aleatória da "cpu"
            Random rand = new Random();
            int cpuPosition = rand.nextInt(9) + 1;
            while (playerPositions.contains(cpuPosition) || CPUPositions.contains(cpuPosition)){
                //System.out.println("Posição usada! Entre com outra: ");
                cpuPosition = sc.nextInt(9) + 1;
            }

            placePiece(gameBoard, cpuPosition, "CPU");


            printGameBoard(gameBoard);

            result = checkWinner();
            if(result.length() > 0) {
                System.out.println(result);
                break;
            }
        }

    }

    public static void printGameBoard(char[][] gameBoard){
        for (char[] row : gameBoard) {
            for (char c : row){
                System.out.print(c);
            }
            System.out.println();
        }
    }
    public static void placePiece(char[][] gameBoard, int position, String user){
        char symbol = ' ';

        if(user.equals("Player")){
            symbol = 'X';
            playerPositions.add(position);
        } else if(user.equals("CPU")){
            symbol = 'O';
            CPUPositions.add(position);
        }

        switch (position){
            case 1:
                gameBoard[0][0] = symbol;
                break;
            case 2:
                gameBoard[0][2] = symbol;
                break;
            case 3:
                gameBoard[0][4] = symbol;
                break;
            case 4:
                gameBoard[2][0] = symbol;
                break;
            case 5:
                gameBoard[2][2] = symbol;
                break;
            case 6:
                gameBoard[2][4] = symbol;
                break;
            case 7:
                gameBoard[4][0] = symbol;
                break;
            case 8:
                gameBoard[4][2] = symbol;
                break;
            case 9:
                gameBoard[4][4] = symbol;
                break;
            default:
                break;
        }
    }
    public static String checkWinner(){
        List topRow = Arrays.asList(1, 2, 3);
        List midRow = Arrays.asList(4, 5, 6);
        List botRow = Arrays.asList(7, 8, 9);
        List leftCol = Arrays.asList(1, 4, 7);
        List midCol = Arrays.asList(2, 5, 8);
        List rigthCol = Arrays.asList(3, 6, 9);
        List cross1 = Arrays.asList(1, 5, 9);
        List cross2 = Arrays.asList(7, 5, 3);

        List<List> winning = new ArrayList<>();
        winning.add(topRow);
        winning.add(midRow);
        winning.add(botRow);
        winning.add(leftCol);
        winning.add(midCol);
        winning.add(rigthCol);
        winning.add(cross1);
        winning.add(cross2);

        for(List l : winning){
            if(playerPositions.containsAll(l)){
                return "VOCÊ GANHOU!";
            } else if (CPUPositions.containsAll(l)) {
                return "CPU venceu!";
            } else if (playerPositions.size() + CPUPositions.size() == 9) {
                return "Empate!";
            }
        }

        return "";
    }
}

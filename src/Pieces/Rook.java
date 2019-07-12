package Pieces;

import GameBoard.GameBoard;

import java.util.ArrayList;
import java.util.List;

public class Rook implements Piece{
    String square;
    List<String> listMovements;
    public Rook(String square){
        this.square = square;
        this.listMovements = new ArrayList<>();
    }

    public List<String> getListMovements() {
        return listMovements;
    }

    public String formatResult() {
        return null;
    }

    public String toString(){
        return square;
    }

    private static String transformValuetoSquare(int horizontalValue, int verticalValue){
        String charValue = ((char) (horizontalValue + 98))+ "";
        int newVerticalValue = verticalValue + 1;
        return charValue + newVerticalValue;
    }

    public List<String> movePieceInBoard(GameBoard gameBoard) {
        String[] splitSquare = this.square.split("");
        int verticalValue = Integer.parseInt(splitSquare[1]) - 1;
        int horizontalValue = (int) splitSquare[0].charAt(0) - 98;

        System.out.println(transformValuetoSquare(horizontalValue, verticalValue));
        System.out.println(verticalValue);
        System.out.println(horizontalValue);
        // Moving to Right
        for(int i = horizontalValue + 1 ; i < 8 ; i++){
            if(gameBoard.getDataBoard().get(transformValuetoSquare(i, verticalValue)) != null){
                break;
            }
            this.listMovements.add("T"+this.square + "-" + transformValuetoSquare(i, verticalValue));
        }

        // Moving to Left
        for(int i = horizontalValue - 1 ; i >= 0 ; i--){
            if(gameBoard.getDataBoard().get(transformValuetoSquare(i, verticalValue)) != null){
                break;
            }
            this.listMovements.add("T"+this.square + "-" + transformValuetoSquare(i, verticalValue));
        }
        // Moving to Down
        for(int i = verticalValue - 1 ; i >= 0 ; i--){
            if(gameBoard.getDataBoard().get(transformValuetoSquare(horizontalValue, i )) != null){
                break;
            }
            this.listMovements.add("T"+this.square + "-" + transformValuetoSquare(horizontalValue, i));
        }

        // Moving to Up
        for(int i = verticalValue + 1 ; i < 8 ; i++){
            if(gameBoard.getDataBoard().get(transformValuetoSquare(horizontalValue, i)) != null){
                break;
            }
            this.listMovements.add("T"+this.square + "-" + transformValuetoSquare(horizontalValue, i));
        }


        return this.listMovements;
    }
}

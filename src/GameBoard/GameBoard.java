package GameBoard;


import Pieces.Piece;

import java.util.HashMap;
import java.util.Map;

public class GameBoard {

    public GameBoard(){
        dataBoard = new HashMap<String, Piece>(){{
            for(int i = 1 ; i <= 8 ; i++){
                for(int j = 97 ; j <=  104; j++){
                    String horizontal = (char) j + "";
                    put(horizontal + i, null);
                }
            }
        }};
    }

    public Map<String, Piece> getDataBoard(){
        return this.dataBoard;
    }

    // We Can add players in the Game ...

    private  Map<String, Piece> dataBoard;

    public void putPieceToSquare(String square, Piece piece){
        this.dataBoard.put(square, piece);
    }

    public void initializeBoard(){

    }

    public void updateBoard(){

    }

}

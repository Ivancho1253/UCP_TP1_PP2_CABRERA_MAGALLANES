package com.example;

public class PieceT 
            extends Piece{

    public PieceT() {
        
        int [][] forma = {

            {1, 1, 1},
            {0, 1, 0},
            {0, 0, 0}
        };
        
        setForma(forma);
    }

    public PieceT(boolean existencia, int [][] forma){
        super(existencia, forma);
    }  
}

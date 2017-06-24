package other;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import pieces.Piece;

public class Board
{
    private static final int boardDimension = 8;
    
    private static Board board = new Board();
    
    private List<List<Tile>> grid;
    private Map<Piece, List<Tile>> tileChecks;
    
    private Board()
    {
        grid = new ArrayList<>();
        for (int i = 0; i < boardDimension; ++i)
        {
            grid.add(new ArrayList<>());
            for (int j = 0; j < boardDimension; ++j)
                grid.get(i).add(new Tile(i, j));
        }
        
        tileChecks = new HashMap<>();
        
        setup();
    }
    
    public static Board getInstance()
    {
        return board;
    }
    
    public void registerPiece(Piece piece)
    {
        tileChecks.put(piece, new ArrayList<>());
    }
    
    private void setup()
    {
        PieceFactory pieceFactory = new PieceFactory();
        
        Player white = new Player();
        Player black = new Player();
        
        registerPiece(pieceFactory.getPiece(PieceType.ROOK).setOwner(white));
        registerPiece(pieceFactory.getPiece(PieceType.KNIGHT).setOwner(white));
        registerPiece(pieceFactory.getPiece(PieceType.BISHOP).setOwner(white));
        registerPiece(pieceFactory.getPiece(PieceType.QUEEN).setOwner(white));
        registerPiece(pieceFactory.getPiece(PieceType.KING).setOwner(white));
        registerPiece(pieceFactory.getPiece(PieceType.BISHOP).setOwner(white));
        registerPiece(pieceFactory.getPiece(PieceType.KNIGHT).setOwner(white));
        registerPiece(pieceFactory.getPiece(PieceType.ROOK).setOwner(white));
        
        registerPiece(pieceFactory.getPiece(PieceType.PAWN).setOwner(white));
        registerPiece(pieceFactory.getPiece(PieceType.PAWN).setOwner(white));
        registerPiece(pieceFactory.getPiece(PieceType.PAWN).setOwner(white));
        registerPiece(pieceFactory.getPiece(PieceType.PAWN).setOwner(white));
        registerPiece(pieceFactory.getPiece(PieceType.PAWN).setOwner(white));
        registerPiece(pieceFactory.getPiece(PieceType.PAWN).setOwner(white));
        registerPiece(pieceFactory.getPiece(PieceType.PAWN).setOwner(white));
        registerPiece(pieceFactory.getPiece(PieceType.PAWN).setOwner(white));
        
        
        registerPiece(pieceFactory.getPiece(PieceType.ROOK).setOwner(black));
        registerPiece(pieceFactory.getPiece(PieceType.KNIGHT).setOwner(black));
        registerPiece(pieceFactory.getPiece(PieceType.BISHOP).setOwner(black));
        registerPiece(pieceFactory.getPiece(PieceType.QUEEN).setOwner(black));
        registerPiece(pieceFactory.getPiece(PieceType.KING).setOwner(black));
        registerPiece(pieceFactory.getPiece(PieceType.BISHOP).setOwner(black));
        registerPiece(pieceFactory.getPiece(PieceType.KNIGHT).setOwner(black));
        registerPiece(pieceFactory.getPiece(PieceType.ROOK).setOwner(black));
        
        registerPiece(pieceFactory.getPiece(PieceType.PAWN).setOwner(black));
        registerPiece(pieceFactory.getPiece(PieceType.PAWN).setOwner(black));
        registerPiece(pieceFactory.getPiece(PieceType.PAWN).setOwner(black));
        registerPiece(pieceFactory.getPiece(PieceType.PAWN).setOwner(black));
        registerPiece(pieceFactory.getPiece(PieceType.PAWN).setOwner(black));
        registerPiece(pieceFactory.getPiece(PieceType.PAWN).setOwner(black));
        registerPiece(pieceFactory.getPiece(PieceType.PAWN).setOwner(black));
        registerPiece(pieceFactory.getPiece(PieceType.PAWN).setOwner(black));
    }
}
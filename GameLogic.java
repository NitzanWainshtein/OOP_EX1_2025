import java.util.List;

public class GameLogic implements PlayableLogic {
    final private int BOARDSIZE = 8;
    private Player player1, player2;
    private Disc[][] gameBoard = new Disc[8][8];
    private boolean isFirstPturn = true;

    @Override
    public boolean locate_disc(Position a, Disc disc) {
        int arow = a.row();
        int acol = a.col();
        if (arow < 0 || arow >= 8 || acol >= 8 || acol < 0) {
            return false;
        }
        if (gameBoard[arow][acol] != null) {
            return false;
        }
        gameBoard[arow][acol] = disc;
        return true;
    }


    @Override
    public Disc getDiscAtPosition(Position position) {
        int prow = position.row();
        int pcol = position.col();

        return null;
    }

    @Override
    public int getBoardSize() {
        return BOARDSIZE;
    }

    @Override
    public List<Position> ValidMoves() {
        return List.of();
    }

    @Override
    public int countFlips(Position a) {
        return 0;
    }

    @Override
    public Player getFirstPlayer() {
        return player1;
    }

    @Override
    public Player getSecondPlayer() {
        return player2;
    }

    @Override
    public void setPlayers(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;

    }

    @Override
    public boolean isFirstPlayerTurn() {
        return isFirstPturn;
    }

    @Override
    public boolean isGameFinished() {
        return false;
    }

    @Override
    public void reset() {
        gameBoard = new Disc[8][8];

    }

    @Override
    public void undoLastMove() {

    }
}

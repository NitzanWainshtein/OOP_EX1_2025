public class UnflippableDisc implements Disc {
    private Player discOwner;

    public UnflippableDisc(Player currentPlayer) {
        this.discOwner = currentPlayer;
    }

    @Override
    public Player getOwner() {
        return discOwner;
    }

    @Override
    public void setOwner(Player player) {
        this.discOwner = player;

    }

    @Override
    public String getType() {
        return "⭕";
    }
}

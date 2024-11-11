public class SimpleDisc implements Disc {
    private Player discOwner;

    public SimpleDisc(Player currentPlayer) {
        this.discOwner = currentPlayer;
    }

    @Override
    public Player getOwner() {
        return this.discOwner;
    }

    @Override
    public void setOwner(Player player) {
        this.discOwner = player;
    }

    @Override
    public String getType() {
        return "⬤";
    }
}

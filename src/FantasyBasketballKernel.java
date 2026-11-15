public interface FantasyBasketballKernel {

    public void addPlayer(Player toAdd);

    public Player removePlayer(Player toRemove);

    public Player removeAnyPlayer();

    public int numberOfPlayers();

    public boolean hasPlayer(Player p);
}
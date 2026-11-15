public interface FantasyBasketball extends FantasyBasketballKernel {
    public boolean isRosterComplete();

    public void removeInjuredPlayers();

    public void swapPlayer(Player p1, Player p2);

    public void tradePlayer(Player p1, FantasyBasketball otherRoster,
            Player p2);

    public int numberInRole(Role role);
}
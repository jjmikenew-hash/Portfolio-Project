public abstract class FantasyBasketballSecondary implements FantasyBasketball {

    @Override
    public boolean isRosterComplete() {
        final int REQUIRED_ROSTER_SIZE = 13;

        boolean hasRightSize = (this.numberOfPlayers() == REQUIRED_ROSTER_SIZE);
        boolean hasCenter = (this.numberInRole(Role.CENTER) >= 1);
        boolean hasPointGuard = (this.numberInRole(Role.POINT_GUARD) >= 1);

        return hasRightSize && hasCenter && hasPointGuard;
    }

    @Override
    public void removeInjuredPlayers() {
        Player[] healthyPlayers = new Player[this.numberOfPlayers()];
        int keptCount = 0;
        while (this.numberOfPlayers() > 0) {
            Player p = this.removeAnyPlayer();
            if (!p.isInjured()) {
                healthyPlayers[keptCount] = p;
                keptCount++;
            }
        }
        for (int i = 0; i < keptCount; i++) {
            this.addPlayer(healthyPlayers[i]);
        }
    }

    @Override
    public void swapPlayer(Player p1, Player p2) {
        this.removePlayer(p1);
        this.addPlayer(p2);
    }

    @Override
    public void tradePlayer(Player p1, FantasyBasketball otherRoster,
            Player p2) {
        Player myTradedPlayer = this.removePlayer(p1);
        Player theirTradedPlayer = otherRoster.removePlayer(p2);
        this.addPlayer(theirTradedPlayer);
        otherRoster.addPlayer(myTradedPlayer);
    }
}
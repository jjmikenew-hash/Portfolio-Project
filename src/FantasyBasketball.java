import java.util.Map;

import javax.swing.text.Position;

public class FantasyBasketball {

    private Map<Position, Player>[] roster;
    private int size;

    public FantasyBasketball() {
        this.size = 12;
        this.roster = new Map[this.size];
        for (int i = 0; i < this.roster; i++) {
            this.roster[i] = new components.map.Map1L<Position, Player>();
        }
    }

    /**
     * Precondition: there must be space for a player on roster
     *
     * @param role = position of player being added
     * @param name = name of player being added
     */
    private static void addPlayer(Position role, Player name)
    {
        this.add(role, name);
        this.add
    }

    /**
     * Precondition: the player must exist
     *
     * @param role
     *            = position of player being removed
     * @param name
     *            = name of player being removed
     */
    private static void removePlayer(Position role, Player name) {
        this.remove(role, name);
    }
}
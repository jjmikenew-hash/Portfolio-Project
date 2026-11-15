public class FantasyBasketball1 extends FantasyBasketballSecondary {

    private final class Node {
        private Player data;
        private Node next;
    }

    private Node preFront;

    private int length;

    private void createNewRep() {
        this.preFront = new Node();
        this.preFront.next = null;
        this.length = 0;
    }

    public FantasyBasketball1() {
        this.createNewRep();
    }

    @Override
    public void addPlayer(Player toAdd) {
        Node newNode = new Node();
        newNode.data = toAdd;
        newNode.next = this.preFront.next;

        this.preFront.next = newNode;
        this.length++;
    }

    @Override
    public Player removeAnyPlayer() {
        Node removedNode = this.preFront.next;
        this.preFront.next = removedNode.next;
        this.length--;
        return removedNode.data;
    }

    @Override
    public Player removePlayer(Player toRemove) {
        Node previous = this.preFront;
        Node current = this.preFront.next;

        while (current != null) {
            if (current.data.equals(toRemove)) {
                previous.next = current.next;
                this.length--;
                return current.data;
            }
            previous = current;
            current = current.next;
        }
        return null;
    }

    @Override
    public int numberOfPlayers() {
        return this.length;
    }

    @Override
    public boolean hasPlayer(Player p) {
        Node current = this.preFront.next;
        while (current != null) {
            if (current.data.equals(p)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    @Override
    public int numberInRole(Role role) {
        int count = 0;
        Node current = this.preFront.next;
        while (current != null) {
            if (current.data.getRole() == role) {
                count++;
            }
            current = current.next;
        }
        return count;
    }
}
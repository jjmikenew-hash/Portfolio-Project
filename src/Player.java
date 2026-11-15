public class Player {

    private String name;
    private Role role;
    private boolean isInjured;

    public Player(String name, Role role, boolean isInjured) {
        this.name = name;
        this.role = role;
        this.isInjured = isInjured;
    }

    public Role getRole() {
        return this.role;
    }

    public boolean isInjured() {
        return this.isInjured;
    }

    public String getName() {
        return this.name;
    }

    public void setInjured(boolean injured) {
        this.isInjured = injured;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        Player other = (Player) obj;
        return this.name.equals(other.name);
    }

    @Override
    public int hashCode() {
        return this.name.hashCode();
    }
}
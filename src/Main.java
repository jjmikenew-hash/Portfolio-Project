public class Main {
    public static void main(String[] args) {
        Player p = new Player("Lebron James", "76ers", "Yes");
        if (p.team().equals("Cavs")) {
            System.out.println(p);
        }
    }
    
}

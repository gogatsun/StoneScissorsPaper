public class Main {
    public static void main(String[] args) {
        System.out.println("Game: Stone Scissors Paper");
        int n = 5;
        for (int i = 1; i <= n; i++) {
            System.out.printf("\nGame: %d", i);
            Game.run();
        }
    }
}
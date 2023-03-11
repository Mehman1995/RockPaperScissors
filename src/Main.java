public class Main {
    public static void main(String[] args) {
         Player bot = new Player();
         Player Mehman = new Player("Mehman", RPS.SCISSORS);
        System.out.println(bot.whoWins(Mehman,bot));
    }
}
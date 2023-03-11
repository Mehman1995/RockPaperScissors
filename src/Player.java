import java.util.ArrayList;

public class Player {
    private String name;
    public RPS rps;

    public Player(String name, RPS rps) {
        this.name = name;
        this.rps = rps;
    }
    public Player() {
        this.name = "bot";
        this.rps = getRandom();
    }
    private RPS getRandom(){
        int x = (int) (Math.random() * 3);
        switch (x){
            case 0:
                return RPS.PAPER;
            case 1:
                return RPS.ROCK;
            default:
                return RPS.SCISSORS;
        }
    }
    public String whoWins(Player p1, Player p2) {
        System.out.println(p1.name + " choose " + p1.rps);
        System.out.println(p2.name + " choose " + p2.rps);

        ArrayList<RPS> arr = new ArrayList<>();
        arr.add(RPS.PAPER);
        arr.add(RPS.ROCK);
        arr.add(RPS.SCISSORS);

        int index1 = arr.indexOf(p1.rps);
        int index2 = arr.indexOf(p2.rps);

        if (index1 == index2) {
            return "It's draw";
        }
        if ((index1 - index2) == 1 || (index1 - index2) == 2) {
            return p1.name + " win";
        } else
            return p2.name + " win";

    }

}

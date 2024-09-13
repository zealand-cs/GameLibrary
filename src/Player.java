public class Player {
    private int playerId;
    private String name;
    private int age;
    private double score;

    public Player(int playerId, String name, int age, double score) {
        this.playerId = playerId;
        this.name = name;
        this.age = age;
        this.score = score;
    }

    public int getPlayerId() {
        return playerId;
    }

    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public void displayDetails() {
        System.out.print(STR."\{playerId}");
        System.out.print(STR."\{name}");
        System.out.print(STR."\{age}");
        System.out.print(STR."\{score}");
    }

    public void updateScore(double newScore) {
        setScore(newScore);
    }
}

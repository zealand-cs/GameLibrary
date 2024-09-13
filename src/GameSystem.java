public class GameSystem {
    Game[] games;
    Player[] players;

    int gameCount;
    int playerCount;

    public void addGame(Game game) {
        // Add to array???
        gameCount = games.length;
    }

    public void addPlayer(Player player) {
        // Add to array???
        playerCount = players.length;
    }

    public void displayAllGames() {
        for (Game game : games) {
            game.displayDetails();
        }
    }

    public void displayAllPlayers() {
        for (Player player : players) {
            player.displayDetails();
        }
    }

    public void updatePlayerScore(int playerId, double newSore) {
        findPlayerById(playerId).updateScore(newSore);
    }

    public Game findGameById(int gameId) {
        for (Game game : games) {
            if (game.getGameId() == gameId) {
                return game;
            }
        }

        return null;
    }

    public Player findPlayerById(int playerId) {
        for (Player player : players) {
            if (player.getPlayerId() == playerId) {
                return player;
            }
        }

        return null;
    }

    public double calculateTotalRevenue() {
        double total = 0;
        for (Game game : games) {
            total += game.getPrice();
        }
        return total;
    }

    public Player findTopScoringPlayer() {
        Player highestPlayer = null;
        for (Player player : players) {
            if (highestPlayer == null) {
                highestPlayer = player;
            }

            if (player.getScore() > highestPlayer.getScore()) {
                highestPlayer = player;
            }
        }
        return highestPlayer;
    }
}

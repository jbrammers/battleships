package Database;

public class PlayerData {
    private String username;
    private Integer wins;
    private Integer losses;
    private Float winratio;

    PlayerData(String username, Integer wins, Integer losses, Float winratio){
        this.username = username;
        this.wins = wins;
        this.losses = losses;
        this.winratio = winratio;
    }

    public String getUsername() {
        return username;
    }

    public Integer getWins() {
        return wins;
    }

    public Integer getLosses() {
        return losses;
    }

    public Float getWinratio() {
        return winratio;
    }

    @Override
    public String toString() {
        return String.format("|%-45s|%-18d|%-20d|%-19f|" , username, wins, losses, winratio);
    }
}

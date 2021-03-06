package ServerProgram.Database;

import java.io.Serializable;

public class PlayerData implements Serializable {
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

    Float getWinratio() {
        return winratio;
    }

    @Override
    public String toString() {
        return String.format("%s!%d!%d!%f" , username, wins, losses, winratio);
    }
}

package server.referenceclass;

public class Player {
    int id;
    String username;
    String password;
    int highScore;

    public Player(int id, String username, String password){
        this.id = id;
        this.username = username;
        this.password = password;
        highScore = 0;
    }

    public Player(int id, String username, String password, int highScore){
        this.id = id;
        this.username = username;
        this.password = password;
        this.highScore = highScore;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getHighScore() {
        return highScore;
    }

    public void setHighScore(int highScore) {
        this.highScore = highScore;
    }
}

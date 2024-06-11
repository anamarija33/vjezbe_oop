package pckg_vj8.auxPckg;

public class UserInpts {
    private int lwr;
    private int uppr;
    private int guess;
    private boolean status;

    public UserInpts() {}

    public void setInputs(int lwr, int uppr, int guess) {
        this.lwr = lwr;
        this.uppr = uppr;
        this.guess = guess;
    }
    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getLwr() {
        return lwr;
    }

    public int getUppr() {
        return uppr;
    }

    public int getGuess() {
        return guess;
    }

    public boolean getStatus() {
        return status;
    }
}


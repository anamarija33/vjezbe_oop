package pckg_vj8.auxPckg;

public class UsrInptException extends Exception{
    private int lwr;
    private int uppr;
    private int plGuess;
    private String msg;


    public UsrInptException(String msg) {
        super(msg);
        this.msg = msg;
    }

    public void setLwr(int lwr) {
        this.lwr = lwr;

    }

    public void setUppr(int uppr) throws UsrInptException {
        this.uppr = uppr;
        if(uppr<lwr){
            throw new UsrInptException("Upper age bound is lower than lower age bound!");
        }
    }

    public void setPlGuess(int plGuess) throws UsrInptException {
        this.plGuess = plGuess;
        if(plGuess>uppr || plGuess<lwr){
            throw new UsrInptException("Your guess is not within your set bounds!!");
        }
    }
}

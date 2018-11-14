
public class Lotto extends Game {
    // PrizeMachine1 attributes
    private int Lotto[];

    //Constructors
    Lotto(){
        super(null,null,null);
        Lotto = null;
    }

    Lotto(int[]L, String n, User v, String pCode) {
        super(n,v,pCode);
        Lotto = L;
    }


    public int []getLotto() {
        return Lotto;
    }
    public void setLotto(int []L){
        Lotto = L;
    }

    // the accessor
    public String getName() { return name;}

    public void setName (String n) { name = n; }

    //displays array with random numbers and the name of lotto
    public String toString() {
        return "\nLotto" + Lotto;
    }
} // end Lotto class
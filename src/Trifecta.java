
public class Trifecta extends Game{
    // PrizeMachine1 attributes
    private String name;
    private int Trifecta[];

    //Constructors
    Trifecta(){
        super(null,null,null);
        Trifecta = null;
    }
    Trifecta(int[]T, String n, User v, String pCode) {
        super(n,v,pCode);
        Trifecta = T;
    }


    public int []getTrifecta() {
        return Trifecta;
    }
    public void setTrifecta(int []T){ Trifecta = T;}

    // the accessor
    public String getName() { return name;}

    public void setName (String n) { name = n; }

    //displays array with random numbers and the name of lotto
    public String toString() {
        return "\nTrifecta" + Trifecta;
    }
} // end Trifecta class


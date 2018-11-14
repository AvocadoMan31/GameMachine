
public abstract class Game {
    //Game attributes
    protected String name;
    protected User ven;
    protected String postCode;

    //the constructores
    Game() {
        name = null;
        ven = null;
        postCode = null;
    }
    Game (String gameName, User v, String pCode) {
        name = gameName;
        ven = v;
        postCode = pCode;
    }

    //the mutators
    public void setName (String GameName) {name = GameName;}
    public void setVen (User v) {ven = v;}
    public void setPostCode (String pCode) {postCode = pCode;}

    //the accessors
    public String getName () {return name;}
    public User getVen () {return ven;}
    public String getPostCode () {return postCode;}

    //Attribute available for display
    public String toString () {
        //how do I add a string displaying both names
        return "\n " + name + ven.toString() + postCode;
    }
}


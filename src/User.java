
public class User {
    // User attributes
    private int age;
    private String firstName;

    // the constructors
    User() {
        age = 0;
        firstName = null;
    }
    User(int yearsOld, String fName) {
        firstName = fName;
        age = yearsOld;
    }
    // the mutators
    public void setFirstName (String fName) {firstName = fName;}
    public void setAge (int yearsOld) {age = yearsOld;}

    // the accessors
    public String getFirstName () { return firstName; }
    public int getAge () { return age; }

    //make attributes available for display
    public String toString () {
        return "\nage: " + age + "\nFirst Name: " + firstName;
    }

} // end User class

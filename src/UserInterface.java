
import javax.swing.JOptionPane;
import java.util.*;

public class UserInterface {
    public void begin() {
        // create the Game ArrayList to store the data while the program is running
        ArrayList<ArrayList<Game>> user = new ArrayList<ArrayList<Game>>();
        // display the menu and process Lotto & Trifecta data
        boolean finished = false;
        while (!finished) { // a loop to allow the program to continue until the user chooses to exit program
            int selection = showMenu();
            switch (selection) {
                case 1:     // add a Lotto
                    user.add(addLotto());
                    break;
                case 2:     // add a Trifecta
                    user.add(addTrifecta());
                    break;
                case 3:     // display Game data
                    JOptionPane.showMessageDialog(null, "Displaying the user results", "List of results", JOptionPane.PLAIN_MESSAGE);
                    for (int i = 0; i < user.size(); i++) {
                        JOptionPane.showMessageDialog(null, user.get(i), "Game details", JOptionPane.PLAIN_MESSAGE);
                    }
                    JOptionPane.showMessageDialog(null, "There are " + user.size() + "records in this list", "Total records", JOptionPane.PLAIN_MESSAGE);
                    break;
                case 4:
                    finished = true; // the boolean variable 'finished' is used to control the loop
                    JOptionPane.showMessageDialog(null, "*** Program Ended***\n" +
                            "*** Thank you for using this program***");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "\n** Invalid Selection ** \n", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public int showMenu() {
        int selection = 0;
        String stringSelection = JOptionPane.showInputDialog(
                "Prize machine lotto and horse racing\n\n" +
                        "1. Add this weeks Prize Machine draws\n" +
                        "2. Add this weeks Prize Machine Trifecta\n" +
                        "3. Display all game details\n" +
                        "4. Exit Program\n\n" +
                        "Type the number of your selection, and click OK: ");
        selection = Integer.parseInt(stringSelection.trim());
        return selection;
    }

    public ArrayList<Game> addLotto() {
        String name = JOptionPane.showInputDialog(null, "\nFull name: ").trim();
        //int yearsOld = Integer.parseInt(JOptionPane.showInputDialog(null, "\nUser's Age: ").trim());
        //int pCode = Integer.parseInt(JOptionPane.showInputDialog("Enter in your postcode:"));
        double age;

        String stringValidAge = JOptionPane.showInputDialog(null, "What is " + name + "'s age?");
        age = Double.parseDouble(stringValidAge);

        if (age <= 17) {
            JOptionPane.showMessageDialog(null, "ATTENTION! Under 18s not authorized by law to participate.", "WARNING",
                    JOptionPane.ERROR_MESSAGE);
        }

        // always false never runs needs to ba an else of seperate if statment and while inside if it need to run recursivly
        else if (age >= 18) {

            String pCode = "";
            String ven = null;
            ven = JOptionPane.showInputDialog(null, "Store location (where was the ticket purchased e.g Moonee Ponds, Sunshine, etc) ? ");


            // need to get post code before displaying
            pCode = JOptionPane.showInputDialog(null, "Area where " + ven + " is ? (post code)");
            User u = new User();


            // save everything for user


            //Lotto l = new Lotto[];
            // Monday lotto has a 6 number combination
            int[] L1 = new int[6];
            for (int i = 0; i < 6; i++) {
                L1[i] = (int) (Math.random() * 98) + 1;
            }
            // this just needs the rest of the variables.
            Lotto L1_lotto = new Lotto(L1, name, u, pCode);

            ArrayList<Game> lottos = new ArrayList<Game>();
            lottos.add(L1_lotto);
            JOptionPane.showMessageDialog(null, "Thank you - new Lotto results added for this user", "Lotto results saved",
                    JOptionPane.PLAIN_MESSAGE);

            return lottos;
        }
        return null;
    }


    public ArrayList<Game> addTrifecta() {
        String name = JOptionPane.showInputDialog(null, "\nFull name: ").trim();
        //int yearsOld = Integer.parseInt(JOptionPane.showInputDialog(null, "\nUser's Age: ").trim());
        //int pCode = Integer.parseInt(JOptionPane.showInputDialog("Enter in your postcode:"));
        double age;

        String stringValidAge = JOptionPane.showInputDialog(null, "What is " + name + "'s age?");
        age = Double.parseDouble(stringValidAge);

        if (age <= 17) {
            JOptionPane.showMessageDialog(null, "ATTENTION! Under 18s not authorized by law to participate.", "WARNING",
                    JOptionPane.ERROR_MESSAGE);
        }

        // always false never runs needs to ba an else of seperate if statment and while inside if it need to run recursivly
        else if (age >= 18) {

            String pCode = "";
            String ven = null;
            ven = JOptionPane.showInputDialog(null, "Store location (where was the ticket purchased e.g Moonee Ponds, Sunshine, etc) ? ");


            // need to get post code before displaying
            pCode = JOptionPane.showInputDialog(null, "Area where " + ven + " is ? (post code)");
            User u = new User();


            // save everything for user

            //Straight Trifecta
            int[] T1 = new int[8];
            for (int i = 0; i < 8; i++) {
                T1[i] = (int) (1 + Math.random() * 8);
                if (i > 0)
                    for (int j = 0; j <= i - 1; j++)
                        if (T1[j] == T1[i])
                            i--;
            }
            Trifecta T1_trifecta = new Trifecta(T1, name, u, pCode);


            ArrayList<Game> trifectas = new ArrayList<Game>();
            trifectas.add(T1_trifecta);


            JOptionPane.showMessageDialog(null, "Thank you - new Lotto results added for this user", "Trifecta results saved", JOptionPane.PLAIN_MESSAGE);

            return trifectas;
        }
        return null;
    }
} // end UserInterface class
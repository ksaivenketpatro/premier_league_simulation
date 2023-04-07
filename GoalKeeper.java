
/**
 * A Class to define the GoalKeeper of a Squad
 *
 * @author Saivenket Patro
 * @version 1.7
 */
public class GoalKeeper extends ClubPlayer
{
    //To define number the number of clean sheets of a goalkeeper
    private int cleanSheets;

    /**
     * Constructor for objects of class GoalKeeper
     */
    public GoalKeeper()
    {
        // Inheriting from the ClubPlayer Class
        super();
        
        //Initialization variable declared
        cleanSheets = 0;
        
    }

    /**
     * Method to add to the tally of Clean Sheets of a Goal Keeper Object
     */
    public void add_cleanSheet()
    {
        // put your code here
        cleanSheets = cleanSheets +1;
    }
    
    /**
     * Returns the number of Clean Sheets of a Goal Keeper of type int
     * @return cleanSheets - Number of Clean Sheets
     */
    public int get_cleanSheet()
    {
        // put your code here
        return (cleanSheets);
    }
}

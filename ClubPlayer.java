
/**
 * A Class to define characterstics and stats of a Player
 *
 * @author Saivenket Patro K
 * @version 1.0
 */
public class ClubPlayer
{
    // atheleteName - Name of a player
    private String athleteName;
    
    //athleteDOB -  date of birth of a player
    private int athleteDOB;
    
    //athleteHeight - Height of a player
    private int athleteHeight;
    
    // goalScored - Goals Scored by  a player
    private int goalScored;
    
    /**
     * Constructor for objects of class clubPlayer
     */
    public ClubPlayer()
    {
        // Initializing goals scored by a player to nil
        goalScored = 0;
    }

    /**
     * Method to set player characterstics
     * @param playerName Name of the Player
     * @param playerDOB Year of the Birth of the Player
     * @param playerHeight Height of the Player
     */
    public void set_playerData(String playerName,int playerDOB,
    int playerHeight)
    {
        //passing values to the desired variables
        athleteName = playerName;
        athleteDOB = playerDOB;
        athleteHeight = playerHeight;
    }
    
    /**
     * Return the player name of the object of type String
     * @return athleteName - Name of the Player 
     */
    public String get_playerName()
    {
        //return the player name
        return (athleteName);
    }
    
    /**
     * Return the player age of the object of type int
     * @return age_dob - Age of the Player
     */
    public int get_playerAge()
    {
        // 
        int age_dob = 2022 - athleteDOB;
        return (age_dob);
    }
    
    /**
     * Returns the player Height of the object of type int
     * @return atheleteHeight - Height of the player 
     */
    public int get_playerHeight()
    {
        // Height of the player
        return (athleteHeight);
    }
    
    /**
     * Method to add goals to the tally of a ClubPlayer Object
     * @param goal Number of Goals of type int
     */
    public void add_goalScored(int goal)
    {
       // to add the number of goals scored to the tally
       goalScored = goalScored + goal;
    }
    
    /**
     * Return the number of goals a player scored which is of type int
     * @return goalScored - Number of Goals scored
     */
    public int get_goalScored()
    {
       return (goalScored);
    }
}

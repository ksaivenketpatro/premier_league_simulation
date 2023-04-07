import java.util.ArrayList;

/**
 * A Class to define a Football Club with its Characteristics
 *
 * @author Saivenket Patro  
 * @version 2.5
 */
public class Club
{
    // clubName - Name of the Club
    private String clubName;
    
    //club_goalsScored - Goals scored by a club of type Integer Class
    private Integer club_goalsScored;
    
    //club_goalsConceded - Goals Conceded by a Club
    private int club_goalsConceded;
    
    //clubPoints - Points scored by a Club
    private int clubPoints;
    
    //clubSquad - ArrayList of players in a Club
    public ArrayList<ClubPlayer> clubSquad;
    
    //clubgoalKeeper - ArrayList of goalkeeper in a Club
    public ArrayList<GoalKeeper> clubgoalKeeper;
    /**
     * Constructor for objects of class club
     */
    public Club()
    {
        // initialise instance variables
        clubSquad = new ArrayList<ClubPlayer>();
        clubgoalKeeper = new ArrayList<GoalKeeper>();
        club_goalsScored =0;
        club_goalsConceded =0;
        clubPoints =0;
    }

    /**
     * Method to Set the Club Name
     *
     * @param club_name Name of the club of type String
     * 
     */
    public void set_clubName(String club_name)
    {
        // assign club name
        clubName = club_name;
    }
    
        /**
     * Return the Name of a Club as a String
     * @return  clubName - name of the club
     */
    public String get_clubName()
    {
        // return the club name
        return(clubName);
    }
    
    /**
     * Method to add Goals to Club Goal tally
     * @param  goals Goals scored as a Club of type int
     */
    public void add_club_goalsScored(int goals)
    {
        // add goals to the club goal tally
        club_goalsScored = club_goalsScored + goals;
    }
    
    /**
     * Returns the Number of Goals scored by a Club as type int
     * @return   club_goalsScored - Goals Scored by the Club 
     */
    public int get_clubGoalsScored()
    {
        //return the club goals scored
        return(club_goalsScored);
    }
    
    /**
     * Method to add the Club Goals Conceded
     * @param  goals Goals Conceded by the Club of type int
     */
    public void add_club_goalsConceded(int goals)
    {
        //Tally the club goals conceded
        club_goalsConceded = club_goalsConceded - goals;
    }
    
    /**
     * Returns the Number of Goals Conceded as type int
     * @return  club_goalsConceded - Number of Goals Conceded by a Club
     */
    public int get_clubGoalsConceded()
    {
        // return the club goals conceded
        return(club_goalsConceded);
    }
    
    
    /**
     * Returns the Club Goal Difference of type int
     * @return goal_diff - Goal Difference of a CLub
     */
    public int club_goalDiff()
    {
        // return the club goal difference
        int goal_diff;
        goal_diff = club_goalsScored + club_goalsConceded;
        return(goal_diff);
    }
    
    /**
     * Method to add points to a Club
     * @param  type (Outcome of a game, Example: win or draw or lose) of 
     * type String
     */
    public void add_clubPoints(String type)
    {
        // put your code here
        //System.out.println("club points: "+ type);
        if (type.equals("win"))
        {
            clubPoints = clubPoints +3;
        }
        else if (type.equals("draw"))
        {
            clubPoints = clubPoints +1;
        }
        //else type== "lose"
        //do nothing
    }
    
    /**
     * Returns the Club Points of type int
     * @return clubPoints - Points scored by a Club
     */
    public int get_clubPoints()
    {
        // return points of a club
        return(clubPoints);
    }
    
    /**
     * Method to add a player to the Squad of a Club
     * @param  player_name Name of the Player as a String
     * @param  age Year of Birth as int
     * @param  height Height of the Player as int
     */
    public void add_squadPlayer(String player_name, int age, int height )
    {
        // Create a new player of type CLubPlayer Class
        ClubPlayer player = new ClubPlayer();
        
        //Set the player details 
        player.set_playerData(player_name, age, height);
        
        //Check if the player is already in the Squad or not
        boolean check = true;
        check = check_clubPlayer(player_name);
        
        //Condition to check and add the player only if player already
        //not in squad
        if (check != true)
        {
            //add the player to the squad
           clubSquad.add(player); 
        }
        
    }
    
    /**
     * Method to add the Goal Keeper to the Club Squad
     * @param  player_name Goalkeeper Name of the Player as a String
     * @param  age Year of Birth as int
     * @param  height Height of the Player as int
     */
    public void add_goalkeeperPlayer(String player_name, int age, int height )
    {
        // Create a new player of type GoalKeeper Class
        GoalKeeper player = new GoalKeeper();
        
        // set details of the player 
        player.set_playerData(player_name, age, height);
        
        //add to the list of Goal Keeper
        clubgoalKeeper.add(player);
        
    }
    
    /**
     * Method to Check a Club Player already added in the Club Squad
     * @param  player_name Name of the Player as a String
     */
    public boolean check_clubPlayer(String player_name)
    {
        // flag to help understand the result of a check
        int flag = 0;
        
        // initialise check_result to boolen type 
        boolean check_result = false;
        
        // loop to check if a player(player_name) is 
        //already present in a clubSquad or not
        for(int i=0; i<clubSquad.size(); i++)
        {
         if (player_name == clubSquad.get(i).get_playerName())
         {
            flag = 1;
            }
        }
        
        //Flag to understand the result of check_result
        if (flag == 1)
        {
            check_result = true;
        }
        
        //return the final value
        return (check_result);
    }
    
    /**
     * Return the Average age of the Club Squad of type int
     * @return  avg_age - Average Age of the Club Squad
     */
    public int club_avgAge()
    {
        // Initialise variables
        int avg_age =0;
        int totalSum =0;
        
        //loop to get total age of the club squad
        for(int i=0; i<clubSquad.size(); i++)
        {
           totalSum = totalSum +  clubSquad.get(i).get_playerAge();
        }
        
        //get the avergae age of the club
        avg_age = totalSum/clubSquad.size();
        
        //return the average age 
        return(avg_age);
    }
    
    /**
     * Return the Average Height of the Club Squad of type int
     * @return  avg_height - Average Height of the Club Squad
     */
    public int club_avgHeight()
    {
        // Initialise Variables
        int avg_height =0;
        int totalHeight =0;
        
        //loop to to get the total sum of height
        for(int i=0; i<clubSquad.size(); i++)
        {
            totalHeight = totalHeight +  
            clubSquad.get(i).get_playerHeight();
        }
        
        //average height of the club squad
        avg_height = totalHeight/clubSquad.size();
        
        //return the average height
        return(avg_height);
    }
    
}

import java.util.*;
/**
 * A Class to define a League Fixture of two clubs
 * @author Saivenket Patro
 * @version 3.2
 */
public class LeagueMatch
{
    // matchTime - Time of the match
    private String matchTime;
    
    //matchLocation - Location of the match
    private String matchLocation;
    
    // Array list of match fixtures of a league
    private ArrayList<Club> matchFixture;
    
    // Goals Scored by the home team
    private int homeGoal;
    
    //Goals scored by the away team
    private int awayGoal;
    
    // Result of the home team
    private String homeResult;
    
    //Result of the away team
    private String awayResult;
    
    // unique id every match
    private String matchID;
    
    /**
     * Constructor for objects of class leagueMatch
     */
    public LeagueMatch()
    {
        // initialise instance variables
        matchFixture = new ArrayList<>();
    }

    /**
     * Method to Add Details of a Match Fixture
     * @param match_id ID of the match as a String
     * @param time Time of the match held as a String
     * @param location Location of the match as a String
     * @param homeTeam Home Club of type Club Object
     * @param awayTeam Away Club of type Club Object
     */
    public void add_matchDetails(String match_id, String time, 
    String location, Club homeTeam, Club awayTeam)
    {
        // add clubs to the match fixture array
        matchFixture.add(homeTeam);
        matchFixture.add(awayTeam);
        
        // assign time, location and match_id 
        matchTime=time;
        matchLocation = location;
        matchID = match_id;
    }
    
    /**
     * Returns the Unique matchID of a particular fixture of type String
     * @return matchID - Match ID of a fixture
     */
    public String get_matchID()
    {
        // return matchID
        return (matchID);
    }
    
    /**
     * Returns the Match Details of a Fixture of type String
     * @return  match_details - Details of a Match Fixture
     */
    public String get_matchDetails()
    {
        // Details of time and location in a string
        String details = "Time: " + matchTime + ", Location: "+
        matchLocation;
        
        // Add details of the club
        //System.out.println("get"+matchFixture.get(0));
        String team_details = this.matchFixture.get(0).get_clubName()
        + " vs " + this.matchFixture.get(1).get_clubName();
        
        // Concatenate two details 
        String match_details = details + "\n" + team_details;
        
        //return the Match details
        return(match_details);
    }
    
    /**
     * Method to add record Match Stastics to a match fixture
     * @param homeClub_goals Goals Scored by the Home Club as int 
     * @param awayClub_goals Goals Scored by the Away Club as int
     * @param homeClub_result Result of Home Club as String
     * @param awayClub_result Result of the Away Club as String
     */
    public void record_MatchStats(int homeClub_goals, int awayClub_goals, 
                    String homeClub_result, String awayClub_result)
    {
        // Assign Goals and Results
        homeGoal = homeClub_goals;
        awayGoal = awayClub_goals;
        homeResult = homeClub_result;
        awayResult = awayClub_result;
        
        //Add Club Details
        matchFixture.get(0).add_club_goalsScored(homeGoal);
        matchFixture.get(0).add_club_goalsConceded(awayGoal);
        matchFixture.get(0).add_clubPoints(homeResult);
        
        matchFixture.get(1).add_club_goalsScored(awayGoal);
        matchFixture.get(1).add_club_goalsConceded(homeGoal);
        matchFixture.get(1).add_clubPoints(awayResult);
        
    }
    

    /**
     * Returns the Final Score of a Match Fixture of type String
     * @return  finalScore_details - Final Score Details of a Match
     */
    public String get_finalScore()
    {
        // details of clubs and goals
        String finalScore_details = this.matchFixture.get(0).get_clubName()
         + " " + homeGoal + " - " + awayGoal + " " +
         this.matchFixture.get(1).get_clubName(); 
        
        String result ="";
        if (homeResult.equals("win"))
        {
            result = this.matchFixture.get(0).get_clubName() + " won";
        }
        else if (homeResult.equals("lose"))
        {
            result = this.matchFixture.get(1).get_clubName() + " won";
        }
        else
        {
            result = this.matchFixture.get(0).get_clubName() + " and " +
            this.matchFixture.get(1).get_clubName() + " drew";
        }
        
        //return thr finalScore_details of a fixture
        finalScore_details = finalScore_details + "\n" + result;
        
        return(finalScore_details);
    }
}

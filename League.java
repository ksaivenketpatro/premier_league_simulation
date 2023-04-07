import java.util.*;
/**
 * A Class to define a League and its Characterstics
 * @author Saivenket Patro
 * @version 1.5
 */
public class League
{
    // leagueName - Name of the league
    private String leagueName;
    
    // leagueClubs - list of clubs in the league
    private ArrayList<Club> leagueClubs;
    
    // leagueFixtures - list of fixtures 
    private ArrayList<LeagueMatch> leagueFixtures;
    
    /**
     * Constructor for objects of class league
     */
    public League()
    {
        // initialise instance variables
        leagueClubs = new ArrayList<>();
        leagueFixtures = new ArrayList<>();
    }

    /**
     * Method to set the Name of the league
     *
     * @param  name_league Name of the League as type String
     */
    public void add_leagueName(String name_league)
    {
        // assign the name of the league
        leagueName = name_league;
    }
    
    /**
     * Returns the Name of the League of type String
     *
     * @return  leagueName - Name of the League
     */
    public String get_leagueName()
    {
        // returns the name of the league
        return (leagueName);
    }
    
    /**
     * Method to add a Club to the League
     * @param  league_club_name Name of the Club of type String
     */
    public void add_leagueClub(String league_club_name)
    {
        // Create a new club, new club object
        Club new_club = new Club();
        
        //Set the name of the new club using league_club_name String
        new_club.set_clubName(league_club_name);
        
        //add club to the arraylist of clubs
        leagueClubs.add(new_club); 
    }
    
    /**
     * Method to add Player to a Club in a League
     * @param club_name Name of the Club as a String
     * @param player_name Name of the Player as a String
     * @param age Year of the Birth as int
     * @param height Height of the Player as int
     */
    public void add_playerClub(String club_name, String player_name,
    int age, int height)
    {
        // loop to find the club using the club_name and add the player 
        for(int i =0; i<leagueClubs.size(); i++)
        {
            if (leagueClubs.get(i).get_clubName().equals(club_name))
            {
                leagueClubs.get(i).add_squadPlayer(player_name,age,height);
            }
    
        }
        
    }
    
    /**
     * Method to add Goal Keeper to a Club in a League
     * @param club_name Name of the Club as a String
     * @param player_name Goalkeeper Name of the Player as a String
     * @param age Year of the Birth as int
     * @param height Height of the Player as int
     */
    public void add_goalkeeperClub(String club_name, String player_name,int age,
    int height)
    {
        // loop to find the club using the club_name and add the Goal Keeper
        for(int i =0; i<leagueClubs.size(); i++)
        {
            if (leagueClubs.get(i).get_clubName().equals(club_name))
            {
                leagueClubs.get(i).add_goalkeeperPlayer(player_name,
                age,height);
            }
    
        }
        
    }
    
    /**
     * Method to add Fixtures to a League
     * @param match_id ID of the match as a String
     * @param time Time of the match held as a String
     * @param location Location of the match as a String
     * @param homeTeam_name Name of the Home Club as a String 
     * @param awayTeam_name Name of the Away Club as a String 
     */
    public void add_leagueFixture(String match_id, String time,
    String location, String homeTeam_name, String awayTeam_name)
    {
        //find the clubs and copy the club adresses
        Club homeTeam = new Club();
        Club awayTeam = new Club();
        
        //for loop to go over the clubs and set the homeTeam and awayTeam
        for (int i =0; i<leagueClubs.size();i++)
        {
            if (leagueClubs.get(i).get_clubName().equals(homeTeam_name))
            {
                homeTeam = leagueClubs.get(i);
            }
            
            else if (leagueClubs.get(i).get_clubName().equals(awayTeam_name))
            {
                awayTeam = leagueClubs.get(i);
            }
        }
        
        //Create a new leagueMatch and add the details and store as well
        LeagueMatch match = new LeagueMatch();
        match.add_matchDetails(match_id, time,location,homeTeam,awayTeam);
        leagueFixtures.add(match);
    }
    
    /**
     * Returns the Fixture Details of a Match of type String
     *
     * @return  matchDet - Details of the Match
     */
    public String get_fixtureDetails(String match_id)
    {
        // Get the Match Details of a fixture using the match_id
        String matchDet = "No Fixture Found";
        
        // for loop to go over the fixtures in the league
        for (int i =0; i<leagueFixtures.size();i++)
        {
            // to get the match details using the match id of the fixture
            if(leagueFixtures.get(i).get_matchID().equals(match_id))
            {
                matchDet = leagueFixtures.get(i).get_matchDetails();
            }
        }
        
        //return the Match Details
        return (matchDet);
    }   
    
    /**
     * Method to add match result to a fixture
     *
     * @param match_id Match ID of the Fixture of type String
     * @param homeClub_goals Goals Scored by the Home Club as int
     * @param awayClub_goals Goals Scored by the Away Club as int
     * @param homeClub_result Result of the Home Club as String
     * @param awayClub_result Result of the Away Club as String
     */
    public void add_resultFixture(String match_id, int homeClub_goals,
    int awayClub_goals, String homeClub_result, String awayClub_result)
    {
        // for loop to go over the match fixtures of a league
        for (int i =0; i<leagueFixtures.size();i++)
        {
            //check tha match id and assign the stats
            if(leagueFixtures.get(i).get_matchID().equals(match_id))
            {
                leagueFixtures.get(i).record_MatchStats(homeClub_goals,
                awayClub_goals,homeClub_result,awayClub_result);
            }
        }
        
    }
    
    /**
     * Returns the Fixture Details of a Match of type String
     *
     * @return  matchDet - Details of the Match
     */
    public String get_resultDetails(String match_id)
    {
        // Get the Match Details of a fixture using the match_id
        String resultDet = "No Fixture Found";
        
        //for loop to go over the fixtures
        for (int i =0; i<leagueFixtures.size();i++)
        {
            // check the match id and get the final score of the fixture
            if(leagueFixtures.get(i).get_matchID().equals(match_id))
            {
                resultDet = leagueFixtures.get(i).get_finalScore();
            }
        }
        
        return (resultDet);
    }   
    
    /**
     * Return the Club Name of the Highest Number of Points in the League as String
     * @return top_club_name - Club with highest number of points
     */
    public String get_topTeam_league()
    {
        // Assign the points to the array list
        ArrayList<Integer> points_list = new ArrayList<>();
        String top_club_name = "No Club Found";
        
        //for loop to go over the clubs and add its points 
        for (int i=0; i<leagueClubs.size();i++)
        {
            points_list.add(leagueClubs.get(i).get_clubPoints());
        }
        
        //sort the points in descending order
        Collections.sort(points_list, Collections.reverseOrder());
       
        //for loop to go over the clubs and find the club with highest points
        for (int j=0; j<leagueClubs.size(); j++)
        {
            if (leagueClubs.get(j).get_clubPoints()== points_list.get(0))
            {
                top_club_name = leagueClubs.get(j).get_clubName();
            
            }
        }
        
        return(top_club_name);
    }
    
    /**
     * Method to get the Points Table of the League
     */
    public void get_leagueTable()
    {
        // Assign points to the array list
        ArrayList<Integer> point = new ArrayList<>();
        
        //for loop to get over the clubs and add the points to the list
        for (int i=0; i<leagueClubs.size();i++)
        {
            point.add(leagueClubs.get(i).get_clubPoints());
        }
        
        //sort the points in a descending order
        Collections.sort(point, Collections.reverseOrder());
        
        //define an array of string to store values of the club
        String [][] leagueTable = new String[5][5];
        
        //for loop to go over the point list
        for (int i =0; i<point.size();i++)
        {
            //for loop to go over the clubs
            for (int j=0; j<leagueClubs.size(); j++)
            {
                // compare the points and get the club details
                if (leagueClubs.get(j).get_clubPoints()== point.get(i))
                {
                    String name = leagueClubs.get(j).get_clubName();
                    Integer gs = leagueClubs.get(j).get_clubGoalsScored();
                    Integer gc = leagueClubs.get(j).get_clubGoalsConceded();
                    Integer gd = leagueClubs.get(j).club_goalDiff();
                    Integer lp = point.get(i);
                    
                    //assign the club details to the array
                    leagueTable[i][0]= name;
                    leagueTable[i][1]= gs.toString();
                    leagueTable[i][2]= gc.toString();
                    leagueTable[i][3]= gd.toString();
                    leagueTable[i][4]= lp.toString();
                }
            }
        }
        
        //Print statements to get a tbale like output
        System.out.println("--------------------------------------------------------------------------");
        System.out.format("%5s %20s %15s %18s %10s","Clubs","Goals Scored","Goals Conceded","Goal Difference","Points");
        System.out.println();
        System.out.println("--------------------------------------------------------------------------");
        
        //for loop to go over the array to print the club information
        for(int i =0; i<leagueTable.length;i++)
            
        {
            System.out.format("%7s %10s %15s %15s %15s\n",leagueTable[i][0],
                    leagueTable[i][1],leagueTable[i][2],leagueTable[i][3],
                    leagueTable[i][4]);
        }
        System.out.println();
        System.out.println("--------------------------------------------------------------------------");
    }
    
    /**
     * Method to add Goals of a Player
     *
     * @param player_name Name of the Player as a String
     * @param player_goals Goals Scored by the Player as int
     */
    public void add_goalsPlayer(String player_name, int player_goals)
    {
        // for loop to go over the clubs
        for (int i=0; i<leagueClubs.size();i++)
        {
            //for loop to go over the club squad
            for (int j=0; j<leagueClubs.get(i).clubSquad.size();j++)
            {
               String club_player_new = leagueClubs.get(i).clubSquad.get(j).
               get_playerName();
               
               //find the club player and assign the goals using the
               // using the method in the Club class
               if (club_player_new.equals(player_name))
               {
                   leagueClubs.get(i).clubSquad.get(j).add_goalScored(
                   player_goals);
                }
                
            }
        }
        
    }
    
    /**
     * Method to add Clean Sheets of a Goal Keeper
     *
     * @param player_name Name of the Goal Keeper as a String
     */
    public void add_cleanSheet(String player_name)
    {
        // for loop to go over the clubs
        for (int i=0; i<leagueClubs.size();i++)
        {
            //for loop to go over the goal keeper of a squad
            for (int j=0; j<leagueClubs.get(i).clubgoalKeeper.size();j++)
            {
               // find the player and assign the cleansheet to the goalkeeper
               if (player_name.equals(leagueClubs.get(i).clubgoalKeeper.get(j).
               get_playerName()))
               {
                   leagueClubs.get(i).clubgoalKeeper.get(j).
                   add_cleanSheet();    
                }  
            }
        }
        
    }
    
    /**
     * Returns the Player Name who has scored the highest number of goals
     * as String
     * @return - goldenBoot Golden Boot Player with its goals
     */
    public String get_goldenBoot()
    {
        // Create a new array list for the list of goals
        ArrayList<Integer> golden = new ArrayList<>();
        
        //for loop to go over the clubs
        for (int i=0; i<leagueClubs.size();i++)
        {
            //for loop to go over the squad in a club 
            for (int j=0; j<leagueClubs.get(i).clubSquad.size();j++)
            {
               // assign goals of a player to the list
               golden.add(leagueClubs.get(i).clubSquad.get(j).
               get_goalScored()); 
            }
        }
        
        //sort the goals in descending order
        Collections.sort(golden, Collections.reverseOrder());
        Integer goldenScore = golden.get(0);
        
        // initialize the golden player 
        String golden_player ="";
        
        //for loop to go over the clubs
        for (int i=0; i<leagueClubs.size();i++)
        {
            // for loop to go over the squad of a club
            for (int j=0; j<leagueClubs.get(i).clubSquad.size();j++)
            {
               // compare the goals and get the player name
               if (goldenScore.equals(leagueClubs.get(i).clubSquad.get(j).
               get_goalScored()))
               {
                   golden_player = leagueClubs.get(i).clubSquad.get(j).
                   get_playerName();
                }
                
            }
        }
        
        //assign the player name and its goals
        String goldenBoot = golden_player + " - "+ goldenScore.toString();
        
        return (goldenBoot);
    }
    
     /**
     * Returns the Goal Keeper who has the Highest Number of Clean Sheets
     * as a String
     * @return - goldenKeeper GoldenKeeper Player and its Clean Sheets
     */
    public String get_goldenHand()
    {
        // initialize variable to keep the cleansheets of the goalkeepers
        ArrayList<Integer> golden = new ArrayList<>();
        
        // for loop to loop over clubs in the Array List
        for (int i=0; i<leagueClubs.size();i++)
        {
            // for loop to go over the goalkeeper of a club
            for (int j=0; j<leagueClubs.get(i).clubgoalKeeper.size();j++)
            {
               //add cleansheet to the goalkeeper
               golden.add(leagueClubs.get(i).clubgoalKeeper.get(j).
               get_cleanSheet()); 
            }
        }
        
        //Sort the list of cleansheets in descending order
        Collections.sort(golden, Collections.reverseOrder());
        
        //Assign the highest cleansheet
        Integer goldenClean= golden.get(0);
        
        //Initialize the goalkeeper with the highest cleansheet
        String golden_player ="";
        
        //for loop to go over the clubs
        for (int i=0; i<leagueClubs.size();i++)
        {
            // for loop to go over the goalkeepers in a squad
            for (int j=0; j<leagueClubs.get(i).clubgoalKeeper.size();j++)
            {
               // check if the no of cleansheet matches and assign the name
               if (goldenClean.equals(leagueClubs.get(i).clubgoalKeeper.get(j).
               get_cleanSheet()))
               {
                   //get the goal keeper name
                   golden_player = leagueClubs.get(i).clubgoalKeeper.get(j).
                   get_playerName();
                }
                
            }
        }
        
        //Assign the goalkeeper name with its number of cleansheets
        String goldenKeeper = golden_player + " - "+ goldenClean.toString();
        
        return (goldenKeeper);
    }
    
    /**
     * Returns the Club Squad Stastics as a String
     * @return avg_det - Average Age and Height of the Squad
    */
    public String get_avgClubSquad_stat(String club_name)
    {
        //initialize variables
        String avg_det = "No Club Found";
        int avg_age = 0;
        int avg_height = 0;
        
        //for loop to loop over the clubs in the leagueClubs Array List
        for(int i =0; i<leagueClubs.size(); i++)
        {
            //Check if the club name matches to get the average stat details
            if (leagueClubs.get(i).get_clubName().equals(club_name))
            {
                avg_age = leagueClubs.get(i).club_avgAge();
                avg_height = leagueClubs.get(i).club_avgHeight();
                avg_det = leagueClubs.get(i).get_clubName() + "\n" + 
                "Average Age is " + avg_age + " years" + "\n"
                + "Average Height is " + avg_height + " cms";
            }
        }
        return (avg_det);
    }
}

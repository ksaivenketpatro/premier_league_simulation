import java.io.*; 
import java.util.*; 
/**
 *League Manager is the main driving Class for the whole project
 *
 * @author Saivenket Patro K
 * @version 4.7
 */
public class League_Manager
{
    public static void main(String[] args) throws FileNotFoundException  
     {
        try
        {
            System.out.println("Test Scenario");
            System.out.println();
            System.out.println("Test A: Create a New League");
            System.out.println();
            
            //Create a New League
            League Premier_League = new League();
            Premier_League.add_leagueName("English Premier League");
            System.out.println(Premier_League.get_leagueName());
            System.out.println();
            
            //Add clubs and players to the league
            System.out.println("Test B: Add Clubs and its Squad to the league");
            // Create a Scanner Object
            String file_path = "test_case/Squad.txt";
            Scanner file = new Scanner(new FileReader(file_path));
            //while loop to get the club and its squad 
            while(file.hasNextLine())
            {
                //Initialize variables
                String player_name="";
                int age=0;
                int height=0;
                //Skip Lines to Read
                file.nextLine();
                file.nextLine();
                //Assign Variables 
                String squad_size_string = file.nextLine();
                int squad_size = Integer.parseInt(squad_size_string);
                String club_name = file.nextLine();
                //Add Clubs to the League
                Premier_League.add_leagueClub(club_name);
                System.out.println(club_name);
                System.out.println();
                //for loop to add squad players to a club
                for(int i = 1; i<=squad_size; i++)
                {
                    //assign player details
                    player_name = file.nextLine();
                    String age_string = file.nextLine();
                    age = Integer.parseInt(age_string); //Converting a String to Integer
                    String height_string = file.nextLine();
                    height = Integer.parseInt(height_string); //Converting a String to Integer
                    //adding player to the squad
                    Premier_League.add_playerClub(club_name,player_name,
                    age,height);
                    System.out.println(player_name);
                }
                System.out.println();
                //Add Goal Keeper
                Premier_League.add_goalkeeperClub(club_name,player_name,age,
                height);
                System.out.println("Goal Keeper: "+player_name);
    
                System.out.println();
                System.out.println();
            }
            //close the scanner object
            file.close();
            
            //Add Fixtures to the League
            System.out.println("Test Case C: Add Fixtures to the League");
            System.out.println();
            //Scanner object for fixtures
            String fixture_file_path = "test_case/Fixtures.txt";
            Scanner fixture_file = new Scanner(new FileReader(fixture_file_path));
            String home_club="";
            // while loop to extract details of fixture
            while(fixture_file.hasNextLine())
            {
                fixture_file.nextLine();
                fixture_file.nextLine();
                
                //Assign Variables
                String match_id = fixture_file.nextLine(); //unique match ID
                fixture_file.nextLine();
                String time = fixture_file.nextLine();
                fixture_file.nextLine();
                String location= fixture_file.nextLine();
                fixture_file.nextLine();
                home_club = fixture_file.nextLine();
                fixture_file.nextLine();
                String away_club = fixture_file.nextLine();
                
                //Add Fixture
                Premier_League.add_leagueFixture(match_id,time,location,
                home_club,away_club);
                
                //Print/Get the Match Fixture Details
                System.out.println(Premier_League.get_fixtureDetails(match_id));
                System.out.println();
            }
            System.out.println();
            //Close the Scanner Object
            fixture_file.close();
            
            //Add Results to the Fixture
            System.out.println("Test Case D: Add Fixtures Results");
            System.out.println();
            // Create a Scanner object for adding the Result
            String fixture_result_path = "test_case/Fixture_Results.txt";
            Scanner fixture_result = new Scanner(new FileReader(fixture_result_path));
            //while loop to get the details of the results of a fixture from txt
            while(fixture_result.hasNextLine())
            {
                fixture_result.nextLine();
                fixture_result.nextLine();
                
                //Assign variables in accordance to the method
                String match_id_result= fixture_result.nextLine();
                fixture_result.nextLine();
                String home_goals_string = fixture_result.nextLine();
                int home_goals = Integer.parseInt(home_goals_string); // Convert String to Integer
                fixture_result.nextLine();
                String away_goals_string= fixture_result.nextLine();
                int away_goals = Integer.parseInt(away_goals_string); // Convert String to Integer
                fixture_result.nextLine();
                String home_result = fixture_result.nextLine();
                fixture_result.nextLine();
                String away_result = fixture_result.nextLine();
                
                // Add result to the fixture in accordance to the match ID
                Premier_League.add_resultFixture(match_id_result,home_goals,
                away_goals,home_result,away_result);
                
                //Get reults of the fixture in accordance to the match ID
                System.out.println(Premier_League.
                get_resultDetails(match_id_result));
                System.out.println();
            }
            System.out.println();
            // Close the Scanner Object
            fixture_result.close();
            
            
            //Add Player Goal Stats
            System.out.println("Test Case E: Add Player Goals Stats");
            System.out.println();
            // Create a new Scanner Object
            String player_goal_file_path = "test_case/Player Goals.txt";
            Scanner Player_Goals_file = new Scanner(new FileReader(player_goal_file_path));
            //while loop to get goal stats of player from txt
            while(Player_Goals_file.hasNextLine())
            {
                Player_Goals_file.nextLine();
                Player_Goals_file.nextLine();
                Player_Goals_file.nextLine();
                Player_Goals_file.nextLine();
                
                //Assign variables in accordance to the method
                String player_name_goal = Player_Goals_file.nextLine();
                System.out.println(player_name_goal);
                Player_Goals_file.nextLine();
                String goals_player_string = Player_Goals_file.nextLine();
                System.out.println(goals_player_string);
                int goals_player = Integer.parseInt(goals_player_string);// Convert String to Integer
                System.out.println();
                
                //Add Goals of the player
                Premier_League.add_goalsPlayer(player_name_goal,goals_player);
            }
            System.out.println();
            //Close the Scanner
            Player_Goals_file.close();
            
            
            //Add Goal Keeper Clen Sheet Stats
            System.out.println("Test Case F: Add GoalKeeper Stats");
            System.out.println();
            // Create Scanner Object
            String goalkeeper_file_path = "test_case/GoalKeeper CleanSheets.txt";
            Scanner goalkeeper_file = new Scanner(new FileReader(goalkeeper_file_path));
            // while loop to get the goalkeeper stats
            while(goalkeeper_file.hasNextLine())
            {
                goalkeeper_file.nextLine();
                goalkeeper_file.nextLine();
                goalkeeper_file.nextLine();
                goalkeeper_file.nextLine();
                
                //Assign Variables in accordance to the goalKeeper Clean Sheets
                String goalkeeper_name = goalkeeper_file.nextLine();
                System.out.println(goalkeeper_name);
                
                //add Clean Sheet to the GoalKeeper Tally
                Premier_League.add_cleanSheet(goalkeeper_name);
            }
            System.out.println();
            //Close the Scanner
            goalkeeper_file.close();
            
            //get top points in the league
            System.out.println("Test Case G: Top Points");
            System.out.println(Premier_League.get_topTeam_league());
            System.out.println();
    
            //Points table
            System.out.println("Test Case H: Points Table");
            Premier_League.get_leagueTable();
            System.out.println();
            
            //Get the Golden Boot of the League
            System.out.println("Test Case I: Golden Boot");
            System.out.println(Premier_League.get_goldenBoot());
            System.out.println();
            
            //Get the Golden Hand of the League
            System.out.println("Test Case J: Golden Hand");
            System.out.println(Premier_League.get_goldenHand());
            System.out.println();
            
            //Get Average Club Stastics
            System.out.println("Test Case K: Average Club Stastics");
            System.out.println(Premier_League.get_avgClubSquad_stat("Manchster"));
        }
        catch (Exception e)
        {
            System.out.println("Something went wrong");
            String error = e.getMessage();
            System.out.println(error);
        }
    }
    
}
        
# English Premier League Simulation - Java
## Documentation Overview
The Sports League Project is designed in a unique yet simple way to execute its problem in hand. The Documentation will help the reader understand the design principle and the implementation to simulate the English Premiere League Football.
The documentation consists sections of:
1.Class Diagram
2.Class Diagram Overview
3.Design Principle
4.Project Folder Hierarchy
5.How To Run The Program
6.Explaining The Text Files For The Test Cases
7.Explaining The Test Case With Implementation
These sections will help in understanding the project.
Although, to keep in mind, the simulation has been demonstrated with constraints which will be highlighted in the Test Explanation Section.
## Class Diagram
![image](https://user-images.githubusercontent.com/46882290/230661865-88b70fd3-0c6a-482e-b5cd-93eb85affd64.png)
## Class Diagram Overview
As the diagram states the flow,
The League_Manger is the driving class for the functioning of the overall project.
The League Class manages and handles the methods and functions of the LeagueMatch and Club class. It has a list of fixtures and clubs to store the information. The methods of this class are used to retrieve and compute information of the overall League.
The LeagueMatch Class helps in creating a fixture between two teams, where the teams are defined by the Club Class. It contains details about the fixture such as the time, venue, Home team and Away team, and their result. It also helps in stating results of a fixture.
The Club Class defines the overall characteristics of a team. It includes a Squad consisting of a Goal Keeper. It has information about the Club such as Goals Scored, Points Scored, etc. and also data about its players in the team. The Class uses the ClubPlayer Class to store its players and GoalKeeper to store its Squad GoalKeepers
The ClubPlayer class gives access to its personal information and its achievements attained during the match fixture.
The GoalKeeper Class is an extended Class of the ClubPlayer Class. It is defined as a Sub Class because it is a part of the squad but has an additional feature “Clean Sheets” as a Goal Keeper. While, it has the parameters such as goal scored, age, height, etc same as a ClubPlayer.
## Design Principle
The Sports League project was designed to replicate as close to the Premiere League Football.
The classes have been given responsibilities as designed the real case scenario.
Let me elaborate, 
The League consists of teams, and the designs different match fixtures between the clubs over a period in different locations. Hence, the League controls the data of Clubs and League Fixtures. 
The League Fixture consists of two teams and has data about the clubs and the venue details.
The Club consists of its team and achievements of the squad. Hence the Club has access to its players and collects information about the club to project it to the League.
The Player in a Club is the smallest entity in the League and hence in the bottom of the class design. Where, a player can be defined by its personal characteristics and achievements.

## Project Folder Hierarchy
Sports League (root folder)
Java Class Files (root files)
Sports League Documentation
Doc
-Java doc files for every class is present
test_case
-Fixture_Result.txt
-Fixtures.txt
-GoalKeeper CleanSheets.txt
-Player Goals.txt
-Squad.txt

## How To Run The Program
The program is developed using BlueJ Version 5.0.2.
Step 1: Unzip the Project
Step 2: Open BlueJ and open the project folder Sports League. The Class diagram should be visible in the console.
Step3: Right Click on the League_Manager Class, and click on void main (String args []) option to run the program.
Step4: View the results in the output window


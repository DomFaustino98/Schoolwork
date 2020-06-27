//Dominic Faustino
//Feb 22 2019
//Lab 2

#include <iostream>
#include <vector>
#include <string>
#include <iomanip>

using namespace std;


const int NUM_TEAMS = 4; //Constant for the number of teams
const int NUM_MEMBERS = 3; //Constant for the number of members



struct TeamS //structure TeamS with ID and string array for names
{
	int iD;
	string names[3];
};


void Initialize(vector <TeamS> &TeamV, const int id[], const string m[][NUM_MEMBERS], int arraySize); //Function to add to vectors
void displayTeams(const vector <TeamS> &TeamV); //Function to display list of teams
void menu(); //Function to display menu
void addTeam(vector <TeamS> &teamV); //Function to add a team to the list
int searchTeams(const vector <TeamS> &TeamV, int id); //Function to search for a team ID

int main()
{
	int choice; //int for the choice for menu
	int passID; //int for the ID to be search
	cout << setprecision(2) << fixed;

	vector<TeamS> TeamV;

	const int teamID[NUM_TEAMS] = { 123, 321, 456, 789 };
	const string teamMembers[NUM_TEAMS][NUM_MEMBERS]
	{
		{"Mario","Luigi","Bowser"},
		{"Link", "Zelda", "Ganondorf"},
		{"Harry","Ron", "Hermione"},
		{"Spongebob", "Patrick", "Squidward"}
	};

	Initialize(TeamV, teamID, teamMembers, NUM_MEMBERS); //Function to put info into vector
	displayTeams(TeamV); //Function to display teams

	do //Do while loop for menu
	{
	menu();

	cout << "\nPlease enter a choice: ";
	cin >> choice;

	switch (choice) //Switch statement for menu
	{
	case 1:
		displayTeams(TeamV);
		break;
	case 2:
		addTeam(TeamV);
		break;
	case 3:
		cout << "Please enter in an ID to search for: ";
		cin >> passID;
		int result = searchTeams(TeamV, passID);
		if (result == 0)
			cout << "No matching ID found";
		break;
	}

	if (choice < 1 || choice > 4) {
		cout << "Please enter in a value 1-4" << endl;
	}
	
	} while (choice != 4);
	
	cout << "\n\nLab 2 written by Dominic Faustino has ended" << endl;




	system("pause");
	return 0;
}

void Initialize(vector <TeamS> &TeamV, const int id[], const string m[][NUM_MEMBERS], int arraySize) //Adds to vector
{
	for (int i = 0; i < NUM_TEAMS; i++) //Loops through and adds the arrays to the vector
	{
		TeamS myTeam = { id[i], m[i][0], m[i][1], m[i][2] };
		TeamV.push_back(myTeam);
	}
}

void displayTeams(const vector <TeamS> &TeamV) //Displays list of teams
{
	cout << "*********** TEAM LIST *********** \n" << endl;
	for (int i = 0; i < TeamV.size(); i++) {
		cout << "Info for team " << i << endl;
		cout << "ID:\t" << TeamV[i].iD << "\t\t" << setw(10) << left << TeamV[i].names[0] << "\t" <<setw(10) << left <<  TeamV[i].names[1] << "\t" << setw(10)  << left << TeamV[i].names[2] << endl;

	}
}

void menu() //Displays a menu
{

		cout << "\n**********" << endl;
		cout << "Enter 1 to see a list of teams" << endl;
		cout << "Enter 2 to add a team to the list" << endl;
		cout << "Enter 3 to search for a team using an ID" << endl;
		cout << "Enter 4 to end the program" << endl;
		
}

void addTeam(vector <TeamS> &TeamV) //Adds a team to the vector of teams
{
	int tempID;
	string tempName1;
	string tempName2;
	string tempName3;
	cout << "Enter team ID: ";
	cin >> tempID;
	cout << "Enter member 1: ";
	cin >> tempName1;
	cout << "Enter member 2: ";
	cin >> tempName2;
	cout << "Enter member 3: ";
	cin >> tempName3;

	TeamS newTeam = { tempID, tempName1, tempName2, tempName3 }; //Make a temporary TeamS 
	TeamV.push_back(newTeam); //Push_back the temp TeamS
}

int searchTeams(const vector <TeamS> &TeamV, int id) //compares an ID value to the existing ID values and returns the match when true, or returns a value 0 for an error statement in main when false
{
	for (int i = 0; i < TeamV.size(); i++)
	{
		if (id == TeamV[i].iD) 
		{
			cout << "ID:\t" << TeamV[i].iD << "\t\t" << setw(10) << left << TeamV[i].names[0] << "\t" << setw(10) << left << TeamV[i].names[1] << "\t" << setw(10) << left << TeamV[i].names[2] << endl;
			return 1; //Return this value so it does not trigger the error check for 0
		}
	}
	return 0; //Return 0 for the error check statement in main
	
		

}
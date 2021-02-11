package Project00;

import java.util.ArrayList;

public class Course
{
    ArrayList<Team> teams = new ArrayList<>();

    public Course()
    {

    }


    public void printCourseMembers()
    {
        for(int i = 0; i < teams.size(); i++)
        {
            System.out.println(teams.get(i).getTeamName());
            teams.get(i).printTeamMembers();
            System.out.println("\n");
        }
    }


    public void createTeams()
    {
        teams.add(new Team5("Team5"));
        teams.add(new TeamCool("TeamCool"));
        teams.add(new TeamNice("TeamNice"));
        // create each new team and add to team list;
        // Repository owner will do this.
    }

}


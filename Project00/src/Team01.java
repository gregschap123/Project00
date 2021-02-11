package Project00;

import java.util.*;
import Project00.Team;
import Project00.Member;
import Project00.TeamMember;

public class Team01 extends Team {

    public Team01(String name)
    {
        super(name);
        createTeamMembers();
    }

    public void createTeamMembers()
    {
        members.add(new TeamMember("Mark Morykan"));
        members.add(new TeamMember("Kyle Schaedler"));
        members.add(new TeamMember("Richie Glennon"));
        // create a new member class for each team member
        // and add it to the team members list
    }
}

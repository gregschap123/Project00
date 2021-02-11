package Project00;

import java.util .*;
import Project00.Team;
import Project00.Member;
import Project00.TeamMember;


    public class Team5 extends Project00.Team
    {
        public Team5(String name)
        {
            super(name);
            createTeamMembers();
        }

        public void createTeamMembers()
        {
            members.add(new Project00.TeamMember("Evan Toyberg"));

        }
    }


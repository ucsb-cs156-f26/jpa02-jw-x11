package edu.ucsb.cs156.spring.hello;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TeamTest {

    Team team;

    @BeforeEach
    public void setup() {
        team = new Team("test-team");    
    }

    @Test
    public void getName_returns_correct_name() {
       assert(team.getName().equals("test-team"));
    }

       // 100% mutation coverage (all mutants timed out or killed)
    // @Test
    // public void teamToString() {
    //     team.addMember("Bob");
    //     team.addMember("Alice");
    //     String expected = "Team(name=test-team, members=[Bob, Alice])";
    //     assertEquals(expected, team.toString());
    // }

    // @Test
    // public void teamHash() {
    //     assert(team.hashCode());
    // }
}

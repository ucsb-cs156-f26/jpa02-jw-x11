package edu.ucsb.cs156.spring.hello;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

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

    @Test
    public void toString_returns_correct_string() {
        assertEquals("Team(name=test-team, members=[])", team.toString());
    }

    @Test
    public void equals_same_obj() {
        assertTrue(team.equals(team));
    }

    @Test
    public void equals_same_name(){
        Team tm2 = new Team("test-team");
        assertTrue(tm2.equals(team));
    }

    @Test
    public void equals_diff_class(){
        Integer n = 123;
        assertTrue(!team.equals(n));
    }

    @Test 
    public void equal_member_test(){
        Team t1 = new Team();
        t1.setName("foo");
        t1.addMember("bar");
        Team t2 = new Team();
        t2.setName("foo");
        t2.addMember("gar");
        assertTrue(!t1.equals(t2));
    }

    @Test 
    public void equal_member_test2(){
        Team t1 = new Team();
        t1.setName("bw");
        t1.addMember("bar");
        Team t2 = new Team();
        t2.setName("foo");
        t2.addMember("bar");
        assertTrue(!t1.equals(t2));
    }

    @Test 
    public void equal_member_test3(){
        Team t1 = new Team();
        t1.setName("abab");
        t1.addMember("bar");
        Team t2 = new Team();
        t2.setName("abab");
        t2.addMember("bar");
        assertTrue(t1.equals(t2));
    }


    @Test 
    public void hashcode_check(){
        Team t1 = new Team();
        t1.setName("foo");
        t1.addMember("bar");
        Team t2 = new Team();
        t2.setName("foo");
        t2.addMember("bar");
        assertEquals(t1.hashCode(), t2.hashCode());
    }

    @Test 
    public void hash_member_test(){
        Team t1 = new Team();
        t1.setName("foo");
        t1.addMember("bar");
        Team t2 = new Team();
        t2.setName("foo");
        t2.addMember("gar");
        assertTrue(t1.hashCode() != t2.hashCode());
    }

    @Test
    public void hash_test(){
        Team t = new Team();
        // instantiate t as a Team object
        int result = t.hashCode();
        int expectedResult = 1;
        assertEquals(expectedResult, result);
    }
    
}

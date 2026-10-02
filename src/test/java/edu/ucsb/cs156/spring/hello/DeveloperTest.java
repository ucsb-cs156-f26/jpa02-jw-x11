package edu.ucsb.cs156.spring.hello;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

import org.junit.jupiter.api.Test;

public class DeveloperTest {

    @Test
    public void testPrivateConstructor() throws Exception {
        // this hack is from https://www.timomeinen.de/2013/10/test-for-private-constructor-to-get-full-code-coverage/
        Constructor<Developer> constructor = Developer.class.getDeclaredConstructor();
        assertTrue(Modifier.isPrivate(constructor.getModifiers()),"Constructor is not private");

        constructor.setAccessible(true);
        constructor.newInstance();
    }

    @Test
    public void getName_returns_correct_name() {
        // <https://bit.ly/cs156-f26-teams>
        assertEquals("Junxi W.", Developer.getName());
    }

    @Test
    public void getGithubId_returns_correct_githubId() {
        assertEquals("jw-x11", Developer.getGithubId());
    }

    @Test
    public void getTeam_returns_team_with_correct_name() {
        Team  t = Developer.getTeam();
        assertEquals("f26-03", t.getName());
    }

    @Test
    public void getTeam_returns_team_with_correct_members() {
        Team  t = Developer.getTeam();
        assertTrue(t.getMembers().contains("Junxi W."),"Team should contain Junxi");
        assertTrue(t.getMembers().contains("Declan H."),"Team should contain Declan");
        assertTrue(t.getMembers().contains("Cody K."),"Team should contain Cody");
        assertTrue(t.getMembers().contains("Brandon K."),"Team should contain Brandon");
        assertTrue(t.getMembers().contains("Xianze G."),"Team should contain Xianze");
        assertTrue(t.getMembers().contains("Philip W."),"Team should contain Philip");
  
    }
}

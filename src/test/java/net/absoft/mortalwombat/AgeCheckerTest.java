package net.absoft.mortalwombat;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AgeCheckerTest {

    @Test
    public void testAgedUserCanPlay(){
        AgeChecker ageChecker = new AgeChecker();
        Assert.assertTrue(ageChecker.canPlayGame(19), "Aged user CAN'T play game");
    }
     @Test
    public void testThatTooYongUsersCanNotPlay(){
         AgeChecker ageChecker = new AgeChecker();
         Assert.assertFalse(ageChecker.canPlayGame(15),"Aged user CAN play game");
    }
}

package de.dagere.peass;

import org.junit.Assert;
import org.junit.Test;

public class AdditionTest {
   @Test
   public void testApp() {
      int sum = AdditionClass.addRandomNumbers(1000);
      Assert.assertNotNull(sum);
   }
}

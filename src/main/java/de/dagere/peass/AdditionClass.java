package de.dagere.peass;

import java.util.Random;

public class AdditionClass 
{
   private static final Random random = new Random();
   
   public static int addRandomNumbers(final int count) {
      int sum = 0;
      for (int i = 0; i < count; i++) {
         sum += random.nextInt();
      }
      return sum;
   }
}

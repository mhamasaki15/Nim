public class HamasakiNim
{
  
 public int play(int pieces) //The computer's guess.
 {
   int take = (int)(Math.random()*2 + 1); //This is for when pieces % 3 == 1. Aka if the person you are playing against knows what they are doing, you lose. Generates 1 of 2 randomly.
   if (pieces % 3 == 2) //If there are 2 more than a multiple of 3 left. Uses % (remainder) symbol.
   {take = 1; //This ensures that the other player will be left with 1 more than a multiple of 3.
   }
   else if (pieces % 3 == 0) //If pieces is a multiple of 3.
   {take = 2; //Subtracts 2 pieces to force other player to be left with 1 more than a multiple of 3.
   }
   
   return take; //Returns the computer's move.
 }
 
}

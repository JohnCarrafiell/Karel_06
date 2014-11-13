/**
*
* Description of the program goes here  // provide a brief description
*
* @author <Your Name here>  // replace <...> with your name
* @version <date/of/completion> // replace <...> with the date
*/

import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;
import javax.swing.JOptionPane;

public class Lab06 
{ 
public static void toWall(Robot arg)
{
   while (arg.frontIsClear()) 
   {
   arg.move();
   }
}
public static void toClearing(Robot arg)
{
   while (arg.nextToABeeper()) 
   {
   arg.move();
   }
}
public static void toBeeper(Robot arg)
{
   while (!arg.nextToABeeper()) 
   {
   arg.move();
   }
}
public static void toWallWithBeepers(Robot arg)
{
   while (arg.frontIsClear()){ 

      if (arg.nextToABeeper()){
      
      arg.pickBeeper();
      arg.move();}
      
      else if (!arg.nextToABeeper()){
      
      arg.move();}
      }   
}    
public static void toWallWithAllBeepers(Robot arg)
{
   while (arg.frontIsClear()){ 

      if (arg.nextToABeeper()){
      
      arg.pickBeeper();}
      
      else if (!arg.nextToABeeper()){
      
      arg.move();}
      
   while (!arg.frontIsClear()&&arg.nextToABeeper()){
      arg.pickBeeper();}
         }   
}
public static void toEndOfRow(Robot arg)
{
   while (arg.nextToABeeper()&&arg.frontIsClear()) 
   {
   arg.move();}
   arg.move();
   while (arg.nextToABeeper()&&arg.frontIsClear()) 
   {
   arg.move();}
}
     public static void main(String[] args) {
        String filename = JOptionPane.showInputDialog("What robot world?");
        Display.openWorld("maps/" + filename + ".map");
        Display.setSize(10, 10);
        Display.setSpeed(8);
          
        Robot pete = new Robot(1, 1, Display.EAST, 0);
        Robot john = new Robot(1, 2, Display.EAST, 0);
        Robot sam = new Robot(1, 3, Display.EAST, 0);
        Robot mary = new Robot(1, 4, Display.EAST, 0);
        Robot lisa = new Robot(1, 5, Display.EAST, 0);
        Robot karel = new Robot(1, 6, Display.EAST, 0);
        
        toClearing(pete);
        toBeeper(john);
        toWall(sam);
        toWallWithBeepers(mary);
        toWallWithAllBeepers(lisa);
        toEndOfRow(karel);
        }
}

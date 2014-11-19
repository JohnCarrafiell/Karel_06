import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;
import javax.swing.JOptionPane;
        
public class Lab06_Exercises{

public static void task_07(Robot arg){

   int count = 0;
   while (!arg.nextToABeeper()||arg.frontIsClear()){
   arg.move();
   count++;
}
System.out.println("Count is "+count);
}

public static void task_08(Robot arg){

   while (!arg.nextToARobot()&&arg.frontIsClear()){
   arg.pickBeeper();
   arg.move();
   }
   while (arg.nextToARobot()){
   arg.putBeeper();
}
}

public static void task_09(Robot arg){

   arg.putBeeper();
   arg.putBeeper();
   arg.putBeeper();
   arg.putBeeper();
   arg.move();
   arg.putBeeper();
   arg.putBeeper();
   arg.putBeeper();
   arg.putBeeper();
   arg.move();
   arg.putBeeper();
   arg.putBeeper();
   arg.putBeeper();
   arg.putBeeper();
   arg.move();
   arg.putBeeper();
   arg.putBeeper();
   arg.putBeeper();
   arg.putBeeper();
   arg.move();
   arg.putBeeper();
   arg.putBeeper();
   arg.putBeeper();
   arg.putBeeper();
   arg.move();
   
}

public static void task_10(Robot arg){

   while (arg.frontIsClear()){
   
      if (!arg.nextToABeeper()){
      
      arg.putBeeper();}
      
      else if (arg.nextToABeeper()){
      
      arg.move();}
      }
  }
  
public static void task_11(Robot arg){

   while (arg.frontIsClear()){
   
      if (!arg.rightIsClear()){
      
      arg.putBeeper();}
      
      else if (arg.rightIsClear()){
      
      arg.move();}
   }
}
   
public static void task_12(Robot arg){

   while (!arg.nextToABeeper()&&!arg.rightIsClear()){
   
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
        
     task_07(pete);
     task_08(john);
     task_09(sam);
     task_10(mary);
     task_11(lisa);
     task_12(karel);
        
}
}

   

   
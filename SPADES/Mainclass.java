import java.util.*;
import javax.swing.*;
//-----------------------------------------
/**
*THIS THE PROGRAM THAT NEEDS TO BE RUN 
*FOR THE GAME TO BE PLAYED!!!!!!!!!!!!!!!
*/
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class Mainclass {
 public static void main(String[] args)throws Exception{
      int ans = JOptionPane.showConfirmDialog(null, "PLAY SPADES GAME NOW!");
        if( ans == JOptionPane.YES_OPTION){
  String[] retunednumber;
  
 // String numbers = JOptionPane.showInputDialog(null,"HOW MANY PLAYERS DO YOU HAVE: "+" "+"ENTER 3 OR 4:"+" "+"\n(NOTE THAT 3 PLAYERS MEANS THAT THE FOURTH PLAYER WILL BE THE AI)");
 // int playernumber = Integer.parseInt(numbers);
 

   retunednumber=SetPlayers.Fourplayers ();//array of names
   // derick code
   int[] arrayofbid=SetPlayers.SetBid();//array of  bid
   Spades.Play();

       
   Players4.Main(retunednumber);
  }
 
    else{
        System.exit(2);
            
    }
    
 }
}
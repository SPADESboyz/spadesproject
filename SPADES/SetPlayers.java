import java.util.Scanner;
import java.util.Arrays;
import java.util.*;
import javax.swing.*;
/**
*this is the that need to be executed for the other classes to be used  
*All the methods in here are public static ,can be accessed in other program without instantiating an object 
*
*/
public class  SetPlayers{
    
private static String name1;
private static String name2;
private static String name3;
private static String name4;

    
 private static Scanner in=new Scanner(System.in);
    
 public static String[] ThreePlayers (){
  /**this method enters the name of the players,only when there is three  player*/
  
   String [] name=new String[4];
   JOptionPane.showMessageDialog(null, "PLEASE ENTER THE NAMES OF THE PLAYERS!:");
   System.out.println("                                ");
    name1 = JOptionPane.showInputDialog(null,"PLEASE ENTER YOUR NAME PLAYER ONE!:");
   
   String player1= name1;
   while(player1.equals("")){
    name1 = JOptionPane.showInputDialog(null,"PLEASE ENTER YOUR NAME PLAYER ONE!:");
    player1= name1;
   }
   name[0]=player1;
   name2 = JOptionPane.showInputDialog(null,"PLEASE ENTER YOUR NAME PLAYER TWO!:");
   //System.out.print("player2: ");
   String player2= name2;
   while(player2.equals("")){
    name2 = JOptionPane.showInputDialog(null,"PLEASE ENTER YOUR NAME PLAYER TWO!:");
     player2= name2;
   }
   name[1]=player2;
   
   name3 = JOptionPane.showInputDialog(null,"PLEASE ENTER YOUR NAME PLAYER THREE!:");
   String player3= name3;
   while(player3.equals("")){
   name3 = JOptionPane.showInputDialog(null,"PLEASE ENTER YOUR NAME PLAYER THREE!:");
   player3= name3;
   }
   name[2]=player3;
   String player4="James";
   name[3]=player4; 
   return name;
  
 }
 public static String[] Fourplayers (){
  /**this method enters the name of the players,only when there is four  player*/
  
   String [] names=new String[4];
   JOptionPane.showMessageDialog(null, "PLEASE ENTER THE NAMES OF THE PLAYERS!:");
   System.out.println("                                ");
   name1 = JOptionPane.showInputDialog(null,"PLEASE ENTER YOUR NAME PLAYER ONE!:");
   
   String playerone= name1 ;
   while(playerone.equals("")){
    name1 = JOptionPane.showInputDialog(null,"PLEASE ENTER YOUR NAME PLAYER ONE!:");
     playerone= name1;
   }
   names[0]=playerone;
   
   name2 = JOptionPane.showInputDialog(null,"PLEASE ENTER YOUR NAME PLAYER TWO!:");
   String playertwo= name2;
   while(playertwo.equals("")){
   name2 = JOptionPane.showInputDialog(null,"PLEASE ENTER YOUR NAME PLAYER TWO!:");
     playertwo= name2;
   }
   names[1]=playertwo;
   name3 = JOptionPane.showInputDialog(null,"PLEASE ENTER YOUR NAME PLAYER THREE!:");
   String playerthree= name3;
   while(playerthree.equals("")){
   name3 = JOptionPane.showInputDialog(null,"PLEASE ENTER YOUR NAME PLAYER ONE!:");
     playerthree= name3;
   }
   names[2]=playerthree;
   name4 = JOptionPane.showInputDialog(null,"PLEASE ENTER YOUR NAME PLAYER FOUR!:");
   String playerfour= name4;
   while(playerfour.equals("")){
    name4 = JOptionPane.showInputDialog(null,"PLEASE ENTER YOUR NAME PLAYER ONE!:");
     playerfour= name4;
   }
   final String[] y = names;
   
   return names;
 }
 
 public static int[] SetBid(){
  /**the method set the bids for the four players*/
  int[] bid=new int[4];
  
  
  String bidd1 = JOptionPane.showInputDialog(null,name1.toUpperCase()+" "+"WHAT DO YOU BID OR WHAT IS YOUR PREDICTION?(LIMIT 13 BIDS):"+"\n"+"( IN OTHER WORDS PREDICT HOW MANY TIMES YOU THINK YOU WILL WIN)");
  int bid1  = Integer.parseInt(bidd1);
  int pl1= bid1;
  bid[0]=pl1;

  
 String bidd2 = JOptionPane.showInputDialog(null,name2.toUpperCase()+" "+"WHAT DO YOU BID OR WHAT IS YOUR PREDICTION?(LIMIT 13 BIDS):"+"\n"+"( IN OTHER WORDS PREDICT HOW MANY TIMES YOU THINK YOU WILL WIN)");
 int bid2  = Integer.parseInt(bidd2);
  int pl2= bid2;
  bid[1]=pl2;
  
  String bidd3 = JOptionPane.showInputDialog(null,name3.toUpperCase()+" "+"WHAT DO YOU BID OR WHAT IS YOUR PREDICTION?(LIMIT 13 BIDS):"+"\n"+"( IN OTHER WORDS PREDICT HOW MANY TIMES YOU THINK YOU WILL WIN)");
  int bid3  = Integer.parseInt(bidd3);
  int pl3= bid3;
  bid[2]=pl3;
  
  String bidd4 = JOptionPane.showInputDialog(null,name4.toUpperCase()+" "+"WHAT DO YOU BID OR WHAT IS YOUR PREDICTION?(LIMIT 13 BIDS):"+"\n"+"( IN OTHER WORDS PREDICT HOW MANY TIMES YOU THINK YOU WILL WIN)");
  int bid4  = Integer.parseInt(bidd4);
  int pl4= bid4;
  bid[3]=pl4;
  
 JOptionPane.showMessageDialog(null, "ATTENTION! NOTE THAT IN ORDER FOR THE GAME TO WORK"+"\n"+name1.toUpperCase()+" "+"MUST PLAY FIRST"+"\n"+"AND"+" "+name2.toUpperCase()+" "+"MUST PLAY SECOND"+"\n"+"THEN FOLLOWED BY"+" "+name3.toUpperCase()+" "+"AND THEN"+" "+name1.toUpperCase() );
 JOptionPane.showMessageDialog(null,name1.toUpperCase()+" "+"PLEASE SELECT A CARD IN ORDER TO START GAME!");
  return bid;
 }
 public static int[] SetBid3 (){
     
  /**the method set the bids for the three players*/
  //names = ThreeNames(ThreePlayers ());
 // System.out.println(y.name[0]);/** Storing our return value to names*/
  
  int[] bid=new int[4];
  
  String bidd1 = JOptionPane.showInputDialog(null,name1.toUpperCase()+" "+"WHAT DO YOU BID OR WHAT IS YOUR PREDICTION?(LIMIT 13 BIDS):");
  int bid1  = Integer.parseInt(bidd1);
  int pl1= bid1;
  bid[0]= bid1 ;
  String bidd2 = JOptionPane.showInputDialog(null,name2.toUpperCase()+" "+"WHAT DO YOU BID OR WHAT IS YOUR PREDICTION?(LIMIT 13 BIDS):");
  int bid2  = Integer.parseInt(bidd2);
  bid[1]= bid2;
  String bidd3 = JOptionPane.showInputDialog(null,name3.toUpperCase()+" "+"WHAT DO YOU BID OR WHAT IS YOUR PREDICTION?(LIMIT 13 BIDS):");
  int bid3  = Integer.parseInt(bidd3);
  bid[2]= bid3;
  
  Random random=new Random();
  int rand=random.nextInt(5);
  bid[3]=rand;
  
  
  return bid;
 }
 
 public static String names1(){
     return name1;
 }
 public static String names2(){
     return name2;
 }
  public static String names3(){
     return name3;
 }
  public static String names4(){
     return name4;
 } 
}
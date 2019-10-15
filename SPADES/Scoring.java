import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.io.BufferedReader;

import javax.swing.JFrame;
import javax.swing.JLabel;

import javax.swing.*;


public class Scoring
{
 private static String [] players = new String [4];
 
 private static JFrame fram;
 
 //for the help menu
 private static JFrame help;
 private static JLabel [] instruct = new JLabel[24];
 
 //
 private static JLabel team_A,team_B,player_1,player_2,player_3,player_4,total_1,total_2,a,b,c,d,e,f,g,h,i;
 
 private static JLabel [] scores= new JLabel[12];
 private static  JLabel [] score_v= new JLabel [2];
 private static int [] V_score = new int [2];
 
 public static int [] points = new int [4];
 private static int [] bids = new int[4];
 
 private static JLabel [] bag = new JLabel[2];
 private static int [] bag_v = new int[2];
 private static int [] n_bag_v = new int[2];
 
 
 //Constructor for the game
 public  Scoring(String [] players , int [] bids)
 {
  this.players[0]=players[0];
  this.players[1]=players[1];
  this.players[2]=players[2];
  this.players[3]=players[3];
  
  this.bids[0]=bids[0];
  this.bids[1]=bids[1];
  this.bids[2]=bids[2];
  this.bids[3]=bids[3];
  
 }
 
 public Scoring()
 {
  this.players[0]=players[0];
 }
 
 public static void ScoreBoard()
 // The R_score is representting the scores in a form of string
 {
  if((points[0]+points[1]+points[2]+points[3])<14)
  {
   System.out.println("Not valid answer");
  }
  else
  {
   fram = new JFrame("The Score of the Round");
   
   team_A = new JLabel("Team_A");
   team_A.setBounds(210,15,100,30);
   
   ///
   a=new JLabel("Team_A");
   a.setBounds(1050,15,100,30);
   
   e=new JLabel("Score");
   e.setBounds(1030,60,100,25);
   
   f=new JLabel("Bags");
   f.setBounds(1140,60,100,25);
   //
   
   team_B=new JLabel("Team_B");
   team_B.setBounds(570,15,100,30);
   
   //
   b=new JLabel("Team_B");
   b.setBounds(1300,15,100,30);
   
   g=new JLabel("Score");
   g.setBounds(1280,60,100,25);
   
   
   h=new JLabel("Bags");
   h.setBounds(1380,60,100,25);
   
   ///
   c= new JLabel("BIDS");
   c.setBounds(0,90,80,25);
   
   d=new JLabel("Actual");
   d.setBounds(0,120,80,25);
   
   //
   player_1 = new JLabel(players[0]);
   player_1.setBounds(150,60,100,25);
   
   //actual scores for P1
   scores[0]= new JLabel(Integer.toString(points[0]));
   scores[0].setBounds(160,120,50,15);
   
   //bided scores for P1
   scores[6]=new JLabel(Integer.toString(bids[0]));
   scores[6].setBounds(160,90,50,15);
   //
   
   //
   player_2 = new JLabel(players[1]);
   player_2.setBounds(270,60,100,25);
   
   //actual scores P2
   scores[1]=new JLabel(Integer.toString(points[1]));
   scores[1].setBounds(280,120,50,15);
   
   //bided scores P2
   scores[7]=new JLabel(Integer.toString(bids[1]));
   scores[7].setBounds(280,90,50,15);
   //
   
   total_1=new JLabel("Total");
   total_1.setBounds(380,60,100,25);
   
   //actual scores
   scores[2]=new JLabel(Integer.toString(points[0]+points[1]));
   scores[2].setBounds(390,120,50,15);
   
   //bided scores
   scores[11]=new JLabel(Integer.toString(bids[0]+bids[1]));
   scores[11].setBounds(390,90,50,15);
   //
   player_3 = new JLabel(players[2]);
   player_3.setBounds(500,60,100,25);
   
   //actual scores P3
   scores[3]=new JLabel(Integer.toString(points[2]));
   scores[3].setBounds(510,120,50,15);
   
   //bided scores P3
   scores[8]=new JLabel(Integer.toString(bids[2]));
   scores[8].setBounds(510,90,50,15);
   //
   
   player_4 = new JLabel(players[3]);
   player_4.setBounds(670,60,100,25);
   
   //actual scores P4
   scores[4]=new JLabel(Integer.toString(points[3]));
   scores[4].setBounds(680,120,50,15);
   
   //bided scores P4
   scores[9]=new JLabel(Integer.toString(bids[3]));
   scores[9].setBounds(680,90,50,15);
   //
   total_2=new JLabel("Total");
   total_2.setBounds(780,60,100,25);
   
   //actual scores
   scores[5]=new JLabel(Integer.toString(points[2]+points[3]));
   scores[5].setBounds(790,120,50,15);
   
   //bided scores
   scores[10]=new JLabel(Integer.toString(bids[2]+bids[3]));
   scores[10].setBounds(790,90,50,15);
   //
   
   //This for Team 1  don't get the bid
   if(points[0]+points[1] < bids[0]+bids[1])
   {
    bag_v[0]+=0;
    V_score[0]-=(bids[0]+bids[1])*10;
    //when player 1 got his bid nill
    if(bids[0]==0 || points[0]==0)
    {
     score_v[0]=new JLabel(Integer.toString(-100+(100+(V_score[0]))));
     score_v[0].setBounds(1040,90,50,15);
     
     bag[0] = new JLabel(Integer.toString(bag_v[0]));
     bag[0].setBounds(1150,90,50,15);
     
    }
    
    //when player 2 got his bid nill
    if(bids[1]==0 || points[1]==0)
    {
     score_v[0]=new JLabel(Integer.toString(-100+(100+(V_score[0]))));
     score_v[0].setBounds(1040,90,50,15);
     
     bag[0] = new JLabel(Integer.toString(bag_v[0]));
     bag[0].setBounds(1150,90,50,15);
     
    }
    
    //when the team 1 total is under the bid total
    else
    {
     score_v[0]= new JLabel(Integer.toString(V_score[0]));
     score_v[0].setBounds(1040,90,50,15);
     
     bag[0] = new JLabel(Integer.toString(bag_v[0]));
     bag[0].setBounds(1150,90,50,15);
     
    }
   }
   
   //when Team 1 get the bid
   else
   {
    //Bags for Team 1
    bag_v[0]+=(points[0]+points[1])-(bids[0]+bids[1]);
    n_bag_v[0]=(points[0]+points[1])-(bids[0]+bids[1]);
    
    V_score[0]+=(bids[0]+bids[1])*10;
    //When their bag is above 10 points
    if(bag_v[0]>=10)
    {
     if(bids[0]==0 || points[0]==0)
     {
      score_v[0]=new JLabel(Integer.toString((100+((V_score[0])-(100)))));
      score_v[0].setBounds(1040,90,50,15);
      bag_v[0]-=10;
      
      bag[0] = new JLabel(Integer.toString(bag_v[0]));
      bag[0].setBounds(1150,90,50,15);
     }
     
     //when player 2 got his bid nill
     if(bids[1]==0 || points[1]==0)
     {
      score_v[0]=new JLabel(Integer.toString(100+(((V_score[0])-100))));
      score_v[0].setBounds(1040,90,50,15);
      bag_v[0]-=10;
      
      bag[0] = new JLabel(Integer.toString(bag_v[0]));
      bag[0].setBounds(1150,90,50,15);
     }
     
     //when both player from team 1 didn't get a nill bid
     else
     {
      score_v[0]= new JLabel(Integer.toString(((V_score[0])-100)));
      score_v[0].setBounds(1040,90,50,15);
      bag_v[0]-=10;
      
      bag[0] = new JLabel(Integer.toString(bag_v[0]));
      bag[0].setBounds(1150,90,50,15);
     }
    }
    
    //when their bag is below 10 points
    else
    {
     //when player 1 got his nill bid
     if(bids[0]==0 || points[0]==0)
     {
      score_v[0]=new JLabel(Integer.toString((100+((V_score[0])+(n_bag_v[0])))));
      score_v[0].setBounds(1040,90,50,15);
      
      bag[0] = new JLabel(Integer.toString(bag_v[0]));
      bag[0].setBounds(1150,90,50,15);
     }
     
     //when player 2 got his bid nill
     if(bids[1]==0 || points[1]==0)
     {
      score_v[0]=new JLabel(Integer.toString(100+(((V_score[0])+n_bag_v[0]))));
      score_v[0].setBounds(1040,90,50,15);
      
      
      bag[0] = new JLabel(Integer.toString(bag_v[0]));
      bag[0].setBounds(1150,90,50,15);
     }
     
     //when the team 1 total is over or equal to the bid total
     else
     {
      score_v[0]= new JLabel(Integer.toString(((V_score[0])+n_bag_v[0])));
      score_v[0].setBounds(1040,90,50,15);
      
      
      bag[0] = new JLabel(Integer.toString(bag_v[0]));
      bag[0].setBounds(1150,90,50,15);
     }
     
    }
    
   }
   
   //This for Team 2  don't get the bid
   if(points[2]+points[3] < bids[2]+bids[3])
   {
    //Bags for Team 2
    bag_v[1]+=0;
    
    V_score[1]-=(bids[2]+bids[3])*10;
    //when player 3 got his bid nill
    if(bids[2]==0 || points[2]==0)
    {
     score_v[1]=new JLabel(Integer.toString(-100+(100+(V_score[1]))));
     score_v[1].setBounds(1270,90,50,15);
     
     bag[1] = new JLabel(Integer.toString(bag_v[1]));
     bag[1].setBounds(1390,90,50,15);
    }
    
    //when player 4 got his bid nill
    if(bids[3]==0 || points[3]==0)
    {
     score_v[1]=new JLabel(Integer.toString(-100+(100+(V_score[1]))));
     score_v[1].setBounds(1270,90,50,15);
     
     bag[1] = new JLabel(Integer.toString(bag_v[1]));
     bag[1].setBounds(1390,90,50,15);
    }
    
    //when the Team 2 total is under the bid total
    else
    {
     score_v[1]= new JLabel(Integer.toString(-100+((V_score[1]))));
     score_v[1].setBounds(1270,90,50,15);
     
     bag[1] = new JLabel(Integer.toString(bag_v[1]));
     bag[1].setBounds(1390,90,50,15);
    }
   }
   
   //when Team 2 get the bid and above
   else
   {
    //Bags for Team 2
    bag_v[1]+=(points[2]+points[3])-(bids[2]+bids[3]);
    n_bag_v[1]=(points[2]+points[3])-(bids[2]+bids[3]);
    
    //When their bag is above 10 points
    if(bag_v[1]>=10)
    {
     //when player 3 got his nill bid
     if(bids[2]==0 || points[2]==0)
     {
      score_v[1]=new JLabel(Integer.toString((100+((V_score[1])-(100)))));
      score_v[1].setBounds(1270,90,50,15);
      bag_v[1]-=10;
      
      bag[1] = new JLabel(Integer.toString(bag_v[1]));
      bag[1].setBounds(1390,90,50,15);
     }
     
     //when player 4 got his bid nill
     if(bids[3]==0 || points[3]==0)
     {
      score_v[1]=new JLabel(Integer.toString(100+(((V_score[1])-100))));
      score_v[1].setBounds(1270,90,50,15);
      bag_v[1]-=10;
      
      bag[1] = new JLabel(Integer.toString(bag_v[1]));
         bag[1].setBounds(1390,90,50,15);
     }
     
     //when the Team 2 total is under the bid total
     else
     {
      score_v[1]= new JLabel(Integer.toString(((V_score[1])-100)));
      score_v[1].setBounds(1270,90,50,15);
      bag_v[1]-=10;
      
      bag[1] = new JLabel(Integer.toString(bag_v[1]));
      bag[1].setBounds(1390,90,50,15);
     }
    }
    //when their bag is below 10 points
    else
    {
     //when player 3 got his nill bid
     if(bids[2]==0 || points[2]==0)
     {
      score_v[1]=new JLabel(Integer.toString((100+((V_score[1])+(n_bag_v[1])))));
      score_v[1].setBounds(1270,90,50,15);
      
      bag[1] = new JLabel(Integer.toString(bag_v[1]));
      bag[1].setBounds(1390,90,50,15);
     }
     
     //when player 4 got his bid nill
     if(bids[3]==0 || points[3]==0)
     {
      score_v[1]=new JLabel(Integer.toString(100+(((V_score[1])+n_bag_v[1]))));
      score_v[1].setBounds(1270,90,50,15);
      
      bag[1] = new JLabel(Integer.toString(bag_v[1]));
      bag[1].setBounds(1390,90,50,15);
     }
     
     //when the Team 2 total is over or equal to the bid total
     else
     {
      score_v[1]= new JLabel(Integer.toString(((V_score[1])+n_bag_v[1])));
      score_v[1].setBounds(1270,90,50,15);
      
      bag[1] = new JLabel(Integer.toString(bag_v[1]));
      bag[1].setBounds(1390,90,50,15);
     }
     
    }
    
   }

   //Writing the teams and players names
   fram.add(team_A);
   fram.add(team_B);
   fram.add(player_1);
   fram.add(player_2);
   fram.add(player_3);
   fram.add(player_4);
   
   //This part adds the totals and the points also
   fram.add(total_1);
   fram.add(total_2);
   fram.add(a);
   fram.add(b);
   fram.add(c);
   fram.add(d);
   fram.add(e);
   fram.add(f);
   fram.add(g);
   fram.add(h);
   
   //actual values added
   fram.add(scores[0]);
   fram.add(scores[1]);
   fram.add(scores[2]);
   fram.add(scores[3]);
   fram.add(scores[4]);
   fram.add(scores[5]);
   
   //bid values added 
   fram.add(scores[6]);
   fram.add(scores[7]);
   fram.add(scores[8]);
   fram.add(scores[9]);
   fram.add(scores[10]);
   fram.add(scores[11]);
   
   //the score and the bags 
   fram.add(score_v[0]);
   fram.add(score_v[1]);
   fram.add(bag[0]);
   fram.add(bag[1]);
   
   
   fram.setSize(1300,400);
   fram.setLayout(null);
   fram.setVisible(true);
   fram.setLocationRelativeTo(null);
   fram.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   
  }
  
 }
 
 public static void CountPoints(String a,int num)
 {
  
  /* The below lines will keep on adding number of wins each player gets
  and goes back to the game atill every player has no card */
  
  //System.out.println(points);
  
  if(num==0)
  {
   System.out.println("The end of the first round");
  }
  
  else
  {
   if(a.equalsIgnoreCase(players[0]))
   {
    //(Player_1 won the Round);
    points[0]+=1;
   }
   
   if(a.equalsIgnoreCase(players[1]))
   {
    //(Player_2 won the Round);
    points[1]+=1;
   }
   
   if(a.equalsIgnoreCase(players[2]))
   {
    //(Player_3 won the Round);
    points[2]+=1;
   }
   
   if(a.equalsIgnoreCase(players[3]))
   {
    //(Player_4 won the Round);
    points[3]+=1;
   }
  }
  //ScoreBoard();
  
  
 }
 
 public static String [] Game(String [] p)
 {
  Scanner input=new Scanner(System.in);
  
  System.out.println("Which player won \n"+p[0]+"\n"+p[1]+"\n"+p[2]+"\n"+p[3]); 
  String input1=input.nextLine();
  System.out.println("enter 0 to quiet and any number to continue:");
  String input2=input.nextLine();
  
  String [] comB={input1,input2};
  
  return comB; 
 }
 
 public static void Help() 
 {    

  // ask the user a yes/no question 12   
  for(int i=0;i<4;i++)
  {
   int choice = JOptionPane.showConfirmDialog(null,"Do you like to learn how the game works ?");    // show different response depending on answer       

   if (choice == JOptionPane.YES_OPTION) 
   {
    help = new JFrame("The instruction box");
    instruct[0] = new JLabel("INSTRUCTION ON HOW THE SPADES GAME WORK");
    instruct[0].setBounds(100,10,1300,10);
    
    instruct[1] = new JLabel("Step 1 : Each player is given a chance to Bid on how ,many times are they giong to win in the Game that's giong to start.");
    instruct[1].setBounds(0,30,1300,10);
    
    instruct[2] = new JLabel("Step 2 : If a player chooses that they won't get any wins in the game that's giong to start, then if it is true they get");
    instruct[2].setBounds(0,40,1300,10);
    
    instruct[3] = new JLabel("extra 100 points at the end of a round else 100 points will be dedacted from them at the end of the round.");
    instruct[3].setBounds(10,54,1300,10);
    
    
    instruct[4] = new JLabel("Step 3 : The way Scores are given as fellow if the Total Bid wins of Team is equal to the Actual Total wins of the Team, then they total");
    instruct[4].setBounds(0,68,1300,10);
    
    instruct[5] = new JLabel("Bid wins of that team will be multiply by ten and added to their previous score to make their total score as a Team.");
    instruct[5].setBounds(10,82,1300,10);
   
    instruct[6] = new JLabel("If the Total Bid wins of the Team are greater then the Actual Total wins of the Team, then their total Bid wins will be multiplied by ten then dedacted");
    instruct[6].setBounds(10,94,1300,10);
    
    instruct[7] = new JLabel("from thier present score.");
    instruct[7].setBounds(10,108,1300,10);
    
    instruct[8] = new JLabel("If the Total Bid wins of the Team are less than the Actual Total wins of the Team, then thier total Bid wins will be multiplied by ten and added with the");
    instruct[8].setBounds(10,122,1300,10);
    
    instruct[9] = new JLabel("difference betweeen the Actual total wins of the Team and the total Bids wins of the Team , after it is added to thier present score, and the differences between");
    instruct[9].setBounds(10,136,1300,10);
    
    instruct[10] = new JLabel("the Actual total and the total Bid wins of the will be added as the Bag ,Once the Bag reaches or passes 10 the Team will loose 100 points from thier score and then the bag is reduced by 10.");
    instruct[10].setBounds(10,150,1300,10);
    
    instruct[11] = new JLabel("Step 4 : The first Team to get to score of 500 is the one that wins the game, but if it happens both Teams reach score 500 in the same round then the Team with the highest points will be assigned as the ");
    instruct[11].setBounds(0,164,1300,10);
    
    instruct[12] = new JLabel("winners of the game.");
    instruct[12].setBounds(10,178,1300,10);
    
    instruct[13] = new JLabel("Now to explain how the points are obtained during the game and some rules along the way");
    instruct[13].setBounds(40,192,1300,10);
    
    instruct[14] = new JLabel("Step 5 : First the Dealer in the game shuffles the Cards propa and then starts hending a card from the player to the left of him giong on a clock wise direction since each player will be at 90 degrees to");
    instruct[14].setBounds(0,206,1300,10);
    
    instruct[15] = new JLabel("each other, He/She will do this atill every player has 13 cards infront of them head down.");
    instruct[15].setBounds(10,220,1300,10);
    
    instruct[16] = new JLabel("Step 6 : Then they turn thier cards over and then thier given the chance to Bid thier wins after the game is started by the Dealer by putting a suit for each player to follow then the player on his/her left");
    instruct[16].setBounds(0,234,1300,10);
    
    instruct[17] = new JLabel("will play and it follows in a clock wise direction.");
    instruct[17].setBounds(10,248,1300,10);
    
    instruct[18] = new JLabel("Step 7 : Now to the Ranks of our cards, The Ace of every suit card is the highest followed by the King,Queen giong down to two of that suit as the lowest, but know that Spades are regarded as the highest value suits in");
    instruct[18].setBounds(0,262,1300,10);
    
    instruct[19] = new JLabel("the game but also have highest value from Ace of Spades going down to two of Spades, but note the two of Spades is greater than all the other suit value except its own suit.");
    instruct[19].setBounds(10,276,1300,10);
    
    instruct[20] = new JLabel("Step 8 : When the a player is putting a leading suit, they can't put spades as the leading unless it the only suit they have, and during the game if a player doesn't have a card to follow the suit then they can another");
    instruct[20].setBounds(0,290,1300,10);
    
    instruct[21] = new JLabel("card but a score of 10 will be dedacted from thier present Team score, but if the other card he playes is a Spades then the won't be any score dedacted from thier Team score.");
    instruct[21].setBounds(10,304,1300,10);
    
    instruct[22] = new JLabel("Step 9 : So a player only gets a point if the card they put on the Table is the greatest among the ones in the table and they get one win as a point, then the score is diplayed once everyone has no card in their position.");
    instruct[22].setBounds(0,318,1300,10);
    
    instruct[23] = new JLabel("Have fun playing this wonderful game !!!!!!!");
    instruct[23].setBounds(50,332,1300,10);
    
    help.add(instruct[0]);
    help.add(instruct[1]);
    help.add(instruct[2]);
    help.add(instruct[3]);
    help.add(instruct[4]);
    help.add(instruct[5]);
    help.add(instruct[6]);
    help.add(instruct[7]);
    help.add(instruct[8]);
    help.add(instruct[9]);
    help.add(instruct[10]);
    help.add(instruct[11]);
    help.add(instruct[12]);
    help.add(instruct[13]);
    help.add(instruct[14]);
    help.add(instruct[15]);
    help.add(instruct[16]);
    help.add(instruct[17]);
    help.add(instruct[18]);
    help.add(instruct[19]);
    help.add(instruct[20]);
    help.add(instruct[21]);
    help.add(instruct[22]);
    help.add(instruct[23]);
    
    help.setSize(2000,2000);
    help.setLayout(null);
    help.setVisible(true);
    help.setLocationRelativeTo(null);
    help.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   } 
   else 
   {  // choice == NO_OPTION or CANCEL_OPTION 20   
    System.out.println("");
   }
  }
  
 }
 
    public static void TakeV (String[] args)
    {
  Scanner input=new Scanner(System.in);
  Scanner anoth= new Scanner(System.in);
  
  Help();
  
   while(points[0]+points[1]+points[2]+points[3]<=13)
//   String[] w_player=Game(players);
 //  CountPoints(w_player[0],Integer.parseInt(w_player[1]));
   ScoreBoard();
  }
  
 
 }

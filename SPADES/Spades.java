import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import java.awt.Graphics;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;



public class Spades extends MouseInputAdapter{
static private Cards[] playerA;    
static private Cards[] playerB; 
static private Cards[] playerC; 
static private Cards[] playerD;

public static void Play() throws IOException{


// listener or event    
Cards cards = new Cards("Spades","Ace",27,ImageIO.read(new File("Ace_Of_Spades.png")));// created a class where we can use the methods stored in the Cards class
 Cards[][] players = cards.Players();
 playerA = players[0];
 playerB = players[1];    
 playerC = players[2];
 playerD = players[3];

JFrame window = new JFrame("Spades");
window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
window.setSize(500,300); 



final CardLayout storingPanels = new CardLayout(); 
final JPanel cardPanel = new JPanel( storingPanels);


JLabel[] index = new JLabel[13];
JPanel cardPanelOne = new JPanel();


JLabel[] nw = new JLabel[13];
for(int i = 0 ; i < index.length ; i++){
  JLabel labelingOne = new JLabel( new ImageIcon(playerA[i].printImage()));
  nw[i] = labelingOne = new JLabel( new ImageIcon(playerA[i].printImage()));
Compo co = new Compo(cardPanelOne,labelingOne,playerA,nw );  
labelingOne.addMouseListener(co);// check this out
labelingOne.addMouseMotionListener(co);
cardPanelOne.add(labelingOne);
}

cardPanelOne.setBackground(Color.green.darker().darker());


JPanel cardPanelTwo = new JPanel();// created a different panel to hold a different set of cards
JLabel[] nw1 = new JLabel[13];
//JLabel[] nw = new JLabel[13];
for(int i = 0 ; i < 13; i++){
JLabel labelingTwo = new JLabel( new ImageIcon(playerB[i].printImage()));
nw1[i] = labelingTwo = new JLabel( new ImageIcon(playerB[i].printImage()));
Compo1 co1 = new Compo1(cardPanelTwo,labelingTwo,playerB,nw1 );  
labelingTwo.addMouseListener(co1);// check this out
labelingTwo.addMouseMotionListener(co1);

cardPanelTwo.add(labelingTwo);// storing those cards in card2
}
cardPanelTwo.setBackground(Color.green.darker().darker());

//----------------------------
JPanel cardPanelThree = new JPanel();// created a different panel to hold a different set of cards
JLabel[] nw2 = new JLabel[13];
for(int i = 0 ; i < 13; i++){
JLabel labelingThree = new JLabel( new ImageIcon(playerC[i].printImage()));
nw2[i] = labelingThree = new JLabel( new ImageIcon(playerC[i].printImage()));
Compo2 co2 = new Compo2(cardPanelThree,labelingThree,playerC,nw2 );  
labelingThree.addMouseListener(co2);// check this out
labelingThree.addMouseMotionListener(co2);
cardPanelThree.add(labelingThree);// storing those cards in card2
}
cardPanelThree.setBackground(Color.green.darker().darker()); 

//-----------------------------------------------


/** created a different panel to hold a different set of cards and to show the cards on the panel 
*/
JPanel cardPanelFour = new JPanel();
JLabel[] nw3 = new JLabel[13];
for(int i = 0 ; i < 13; i++){
JLabel labelingFour = new JLabel( new ImageIcon(playerD[i].printImage()));
nw3[i] = labelingFour = new JLabel( new ImageIcon(playerD[i].printImage()));
Compo3 co3 = new Compo3(cardPanelFour,labelingFour,playerD,nw3 );  
labelingFour.addMouseListener(co3);
labelingFour.addMouseMotionListener(co3);
cardPanelFour.add(labelingFour);
}
/** here we are changing the color of the background */
cardPanelFour.setBackground(Color.green.darker().darker()); 
//---------------------------------------------------
/** here we are adding the the different panels in the main panel and the strings names are used to differentiate the added panels */
cardPanel.add(cardPanelOne,"First");
cardPanel.add(cardPanelTwo,"Second");
cardPanel.add(cardPanelThree,"Third");
cardPanel.add(cardPanelFour,"Fourth");

// create two buttons 
JPanel addButtons = new JPanel();
JButton button1 = new JButton(SetPlayers.names1().toUpperCase());
JButton button2 = new JButton(SetPlayers.names2().toUpperCase());
JButton button3 = new JButton(SetPlayers.names3().toUpperCase());
JButton button4 = new JButton(SetPlayers.names4().toUpperCase());
JButton button5 = new JButton("HELP!");
addButtons.add(button1);
addButtons.add(button2);
addButtons.add(button3);
addButtons.add(button4);
addButtons.add(button5);


JPanel cardPanelHelp = new JPanel();
JLabel [] instruct = new JLabel[24];

/** The below code is storing the instructions from the Jlabel and adding it to the cardPanelHelp in order for it to be displayed */ 
instruct[0] = new JLabel("HELP!");//INSTRUCTION ON HOW THE SPADES GAME WORK"
instruct[0].setBounds(100,10,1300,10);

instruct[1] = new JLabel("Step 1 : Each player is given a chance to Bid on how ,many times are they going to win in the Game that's going to start.");
instruct[1].setBounds(0,30,1300,10);

instruct[2] = new JLabel("Step 2 : If a player chooses that they won't get any wins in the game that's going to start, then if it is true they get");
instruct[2].setBounds(0,40,1300,10);

instruct[3] = new JLabel("extra 100 points at the end of a round else 100 points will be deducted from them at the end of the round.");
instruct[3].setBounds(10,54,1300,10);


instruct[4] = new JLabel("Step 3 : The way Scores are given as fellow if the Total Bid wins of Team is equal to the Actual Total wins of the Team, then they total");
instruct[4].setBounds(0,68,1300,10);

instruct[5] = new JLabel("Bid wins of that team will be multiply by ten and added to their previous score to make their total score as a Team.");
instruct[5].setBounds(10,82,1300,10);

instruct[6] = new JLabel("If the Total Bid wins of the Team are greater then the Actual Total wins of the Team, then their total Bid wins will be multiplied by ten then deducted");
instruct[6].setBounds(10,94,1300,10);

instruct[7] = new JLabel("from their present score.");
instruct[7].setBounds(10,108,1300,10);

instruct[8] = new JLabel("If the Total Bid wins of the Team are less than the Actual Total wins of the Team, then their total Bid wins will be multiplied by ten and added with the");
instruct[8].setBounds(10,122,1300,10);

instruct[9] = new JLabel("difference between the Actual total wins of the Team and the total Bids wins of the Team , after it is added to their present score, and the differences between");
instruct[9].setBounds(10,136,1300,10);

instruct[10] = new JLabel("the Actual total and the total Bid wins of the will be added as the Bag ,Once the Bag reaches or passes 10 the Team will loose 100 points from their score and then the bag is reduced by 10.");
instruct[10].setBounds(10,150,1300,10);

instruct[11] = new JLabel("Step 4 : The first Team to get to score of 500 is the one that wins the game, but if it happens both Teams reach score 500 in the same round then the Team with the highest points will be assigned as the ");
instruct[11].setBounds(0,164,1300,10);

instruct[12] = new JLabel("winners of the game.");
instruct[12].setBounds(10,178,1300,10);

instruct[13] = new JLabel("Now to explain how the points are obtained during the game and some rules along the way");
instruct[13].setBounds(40,192,1300,10);

instruct[14] = new JLabel("Step 5 : First the Dealer in the game shuffles the Cards properly and then starts handing a card from the player to the left of him going on a clock wise direction since each player will be at 90 degrees to");
instruct[14].setBounds(0,206,1300,10);

instruct[15] = new JLabel("each other, He/She will do this still every player has 13 cards in-front of them head down.");
instruct[15].setBounds(10,220,1300,10);

instruct[16] = new JLabel("Step 6 : Then they turn their cards over and then their given the chance to Bid their wins after the game is started by the Dealer by putting a suit for each player to follow then the player on his/her left");
instruct[16].setBounds(0,234,1300,10);

instruct[17] = new JLabel("will play and it follows in a clock wise direction.");
instruct[17].setBounds(10,248,1300,10);

instruct[18] = new JLabel("Step 7 : Now to the Ranks of our cards, The Ace of every suit card is the highest followed by the King,Queen going down to two of that suit as the lowest, but know that Spades are regarded as the highest value suits in");
instruct[18].setBounds(0,262,1300,10);

instruct[19] = new JLabel("the game but also have highest value from Ace of Spades going down to two of Spades, but note the two of Spades is greater than all the other suit value except its own suit.");
instruct[19].setBounds(10,276,1300,10);

instruct[20] = new JLabel("Step 8 : When the a player is putting a leading suit, they can't put spades as the leading unless it the only suit they have, and during the game if a player doesn't have a card to follow the suit then they can another");
instruct[20].setBounds(0,290,1300,10);

instruct[21] = new JLabel("card but a score of 10 will be deducted from their present Team score, but if the other card he played is a Spades then the won't be any score deducted from their Team score.");
instruct[21].setBounds(10,304,1300,10);

instruct[22] = new JLabel("Step 9 : So a player only gets a point if the card they put on the Table is the greatest among the ones in the table and they get one win as a point, then the score is displayed once everyone has no card in their position.");
instruct[22].setBounds(0,318,1300,10);

instruct[23] = new JLabel("Have fun playing this wonderful game !!!!!!!");
instruct[23].setBounds(50,332,1300,10);



for(int i = 0 ; i <  instruct.length ; i++){
cardPanelHelp.add(instruct[i]);
}


cardPanelHelp.setBackground(Color.green.darker().darker());
cardPanel.add(cardPanelHelp,"Help");


button1.addActionListener(new ActionListener() {
  public void actionPerformed(ActionEvent event) {
	storingPanels.show(cardPanel, "First");
  }
});


button2.addActionListener(new ActionListener() {
  public void actionPerformed(ActionEvent event) {
	storingPanels.show(cardPanel, "Second");
  }
});

button3.addActionListener(new ActionListener() {
  public void actionPerformed(ActionEvent event) {
	storingPanels.show(cardPanel, "Third");
  }
});


button4.addActionListener(new ActionListener() {
  public void actionPerformed(ActionEvent event) {
   storingPanels.show(cardPanel, "Fourth");
  }
});


button5.addActionListener(new ActionListener() {
  public void actionPerformed(ActionEvent event) {
	storingPanels.show(cardPanel, "Help");
  }
});

 


// add card & button panels to the main window
window.add(cardPanel,BorderLayout.CENTER);
window.add(addButtons,BorderLayout.NORTH);
window.setVisible(true);

}
public static  Cards[] play1(){
  return playerA;
}

public static Cards[] play2(){
  return playerB;
} 

public static  Cards[] play3(){
  return playerC;
} 

public static  Cards[] play4(){
  return playerD;
} 
}

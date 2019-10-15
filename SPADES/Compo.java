import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import  java.awt.Container;
import java.util.*;

//-----------------


public class Compo extends MouseInputAdapter {
private JPanel pan;
private JLabel lab;
private JLabel[] labs;
private Cards[] card;
static private int indexNumber;

public Compo(JPanel pan, JLabel lab, Cards[] card, JLabel[] labs){
   this.pan = pan;
   this.lab = lab;
   this.card = card;
   this.labs = labs;
}

public void mouseClicked(MouseEvent event) {
 Object source = event.getSource();// what weve pressed or rather the jlabel 
// this.indexNumber = 1;
 this.pan.remove(this.lab);
 this.pan.remove(this.lab);
 this.pan.validate();
 this.pan.repaint();
 //this.lab.ImageIcon();
JOptionPane.showMessageDialog(null, "You have selected a card!");
JOptionPane.showMessageDialog(null, "NOTE"+" "+SetPlayers.names1().toUpperCase()+" "+"THAT YOU CAN NOT SELECT ANOTHER CARD UNTIL ALL PLAYERS HAVE PLAYED!");
//JOptionPane.showMessageDialog(null,SetPlayers.names2().toUpperCase()+"PLEASE SELECT A CARD!");
//------------------------ comparing----------------------------
for(int i = 0 ; i < this.labs.length ; i++){
if(this.labs[i]== this.lab){
	this.indexNumber = i;
	//System.out.println("NICE!!");
   // System.out.println(source);
	//System.out.println(indexOf(this.labs[i]));
   // break;
}
}

//----------------------------------------Cards[] to print the strong representation-----------------------//
//for(int i = 0 ; i < card.length ; i++){
//System.out.println(card[indexNumber]);
JOptionPane.showMessageDialog(null, "You have selected"+" "+card[this.indexNumber].printCards());
JOptionPane.showMessageDialog(null,SetPlayers.names2().toUpperCase()+" "+"PLEASE SELECT A CARD!");

	
System.out.println(indexNumber);
this.pan.remove(this.lab);

//CardValue(indexNumber);

}
public static int CardValue(){
return indexNumber;
}

//=------------------------------------------------------------------------






}
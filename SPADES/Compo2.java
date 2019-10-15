import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import  java.awt.Container;
import java.util.*;

public class Compo2 extends MouseInputAdapter {
   private JPanel p;
   private JLabel l;
   private JLabel[] la;
   private Cards[] ca;
  static  private int indexNumber;
   
   public Compo2(JPanel p, JLabel l, Cards[] ca, JLabel[] la){
       this.p = p;
       this.l = l;
       this.ca = ca;
       this.la = la;
}
   
 public void mouseClicked(MouseEvent event) {
     Object source = event.getSource();// what weve pressed or rather the jlabel 
    // int indexNumber = 1;
     this.p.remove(this.l);
     this.p.remove(this.l);
     this.p.validate();
     this.p.repaint();
     //this.lab.ImageIcon();
JOptionPane.showMessageDialog(null, "You have selected a card!");
JOptionPane.showMessageDialog(null, "NOTE"+" "+SetPlayers.names3().toUpperCase()+" "+"THAT YOU CAN NOT SELECT ANOTHER CARD UNTIL ALL PLAYERS HAVE PLAYED!");
//------------------------ comparing----------------------------
for(int i = 0 ; i < this.la.length ; i++){
    if(this.la[i]== this.l){
       this.indexNumber = i;
       // System.out.println("NICE!!");
        //System.out.println(source);
        //System.out.println(indexOf(this.labs[i]));
       // break;
    }
}

//----------------------------------------Cards[] to print the strong representation-----------------------//
//for(int i = 0 ; i < card.length ; i++){
    //System.out.println(card[indexNumber]);
 JOptionPane.showMessageDialog(null, "You have selected"+" "+ca[this.indexNumber].printCards());
JOptionPane.showMessageDialog(null,SetPlayers.names4().toUpperCase()+" "+"PLEASE SELECT A CARD!");
        
System.out.println(this.indexNumber);
this.p.remove(this.l);


//CardValue(indexNumber);
 }
   public static int CardValue(){
 return indexNumber;
}
}
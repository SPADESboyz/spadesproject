import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import  java.awt.Container;
import java.util.*;

public class Compo1 extends MouseInputAdapter {
   private JPanel pa;
   private JLabel la;
   private JLabel[] lab;
   private Cards[] car;
  static private int indexNumber;
   
   public Compo1(JPanel pa, JLabel la, Cards[] car, JLabel[] lab){
       this.pa = pa;
       this.la = la;
       this.car = car;
       this.lab = lab;
}
   
 public void mouseClicked(MouseEvent event) {
     Object source = event.getSource();// what weve pressed or rather the jlabel 
     //int indexNumber = 1;
     this.pa.remove(this.la);
     this.pa.remove(this.la);
     this.pa.validate();
     this.pa.repaint();
     //this.lab.ImageIcon();
JOptionPane.showMessageDialog(null, "You have selected a card!");
JOptionPane.showMessageDialog(null, "NOTE"+" "+SetPlayers.names2().toUpperCase()+" "+"THAT YOU CAN NOT SELECT ANOTHER CARD UNTIL ALL PLAYERS HAVE PLAYED!");
//------------------------ comparing----------------------------
for(int i = 0 ; i < this.lab.length ; i++){
    if(this.lab[i]== this.la){
        this.indexNumber = i;
       // System.out.println("NICE!!");
       // System.out.println(source);
        //System.out.println(indexOf(this.labs[i]));
       // break;
    }
}

//----------------------------------------Cards[] to print the strong representation-----------------------//
//for(int i = 0 ; i < card.length ; i++){
    //System.out.println(card[indexNumber]);
 JOptionPane.showMessageDialog(null, "You have selected"+" "+car[this.indexNumber].printCards());
 JOptionPane.showMessageDialog(null,SetPlayers.names3().toUpperCase()+" "+"PLEASE SELECT A CARD!");

        
System.out.println(this.indexNumber);
this.pa.remove(this.la);

//CardValue(indexNumber);
    
    


 }
   public static int CardValue(){
 return indexNumber;
}
}
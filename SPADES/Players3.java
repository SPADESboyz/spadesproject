import java.util.Arrays;
import java.util.*;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
public class Players3{
    static  private int j ;  
public static void ClearOurList(LinkedList<Cards> PLayer1,LinkedList<Cards> PLayer2,LinkedList<Cards> PLayer3,LinkedList<Cards> PLayer4,int y1,int y2,int y3,int y4){
 /**this method ensure the card played by all players are removed from their hands*/
 PLayer1.remove(y1);
 PLayer2.remove(y2);
 PLayer3.remove(y3);
 PLayer4.remove(y4);

}
public static void JustPrintstuff(LinkedList<Cards> PLayer1,LinkedList<Cards> PLayer2,LinkedList<Cards> PLayer3,LinkedList<Cards> PLayer4,Cards returncard){
 /** favorite method...this tells which players  wins the turn*/ 
 boolean KeepTrack=false;

while(KeepTrack== false){
 KeepTrack=Findplayer(PLayer1,returncard);
 if(KeepTrack==true){
  System.out.println("the first player got it ");
  break;
 }
 KeepTrack=Findplayer(PLayer2,returncard);
 if(KeepTrack==true){
  System.out.println("the second player got it ");
  break;
 }
 KeepTrack=Findplayer(PLayer3,returncard);
 if(KeepTrack==true){
  System.out.println("the third player got it ");
  break;
 }
 KeepTrack=Findplayer(PLayer4,returncard);
 if(KeepTrack==true){
  System.out.println("the fourth player got it ");
  break;
 }
}
}
public static boolean  Findplayer(LinkedList<Cards> x,Cards y){
 /**this method return a boolean value ...once it checks if the winning card was on which player's hand*/
 boolean result=false;
 for(int i=0;i<x.size();i++){
  Cards z=x.get(i);
  if(z.Compare(y)){
   result=true;
   break;
  }
  
 }
 return result;
}
 
public static Cards FindCard(LinkedList<Cards> x,int y,Cards xx){
 /**this method find the card with the highest at the table*/
 
 Cards one=x.get(0);Cards two=x.get(1);Cards three=x.get(2);Cards four=x.get(3);
 int oneval=one.printValue();int twoval=two.printValue();int threeval=three.printValue();int fourval=four.printValue();
 if(oneval==y){
  return one;
 }
 if(twoval==y){
  return two;
 }
 if(threeval==y){
  return three;
 }
 if(fourval==y){
  return four;
 }
 return xx;
 
}
public static int HighestValue(int[] x){
 /**this one finds the value of the card*/
 
 int len=x.length;
 /**
 int i, j;  
    for (i = 0; i < len-1; i++) {     
  for (j = 0; j < len-i-1; j++){  
   if (x[j] > x[j+1])  {
    int temp=x[j];
    x[j]=x[j+1];
    x[j+1]=temp;
   }
    
  }
}*/
System.out.println(Arrays.toString(x));
Arrays.sort(x);
System.out.println(Arrays.toString(x));
System.out.println(x[len-1]);
return x[len-1];
}

public static int[] FetchValues(LinkedList<Cards> table){
 /** in here ,we are finding the values of each cards put on the table*/
 int[] ar=new int[4];
 for(int i=0;i< 4;i++){
  Cards x=table.get(i);
  int val=x.printValue();
  ar[i]=val;
  
 }
 return ar;
}

public static LinkedList<Cards> createtable(int y1,int y2,int y3,int y4,LinkedList<Cards> pl1,LinkedList<Cards> pl2,LinkedList<Cards> pl3,LinkedList<Cards> pl4){
 /** this method return all cards thrown on the table by the players*/
 LinkedList<Cards> table= new LinkedList<Cards>();
 
    Cards x1=pl1.get(y1);// here 
 table.add(x1);
 
 Cards x2=pl2.get(y2);
 table.add(x2);
 
 Cards x3=pl3.get(y3);
 table.add(x3);
 
 Cards x4=pl4.get(y4);
 table.add(x4);
 System.out.println("---------");
 
 return table;
}
public static void PrintAllmyCards(LinkedList<Cards> pl){
 /** just printing the value of the cards*/
 System.out.println("--------");
 for(int i = 0 ; i < pl.size(); i++){
  
System.out.println(pl.get(i).printCards());}
System.out.println("--------");
} 
public static LinkedList<Cards> createplayer(Cards[] x){
 /** players are created here*/
 LinkedList<Cards> y= new LinkedList<Cards>();
 for( int i = 0 ; i < 13 ; i++){
   y.add(x[i]);
  } 
 return y;
}
public static int ComputerChooseNumber(LinkedList<Cards>player1,int y,LinkedList<Cards>player){
 
 int len2=player.size();

 Cards card=player1.get(y);
 
  for( j=0;j<len2;j++){// has the leading suit and the lower value
   
   Cards pl=player.get(j);
   if(pl.Suits().equals(card.Suits())&& pl.printValue()<= card.printValue()){
    return j;
   }
   if(pl.Suits().equals(card.Suits())){// does have the suit only but low value card
    return j;
   } 
  }
  
  for( j=0;j<len2;j++){// does not have the suit but has a low value card
   Cards pl=player.get(j);
   if(card.printValue()>=pl.printValue()&& pl.printValue()<=6){
    return j;
   }
   if(card.printValue()>=pl.printValue()){
    return j;
   }
   
  }
  
  Random random=new Random();
  int rand=random.nextInt(len2);
  
 return rand; 
  
  
}
public static void Play()throws IOException{// the throws IOException in order for the program to continue running even if the image is not found
/** in this method , the actual game is played*/
 Cards cards = new Cards("Spades","Ace",27,ImageIO.read(new File("Ace_Of_Spades.png")));
 Cards[][] players = cards.Players();
 Cards[] playerA = players[0];
 Cards[] playerB = players[1];    
 Cards[] playerC = players[2];
 Cards[] playerD = players[3];
 
 
 //players are created 
LinkedList<Cards> PLayer1 = createplayer(playerA);   
LinkedList<Cards> PLayer2 = createplayer(playerB);
LinkedList<Cards> PLayer3 = createplayer(playerC);
LinkedList<Cards> PLayer4 = createplayer(playerD);
//---------
// print all the cards
PrintAllmyCards(PLayer1);
PrintAllmyCards(PLayer2);
PrintAllmyCards(PLayer3);
PrintAllmyCards(PLayer4);
//----------------
while(PLayer1.size()> 0|| PLayer2.size()>0||PLayer3.size()> 0||PLayer4.size()>0){

System.out.println("____*************________");
Scanner scan=new Scanner(System.in);
System.out.print(" 1st player[cards to remove,enter the index] :");
int y1=scan.nextInt();
while(y1>=PLayer1.size()){
 System.out.printf("wrong index ...please enter a number between 0 and %d\n ",PLayer1.size()-1);
 System.out.print(" 1st player[cards to remove,enter the index] :");
 y1=scan.nextInt();
}
System.out.print(" 2st player[cards to remove,enter the index] :");
int y2=scan.nextInt();
while(y2>=PLayer2.size()){
 System.out.printf("wrong index ...please enter a number between 0 and %d\n ",PLayer2.size()-1);
 System.out.print(" 2st player[cards to remove,enter the index] :");
 y2=scan.nextInt();
}
System.out.print(" 3rd player[cards to remove,enter the index] :");
int y3=scan.nextInt();
while(y3>=PLayer3.size()){
 System.out.printf("wrong index ...please enter a number between 0 and %d /n",PLayer3.size()-1);
 System.out.print(" 3rd player[cards to remove,enter the index] :");
 y3=scan.nextInt();
}
int y4=ComputerChooseNumber(PLayer1,y1,PLayer4);
System.out.printf(" 4th player[cards to remove,enter the index] :%d \n",y4);

while(y4>=PLayer4.size()){
 ///System.out.printf("wrong index ...please enter a number between 0 and %d \n",PLayer4.size()-1);
 y4=ComputerChooseNumber(PLayer1,y1,PLayer4);
 System.out.printf(" 4th player[cards to remove,enter the index] :%d \n",y4);
}
LinkedList<Cards> Table=createtable(y1,y2 ,y3,y4,PLayer1,PLayer2,PLayer3,PLayer4);// table created

int[] arrayofvaluesofcards=FetchValues(Table);// fetching their values of the cards at the table 

PrintAllmyCards(Table); //print cards on the table


int highvalue=HighestValue(arrayofvaluesofcards); // find the highest value of the card on the table 
Cards fist=Table.get(1);// please don't mind this because nothing happens...it is needed so that the code does not break
Cards returncard=FindCard(Table,highvalue,fist);//find the card with the highest value


JustPrintstuff(PLayer1,PLayer2,PLayer3,PLayer4,returncard);
// DERICK 'S PART COMES IN HERE

Table.clear();//we clear the table ,boom
ClearOurList(PLayer1,PLayer2,PLayer3,PLayer4,y1,y2,y3,y4);//the cards that the players threw on the table ,are removed from their hands
PrintAllmyCards(PLayer1);
PrintAllmyCards(PLayer2);
PrintAllmyCards(PLayer3);
PrintAllmyCards(PLayer4);

}
}
public static void anothermain(){
  
 try{
 Scanner scanner1=new Scanner(System.in);
 String  Input;
 while(true){
  
 Play();// the game method
 System.out.print("do you wish to clear the board or continue: ");
 
  Input=scanner1.nextLine();
 if (Input.equals("clear")){// if the player wants to reset the board
  System.out.print("we are going to clear the board\n");
  //continue;
  break;
 }
 if(Input.equals("continue")){
  System.out.print("take the hand\n");
  continue;
 }
 if(Input.equals("Quit")){// if the player wishes to terminate the game
  return;
 }
 }
 while(Input.equals("clear")){
  Play();
 }
 }
 catch(IOException e){
  System.out.print("play method fails !!!");
 }
 
}
 public static void Main(String[] NAMES){
 // the main method
 String firstplayer=NAMES[0];
 String secondplayer=NAMES[1];
 String thirdtplayer=NAMES[2];
 String fourthplayer=NAMES[3];
 anothermain();//enter the another main
 System.out.print("we are out out ");
} 
 public static int  Comp(){
     return j;
 }
 
}



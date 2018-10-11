import java.util.ArrayList;

public class ood {
	static ArrayList<card> deck = new ArrayList<card>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	   
	        
	       player human= new player();
	       
	       String suite[] = {"Heart","Spade", "Diamond", "Clubs"};
	       String cardValues[]= {"Ace","1","2","3","4","5","6","7","8","9","Jack","King","Queen"};
	       int counter=0;
	       
	       while(counter<=3){
	     
	       for(int i =0; i<=cardValues.length-1; i++){
	       card c = new card(cardValues[i],suite[counter]);
	        deck.add(c);
	       }//end of for loop
	       counter++;
	       
	       }
	     ood d = new ood();
	     human.deal();
	     //d.viewDeck();
	     //human.tallyScore();
	    
	    }
	 
	
		void viewDeck(){
	      for(card d: deck){
	          System.out.println(d.suite+" "+d.number);    
	      }
	  }

	  void shuffle(){
	      
	  }


}

import java.util.Random;

public class player {
    card hand []= new card [8]; 
    int score=0;
    Random r;
    
    void deal(){
        for(int i=0; i<=8-1;i++){
     
            ood o=new ood();
            hand[i]=o.deck.get((int)(Math.random() * 51) + 0);
           System.out.println(hand[i].number+" "+hand[i].suite);
        }
    } 
    void tallyScore(){
        for(int j=0; j<=hand.length-1;j++){
          String current =hand[j].number;
          System.out.println("Current card value: " + current);
          switch(current){
              case "Ace": score+=1;//can change from 1 or 11
              break;
              case "King": score+=10;
              break;
              case "Queen": score+=10;
              break;
              case "Jack": score+=10;
              break;
              case "1": score+=1;
              break;
              case "2": score+=2;
              break;
              case "3": score+=3;
              break;
              case "4": score+=4;
              break;
              case "5": score+=5;
              break;
              case "6": score+=6;
              break;
              case "7": score+=7;
              break;
              case "8": score+=8;
              break;
              case"9": score+=9;
              break;
          }
            System.out.println("Score= " + score);
        }
    }
}

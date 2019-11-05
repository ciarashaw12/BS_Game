import java.util.Random;

public class Card{

    private String[] suit = {"Spade","Ace","Club","Heart"};
    private String[] rank = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
    private String[] color = {"Red", "Black"};

    public Card card;

    public Card(String s, String r, String c){

        this.suit = s;
        this.rank = r;
        this.color = c;

    }

    public void RandomCard(String s, String r, String c){
        
         card = new Card(s,r,c);
    }

    public Card getCard(){
        return card;
    }

    public String getSuit(){
        return suit;
    }
    public String getRank(){
        return rank;
    }

    public String getColor(){
        return color;
    }
    
}
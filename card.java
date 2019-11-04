public class Card {

}

public class Card{

    private static String suit;
    private static String rank;
    private static String color;

    Card(String s, String r, String c){

        this.suit = s;
        this.rank = r;
        this.color = c;

    }

    public String getSuit(){
        return suit;
    }
    
}
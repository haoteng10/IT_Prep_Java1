package prep.it.singwai.class6.Card;

public class Game {
    public static String[] suit = {"diamond", "club", "heart", "spade"};

    public static void main(String[] args) {
        Card[] cards = new Card[13 * 4];
        int k = 0;
        for (int i = 0; i < suit.length; i++) {
            for (int j = 0; j < 13; j++) {
                cards[k] = new Card(suit[i], j + 1);
                k++;
            }
        }


        for (int i = 0; i < cards.length; i++) {
            System.out.println(i + " " + cards[i].toString());
        }
    }
}

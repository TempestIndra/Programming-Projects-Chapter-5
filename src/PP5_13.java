import java.util.ArrayList;
import java.util.Collections;

public class PP5_13 {
    public static void main(String[] args) {
        ArrayList numbers = new ArrayList();
        for (int i = 0; i < 52; i++) {
            numbers.add( i + 1 );
        }
        Collections.shuffle( numbers );

        PP5_13Card card1 = new PP5_13Card((int)numbers.get(1));
        PP5_13Card card2 = new PP5_13Card((int)numbers.get(2));
        PP5_13Card card3 = new PP5_13Card((int)numbers.get(3));
        PP5_13Card card4 = new PP5_13Card((int)numbers.get(4));

        System.out.println(card1);
        System.out.println(card2);
        System.out.println(card3);
        System.out.println(card4);
    }
}


/*
* Design and implement a class called Card that represents a stan-
 * dard playing card.Each card has a suit and a face value.
 * Create a program that deals five random cards.
*/

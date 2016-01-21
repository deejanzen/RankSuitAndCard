import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by djanzen on 1/20/16.
 */
public class PokerHand {
    private List<Card> hand;

    public PokerHand(Card a, Card b, Card c, Card d, Card e){
        hand = new ArrayList<>();
        hand.add(a);
        hand.add(b);
        hand.add(c);
        hand.add(d);
        hand.add(e);
        Collections.sort(hand);

    }
}

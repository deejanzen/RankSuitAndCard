/**
 * Dustin Janzen
 * quiz 01.
 */
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by djanzen on 1/17/16.
 */
public class RankSuitAndCardTest {
    @Test
    public void getValue(){

        assertEquals(Rank.Duece.getValue(), 2);
        assertEquals(Rank.Three.getValue(), 3);
        assertEquals(Rank.Four.getValue(), 4);
        assertEquals(Rank.Five.getValue(), 5);
        assertEquals(Rank.Six.getValue(), 6);
        assertEquals(Rank.Seven.getValue(), 7);
        assertEquals(Rank.Eight.getValue(), 8);
        assertEquals(Rank.Nine.getValue(), 9);
        assertEquals(Rank.Ten.getValue(), 10);
        assertEquals(Rank.Jack.getValue(), 11);
        assertEquals(Rank.Queen.getValue(), 12);
        assertEquals(Rank.King.getValue(), 13);
        assertEquals(Rank.Ace.getValue(), 14);
    }
    @Test
    public void cardConstructorTest(){
        Card C2 = new Card(Suit.Clubs, Rank.Duece);
        assertEquals(Suit.Clubs, C2.getSuit());
        assertEquals(Rank.Duece, C2.getRank());
        Card CK = new Card(Suit.Clubs, Rank.King);
        assertEquals(Suit.Clubs, CK.getSuit());
        assertEquals(Rank.King, CK.getRank());
    }
    @Test
    public void handTest(){
        List<Card> firstHand = new ArrayList<Card>();
        firstHand.add(new Card(Suit.Clubs, Rank.King));
        firstHand.add(new Card(Suit.Clubs, Rank.Duece));
        assertEquals(Rank.King, firstHand.get(0).getRank());
        Collections.sort(firstHand);
        assertEquals(Rank.Duece, firstHand.get(0).getRank());
    }

}
package com.mycompany.unonet;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

public class Deck {

    private Card[] cards;
    private int cardsInDeck;

    public Deck()
    {
        cards = new Card[108];
        reset();
    }

    public void reset()
    {
        Card.Color[] colors = Card.Color.values();
        cardsInDeck= 0;

        for(int x=0;x<colors.length-2;x++)
        {
            Card.Color color = colors[x];

            cards[cardsInDeck++] = new Card(color,Card.Value.getValue(0));


            //Adding numbered cards
            for(int j =0; j<9;j++)
            {
                cards[cardsInDeck++] = new Card(color,Card.Value.getValue(j));
                cards[cardsInDeck++] = new Card(color,Card.Value.getValue(j));
            }

            //Adding d2,skip,reverse cards

            Card.Value[] values = new Card.Value[]{Card.Value.D2,Card.Value.Skip,Card.Value.Reverse};
            for(Card.Value value :values)
            {
                cards[cardsInDeck++] = new Card(color,value);
                cards[cardsInDeck++] = new Card(color,value);
            }

            //Adding wild and wild 4
            values = new Card.Value[]{Card.Value.Wild,Card.Value.W4};
            for(Card.Value value : values)
            {
                for(int y = 0;y<4;y++)
                {
                    cards[cardsInDeck++] = new Card(Card.Color.Wild, value);
                }
            }
        }
    }//end of reset

    public void replaceDeckWith(ArrayList<Card> cards)
    {
        this.cards = cards.toArray(new Card[cards.size()]);
        this.cardsInDeck = this.cards.length;
    }//end of replaceDeckWith

    public boolean isEmpty() {
        return cardsInDeck==0;
    }//end of isEmpty()

    public void shuffle()
    {
        int n = cards.length;
        Random random = new Random();

        for(int i =0;i<cards.length;i++)
        {
            int randomValue = i+ random.nextInt(n-i);
            Card randomCard = cards[randomValue];
            cards[randomValue] = cards[i];
            cards[i] = randomCard;
        }
    }//end of shuffle

    public Card drawCard() throws IllegalArgumentException{
        if(isEmpty())
        {
            throw new IllegalArgumentException("Cannot draw card >>> no cards in deck");
        }
        return cards[--cardsInDeck];
    }//end of drawCard

    public ImageIcon drawCardImage() throws IllegalArgumentException
    {
        if(isEmpty())
        {
            throw new IllegalArgumentException("Cannot draw card >>> no cards in deck");
        }
        return new ImageIcon(cards[--cardsInDeck].toString()+ ".png");
    }//end of drawCardImage

    public Card[] drawCard(int n)
    {
        if(n<0)
            throw new IllegalArgumentException("Tried to draw negative cards");

        if(n>cardsInDeck)
            throw new IllegalArgumentException("Tried to draw too many cards for what is left in the deck");

        Card[] ret = new Card[n];

        for(int i =0;i<n;i++)
        {
            ret[i] = cards[--cardsInDeck];
        }

        return ret;
    }//end of drawCard
}

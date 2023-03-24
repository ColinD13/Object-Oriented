package com.mycompany.unonet;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Game {
    private int currentPlayer;
    private String[] ids;
    private Deck deck;
    private ArrayList<ArrayList<Card>> hand;
    private ArrayList<Card> pile;
    private Card.Color validColor;
    private Card.Value validValue;

    boolean direction;

    public Game(String[] pids)
    {
        deck = new Deck();
        deck.shuffle();
        pile = new ArrayList<Card>();

        ids = pids;
        currentPlayer =0;
        direction = false;

        hand = new ArrayList<ArrayList<Card>>();

        for(int i =0;i<pids.length;i++)
        {
            ArrayList<Card> h = new ArrayList<Card>(Arrays.asList(deck.drawCard(7)));
            hand.add(h);
        }
    }//end of game

    public void start(Game game)
    {
        Card card = deck.drawCard();
        validColor = card.getColor();
        validValue = card.getValue();

        if(card.getValue()== Card.Value.Wild)
        {
            start(game);
        }

        if(card.getValue()== Card.Value.W4 || card.getValue()==Card.Value.D2)
        {
            start(game);
        }

        if(card.getValue()==Card.Value.Skip)
        {
            JLabel message = new JLabel(ids[currentPlayer]+ " was skipped!");
            message.setFont(new Font("Arial", Font.BOLD,48));
            JOptionPane.showMessageDialog(null,message);

            if(direction==false)
            {
                currentPlayer = (currentPlayer+1) % ids.length;
            }
            else if(direction==true)
            {
                currentPlayer = (currentPlayer-1) % ids.length;
                if(currentPlayer==-1)
                {
                    currentPlayer = ids.length-1;
                }
            }
        }

        if(card.getValue()==Card.Value.Reverse)
        {
            JLabel message = new JLabel(ids[currentPlayer]+ "Direction Changed");
            message.setFont(new Font("Arial", Font.BOLD,48));
            JOptionPane.showMessageDialog(null,message);
            direction ^= true;
            currentPlayer= ids.length-1;
        }

        pile.add(card);
    }//end of start

    public Card getTopCard()
    {
        return new Card(validColor,validValue);
    }//end of getTopCard

    public ImageIcon getTopCardImage()
    {
        return new ImageIcon(validColor + "_" + validValue + ".png");
    }//end of getTopCardImage

    public boolean isGameOver()
    {
        for(String player : this.ids)
        {
            if(hasEmptyHand(player))
            {
                return true;
            }
        }

        return false;
    }

    public String getCurrentPlayer()
    {
        return this.ids[this.currentPlayer];
    }//end of getCurrentPlayer

    public String getPreviousPlayer(int i)
    {
        int index = this.currentPlayer-i;

        if(index ==-1)
        {
            index = ids.length-1;
        }

        return this.ids[index];
    }//end of getPreviousPLayer

    public String[] getPlayers()
    {
        return ids;
    }//end of getPlayers()

    public ArrayList<Card> getPlayerHand(String pid)
    {
        int index = Arrays.asList(ids).indexOf(pid);
        return hand.get(index);
    }//end of getPLayerHand

    public int getPlayerHandSize(String pid)
    {
        return getPlayerHand(pid).size();
    }//end of getPlayerHandSize

    public Card getPlayerCard(String pid,int choice)
    {
        ArrayList<Card> h = getPlayerHand(pid);
        return h.get(choice);
    }//end of getPlayerCard

    public boolean hasEmptyHand(String pid)
    {
        return getPlayerHand(pid).isEmpty();
    }

    public boolean validCardPlay(Card card)
    {
        return card.getColor() == validColor || card.getValue()==validValue;
    }//end of validCardPlay

    public void checkPlayerTurn(String pid) throws InvalidPlayerTurnException
    {
        if(this.ids[this.currentPlayer]!=pid)
        {
            throw new InvalidPlayerTurnException("it is not "+ pid + "s turn",pid);
        }
    }//end of checkPlayerTurn

    public void submitDraws(String pid) throws InvalidPlayerTurnException
    {
        checkPlayerTurn(pid);

        if(deck.isEmpty())
        {
            deck.replaceDeckWith(pile);
            deck.shuffle();
        }

        getPlayerHand(pid).add(deck.drawCard());
        if(direction ==false)
        {
            currentPlayer = (currentPlayer +1) % ids.length;
        }
        else if(direction ==true)
        {
            currentPlayer = (currentPlayer -1) % ids.length;
            if(currentPlayer==-1)
            {
                currentPlayer = ids.length-1;
            }
        }
    }//end of submitDraws

    public void setCardColor(Card.Color color)
    {
        validColor = color;
    }//end of setCardColor

    public void submitPlayerCard(String pid, Card card, Card.Color declaredColor)throws InvalidColorSubmissionException, InvalidValueSubmissionException,InvalidPlayerTurnException
    {
        checkPlayerTurn(pid);

        ArrayList<Card> pHand = getPlayerHand(pid);

        if(!validCardPlay(card))
        {
            if(card.getColor()==Card.Color.Wild){
                validColor = card.getColor();
                validValue = card.getValue();
            }

            if(card.getColor() != validColor)
            {
                JLabel message = new JLabel("Invalid player move");
                message.setFont(new Font("Arial",Font.BOLD,48));
                JOptionPane.showMessageDialog(null,message);
                throw new InvalidColorSubmissionException("Invalid player move",card.getColor(),validColor);
            }
            else if(card.getValue()!= validValue)
            {
                JLabel message = new JLabel("Invalid player move");
                message.setFont(new Font("Arial",Font.BOLD,48));
                JOptionPane.showMessageDialog(null,message);
                throw new InvalidValueSubmissionException("Invalid player move",card.getValue(),validValue);
            }
        }

        pHand.remove(card);

        if(hasEmptyHand(this.ids[currentPlayer]))
        {
            JLabel message2 = new JLabel(this.ids[currentPlayer] + " won the game!");
            JOptionPane.showMessageDialog(null,message2);
            System.exit(0);
        }

        validColor = card.getColor();
        validValue = card.getValue();
        pile.add(card);

        if(direction == false){
            currentPlayer = (currentPlayer+1) % ids.length;
        }
        else if(direction==true)
        {
            currentPlayer = (currentPlayer-1) % ids.length;
            if(currentPlayer==-1)
            {
                currentPlayer=ids.length-1;
            }
        }

        if(card.getColor()==Card.Color.Wild){
            validColor = declaredColor;
        }

        if(card.getValue()== Card.Value.D2)
        {
            pid = ids[currentPlayer];
            getPlayerHand(pid).add(deck.drawCard());
            getPlayerHand(pid).add(deck.drawCard());
            JLabel message = new JLabel(pid + " drew two cards");
        }

        if(card.getValue()== Card.Value.Skip)
        {
            JLabel message = new JLabel(ids[currentPlayer] + " was skipped");
            message.setFont(new Font("Arial",Font.BOLD,48));
            JOptionPane.showMessageDialog(null,message);
            if(direction ==false)
            {
                currentPlayer = (currentPlayer+1) % ids.length;
            }
            else if(direction==true)
            {
                currentPlayer = (currentPlayer-1) % ids.length;
                if(currentPlayer==-1)
                {
                    currentPlayer = ids.length-1;
                }
            }
        }

        if(card.getValue()==Card.Value.Reverse)
        {
            JLabel message = new JLabel(ids[currentPlayer] + " changed the direction");
            message.setFont(new Font("Arial",Font.BOLD,48));
            JOptionPane.showMessageDialog(null,message);

            direction^=true;
            if(direction==true)
            {
                currentPlayer = (currentPlayer -2) % ids.length;
                if(currentPlayer==-1){
                    currentPlayer = ids.length-1;
                }
                if(currentPlayer==-1){
                    currentPlayer = ids.length-1;
                }
            }
            else if(direction ==false){
                currentPlayer = (currentPlayer+2) % ids.length;
            }

        }


    }//end of submitPlayerCard

    class InvalidPlayerTurnException extends Exception{
        String playerId;

        public InvalidPlayerTurnException(String message,String pid)
        {
            super(message);
            playerId = pid;
        }

        public String getPid(){
            return playerId;
        }

    }//end of InvalidPlayerTurnException class

    class InvalidColorSubmissionException extends Exception{
        private Card.Color expected;
        private Card.Color actual;

        public InvalidColorSubmissionException(String message, Card.Color actual, Card.Color expected)
        {
            this.actual = actual;
            this.expected = expected;
        }
    }//end of InvalidColorSubmissoinException class

    class InvalidValueSubmissionException extends Exception{
        private Card.Value expected;
        private Card.Value actual;

        public InvalidValueSubmissionException(String message, Card.Value actual, Card.Value expected)
        {
            this.actual = actual;
            this.expected = expected;
        }
    }//end of InvalidValueSubmissionException class




}

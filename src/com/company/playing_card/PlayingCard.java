package com.company.playing_card;

import com.company.playing_card.suit.parent.Suit;

public abstract class PlayingCard {
    private int height;
    private int weight;
    private Suit suit;

    public PlayingCard(int height, int weight, Suit suit) {
        this.height = height;
        this.weight = weight;
        this.suit = suit;
    }

    public boolean beat(PlayingCard playingCard) {
        if (this.suit == playingCard.suit) {
            System.out.println("The equals");
            return this.weight > playingCard.weight || (this.weight == playingCard.weight && this.height > playingCard.height);
        } else {
            System.out.println("Something another");
            return this.suit.isTrump();
        }
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Suit getSuit() {
        return suit;
    }

    public void setSuit(Suit suit) {
        this.suit = suit;
    }
}

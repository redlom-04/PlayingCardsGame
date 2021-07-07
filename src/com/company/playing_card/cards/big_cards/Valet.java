package com.company.playing_card.cards.big_cards;

import com.company.playing_card.PlayingCard;
import com.company.playing_card.suit.parent.Suit;

public class Valet extends PlayingCard {
    private static final int HEIGHT = 10;
    private static final int WEIGHT = 2;

    public Valet(Suit suit) {
        super(HEIGHT, WEIGHT, suit);
    }
}

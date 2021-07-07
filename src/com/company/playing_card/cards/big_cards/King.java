package com.company.playing_card.cards.big_cards;

import com.company.playing_card.PlayingCard;
import com.company.playing_card.suit.parent.Suit;

public class King extends PlayingCard {
    private static final int HEIGHT = 12;
    private static final int WEIGHT = 4;

    public King(Suit suit) {
        super(HEIGHT, WEIGHT, suit);
    }
}

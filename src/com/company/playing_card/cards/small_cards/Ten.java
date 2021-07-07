package com.company.playing_card.cards.small_cards;

import com.company.playing_card.PlayingCard;
import com.company.playing_card.suit.parent.Suit;

public class Ten extends PlayingCard {
    private static final int HEIGHT = 13;
    private static final int WEIGHT = 10;

    public Ten(Suit suit) {
        super(HEIGHT, WEIGHT, suit);
    }
}

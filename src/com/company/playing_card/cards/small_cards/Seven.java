package com.company.playing_card.cards.small_cards;

import com.company.playing_card.PlayingCard;
import com.company.playing_card.suit.parent.Suit;

public class Seven extends PlayingCard {
    private static final int HEIGHT = 7;
    private static final int WEIGHT = 0;

    public Seven(Suit suit) {
        super(HEIGHT, WEIGHT, suit);
    }
}

package com.company.playing_card.cards.small_cards;

import com.company.playing_card.PlayingCard;
import com.company.playing_card.suit.parent.Suit;

public class Eight extends PlayingCard {
    private static final int HEIGHT = 8;
    private static final int WEIGHT = 0;

    public Eight(Suit suit) {
        super(HEIGHT, WEIGHT, suit);
    }
}

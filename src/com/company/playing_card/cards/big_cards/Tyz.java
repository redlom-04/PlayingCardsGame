package com.company.playing_card.cards.big_cards;

import com.company.playing_card.PlayingCard;
import com.company.playing_card.suit.parent.Suit;

public class Tyz extends PlayingCard {
    private static final int HEIGHT = 14;
    private static final int WEIGHT = 11;

    public Tyz(Suit suit) {
        super(HEIGHT, WEIGHT, suit);
    }
}

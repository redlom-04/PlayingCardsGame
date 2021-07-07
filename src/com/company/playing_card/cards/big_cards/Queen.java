package com.company.playing_card.cards.big_cards;

import com.company.playing_card.PlayingCard;
import com.company.playing_card.suit.parent.Suit;

public class Queen extends PlayingCard {
    private static final int HEIGHT = 11;
    private static final int WEIGHT = 3;

    public Queen(Suit suit) {
        super(HEIGHT, WEIGHT, suit);
    }
}

package com.company.playing_card.suit;

import com.company.playing_card.suit.parent.Suit;

public class Heart extends Suit {
    public Heart(boolean trump) {
        super(CardSuitEnum.HEART, trump);
    }
}

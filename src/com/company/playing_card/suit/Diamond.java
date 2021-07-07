package com.company.playing_card.suit;

import com.company.playing_card.suit.parent.Suit;

public class Diamond extends Suit {
    public Diamond(boolean trump) {
        super(CardSuitEnum.DIAMOND, trump);
    }
}

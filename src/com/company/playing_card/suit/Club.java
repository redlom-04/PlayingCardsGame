package com.company.playing_card.suit;

import com.company.playing_card.suit.parent.Suit;

public class Club extends Suit {
    public Club(boolean trump) {
        super(CardSuitEnum.CLUB, trump);
    }
}

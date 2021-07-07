package com.company.playing_card.suit.parent;

import com.company.playing_card.suit.CardSuitEnum;

public abstract class Suit {
    private final CardSuitEnum cardSuitEnum;
    private final boolean trump;

    public Suit(CardSuitEnum cardSuitEnum, boolean trump) {
        this.cardSuitEnum = cardSuitEnum;
        this.trump = trump;
    }

    public CardSuitEnum getCardSuitEnum() {
        return cardSuitEnum;
    }

    public boolean isTrump() {
        return trump;
    }
}

package com.company.playing_card;

import com.company.playing_card.cards.big_cards.Valet;
import com.company.playing_card.cards.small_cards.Ten;
import com.company.playing_card.suit.*;

public class Main {
    public static void main(String[] args) {
        Heart heart = new Heart(false);
        Diamond diamond = new Diamond(false);
        Club club = new Club(false);
        Spade spade = new Spade(true);

        PlayingCard ten = new Ten(heart); // no tramp
        PlayingCard valet = new Valet(spade); // tramp
        System.out.println(valet.beat(ten));
    }
}

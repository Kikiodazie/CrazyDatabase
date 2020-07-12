package com.odazie.cardchecker.cardchecker.web;

import com.odazie.cardchecker.cardchecker.business.domain.UserCard;
import com.odazie.cardchecker.cardchecker.business.service.CardService;
import com.odazie.cardchecker.cardchecker.data.entity.Card;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class cardController {

    private final CardService cardService;

    public cardController(CardService cardService) {
        this.cardService = cardService;
    }

    @GetMapping("/cards")
    private List<UserCard> getCards(Model model){
        List<UserCard> usersCards = getCardService().getAllCards();

        model.addAttribute("cards", usersCards);

        return usersCards;
    }

    public CardService getCardService() {
        return cardService;
    }
}

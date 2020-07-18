package com.odazie.cardchecker.cardchecker.web;

import com.odazie.cardchecker.cardchecker.business.domain.UserCard;
import com.odazie.cardchecker.cardchecker.business.service.CardService;
import com.odazie.cardchecker.cardchecker.data.entity.Card;
import com.odazie.cardchecker.cardchecker.data.repository.CardRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class cardController {

    private final CardService cardService;
    private final CardRepository cardRepository;

    public cardController(CardService cardService, CardRepository cardRepository) {
        this.cardService = cardService;
        this.cardRepository = cardRepository;
    }

    @GetMapping("/cards")
    public String getCards(Model model){
        List<UserCard> usersCards = getCardService().getAllCards();

        model.addAttribute("cards",usersCards);
        return "userscards";
    }

    /*
WAS FIGHTING A BUG HERE
    @PostMapping("/card")
    public Card  addCard(@RequestBody UserCard userCard){


        Card newCard = new Card();

        newCard.setCvv(userCard.getCvv());
        newCard.setCardOwnerName(userCard.getCardOwnerName());
        newCard.setCardNumber(userCard.getCardNumber());
        newCard.setBankName(userCard.getBankName());
        newCard.setCardType(userCard.getCardType());

        return  getCardRepository().save(newCard);

    }

*/
    @GetMapping("/card")
    public String cardForm(Model model){
        model.addAttribute("card", new UserCard());
        return "addCard";
    }

    @PostMapping("/card")
    public String addCard(@ModelAttribute Card card ){
        getCardService().addCard(card);
        return "success";
    }

    public CardRepository getCardRepository() {
        return cardRepository;
    }

    public CardService getCardService() {
        return cardService;
    }
}

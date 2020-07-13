package com.odazie.cardchecker.cardchecker.web;

import com.odazie.cardchecker.cardchecker.business.domain.UserCard;
import com.odazie.cardchecker.cardchecker.business.service.CardService;
import com.odazie.cardchecker.cardchecker.data.entity.Card;
import com.odazie.cardchecker.cardchecker.data.repository.CardRepository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class cardController {

    private final CardService cardService;
    private final CardRepository cardRepository;

    public cardController(CardService cardService, CardRepository cardRepository) {
        this.cardService = cardService;
        this.cardRepository = cardRepository;
    }

    @GetMapping("/cards")
    private List<UserCard> getCards(Model model){
        List<UserCard> usersCards = getCardService().getAllCards();

        model.addAttribute("cards", usersCards);

        return usersCards;
        // return this.cardRepository.findAll();
    }

    //WAS FIGHTING A BUG HERE
//    @PostMapping("/card")
//    public Card  addCard(@RequestBody UserCard userCard){
//
//
//        Card newCard = new Card();
//
//        newCard.setCvv(userCard.getCvv());
//        newCard.setCardOwnerName(userCard.getCardOwnerName());
//        newCard.setCardNumber(userCard.getCardNumber());
//        newCard.setBankName(userCard.getBankName());
//        newCard.setCardType(userCard.getCardType());
//
//        return  getCardRepository().save(newCard);
//
//    }
//
    @PostMapping("/card")
    public Long addCard(@RequestBody Card card ){
        getCardService().addCard(card);
        return card.getCardId();
    }

    public CardRepository getCardRepository() {
        return cardRepository;
    }

    public CardService getCardService() {
        return cardService;
    }
}

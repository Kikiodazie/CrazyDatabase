package com.odazie.cardchecker.cardchecker.business.service;

import com.odazie.cardchecker.cardchecker.business.domain.UserCard;
import com.odazie.cardchecker.cardchecker.business.domain.CardOwner;
import com.odazie.cardchecker.cardchecker.data.entity.Card;
import com.odazie.cardchecker.cardchecker.data.repository.CardOwnerRepository;
import com.odazie.cardchecker.cardchecker.data.repository.CardRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class CardService {

    private final CardOwnerRepository cardOwnerRepository;
    private final CardRepository cardRepository;


    public CardService(CardOwnerRepository cardOwnerRepository, CardRepository cardRepository) {
        this.cardOwnerRepository = cardOwnerRepository;
        this.cardRepository = cardRepository;
    }


    public List<UserCard> getAllCards(){
        Iterable<Card> cards = getCardRepository().findAll();

        Map<Long, UserCard> userCardMap = new HashMap<>();

        cards.forEach(card -> {
            UserCard userCard = new UserCard();
            CardOwner cardOwner = new CardOwner();

            userCard.setCardOwnerName(card.getCardOwnerName());
            userCard.setCardId(card.getCardId());
            userCard.setCardNumber(card.getCardNumber());
            userCard.setCardType(card.getCardType());
            userCard.setCvv(card.getCvv());
            userCard.setExpiryDate(card.getExpiryDate());
            userCard.setBankName(card.getBankName());

            userCardMap.put(card.getCardId(), userCard);

        });

        List<UserCard> usersCards = new ArrayList<>();

        for (Long id : userCardMap.keySet()){
            usersCards.add(userCardMap.get(id));
        }

        return usersCards;
    }

    public void addCard(Card card){
        getCardRepository().save(card);
    }



    public CardOwnerRepository getCardOwnerRepository() {
        return cardOwnerRepository;
    }

    public CardRepository getCardRepository() {
        return cardRepository;
    }
}

package com.odazie.cardchecker.cardchecker.data.repository;

import com.odazie.cardchecker.cardchecker.data.entity.Card;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CardRepository extends CrudRepository<Card,Long> {
    List<Card> findByCardOwnerName(String cardOwnerName);


}

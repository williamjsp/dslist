package com.williamjohnson.dslist.repositories;

import com.williamjohnson.dslist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;
                                               //Entidade(Game), e o tipo do id da entidade(Long)
public interface GameRepository extends JpaRepository<Game, Long> {

}

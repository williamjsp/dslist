package com.williamjohnson.dslist.controllers;

import com.williamjohnson.dslist.dto.GameDTO;
import com.williamjohnson.dslist.dto.GameListDTO;
import com.williamjohnson.dslist.dto.GameMinDTO;
import com.williamjohnson.dslist.services.GameListService;
import com.williamjohnson.dslist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {

    @Autowired
    private GameListService gameListService;

    @Autowired
    private GameService gameService;

    @GetMapping
    public List<GameListDTO> findAll(){
        var result = gameListService.findAll();
        return result;
    }
    @GetMapping(value = "/{listId}/games")
    public List<GameMinDTO> findByList(@PathVariable Long listId){
        var result = gameService.findByList(listId);

        return result;
    }
}

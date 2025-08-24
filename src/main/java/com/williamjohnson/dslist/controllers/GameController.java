package com.williamjohnson.dslist.controllers;

import com.williamjohnson.dslist.dto.GameDTO;
import com.williamjohnson.dslist.dto.GameMinDTO;
import com.williamjohnson.dslist.entities.Game;
import com.williamjohnson.dslist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/games")
public class GameController {

    @Autowired
    private GameService gameService;

    @GetMapping(value = "/{id}")
    public GameDTO findById(@PathVariable Long id){
        var result = gameService.findById(id);
        return result;
    }

    @GetMapping
    public List<GameMinDTO> findAll(){
        var result = gameService.findAll();

        return result;
    }
}

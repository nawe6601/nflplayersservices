package com.nathan.nflplayersservices.controllers;

import com.nathan.nflplayersservices.domain.Player;
import com.nathan.nflplayersservices.service.NflPlayersService;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class playerscontroller {

    private NflPlayersService nflPlayersService;

    playerscontroller(NflPlayersService nflPlayersService){
        this.nflPlayersService = nflPlayersService;
    }

    @RequestMapping("/hello")
    public Player helloworld(){
        return nflPlayersService.getNathan();
    }

    @RequestMapping(value = "/createPlayer",method = RequestMethod.POST)
    public Player savePlayer(@RequestBody Player player){
        return nflPlayersService.createPlayer(player);
    }

    @RequestMapping(value = "/getPlayers",method = RequestMethod.GET)
    public List<Player> getPlayers(@RequestParam(value = "yearOfBirth",required = false) String yearOfBirth){
        return nflPlayersService.getPlayers(yearOfBirth);
    }

}

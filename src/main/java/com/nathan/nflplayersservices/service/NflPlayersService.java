package com.nathan.nflplayersservices.service;

import com.nathan.nflplayersservices.Dao.Repositories.NflPlayersRepository;
import com.nathan.nflplayersservices.domain.Player;
import javafx.util.Builder;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import java.util.List;

@Component
public class NflPlayersService {

    NflPlayersRepository nflPlayersRepository;

    NflPlayersService(NflPlayersRepository nflPlayersRepository){
        this.nflPlayersRepository = nflPlayersRepository;
    }

    public Player createPlayer(Player player){
        return nflPlayersRepository.save(player);
    }

    public List<Player> getPlayers(String yearOfBirth){
        if(StringUtils.isEmpty(yearOfBirth)){
            return nflPlayersRepository.findAll();
        }else {
            return nflPlayersRepository.getAllByYearOfBirth(yearOfBirth);
        }
    }

    public Player getNathan(){
        Player nathan = new Player( new Long("1234"),"Nathan","Welch","QB","1995");
        return nathan;
    }
}

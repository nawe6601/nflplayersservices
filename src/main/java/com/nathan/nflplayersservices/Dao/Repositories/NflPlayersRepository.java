package com.nathan.nflplayersservices.Dao.Repositories;

import com.nathan.nflplayersservices.domain.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
public interface NflPlayersRepository extends JpaRepository<Player,Long>{

    List<Player> getAllByYearOfBirth(String year);

}

package ca.quickheaven.demo.dao;

import ca.quickheaven.demo.domain.Player;
import ca.quickheaven.demo.domain.Team;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.List;

@RestResource(path = "players", rel="players")
public interface PlayerDao extends CrudRepository<Player, Long> {

}

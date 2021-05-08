package ca.quickheaven.demo;

import ca.quickheaven.demo.dao.TeamDao;
import ca.quickheaven.demo.domain.Player;
import ca.quickheaven.demo.domain.Team;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import javax.annotation.PostConstruct;
import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class MicroservicesBootApplication extends SpringBootServletInitializer {


    @Autowired
    private TeamDao teamDao;

    /**
     * Used when run as JAR
     *
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(MicroservicesBootApplication.class, args);
    }

    /**
     * Used when run as a WAR
     */
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(MicroservicesBootApplication.class);
    }

    @PostConstruct
    public void init() {
        Set<Player> players = new HashSet<>();
        players.add(new Player("Charlie Brown", "pitcher"));
        players.add(new Player("Snoopy", "shortstop"));

        Team team = new Team("Peanuts", "California", players);
        teamDao.save(team);
    }

}

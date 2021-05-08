package ca.quickheaven.demo;

import ca.quickheaven.demo.dao.TeamDao;
import ca.quickheaven.demo.domain.Team;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WhateverIWantController {

    @Autowired
    private TeamDao teamDao;

    @RequestMapping("/hi/{name}")
    public Team hiThere(@PathVariable String name) {
        Team team = teamDao.findByName(name);

        return team;
    }
}

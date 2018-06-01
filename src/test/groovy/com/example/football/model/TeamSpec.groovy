package com.example.football.model

import spock.lang.Specification

class TeamSpec extends Specification {


    def "Two same constructed Team equals each other"(){
        given:
            def team = new Team(1,"England")
            def team2 = new Team(1,"England")

        expect:
            team == team2
            team.equals(team2)

    }

    def "Two different constructed Teams don't equal each other"(){
        given:
            def team = new Team(1,"England")
            def team2 = new Team(2,"Scotland")

        expect:
            team != team2
            !team.equals(team2)

    }

}

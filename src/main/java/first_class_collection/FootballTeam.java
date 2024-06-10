package first_class_collection;

import java.util.List;

public class FootballTeam {
    private static final int PLAYER_MAX_HEAD_COUNT = 11;

    private final List<String> players;

    public FootballTeam(List<String> players) {
        validateHeadCount(players);
        this.players = players;
    }

    private void validateHeadCount(List<String> players) {
        if (players.size() != PLAYER_MAX_HEAD_COUNT)
            throw new IllegalArgumentException("플레이어의 인원수가 11명이 아닙니다.");
    }

    public void doA() {

    }
}

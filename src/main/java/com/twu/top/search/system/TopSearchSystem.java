package com.twu.top.search.system;

import com.twu.top.search.system.list.RankingList;
import com.twu.top.search.system.user.User;

public class TopSearchSystem {

    private User user;
    private RankingList rankingList;

    public TopSearchSystem() {
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public RankingList getRankingList() {
        return rankingList;
    }

    public void setRankingList(RankingList rankingList) {
        this.rankingList = rankingList;
    }
}

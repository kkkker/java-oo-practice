package com.twu.top.search.system;

import com.twu.top.search.system.list.RankingList;
import com.twu.top.search.system.list.TopSearch;
import com.twu.top.search.system.user.Manager;
import com.twu.top.search.system.user.User;

public class TopSearchSystem {

    private User user;
    private RankingList rankingList = new RankingList();
    private boolean running = false;
    private boolean logIn = false;

    public TopSearchSystem() {
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public boolean isRunning() {
        return running;
    }

    public void setRunning(boolean running) {
        this.running = running;
    }

    public boolean isLogIn() {
        return logIn;
    }

    public void setLogIn(boolean loggin) {
        this.logIn = loggin;
    }

    public RankingList getRankingList() {
        return rankingList;
    }

    public void setRankingList(RankingList rankingList) {
        this.rankingList = rankingList;
    }

    public boolean addTopSearch(TopSearch topSearch) {
        return this.user.addTopSearch(topSearch, this.rankingList.getTopSearchList());
    }

    public boolean addSuperTopSearch(TopSearch topSearch) {
        Manager manager = (Manager)this.user;
        return manager.addSuperTopSearch(topSearch, this.rankingList.getTopSearchList());
    }

    public String showRankingList() {
        return user.showRankingList(this.rankingList);
    }
}

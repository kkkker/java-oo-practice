package com.twu.top.search.system.user;

import com.twu.top.search.system.list.RankingList;
import com.twu.top.search.system.list.TopSearch;

public class UserImpl implements User {

    private String jurisdiction;

    public UserImpl() {
    }

    public String getJurisdiction() {
        return jurisdiction;
    }

    public void setJurisdiction(String jurisdiction) {
        this.jurisdiction = jurisdiction;
    }

    @Override
    public void showRankingList(RankingList rankingList) {
    }

    @Override
    public TopSearch addTopSearch(TopSearch topSearch) {
        return null;
    }
}

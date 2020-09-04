package com.twu.top.search.system.user;

import com.twu.top.search.system.list.RankingList;
import com.twu.top.search.system.list.TopSearch;

import java.util.List;

public class User {

    private String jurisdiction;
    private String name;

    public User(String name, String jurisdiction) {
        this.name = name;
        this.jurisdiction = jurisdiction;
    }

    public String getJurisdiction() {
        return jurisdiction;
    }

    public void setJurisdiction(String jurisdiction) {
        this.jurisdiction = jurisdiction;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String showRankingList(RankingList rankingList) {
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < rankingList.getTopSearchList().size(); i++) {
            res.append(i + 1)
                    .append(" ")
                    .append(rankingList.getTopSearchList().get(i).getDescribe())
                    .append(" ")
                    .append(rankingList.getTopSearchList().get(i).getHot())
                    .append("\n");
        }
        return res.toString();
    }

    public boolean addTopSearch(TopSearch topSearch, RankingList rankingList) {
        if (rankingList.getTopSearchList().contains(topSearch)) {
            return false;
        }
        rankingList.getTopSearchList().add(topSearch);
        rankingList.getBidding().add(0);
        return true;
    }
}

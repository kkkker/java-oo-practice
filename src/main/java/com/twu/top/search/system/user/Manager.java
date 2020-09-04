package com.twu.top.search.system.user;

import com.twu.top.search.system.list.RankingList;
import com.twu.top.search.system.list.TopSearch;

import java.util.List;

public class Manager extends User {

    private String password;

    public Manager(String name, String password) {
        super(name, "manager");
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean addSuperTopSearch(TopSearch topSearch, RankingList rankingList) {
        int index = rankingList.getTopSearchList().indexOf(topSearch);
        if (index < 0) {
            rankingList.getTopSearchList().add(topSearch);
            rankingList.getBidding().add(0);
            return true;
        }
        boolean res = !rankingList.getTopSearchList().get(index).isSuperSearch();
        rankingList.getTopSearchList().get(index).setSuperSearch(true);
        return res;
    }
}

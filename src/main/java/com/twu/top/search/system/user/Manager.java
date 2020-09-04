package com.twu.top.search.system.user;

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

    public boolean addSuperTopSearch(TopSearch topSearch, List<TopSearch> topSearchList) {
        int index = topSearchList.indexOf(topSearch);
        if (index < 0) {
            topSearchList.add(topSearch);
            return true;
        }
        boolean res = !topSearchList.get(index).isSuperSearch();
        topSearchList.get(index).setSuperSearch(true);
        return res;
    }
}

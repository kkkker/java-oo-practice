package com.twu.top.search.system.user;

import com.twu.top.search.system.list.TopSearch;

public class Manager extends UserImpl {

    public Manager() {
        String jurisdiction = "normal-user";
        super.setJurisdiction(jurisdiction);
    }

    public TopSearch addSuperSearch(TopSearch topSearch) {
        return topSearch;
    }
}

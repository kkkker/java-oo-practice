package com.twu.top.search.system.user;

import com.twu.top.search.system.list.TopSearch;

public class NormalUser extends UserImpl {

    public NormalUser() {
        String jurisdiction = "normal-user";
        super.setJurisdiction(jurisdiction);
    }

    public TopSearch vote(TopSearch topSearch) {
        return topSearch;
    }

    public TopSearch buyTopSearch(TopSearch topSearch) {
        return topSearch;
    }
}

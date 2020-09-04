package com.twu.top.search.system.user;

import com.twu.top.search.system.list.TopSearch;

public class NormalUser extends User {

    public NormalUser(String name) {
        super(name, "normal-user");
    }

    public TopSearch vote(TopSearch topSearch) {
        return topSearch;
    }

    public TopSearch buyTopSearch(TopSearch topSearch) {
        return topSearch;
    }
}

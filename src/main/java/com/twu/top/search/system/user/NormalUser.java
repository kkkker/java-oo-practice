package com.twu.top.search.system.user;

import com.twu.top.search.system.list.TopSearch;

public class NormalUser extends User {

    private int numberOfVotes = 10;

    public NormalUser(String name) {
        super(name, "normal-user");
    }

    public int getNumberOfVotes() {
        return numberOfVotes;
    }

    public void setNumberOfVotes(int numberOfVotes) {
        this.numberOfVotes = numberOfVotes;
    }

    public void vote(TopSearch topSearch,int votes) {
        this.numberOfVotes -= votes;
        if (topSearch.isSuperSearch()) {
            topSearch.addHot(2 * votes);
        } else {
            topSearch.addHot(votes);
        }
    }

    public void buyTopSearch(TopSearch topSearch) {
    }
}

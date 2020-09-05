package com.twu.top.search.system.user;

import com.twu.top.search.system.list.RankingList;
import com.twu.top.search.system.list.TopSearch;

import java.util.List;

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

    public boolean buyTopSearch(RankingList rankingList, TopSearch topSearch, int ranking, int money) {
        List<Integer> bidding = rankingList.getBidding();
        if (ranking > bidding.size()) {
            return false;
        }
        if (money <= bidding.get(ranking - 1)) {
            return false;
        }
        List<TopSearch> topSearchList = rankingList.getTopSearchList();
        //若原热搜是购买的，则直接顶替掉
        if (rankingList.getBidding().get(ranking - 1) > 0) {
            topSearchList.remove(ranking - 1);
            bidding.remove(ranking - 1);
        }
        bidding.remove(topSearchList.indexOf(topSearch));
        topSearchList.remove(topSearch);
        bidding.add(ranking - 1, money);
        topSearchList.add(ranking - 1, topSearch);
        return true;
    }
}

package com.twu.top.search.system.list;

import java.util.ArrayList;
import java.util.List;

public class RankingList {

    private List<TopSearch> topSearchList = new ArrayList<>();
    private List<Integer> bidding = new ArrayList<>();

    public RankingList() {
    }

    public RankingList(List<TopSearch> topSearchList, List<Integer> bidding) {
        this.topSearchList = topSearchList;
        this.bidding = bidding;
    }

    public List<TopSearch> getTopSearchList() {
        return topSearchList;
    }

    public void setTopSearchList(List<TopSearch> topSearchList) {
        this.topSearchList = topSearchList;
    }

    public List<Integer> getBidding() {
        return bidding;
    }

    public void setBidding(List<Integer> bidding) {
        this.bidding = bidding;
    }

    @Override
    public String toString() {
        return "RankingList{" +
                "topSearchList=" + topSearchList +
                ", bidding=" + bidding +
                '}';
    }
}

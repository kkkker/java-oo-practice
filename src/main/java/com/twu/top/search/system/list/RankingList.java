package com.twu.top.search.system.list;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

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

    public boolean addTopSearch(TopSearch topSearch) {
        if (this.topSearchList.contains(topSearch)) {
            return false;
        }
        this.topSearchList.add(topSearch);
        return true;
    }

    public void rearrangement() {
        Map<Integer, TopSearch> temp = new HashMap<>();
        for (int i = 0; i < this.bidding.size(); i++) {
            if(bidding.get(i) > 0) {
                temp.put(i, this.topSearchList.get(i));
            }
        }

        this.topSearchList = this.topSearchList.stream()
                .filter(e -> bidding.get(this.topSearchList.indexOf(e)) == 0)
                .sorted(Comparator.comparing(TopSearch::getHot).reversed())
                .collect(Collectors.toList());

        for (Map.Entry<Integer, TopSearch> entry : temp.entrySet()) {
            topSearchList.add(entry.getKey(), entry.getValue());
        }
    }
}

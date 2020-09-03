package com.twu.top.search.system.list;

import java.util.Objects;

public class TopSearch {
    private int ranking;
    private String describe;
    private int hot;
    private boolean superSearch;

    public TopSearch(int ranking, String describe, int hot, boolean superSearch) {
        this.ranking = ranking;
        this.describe = describe;
        this.hot = hot;
        this.superSearch = superSearch;
    }

    public int getRanking() {
        return ranking;
    }

    public void setRanking(int ranking) {
        this.ranking = ranking;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public int getHot() {
        return hot;
    }

    public void setHot(int hot) {
        this.hot = hot;
    }

    public boolean isSuperSearch() {
        return superSearch;
    }

    public void setSuperSearch(boolean superSearch) {
        this.superSearch = superSearch;
    }

    @Override
    public String toString() {
        return "TopSearch{" +
                "ranking=" + ranking +
                ", describe='" + describe + '\'' +
                ", hot=" + hot +
                ", superSearch=" + superSearch +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TopSearch topSearch = (TopSearch) o;
        return Objects.equals(describe, topSearch.describe);
    }

    @Override
    public int hashCode() {
        return Objects.hash(describe);
    }
}

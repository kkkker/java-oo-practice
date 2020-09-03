package com.twu.top.search.system.user;

import com.twu.top.search.system.list.RankingList;
import com.twu.top.search.system.list.TopSearch;

public interface User {

    void  showRankingList(RankingList rankingList);

    TopSearch addTopSearch(TopSearch topSearch);

}

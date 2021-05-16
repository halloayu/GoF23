package com.yzeng.chain;

import java.util.ArrayList;
import java.util.List;

public class FilterChain implements Filter {

    List<Filter> filters = new ArrayList<>();

    public FilterChain add(Filter f) {
        filters.add(f);
        return this;
    }

    public boolean doFilter(Msg msg) {
        for (Filter filter : filters) {
            if (!filter.doFilter(msg)) return false;
        }
        return true;
    }
}

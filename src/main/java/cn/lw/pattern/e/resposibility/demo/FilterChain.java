package cn.lw.pattern.e.resposibility.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by VictorLiu on 2018/10/17.
 */
public class FilterChain implements Filter {

    public List<Filter> filters = new ArrayList();

    public int index = 0;

    @Override
    public void process() {
        index = 0;
        while (index < filters.size()) {
            filters.get(index).process();
            index++;
        }
    }

    public void addFilter(Filter filter) {
        filters.add(filter);
    }
}

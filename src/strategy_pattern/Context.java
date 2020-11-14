package strategy_pattern;

import java.util.ArrayList;
import java.util.List;

public class Context<E> {
    private SortStrategy<E> strategy;
    private List<E> items = new ArrayList<>();

    public void setSortStrategy(SortStrategy<E> sortStrategy) {
        this.strategy = sortStrategy;
    }

    public void add(E e) {
        items.add(e);
    }

    public void sort() {
        strategy.sort(items);
    }
}

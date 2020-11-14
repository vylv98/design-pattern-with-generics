package strategy_pattern;

import java.util.List;

public interface SortStrategy<E> {
    void sort(List<E> items);
}

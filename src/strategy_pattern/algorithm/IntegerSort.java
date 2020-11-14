package strategy_pattern.algorithm;

import strategy_pattern.SortStrategy;

import java.util.List;

public class IntegerSort implements SortStrategy<Integer> {
    @Override
    public void sort(List<Integer> items) {
        System.out.println("Sort Integer list");
    }
}

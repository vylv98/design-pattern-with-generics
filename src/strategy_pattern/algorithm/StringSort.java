package strategy_pattern.algorithm;

import strategy_pattern.SortStrategy;

import java.util.List;

public class StringSort implements SortStrategy<String> {
    @Override
    public void sort(List<String> strs) {
        System.out.println("Sort String list");
    }
}

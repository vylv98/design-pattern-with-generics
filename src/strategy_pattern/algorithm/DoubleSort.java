package strategy_pattern.algorithm;

import strategy_pattern.SortStrategy;

import java.util.List;

public class DoubleSort implements SortStrategy<Double> {
    @Override
    public void sort(List<Double> items) {
        System.out.println("Sort Double list");
    }
}

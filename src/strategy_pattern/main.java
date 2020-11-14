package strategy_pattern;

import strategy_pattern.algorithm.DoubleSort;
import strategy_pattern.algorithm.StringSort;

public class main {
    public static void main(String[] args) {

        Context<String> context = new Context();
        context.add("1.23");
        context.add("2.34");

        context.setSortStrategy(new StringSort());
        context.sort();
    }
}

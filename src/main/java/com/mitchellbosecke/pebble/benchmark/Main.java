package com.mitchellbosecke.pebble.benchmark;

public class Main {

    public static void main(String[] args) {
        BenchmarkRunner runner = new BenchmarkRunner(5, 10000);
        runner.addBenchmark(new CompilationsBenchmark());
        runner.addBenchmark(new EvaluationsBenchmark());
        runner.addBenchmark(new ConcurrentEvaluationsBenchmark());
        runner.run();
    }

}

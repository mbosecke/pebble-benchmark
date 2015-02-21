package com.mitchellbosecke.pebble.benchmark;

import java.io.IOException;

import com.mitchellbosecke.pebble.error.PebbleException;

public class Main {

    public static void main(String[] args) throws PebbleException, IOException {

        BenchmarkRunner runner = new BenchmarkRunner(5,10000);
        runner.addBenchmark(new CompilationsBenchmark());
        runner.addBenchmark(new EvaluationsBenchmark());
        //runner.addBenchmark(new ConcurrentEvaluationsBenchmark());
        runner.run();

    }

}

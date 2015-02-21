package com.mitchellbosecke.pebble.benchmark;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import com.mitchellbosecke.pebble.PebbleEngine;

public final class BenchmarkRunner {

    private final int trials;

    private final int reps;

    private final int numberOfWarmupTrials = 2;

    private final int restBetweenTrials = 2000;

    private final List<Benchmark> benchmarks;

    private final Map<Benchmark, Double> results;

    public BenchmarkRunner(int trials, int reps) {

        this.trials = trials;
        this.reps = reps;
        this.benchmarks = new ArrayList<>();
        this.results = new HashMap<>();
    }

    public void addBenchmark(Benchmark benchmark) {
        this.benchmarks.add(benchmark);
    }

    public void run() {

        System.out.println("Starting benchmarks...");

        System.out.println(String.format("Number of warmup trials: %d", numberOfWarmupTrials));
        System.out.println(String.format("Number of real trials: %d", trials));
        System.out.println(String.format("Number of reps per trial: %d", reps));
        System.out.println("===============================");

        // warmup trials
        for (int warmup = 0; warmup < this.numberOfWarmupTrials; warmup++) {
            for (Benchmark benchmark : benchmarks) {
                timeBenchmark(benchmark);
                sleep();
            }
        }

        // perform the actual recorded trials
        for (int trial = 1; trial <= this.trials; trial++) {
            for (Benchmark benchmark : benchmarks) {
                double result = timeBenchmark(benchmark);

                double totalResultSoFar = results.containsKey(benchmark) ? results.get(benchmark) : 0;
                results.put(benchmark, totalResultSoFar + result);

                System.out
                        .println(String
                                .format("Trial %d [%s]: There were %d reps, total time is %f seconds, average time per rep is %f seconds.",
                                        trial, benchmark.getClass().getSimpleName(), reps, result, result / reps));
            }

            // sleep between trials
            sleep();
        }

        System.out.println("===============================");
        System.out.println("Benchmarks completed. Average total time for each benchmark:");

        for (Entry<Benchmark, Double> result : this.results.entrySet()) {
            System.out.println(String.format("%s: %f", result.getKey().getClass().getSimpleName(), result.getValue()
                    / trials));
        }

    }

    private void sleep() {
        try {
            Thread.sleep(restBetweenTrials);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private double timeBenchmark(Benchmark benchmark) {

        benchmark.setup();
        long start = System.nanoTime();
        benchmark.run(reps);
        long end = System.nanoTime();

        long result = end - start; // ns

        return (result * 10E-10); // convert to seconds

    }

}

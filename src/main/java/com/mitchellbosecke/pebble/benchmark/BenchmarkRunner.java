package com.mitchellbosecke.pebble.benchmark;

import java.util.ArrayList;
import java.util.List;

public final class BenchmarkRunner {

	private final int warmups;

	private final int reps;

	List<Benchmark> benchmarks = new ArrayList<>();

	public BenchmarkRunner(int warmups, int reps) {
		this.warmups = warmups;
		this.reps = reps;
	}

	public void addBenchmark(Benchmark benchmark) {
		this.benchmarks.add(benchmark);
	}

	public void run() {
		for (Benchmark benchmark : benchmarks) {
			double result = timeBenchmark(benchmark);
			System.out.println(String.format(
					"Completed %s. Elapsed time (s): %f", benchmark.getClass()
							.getSimpleName(), result));
		}
	}

	private double timeBenchmark(Benchmark benchmark) {

		benchmark.setup();
		benchmark.run(warmups);

		long start = System.nanoTime();
		benchmark.run(reps);
		long end = System.nanoTime();

		long result = end - start; // ns

		return (result * 10E-10); // convert to seconds

	}

}

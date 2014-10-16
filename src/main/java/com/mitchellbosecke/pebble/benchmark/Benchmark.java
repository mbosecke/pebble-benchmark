package com.mitchellbosecke.pebble.benchmark;

public interface Benchmark {
	
	public void setup();

	public void run(int reps);

}

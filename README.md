pebble-benchmark
================

Microbenchmark for the Pebble Templating Engine

1. Download and build the latest snapshot of google caliper
2. Run the `main` method within com.mitchellbosecke.pebble.benchmark.Main


Example Output
===============
The following benchmark was run on a machine with the following stats:
* OS: CentOS 7
* Kernel: 3.10.0-123.el7.x86_64
* Memory: 8GB
* Processor: Intel(R) Core(TM) i5-3470 CPU @ 3.20GHz
````
Starting benchmarks...
Number of warmup trials: 2
Number of real trials: 5
Number of reps per trial: 10000
===============================
Trial 1 [EvaluationsBenchmark]: There were 10000 reps, total time is 1.496312 seconds, average time per rep is 0.000150 seconds.
Trial 1 [CompilationsBenchmark]: There were 10000 reps, total time is 5.149437 seconds, average time per rep is 0.000515 seconds.
Trial 2 [EvaluationsBenchmark]: There were 10000 reps, total time is 1.492636 seconds, average time per rep is 0.000149 seconds.
Trial 2 [CompilationsBenchmark]: There were 10000 reps, total time is 5.146059 seconds, average time per rep is 0.000515 seconds.
Trial 3 [EvaluationsBenchmark]: There were 10000 reps, total time is 1.488132 seconds, average time per rep is 0.000149 seconds.
Trial 3 [CompilationsBenchmark]: There were 10000 reps, total time is 5.136797 seconds, average time per rep is 0.000514 seconds.
Trial 4 [EvaluationsBenchmark]: There were 10000 reps, total time is 1.509373 seconds, average time per rep is 0.000151 seconds.
Trial 4 [CompilationsBenchmark]: There were 10000 reps, total time is 5.174562 seconds, average time per rep is 0.000517 seconds.
Trial 5 [EvaluationsBenchmark]: There were 10000 reps, total time is 1.495129 seconds, average time per rep is 0.000150 seconds.
Trial 5 [CompilationsBenchmark]: There were 10000 reps, total time is 5.130770 seconds, average time per rep is 0.000513 seconds.
===============================
Benchmarks completed. Average total time for each benchmark:
EvaluationsBenchmark: 1.496316
CompilationsBenchmark: 5.147525
````

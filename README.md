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
Trial 1 [EvaluationsBenchmark]: There were 10000 reps, total time is 1.420284 seconds, average time per rep is 0.000142 seconds.
Trial 1 [CompilationsBenchmark]: There were 10000 reps, total time is 5.088062 seconds, average time per rep is 0.000509 seconds.
Trial 2 [EvaluationsBenchmark]: There were 10000 reps, total time is 1.409083 seconds, average time per rep is 0.000141 seconds.
Trial 2 [CompilationsBenchmark]: There were 10000 reps, total time is 5.096350 seconds, average time per rep is 0.000510 seconds.
Trial 3 [EvaluationsBenchmark]: There were 10000 reps, total time is 1.414965 seconds, average time per rep is 0.000141 seconds.
Trial 3 [CompilationsBenchmark]: There were 10000 reps, total time is 5.077973 seconds, average time per rep is 0.000508 seconds.
Trial 4 [EvaluationsBenchmark]: There were 10000 reps, total time is 1.433666 seconds, average time per rep is 0.000143 seconds.
Trial 4 [CompilationsBenchmark]: There were 10000 reps, total time is 5.112493 seconds, average time per rep is 0.000511 seconds.
Trial 5 [EvaluationsBenchmark]: There were 10000 reps, total time is 1.410160 seconds, average time per rep is 0.000141 seconds.
Trial 5 [CompilationsBenchmark]: There were 10000 reps, total time is 5.105262 seconds, average time per rep is 0.000511 seconds.
===============================
Benchmarks completed. Average total time for each benchmark:
EvaluationsBenchmark: 1.417632
CompilationsBenchmark: 5.096028
````

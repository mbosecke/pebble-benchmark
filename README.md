pebble-benchmark
================

Microbenchmark for the Pebble Templating Engine

1. Download the pebble source code and build it (`mvn install`)
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
Trial 1 [CompilationsBenchmark]: There were 10000 reps, total time is 2.372458 seconds, average time per rep is 0.000237 seconds.
Trial 1 [EvaluationsBenchmark]: There were 10000 reps, total time is 1.029616 seconds, average time per rep is 0.000103 seconds.
Trial 2 [CompilationsBenchmark]: There were 10000 reps, total time is 2.368664 seconds, average time per rep is 0.000237 seconds.
Trial 2 [EvaluationsBenchmark]: There were 10000 reps, total time is 1.034023 seconds, average time per rep is 0.000103 seconds.
Trial 3 [CompilationsBenchmark]: There were 10000 reps, total time is 2.378305 seconds, average time per rep is 0.000238 seconds.
Trial 3 [EvaluationsBenchmark]: There were 10000 reps, total time is 1.028683 seconds, average time per rep is 0.000103 seconds.
Trial 4 [CompilationsBenchmark]: There were 10000 reps, total time is 2.374699 seconds, average time per rep is 0.000237 seconds.
Trial 4 [EvaluationsBenchmark]: There were 10000 reps, total time is 1.041157 seconds, average time per rep is 0.000104 seconds.
Trial 5 [CompilationsBenchmark]: There were 10000 reps, total time is 2.380745 seconds, average time per rep is 0.000238 seconds.
Trial 5 [EvaluationsBenchmark]: There were 10000 reps, total time is 1.032206 seconds, average time per rep is 0.000103 seconds.
===============================
Benchmarks completed. Average total time for each benchmark:
EvaluationsBenchmark: 1.033137
CompilationsBenchmark: 2.374974
````

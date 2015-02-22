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
Trial 1 [CompilationsBenchmark]: There were 10000 reps, total time is 1.337889 seconds, average time per rep is 0.000134 seconds.
Trial 1 [EvaluationsBenchmark]: There were 10000 reps, total time is 0.878246 seconds, average time per rep is 0.000088 seconds.
Trial 2 [CompilationsBenchmark]: There were 10000 reps, total time is 1.332065 seconds, average time per rep is 0.000133 seconds.
Trial 2 [EvaluationsBenchmark]: There were 10000 reps, total time is 0.865939 seconds, average time per rep is 0.000087 seconds.
Trial 3 [CompilationsBenchmark]: There were 10000 reps, total time is 1.324533 seconds, average time per rep is 0.000132 seconds.
Trial 3 [EvaluationsBenchmark]: There were 10000 reps, total time is 0.866019 seconds, average time per rep is 0.000087 seconds.
Trial 4 [CompilationsBenchmark]: There were 10000 reps, total time is 1.335623 seconds, average time per rep is 0.000134 seconds.
Trial 4 [EvaluationsBenchmark]: There were 10000 reps, total time is 0.877653 seconds, average time per rep is 0.000088 seconds.
Trial 5 [CompilationsBenchmark]: There were 10000 reps, total time is 1.327553 seconds, average time per rep is 0.000133 seconds.
Trial 5 [EvaluationsBenchmark]: There were 10000 reps, total time is 0.867742 seconds, average time per rep is 0.000087 seconds.
===============================
Benchmarks completed. Average total time for each benchmark:
EvaluationsBenchmark: 0.871120
CompilationsBenchmark: 1.331533
````

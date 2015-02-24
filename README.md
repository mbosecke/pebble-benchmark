pebble-benchmark
================

Microbenchmark for the Pebble Templating Engine

1. Download the pebble source code and build it (`mvn clean install`)
2. Run the benchmark suite with `java -jar target/benchmarks.jar`

Interpreting the Results
========================
The benchmarks measure throughput, given in "ops/time". The time unit used is seconds. 
Generally, the score represents the number of templates compiled or rendered per second; the higher the score, the better.

The results for the concurrency benchmark can change dramatically depending on the architecture
of the machine being used. The usefulness of this particular benchmark is debatable.
 

Example Output
===============
The following benchmark was run on a machine with the following stats:
* OS: CentOS 7
* Kernel: 3.10.0-123.el7.x86_64
* Memory: 8GB
* Processor: Intel(R) Core(TM) i5-3470 CPU @ 3.20GHz
* Pebble Version: 1.4.2-SNAPSHOT

````
# JMH 1.6.1 (released 3 days ago)
# VM invoker: /usr/java/jdk1.7.0_67/jre/bin/java
# VM options: <none>
# Warmup: 5 iterations, 1 s each
# Measurement: 5 iterations, 1 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Throughput, ops/time

(...)
# Run complete. Total time: 00:02:34

Benchmark                                                       Mode  Cnt      Score     Error  Units
CompilationBenchmark.compilationsBenchmark                     thrpt   25   7323.374 ± 162.401  ops/s
ConcurrentEvaluationsBenchmark.concurrentEvaluationsBenchmark  thrpt   25  12974.688 ± 934.192  ops/s
EvaluationBenchmark.evaluationsBenchmark                       thrpt   25  13454.362 ± 100.875  ops/s
````

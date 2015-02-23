pebble-benchmark
================

Microbenchmark for the Pebble Templating Engine

1. Download the pebble source code and build it (`mvn install`)
2. Run the benchmark suite with `java -jar target/benchmarks.jar`


Example Output
===============
The following benchmark was run on a machine with the following stats:
* OS: Mac OS X 10.10.2
* Memory: 8GB
* Processor: Intel(R) Core(TM) i7 CPU @ 1.70GHz
````
# JMH 1.6.1 (released 2 days ago)
# VM invoker: /Library/Java/JavaVirtualMachines/jdk1.8.0_31.jdk/Contents/Home/jre/bin/java
# VM options: <none>
# Warmup: 5 iterations, 1 s each
# Measurement: 5 iterations, 1 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Average time, time/op
# Benchmark: com.mitchellbosecke.pebble.benchmark.CompilationBenchmark.compilationsBenchmark
(...)
# Run complete. Total time: 00:02:37

Benchmark                                                      Mode  Cnt    Score    Error  Units
CompilationBenchmark.compilationsBenchmark                     avgt   25  281.385 ± 16.386  us/op
ConcurrentEvaluationsBenchmark.concurrentEvaluationsBenchmark  avgt   25  168.001 ± 16.380  us/op
EvaluationBenchmark.evaluationsBenchmark                       avgt   25   97.650 ±  1.289  us/op
````

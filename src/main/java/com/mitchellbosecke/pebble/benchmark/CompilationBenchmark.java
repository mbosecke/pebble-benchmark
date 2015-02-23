package com.mitchellbosecke.pebble.benchmark;

import java.util.concurrent.TimeUnit;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Fork;
import org.openjdk.jmh.annotations.Measurement;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.OutputTimeUnit;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.Setup;
import org.openjdk.jmh.annotations.State;
import org.openjdk.jmh.annotations.Warmup;

import com.mitchellbosecke.pebble.PebbleEngine;
import com.mitchellbosecke.pebble.error.PebbleException;
import com.mitchellbosecke.pebble.template.PebbleTemplate;

@Fork(5)
@Measurement(iterations = 5)
@Warmup(iterations = 5)
@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.MICROSECONDS)
@State(Scope.Benchmark)
public class CompilationBenchmark {

    private PebbleEngine engine;
    private final String templateName = "listing";

    @Setup
    public void setup() {
        this.engine = new PebbleEngine();
        engine.getLoader().setPrefix("templates");
        engine.getLoader().setSuffix(".html");
        engine.setTemplateCache(null);
    }

    @Benchmark
    public PebbleTemplate compilationsBenchmark() throws PebbleException {
        return engine.getTemplate(templateName);
    }

}

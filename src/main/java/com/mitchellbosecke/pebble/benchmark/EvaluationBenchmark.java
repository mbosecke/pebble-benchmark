package com.mitchellbosecke.pebble.benchmark;

import java.io.IOException;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;
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
import com.mitchellbosecke.pebble.benchmark.model.Stock;
import com.mitchellbosecke.pebble.error.PebbleException;
import com.mitchellbosecke.pebble.template.PebbleTemplate;

@Fork(5)
@Measurement(iterations = 5)
@Warmup(iterations = 5)
@BenchmarkMode(Mode.Throughput)
@OutputTimeUnit(TimeUnit.SECONDS)
@State(Scope.Benchmark)
public class EvaluationBenchmark {

    private Map<String, Object> context;
    private PebbleTemplate template;

    @Setup
    public void setup() {
        PebbleEngine engine = new PebbleEngine();
        engine.getLoader().setPrefix("templates");
        engine.getLoader().setSuffix(".html");

        // compile the template once so that it's cached
        try {
            template = engine.getTemplate("listing");
        } catch (PebbleException e) {
            e.printStackTrace();
        }

        this.context = new HashMap<>();
        context.put("items", Stock.dummyItems());
    }

    @Benchmark
    public String evaluationsBenchmark() throws PebbleException, IOException {
        StringWriter writer = new StringWriter();
        template.evaluate(writer, context);
        return writer.toString();
    }

}

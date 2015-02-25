package com.mitchellbosecke.pebble.benchmark;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.Setup;

import com.mitchellbosecke.pebble.PebbleEngine;
import com.mitchellbosecke.pebble.error.PebbleException;
import com.mitchellbosecke.pebble.template.PebbleTemplate;

public class CompilationBenchmark extends BaseBenchmark {

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

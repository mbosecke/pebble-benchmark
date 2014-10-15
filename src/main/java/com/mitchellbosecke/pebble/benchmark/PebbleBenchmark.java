package com.mitchellbosecke.pebble.benchmark;

import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.caliper.Benchmark;
import com.google.caliper.runner.CaliperMain;
import com.mitchellbosecke.pebble.PebbleEngine;
import com.mitchellbosecke.pebble.benchmark.model.Stock;
import com.mitchellbosecke.pebble.error.PebbleException;
import com.mitchellbosecke.pebble.template.PebbleTemplate;

public final class PebbleBenchmark {

	public static void main(String[] args) throws IOException {
		CaliperMain.main(PebbleBenchmark.class, args);

		//PebbleBenchmark benchmark = new PebbleBenchmark();
		//benchmark.compilations(30);
	}

	public void evaluations(int reps) {
		PebbleEngine engine = new PebbleEngine();
		engine.getLoader().setPrefix("templates");
		engine.getLoader().setSuffix(".html");
		engine.setTemplateCache(null);
		Map<String, Object> context = new HashMap<>();
		context.put("items", Stock.dummyItems());

		try {
			PebbleTemplate template = engine.getTemplate("stocks.pebble");
			for (int i = 0; i < reps; i++) {
				template.evaluate(new StringWriter(), context);
			}
		} catch (Exception ex) {
			throw new RuntimeException(ex);
		}
	}

	@Benchmark
	void compilations(int reps) {
		PebbleEngine engine = new PebbleEngine();
		engine.getLoader().setPrefix("templates");
		engine.getLoader().setSuffix(".html");
		engine.setTemplateCache(null);

		@SuppressWarnings("unused")
		PebbleTemplate template;

		for (int i = 0; i < reps; i++) {
			try {
				template = engine.getTemplate("stocks.pebble");
			} catch (PebbleException e) {
				throw new RuntimeException(e);
			}
		}
	}

}

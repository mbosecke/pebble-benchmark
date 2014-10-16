package com.mitchellbosecke.pebble.benchmark;

import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;

import com.mitchellbosecke.pebble.PebbleEngine;
import com.mitchellbosecke.pebble.benchmark.model.Stock;
import com.mitchellbosecke.pebble.template.PebbleTemplate;

public class EvaluationsBenchmark implements Benchmark {

	private PebbleEngine engine;

	private Map<String, Object> context;

	public void run(int reps) {

		PebbleEngine engine = this.engine;

		Map<String, Object> context = this.context;

		try {
			PebbleTemplate template = engine.getTemplate("stocks.pebble");
			for (int i = 0; i < reps; i++) {
				template.evaluate(new StringWriter(), context);
			}
		} catch (Exception ex) {
			throw new RuntimeException(ex);
		}
	}

	@Override
	public void setup() {
		this.engine = new PebbleEngine();
		engine.getLoader().setPrefix("templates");
		engine.getLoader().setSuffix(".html");
		engine.setTemplateCache(null);

		this.context = new HashMap<>();
		context.put("items", Stock.dummyItems());
	}

}

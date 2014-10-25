package com.mitchellbosecke.pebble.benchmark;

import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;

import com.mitchellbosecke.pebble.PebbleEngine;
import com.mitchellbosecke.pebble.benchmark.model.Stock;
import com.mitchellbosecke.pebble.error.PebbleException;
import com.mitchellbosecke.pebble.template.PebbleTemplate;

public class EvaluationsBenchmark implements Benchmark {

	private Map<String, Object> context;
	
	private PebbleTemplate template;

	public void run(int reps) {

		Map<String, Object> context = this.context;

		try {
			for (int i = 0; i < reps; i++) {
				template.evaluate(new StringWriter(), context);
			}
		} catch (Exception ex) {
			throw new RuntimeException(ex);
		}
	}

	@Override
	public void setup() {
		PebbleEngine engine = new PebbleEngine();
		engine.getLoader().setPrefix("templates");
		engine.getLoader().setSuffix(".html");
		
		// compile the template once so that it's cached
		try {
			template = engine.getTemplate("stocks.pebble");
		} catch (PebbleException e) {
			e.printStackTrace();
		}

		this.context = new HashMap<>();
		context.put("items", Stock.dummyItems());
	}

}

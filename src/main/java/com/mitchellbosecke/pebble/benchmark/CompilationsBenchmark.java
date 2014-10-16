package com.mitchellbosecke.pebble.benchmark;

import com.mitchellbosecke.pebble.PebbleEngine;
import com.mitchellbosecke.pebble.error.PebbleException;
import com.mitchellbosecke.pebble.template.PebbleTemplate;

public class CompilationsBenchmark implements Benchmark {

	private PebbleEngine engine;

	public void run(int reps) {

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

	@Override
	public void setup() {
		this.engine = new PebbleEngine();
		engine.getLoader().setPrefix("templates");
		engine.getLoader().setSuffix(".html");
		engine.setTemplateCache(null);
	}

}

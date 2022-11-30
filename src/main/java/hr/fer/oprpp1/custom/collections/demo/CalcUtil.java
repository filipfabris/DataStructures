package hr.fer.oprpp1.custom.collections.demo;

import java.util.Map;
import java.util.function.Function;

import hr.fer.oprpp1.custom.collections.ObjectStack;

public class CalcUtil implements StackInterface {
	ObjectStack stack = new ObjectStack();

	@Override
	public int dohvat() {
		return Integer.valueOf(stack.pop().toString());
	}

	public int izracunaj(String izraz, Map<String, Function> mapa) {
		String[] elements = izraz.split("[ ]+");
		for (String s : elements) {

			if (s.matches("[0-9]+")) {
				stack.push(s);
			} else if (mapa.containsKey(s)) {
				Function<StackInterface, Integer> function = mapa.get(s);
				int broj = function.apply(this);
				stack.push(broj);
			} else {
				throw new IllegalArgumentException("Operation: " + s + " isn't supported");
			}

		}
		return (int) stack.pop();

	}

}
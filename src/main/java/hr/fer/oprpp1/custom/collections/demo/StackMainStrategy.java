package hr.fer.oprpp1.custom.collections.demo;

import java.util.Map;
import java.util.function.Function;

public class StackMainStrategy {
	
	public static void main(String[] args) {
        String izr = "4 1 3 # +";
        Map<String, Function> userInput =
        Map.of(
            "+", (Function<StackInterface, Integer>) (x) -> x.dohvat() + x.dohvat(),
            "-", (Function<StackInterface, Integer>) (x) -> x.dohvat() - x.dohvat(),
            "*", (Function<StackInterface, Integer>) (x) -> x.dohvat() * x.dohvat(),
            "/", (Function<StackInterface, Integer>) (x) -> x.dohvat() / x.dohvat(),
            "#", (Function<StackInterface, Integer>) (x) -> 2*x.dohvat() + 3 * x.dohvat()
        );
        CalcUtil calcUtil = new CalcUtil();
        int rez = calcUtil.izracunaj(izr, userInput);
        System.out.println(rez);


    }

}

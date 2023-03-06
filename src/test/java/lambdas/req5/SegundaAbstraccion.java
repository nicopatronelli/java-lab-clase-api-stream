package lambdas.req5;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;


public class SegundaAbstraccion {
//  2da iteración: Nuestra primera abstracción ya no nos alcanza ...
	public static List<Integer> filterAndMap(List<Integer> nums, Predicate<Integer> condicion, Function<Integer, Integer> func) {
		List<Integer> resultado = new ArrayList<>();
		for (int i = 0; i < nums.size(); i++) {
			Integer num = nums.get(i);
			if (condicion.test(num)) {
				resultado.add(func.apply(num));
			}
		}
		return resultado;
	}

}

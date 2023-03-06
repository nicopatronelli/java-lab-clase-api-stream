package lambdas.req3;

import java.util.ArrayList;
import java.util.List;

public class ParesMultiplicadosPor {
	//  1era iteración: Buscamos eliminar el código repetido a través de una primera abstracción

	public static List<Integer> paresMultiplicadosPor(List<Integer> nums, int factor) {
		List<Integer> resultado = new ArrayList<>();
		for (int i = 0; i < nums.size(); i++) {
			Integer num = nums.get(i);
			if (num % 2 == 0) { // filter
				final int mapResult = num * factor; // map
				resultado.add(mapResult);
			}
		}
		return resultado;
	}
}

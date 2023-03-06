package lambdas.req5.Condicion;

import lambdas.req5.Condicion.Condicion;

public class CondicionPar implements Condicion<Integer> {
	@Override
	public boolean test(Integer num) {
		return num % 2 == 0;
	}
}

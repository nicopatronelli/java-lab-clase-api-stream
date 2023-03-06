package lambdas.req5.Condicion;

@FunctionalInterface
public interface Condicion<T> {
	boolean test(T param);
}

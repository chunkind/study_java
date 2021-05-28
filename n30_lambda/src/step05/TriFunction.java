package step05;

/**
 * @Auth : K. J. S.
 * @Date : 2019. 3. 28.
 * 인자가 3개 이상일때
 */
@FunctionalInterface
public interface TriFunction<T, U, V, R> {
	R apply(T t, U u, V v);
}

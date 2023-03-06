package lambdas.req6;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PokeNames {
	//  Dada una lista con nombres de pokemons (strings), obtener una lista en mayúsculas de aquellos
	//  que terminan con "chu".
	private static List<String> pokeNames(List<String> pokemonNames) {
//		Imperativo
		List<String> resultado = new ArrayList<>();
		for (int i = 0; i < pokemonNames.size(); i++) {
			String pokemon = pokemonNames.get(i);
			if (pokemon.endsWith("chu")) {
				final String pokemonEnMayuscula = pokemon.toUpperCase();
				resultado.add(pokemonEnMayuscula);
			}
		}
		return resultado;
	}

	private static List<String> pokeNamesWithLambdas(List<String> pokemonNames) {
		// Declarativo
		return pokemonNames.stream()
				.filter(pokemon -> pokemon.endsWith("chu"))
				.map(pokemon -> pokemon.toUpperCase())
				.collect(Collectors.toList());
	}

	@Test
	void testPokeNames() {
		List<String> pokes = pokeNamesWithLambdas(List.of("pikachu", "charmander", "squartle", "raichu", "snorlax"));

		assertNotNull(pokes);
		assertEquals(2, pokes.size());
		assertTrue(pokes.contains("PIKACHU"));
		assertTrue(pokes.contains("RAICHU"));
	}
}

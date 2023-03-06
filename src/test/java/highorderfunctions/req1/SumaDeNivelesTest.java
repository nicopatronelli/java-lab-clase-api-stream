package highorderfunctions.req1;

import java.util.List;

import org.junit.jupiter.api.Test;

import domain.pokemon.Pokemon;
import domain.pokemon.PokemonType;

import static highorderfunctions.repository.PokemonRepository.charmander;
import static highorderfunctions.repository.PokemonRepository.charmeleon;
import static highorderfunctions.repository.PokemonRepository.pikachu;
import static highorderfunctions.repository.PokemonRepository.raichu;
import static highorderfunctions.repository.PokemonRepository.snorlax;
import static highorderfunctions.repository.PokemonRepository.squartle;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumaDeNivelesTest {
	//  EJERCICIO 1: A partir de una lista de pokemons, retornar la sumatoria del nivel
	//	de aquellos que no sean de tipo agua y que pertenezcan a un entrenador (no son salvajes)

	// Primera versión (imperativa -> usa fors, ifs, muta variables)
//	public static int sumarNivelDePokemonsQueNoSeanDeAguaYTenganEntrenador(List<Pokemon> pokemons) {
//		int totalLevel = 0;
//		for (Pokemon pokemon : pokemons) {
//			if (!pokemon.esDeTipo(PokemonType.WATER)) { // filter
//				if (pokemon.tieneEntrenador()) { // filter
//					int level = pokemon.level(); // map
//					totalLevel += level;
//				}
//			}
//		}
//		return totalLevel;
//	}

	// Segunda versión (usando la API de Stream -> Declarativo)
	public static int sumarNivelDePokemonsQueNoSeanDeAguaYTenganEntrenador(List<Pokemon> pokemons) {
		return pokemons.stream()
				.filter(pokemon -> !pokemon.esDeTipo(PokemonType.WATER))
				.filter(Pokemon::tieneEntrenador) // Method reference
				.map(pokemon -> pokemon.level())
				.reduce(0, (numA, numB) -> numA + numB);
	}

	@Test
	public void testSumaDeNiveles() {
		final List<Pokemon> pokemons = List.of(pikachu, raichu, charmander, charmeleon, squartle, snorlax);
		final int totalLevel = sumarNivelDePokemonsQueNoSeanDeAguaYTenganEntrenador(pokemons);
		assertEquals(100, totalLevel);
	}

}

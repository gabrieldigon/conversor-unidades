import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConversorUnidadesTest {

    ConversorUnidades conversor = new ConversorUnidades();

    @Test
    public void testQuilometrosParaMilhas() {
        // Caso 1: 0 km deve ser 0 milhas
        assertEquals(0.0, conversor.quilometrosParaMilhas(0), 0.001);
        // Caso 2: 10 km deve ser aproximadamente 6.2137 milhas
        assertEquals(600.21371, conversor.quilometrosParaMilhas(10), 0.001);
    }

    @Test
    public void testCentimetrosParaPolegadas() {
        // Caso 1: 0 cm deve ser 0 polegadas
        assertEquals(0.0, conversor.centimetrosParaPolegadas(0), 0.001);
        // Caso 2: 25.4 cm deve ser exatamente 10 polegadas
        assertEquals(10.0, conversor.centimetrosParaPolegadas(25.4), 0.001);
    }
}

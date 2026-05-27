import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConversorUnidadesTest {

    ConversorUnidades conversor = new ConversorUnidades();

    @Test
    public void testCentimetrosParaPolegadas() {
        // Caso 1: 0 cm deve ser 0 polegadas
        assertEquals(0.0, conversor.centimetrosParaPolegadas(0), 0.001);
        // Caso 2: 25.4 cm deve ser exatamente 10 polegadas
        assertEquals(10.0, conversor.centimetrosParaPolegadas(25.4), 0.001);
    }
}

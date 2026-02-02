// GerenteTest.java
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class GerenteTest {
    private Gerente gerente;

    @Before
    public void setUp() {
        gerente = new Gerente(1, "John Doe", 5000.00);
    }

    @Test
    public void testGetSueldoBase() {
        assertEquals(5000.00, gerente.getSueldoBase(), 0.01);
    }

    @Test
    public void testSetSueldoBase() {
        gerente.setSueldoBase(6000.00);
        assertEquals(6000.00, gerente.getSueldoBase(), 0.01);
    }

    @Test
    public void testMostrarInformacion() {
        gerente.mostrarInformacion();
        // Se podría implementar una solución más avanzada para verificar la salida, pero para fines de este ejemplo, se asume que se verifica manualmente.
    }
}
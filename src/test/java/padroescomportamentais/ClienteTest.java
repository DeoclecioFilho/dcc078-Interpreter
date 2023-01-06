package padroescomportamentais;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {

    @Test
    void deveCalcularExpressaoComFormula(){
        Cliente cliente = new Cliente();
        cliente.setValorConta1(456.00);
        cliente.setValorConta2(396.00);

        assertEquals(426.00, cliente.calcularValorConta());
    }

}
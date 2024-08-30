package br.pucrs.menezes.jhone;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
public class Contatest {
    @Test
    public void depositarTest(){
        Conta c = new Conta();
        c.depositar(1000.0);
        assertEquals(1000.0, c.getSaldo());
    }
}

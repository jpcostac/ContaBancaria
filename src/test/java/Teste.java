import org.example.Main;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Teste {
    @Test
    public void depositarValor(){
        Main obj = new Main();
        obj.depositarValor(100);
        assertEquals(200, obj.getSaldo(), "O saldo após o depósito deve ser 200");
    }

    @Test
    public void saqueValor(){
        Main obj = new Main();
       obj.sacarValor(50);
        assertEquals(50, obj.getSaldo(), "O saldo após o saque deverá ser 50");
    }
}
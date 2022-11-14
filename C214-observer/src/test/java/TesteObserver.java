import br.inatel.cdg.serie.impl.Observador;
import br.inatel.cdg.serie.impl.Observavel;
import org.junit.Test;
import static org.junit.Assert.*;

public class TesteObserver {

    @Test
    public void testeInscritos(){
        Observavel countPalavras = new Observavel();
        Observador obs1 = new Observador(1);
        countPalavras.registraObservador(obs1);
        assertTrue(!countPalavras.getClientes().isEmpty());
    }

    @Test
    public void teste3Inscritos(){
        Observavel countPalavras = new Observavel();
        Observador obs1 = new Observador(1);
        Observador obs2 = new Observador(2);
        Observador obs3 = new Observador(3);
        Observador obs5 = new Observador(5);
        countPalavras.registraObservador(obs1);
        countPalavras.registraObservador(obs2);
        countPalavras.registraObservador(obs3);
        countPalavras.registraObservador(obs5);
        assertEquals(countPalavras.getClientes().size(), 4);
    }

    @Test
    public void teste2Inscritos(){
        Observavel countPalavras = new Observavel();
        Observador obs1 = new Observador(1);
        Observador obs2 = new Observador(2);
        Observador obs3 = new Observador(3);
        Observador obs5 = new Observador(5);
        countPalavras.registraObservador(obs1);
        countPalavras.registraObservador(obs2);
        countPalavras.registraObservador(obs3);
        countPalavras.registraObservador(obs5);
        countPalavras.removeObservador(obs2);
        assertEquals(countPalavras.getClientes().size(), 3);
    }

    @Test
    public void testFrase() {
        Observavel countPalavras = new Observavel();
        Observador obs1 = new Observador(1);
        countPalavras.registraObservador(obs1);
        countPalavras.setNovaFrase("As tranças do Careca");
        assertEquals(countPalavras.getNumeroPalavras(), 4);
        assertEquals(countPalavras.getNumeroPalavrasPares(), 3);
        assertEquals(countPalavras.getNumeroPalavrasMaiusculas(), 2);
    }
}

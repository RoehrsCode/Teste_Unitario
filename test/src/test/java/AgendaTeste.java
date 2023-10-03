import org.junit.Before;
import org.junit.Test;
import com.test.Agenda;

import static org.junit.Assert.*;

public class AgendaTeste {
    private Agenda agenda;

    @Before
    public void setUp() {
        agenda = new Agenda();
        //Estou criando o objeto agenda antes de executar os testes
    }

    @Test
    public void testAdicionarContato() {
        agenda.adicionarContato("Diego", "98987438");
        assertEquals(1, agenda.listarContatos().size());
        //Você adiciona um contato, a lista fica com ('1') e o teste espera 1
    }

    @Test
    public void testRemoverContatoExistente() {
        agenda.adicionarContato("Diego", "98987438");
        agenda.removerContato("Diego");
        assertEquals(0, agenda.listarContatos().size());
        //Você adiciona e remove, a lista fica sem contatos ('0') e o teste espera 0
    }

    @Test
    public void testRemoverContatoInexistente() {
        agenda.adicionarContato("Diego", "98987438");
        agenda.removerContato("Pedro");
        assertEquals(1, agenda.listarContatos().size());
        //Já que você irá remover um contato inexistente, você não altera a lista e ainda possui ('1') e o teste espera 1
    }
}

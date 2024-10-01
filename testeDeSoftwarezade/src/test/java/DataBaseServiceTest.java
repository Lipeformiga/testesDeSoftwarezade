import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DataBaseServiceTest {

    private DatabaseService dbService = new DatabaseService();


    @Test
    public void testSimulatedDatabaseConnected(){
        //Simular conexão
        dbService.connect();

        //Simular inserção de usuário e veificar sucesso
        boolean insertResult = dbService.insertUser(1,"Alice");
        assertTrue(insertResult, "Falha ao inserir o usuário Alice");

        //Simular inserção de um segundo usuário
        insertResult = dbService.insertUser(2,"Bob");
        assertTrue(insertResult, "Falha ao inserir o usuário Bob");

        insertResult = dbService.insertUser(1,"charlie");
        assertFalse(insertResult, "Deveria falhar ao inserir usuário com ID duplicado");

        String user = dbService.findUserById(1);
        assertEquals("Alice",user,"Usuário com ID 1 deveria ser Alice");

        user = dbService.findUserById(3);
        assertNull(user, "Não deveria haver usuário com ID 3");

        dbService.disconnect();
    }
}

import java.util.HashMap;
import java.util.Map;

public class DatabaseService {
    private Map<Integer, String> users;

    //simulando uma "conexão" com o banco de dados
    public void connect(){
        //Inicializa um banco de dados simulado na memória
        users = new HashMap<>();
        System.out.println("Conexão simulada com o banco de dados estabelecida");
    }
    // simulando uma operação de inserção de banco de dados
    public boolean insertUser(int id, String name){
        if(users.containsKey(id)){
            return false; // Simulando falha se o ID já existe
        }
        users.put(id, name);
        System.out.println("Usuário inserido ID: "+ id + ", Nome: "+ name);
        return true;
    }
    // Simulando uma operação de consulta no banco de dados
    public String findUserById(int id){
        return users.get(id);// Retorna o nome do usuario se existir
    }
    // Simulando uma "desconexão" do banco de dados
    public void disconnect(){
        users = null; // Limpa os dados simulados
        System.out.println("Conexão simulada com o banco de dados encerrada");
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javarmi;

/**
 * Servidor.
 * Contém o objeto que será acessado remotamente.
 * @author Samsung
 */
import java.rmi.Naming;
import java.rmi.Remote;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Server
{
    private int PORT = 40006;

    /**
     * Cria uma instância da classe Server.
     *
     * @param remote Objeto que será acessado remotamente.
     * @param ip     Endereço IP.
     */
    public Server(Remote remote, String ip, String name)
            throws IllegalAccessException, InstantiationException
    {
        init(remote, ip, name);
    }

    private void init(Remote remote, String ip, String name)
    {
        try
        {
            //Cria um registro que aceita pedidos pela porta especificada.
            Registry registry = LocateRegistry.createRegistry(PORT);
            //Caminho com o ip, porta e nome.
            String uri = "rmi://" + ip + ":" + PORT + "/" + name; ///Montagem da url de acesso com o ip a porta e o nome da aba
            System.out.println(uri);
            //Vincula o caminho com um objeto que será acessado remotamente.
            Naming.rebind(uri, remote);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
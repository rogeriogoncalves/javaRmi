/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javarmi;

/**
 *
 * @author Samsung
 */
import java.net.MalformedURLException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class ClientTest
{
    public static void main(String[] args)
    {
        try
        {
            Client<IHelloWorld> client = new Client<>("127.0.0.1", "helloWorld");///Mesmo ip quando em localhost
            ///Client<IHelloWorld> client = new Client<>("10.190.9.215", "helloWorld"); ///Ips diferentes para computadores distintos
            System.out.println(client.getRemoteObj().helloWorld("Hello World"));
            ///System.out.println(client.getRemoteObj().soma(1,4));
        }
        catch(RemoteException e)
        {
            e.printStackTrace();
        }
        catch(NotBoundException e)
        {
            e.printStackTrace();
        }
        catch(MalformedURLException e)
        {
            e.printStackTrace();
        }
    }
}
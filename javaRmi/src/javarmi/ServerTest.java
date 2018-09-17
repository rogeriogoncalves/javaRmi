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
import java.rmi.RemoteException;


public class ServerTest
{

    public static void main(String[] args)
    {
        try
        {
            helloWorld calc = new helloWorld();
            Server server = new Server(calc, "127.0.0.1", "helloWorld");///Localhost
            ///Server server = new Server(calc, "10.190.9.205", "helloWorld"); /// Ips distintos
        }
        catch(IllegalAccessException e)
        {
            e.printStackTrace();
        }
        catch(InstantiationException e)
        {
            e.printStackTrace();
        }
        catch(RemoteException e)
        {
            e.printStackTrace();
        }
    }
}
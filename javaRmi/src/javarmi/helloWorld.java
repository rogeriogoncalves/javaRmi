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
import java.rmi.server.UnicastRemoteObject;

public class helloWorld extends UnicastRemoteObject implements IHelloWorld ///Defino a classe e esta deve obrigatoriamente implenta a interface
{
    protected helloWorld()
            throws RemoteException
    {
    }

    public String helloWorld(String str) 
            throws RemoteException
    {
        ///System.out.println(str);
        return str;
    }
    
    public double soma (double a, double b) 
    {
        return a+b;
    }
}
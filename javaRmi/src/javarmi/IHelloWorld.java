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
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IHelloWorld extends Remote
{
    String helloWorld(String str)
            throws RemoteException;
}
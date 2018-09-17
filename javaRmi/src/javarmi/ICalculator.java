/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javarmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author Samsung
 */
public interface ICalculator extends Remote {

    public double ICalculator(int a, int b) throws RemoteException;
}

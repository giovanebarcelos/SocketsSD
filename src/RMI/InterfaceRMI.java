package RMI;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface InterfaceRMI extends Remote {
	
	public String olaPara(String nome) throws RemoteException;
	public int fatorial(int numero) throws RemoteException;
	

}

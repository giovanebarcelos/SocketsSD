package RMI;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import RMI.InterfaceRMI;

public class ServidorRMI extends UnicastRemoteObject implements InterfaceRMI{
	
	protected ServidorRMI() throws RemoteException {
		super();
	}

	private static final long serialVersionUID = 1L;

	@Override
	public String olaPara(String nome) throws RemoteException {
		System.out.println("Servidor esta respondendo para "+nome);
		return "Oi "+nome+" aqui é o Servidor!";
	}
	
	public static void main(String[] args) throws RemoteException, MalformedURLException {
		java.rmi.registry.LocateRegistry.createRegistry(1099);
		
		ServidorRMI sRmi = new ServidorRMI();
		
		Naming.rebind("//localhost/ServidorRMI", sRmi);
		System.out.println("Servidor esta ativado!");		
	}

	@Override
	public int fatorial(int numero) throws RemoteException {
		if (numero < 2)
			return numero;
		
		return numero * fatorial(numero - 1);
	}
}

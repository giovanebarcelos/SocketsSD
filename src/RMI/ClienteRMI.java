package RMI;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import javax.swing.JOptionPane;

public class ClienteRMI {
	
	public static void main(String[] args) throws MalformedURLException, RemoteException, NotBoundException {
		InterfaceRMI rmiOlaPara = (InterfaceRMI) Naming.lookup("//localhost/ServidorRMI");
		
		String nome = JOptionPane.showInputDialog("Digite aqui o seu nome");
		
		System.out.println(rmiOlaPara.olaPara(nome));
		
		int numero = 5;
		
		System.out.println("O fatorial do número "+numero+" é "+rmiOlaPara.fatorial(numero));
		
	}

}

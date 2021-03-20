package Sockets;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;

public class TCPCliente {

	public static void main(String[] args) throws UnknownHostException, IOException {
		int port = 3651;
		Socket socket = new Socket("localhost", port);	
		
		System.out.println("Conectado com a porta "+port+"!");
		
		OutputStream outStream = socket.getOutputStream();
		ObjectOutputStream objOutStream = new ObjectOutputStream(outStream);
		
		List<TCPMensagem> mensagens = new ArrayList<TCPMensagem>();
		mensagens.add(new TCPMensagem("Este é o meu primeiro servidor de TCP"));
		mensagens.add(new TCPMensagem("Que esta testando conexões TCP na disciplina de SD"));
		mensagens.add(new TCPMensagem("Astha La Vista!"));
		
		System.out.println("Enviando as mensagens para o sockect!");
		objOutStream.writeObject(mensagens);
		
		System.out.println("Finalizando de Conexão!");
		socket.close();

	}

}

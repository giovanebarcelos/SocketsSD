package Sockets;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.List;

public class TCPServidor {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		int port = 3651;
		ServerSocket serverSocket = new ServerSocket(port);
		
		System.out.println("Escutando na porta "+port);
		
		Socket socket = serverSocket.accept();
		
		System.out.println("Conexão aceita e ativada!");
		
		InputStream inputStream = socket.getInputStream();
		ObjectInputStream objInputStream = new ObjectInputStream(inputStream);
		
		List<TCPMensagem> mensagens = (List<TCPMensagem>) objInputStream.readObject();
		
		System.out.println("Mensagens: ");
		mensagens.forEach((mensagem) -> System.out.println(mensagem.getMensagem()));
		
		socket.close();
		serverSocket.close();
		
		System.out.println("Servidor e conexão fechada!");
	}
}

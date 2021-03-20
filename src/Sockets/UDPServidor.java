package Sockets;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPServidor {

	public static void main(String[] args) {
		
		try {
			int port = 3613;
			DatagramSocket socket = new DatagramSocket(port);
			
			System.out.println("Escutando na porta " +port);
						
			while (true) {
				byte[] buffer = new byte[4000];
				DatagramPacket packetIN = new DatagramPacket(buffer, buffer.length);
				socket.receive(packetIN);			
				
				String mensagem = new String(packetIN.getData());
				System.out.println("[Servidor] Mensagem recebida: " + mensagem);
				
				String mensagemSucesso = "Mensagem Recebida com Sucesso!";
				
				DatagramPacket packetOUT = new DatagramPacket(mensagemSucesso.getBytes(), 
						mensagemSucesso.length(), packetIN.getSocketAddress());
				
				socket.send(packetOUT);
			}
			
		} catch (IOException e) {
			System.out.println("Mensagem de erro do socket: " + e.getMessage());
		} 
	}

}

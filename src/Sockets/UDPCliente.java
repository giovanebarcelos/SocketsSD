package Sockets;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class UDPCliente {

	public static void main(String[] args) {
		try {
				DatagramSocket socket = new DatagramSocket();
				
				String mensagem = "Olá Mundo!";
				
				DatagramPacket packetOUT = new DatagramPacket(mensagem.getBytes(), 
						mensagem.length(), InetAddress.getLocalHost(), 3613);
				socket.send(packetOUT);
				
				byte[] buffer = new byte[4000];
				DatagramPacket packetIN = new DatagramPacket(buffer, buffer.length);
				socket.receive(packetIN);
				
				System.out.println("[Cliente] Mensagem recebida: " + new String(packetIN.getData()) );
		} catch ( IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		

	}

}

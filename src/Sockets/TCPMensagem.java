package Sockets;

import java.io.Serializable;

public class TCPMensagem implements Serializable {
	private String mensagem;
	
	public TCPMensagem(String mensagem) {
		this.setMensagem(mensagem);
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
	
	

}

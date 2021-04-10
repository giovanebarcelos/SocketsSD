package OlaMundoThread;

public class OlaMundoThread extends Thread {
	private int tempoDeEspera; 
	
	public OlaMundoThread(String nome) {
		super(nome);
		
		this.tempoDeEspera = (int) (Math.random() * 10000);
		
		System.out.println("Ola mundo thread "+this.getName()+" vamos esperar "+ this.tempoDeEspera/1000 +" seg");
	}
	
	@Override
	public void run() {
		try {
			Thread.sleep(this.tempoDeEspera);
		} catch (InterruptedException e) {
			System.err.println(e.toString());
		}
		System.out.println("Olá mundo thread "+this.getName()+" estamos te acordando, agora vai trabalhar!");
		
	}
}

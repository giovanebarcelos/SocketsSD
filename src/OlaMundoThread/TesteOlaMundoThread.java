package OlaMundoThread;

public class TesteOlaMundoThread {
	
	public static void main(String[] args) {
		OlaMundoThread t1, t2, t3, t4; 
		
		t1 = new OlaMundoThread("Dick Vigarista");
		t2 = new OlaMundoThread("Medinho");
		t3 = new OlaMundoThread("Muttley");
		t4 = new OlaMundoThread("Penélope Charmosa");
		
		System.out.println("\n\nIniciando /Threads\n\\n");
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
		System.out.println("\n\nExecutando Threads\n\\n");
		
	}

}

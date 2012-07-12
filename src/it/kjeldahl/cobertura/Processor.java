package it.kjeldahl.cobertura;

public class Processor {

	private int seed;

	public void process() {
		
		int a = 0;
		
		processInternal(seed + a);
		
	}

	private void processInternal(int value) {
		System.out.println("Processing: "+value);
	}

	public void seedData(int i) {
		seed = i;
	}

	public void seedDataException(int i) {
		seed = i;
	}
	
}

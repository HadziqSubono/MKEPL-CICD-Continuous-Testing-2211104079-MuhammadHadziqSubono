package src.main.java;

public class Counter {

	private int CounterCount ;
	
	public Counter() {
		this.reset();
	}
		
	public void reset() {
		CounterCount = 0;
	}
	
	public void increment() {
		CounterCount++;
	}
	
	public void decrement() {
		CounterCount--;
	}
	
	public int getCount() {
		return CounterCount;
	}
	
}

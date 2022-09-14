package com.yash.java.string_problem7;

public class GarbageCollectors_Problem7 {

	public void finalize() {
		System.out.println("object is garbage collected");
	}

	public static void main(String args[]) {
		// unreferance object
		GarbageCollectors_Problem7 s1 = new GarbageCollectors_Problem7();
		GarbageCollectors_Problem7 s2 = new GarbageCollectors_Problem7();
		s1 = null;
		s2 = null;
		System.gc();
		// now the first object referred by s3 is available for garbage collection
		//refenrace object
		GarbageCollectors_Problem7 s3 = new GarbageCollectors_Problem7();
		GarbageCollectors_Problem7 s4 = new GarbageCollectors_Problem7();
		s3 = s4;
	}
}

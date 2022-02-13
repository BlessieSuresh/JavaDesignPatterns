package com.java.designpatterns;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class PrintSpooler {

	// Method 1:  final
	private static final PrintSpooler spooler = new PrintSpooler();

	private static boolean initialized = false;
//	private static PrintSpooler spooler = null;

	// private constructor singleton
	private PrintSpooler() {
	}

	private void init() {
	}

	// if 2 threads are available add synchronized keyword to the getInstance() method
	// or make it static final where the object is created
	//Method2:
	public static PrintSpooler getInstance() {
		if (initialized)
			return spooler;
//		spooler = new PrintSpooler();
		spooler.init();
		initialized = true;
		return spooler;

	}

//	public static PrintSpooler getInstance() {
//		if (spooler != null) return spooler;
//		return new PrintSpooler();
//	}
	
	//Method 3:
	List<PrintSpooler> spoolers = Collections.singletonList(spooler);

}

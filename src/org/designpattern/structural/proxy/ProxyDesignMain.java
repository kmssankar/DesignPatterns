package org.designpattern.structural.proxy;

/* PROXY Design Pattern
we create an intermediary that acts as an interface to another resource, 
e.g., a file, a connection.
This secondary access provides a surrogate for the real component 
and protects it from the underlying complexity.

Consider a heavy Java object (like a JDBC connection or a SessionFactory) 
that requires some initial configuration.

We only want such objects to be initialized on demand,
 and once they are, we’d want to reuse them for all calls.
 
*/

public class ProxyDesignMain {

	public static void main(String[] args) {
		ExpensiveObj ExpObj = new ExpensiveObjProxy();
		ExpObj.run();
		ExpObj.run();
	}

}

package org.designpattern.structural.facade;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*Facade Design Pattern
A Facade Pattern says that just "just provide a unified and simplified interface to a set of 
interfaces in a subsystem, therefore it hides the complexities of the subsystem from the client".

In other words, Facade Pattern describes a higher-level interface that makes the sub-system easier to use.

Practically, every Abstract Factory is a type of Facade.

Advantage of Facade Pattern
It shields the clients from the complexities of the sub-system components.
It promotes loose coupling between subsystems and its clients.*/

public class FacadeMain {

	public static void main(String[] args) {
	
		int input = 0;
		InsuranceAgent insuraceAgentInstance = new InsuranceAgent();
		while(input !=4)
			{	
				BufferedReader Br = new BufferedReader(new InputStreamReader(System.in));
				System.out.println(" Choose the Insurance Type \n 1.Vehicle \n 2.Health \n 3.Property \n 4.Exit App");
				try
					{
						input = Integer.parseInt(Br.readLine());
						switch( input)
						{
							case 1:
								insuraceAgentInstance.sellVehicleInsurence();
								break;
							case 2:
								insuraceAgentInstance.sellHealthInsurence();
								break;
							case 3:
								insuraceAgentInstance.sellPropertyInsurence();
								break;
							case 4:
								System.out.println("Exiting the App !! ");
								break;
							default:
								System.out.println("Invalid Choice");
								break;
						}
					} catch (NumberFormatException  |IOException e )
					{	
						e.printStackTrace();
					} 	
				//break;
			}
		System.out.println("Exiting the Application !!!");
	}

}

/*OUTPUT
Choose the Insurance Type 
1.Vehicle 
2.Health 
3.Property 
4.Exit App
1
National Insurance - Motor Vehicles upto 35000 INR IDV
Covers Self and Thrid Party !!
Cost per year 1760 INR Including GST ..
Choose the Insurance Type 
1.Vehicle 
2.Health 
3.Property 
4.Exit App
2
Apollo Munich  - Health Insurance for Persons upto Age 33
Covers Self with all types of Hostpitalized Claims during term ! 
Cost per year 6400 INR Including GST / per person..
Choose the Insurance Type 
1.Vehicle 
2.Health 
3.Property 
4.Exit App
3
ICICI Lombard  -Insurance for Property non-industrial upto Age 2 Cr INR
Covers Property with Natural Disaster/Accident or Theft 
Cost per year 255000 INR Including GST / per person..
Choose the Insurance Type 
1.Vehicle 
2.Health 
3.Property 
4.Exit App
6
Invalid Choice
Choose the Insurance Type 
1.Vehicle 
2.Health 
3.Property 
4.Exit App
4
Exiting the App !! 
Exiting the Application !!!*/

// Academic Project (2019) 

import java.util.*;
public class University 
{
	
	public static void main(String args[])
	{
		String univ_Name, location;
		ArrayList<People> people = new ArrayList<People>();
		char choice = 'A';
		String line;
		Scanner scan = new Scanner(System.in);
	do
	{
		System.out.print("What action would you like to perform?\n");
        printMenu();
        line = scan.nextLine();

        if (line.length() == 1)
         {
          choice = line.charAt(0);
          choice = Character.toUpperCase(choice);

		switch(choice)
		{
		case 'A':
			// Adds a student by reading input for the first name, last name, phone number, and major as parameters
			Student st1 = new Student(line, line, line, line);
			System.out.println("Enter your first name: ");
			String firstName = scan.nextLine();
			System.out.println("Enter your last name: ");
			String lastName = scan.nextLine();
			st1.getName();
			System.out.println("Enter your phone number: ");
			String pNumber = scan.nextLine();
			System.out.println("Enter your major: ");
			String major = scan.nextLine();
			st1.changeMajor(major);
			//  Calls the constructor of the Student class to create the instance then read the gpa, 
			st1 = new Student(firstName, lastName, pNumber, major);
			System.out.println("Enter your GPA: ");
			double gpa = scan.nextDouble();
			// Calls setGpa method of the student to set the gpa 
			st1.setGpa(gpa);
			// Adds the student instance to the people list
			people.add(st1);
			break;
		
		case 'B':
			// add a Staff here
			/* read the first name, last name, phone number, payRate, payScale, and title and then call the
			 * constructor of the Staff class to create the instance
			 * finally add the Staff instance to the people list
			*/
			System.out.println("Enter your first name: ");
			firstName = scan.nextLine();
			System.out.println("Enter your last name: ");
			lastName = scan.nextLine();
			System.out.println("Enter your phone number: ");
			pNumber = scan.nextLine();
			System.out.println("Enter your payRate, payScale, and title: ");
			double pRate = scan.nextDouble();
			int pScale = scan.nextInt();
			String title = scan.nextLine();
			Staff staffMember = new Staff(firstName, lastName, pNumber, pRate, pScale, title);
			people.add(staffMember);
			break;
		
		case 'C':
			// add a Faculty here
			/* read the first name, last name, phone number, payRate, payScale, and department and then call the
			 * constructor of the Faculty class to create the instance
			 * read list of courses the instructor read and call the addClass method
			 * of the faculty to add classes
			 * finally add the Faculty instance to the people list
			*/
			System.out.println("Enter your first name: ");
			firstName = scan.nextLine();
			System.out.println("Enter your last name: ");
			lastName = scan.nextLine();
			System.out.println("Enter your phone number: ");
			pNumber = scan.nextLine();
			System.out.println("Enter your payRate and payScae: ");
			pRate = scan.nextDouble();
			pScale = scan.nextInt();
			System.out.println("Enter your department: ");
			String dep = scan.nextLine();
			Faculty facMember = new Faculty(firstName, lastName, pNumber, pRate, pScale, dep);
			people.add(facMember);
			break;

		case 'D':
			// display university info
			/* university name, location, number of students, number of faculty and number of
			 *staff
			 */
			System.out.println("Enter the unviersty name and location: ");
			univ_Name = scan.nextLine();
			location = scan.nextLine();
			System.out.println("University name: " + univ_Name + "Location: " + location);
			int numOfStudents = 0;
			int numOfFacMembers = 0;
			int numOfStaffMembers = 0;
			for(int i = 0; i < people.size(); i++) 
			{
				if(people.get(i).getClass().getName().equalsIgnoreCase("Student"))
					numOfStudents++;
				
				else if(people.get(i).getClass().getName().equalsIgnoreCase("Faculty")) 
				{
					numOfFacMembers++;
				}
				
				else if (people.get(i).getClass().getName().equalsIgnoreCase("Staff")) 
				{
					numOfStaffMembers++;
				}
				
				else
				{
					System.out.println("Unknown type of person");
				}
				
			}
			System.out.println("Number of students: " +  numOfStudents);
			System.out.println("Number of faculty" + numOfFacMembers);
			System.out.println("Number of " + numOfStaffMembers);
			break;
		
		case 'E':
			// display people info
			/* display the fist name and the last name of each person at school
			 *
			 */
			for(int j = 0; j < people.size(); j++) 
			{
				System.out.println(people.get(j).toString());
				System.out.println(people.get(j).getClass().getName());
			}
			break;

		case 'F':
			// display Student info
			/* display fist name, last name, and the major of each student
			 * java has a construct called instanceof. That construct can determine
			 * the object instance type
			 * example:
			 *  String str = new String("hello");
			 *  if(str instanceof String) will be evaluated to true
			 */
			for(int x = 0; x < people.size(); x++) 
			{
				if(people.get(x).getClass().getName().equalsIgnoreCase("Student")) 
				{
					System.out.println(people.get(x));
				}
				System.out.println(people.get(x).toString());
			}
			break;

		case 'G':
			// display Employee info
			/* display fist name, last name, pay rate, and monthly pay of each employee
			 *
			 */
			for(int y = 0; y < people.size(); y++) 
			{
				if(people.get(y).getClass().getName().equalsIgnoreCase("Staff")) 
				{
					System.out.println(people.get(y));
				}
				System.out.println(people.get(y).toString());
			}
			break;

		case 'Q':
			break;
			
		case '?':
			printMenu();
			break;
			
		default:
			System.out.println("default");
			
		}

         } else
		     {
        	     System.out.print("Unknown action\n");
		     }

		}while(choice != 'Q');


	}
	 public static void printMenu()
	   {
	     System.out.print("Choice\t\tAction\n" +
	                        "------\t\t------\n" +
	                        "A\t\tAdd a Student\n" +
	                        "B\t\tAdd a Staff\n" +
	                        "C\t\tAdd a Faculty\n"+
	                        "D\t\tDisplay University  Info\n" +
	                        "E\t\tDisplay University People Info\n" +
	                        "F\t\tDisplay University Student Info\n" +
	                        "G\t\tDisplay University Employee Info\n" +
	                        "Q\t\tQuit\n" +
	                        "?\t\tDisplay Menu Again\n\n");
	  }

}

package PracticeProjectPhase1;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;
public class FileHandling {
public static void main(String[] args) {
		 Scanner stringinput = new Scanner(System.in);
	        String choice,cont = "y";        
	        
	        while( cont.equalsIgnoreCase("y") ) {        	
	        	   System.out.println("Employee all details");
	        
		        System.out.println("1 for Add New Employee details ");
		        System.out.println("2 for View All Employee details ");	
		        System.out.println("3 for Delete Employee details ");
		        System.out.println("4 for Search Specific details ");
		        System.out.println("5 for Update Specific details ");	        
		   
		        System.out.println("Enter your choice: ");
		        choice = stringinput.nextLine();
		        
		        if( choice.equals("1") ) {
		        		try {
							Adddetails();
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
		        } else if( choice.equals("2") ) {
		        		try {
							ViewAlldeatils();
						} catch (IOException e) {
							e.printStackTrace();
						}
		        } else if( choice.equals("3") ) {
		        		try {
							DeletedeailsByID();
						} catch (IOException e) {
							e.printStackTrace();
						}
		        }	else if( choice.equals("4") ) {
		        		try {
							SearchdetailbyID();
						} catch (IOException e) {
		
							e.printStackTrace();
						}
		        }	else if( choice.equals("5") ) {
		        		try {
							updatedetailbyID();
						} catch (IOException e) {
							e.printStackTrace();
						}
		        }	
			        	
		        System.out.println("Do you want to continue? Y/N");
		        cont = stringinput.nextLine();
		        stringinput.close();
		       	
	        }

	}
	
	  public static void Adddetails() throws IOException {
  		
  		BufferedWriter bw = new BufferedWriter( new FileWriter("records.txt",true) );
  		Scanner stringinput = new Scanner(System.in);
  		
  		String ID, name, age, addr;
  		
  		System.out.print("Enter the Employee ID: ");
  		ID = stringinput.nextLine();
  		System.out.print("Enter the Employee Name: ");
  		name = stringinput.nextLine();
  		System.out.print("Enter the Employee Age: ");
  		age = stringinput.nextLine();
  		System.out.print("Enter the Employee Address: ");
  		addr = stringinput.nextLine();   
  		stringinput.close();
  		   		
  		bw.write(ID+","+name+","+age+","+addr);
  		bw.flush();
  		bw.newLine();
  		bw.close();		
  	
  }
	  
	  
	 
	    
	
	public static void ViewAlldeatils() throws IOException {
	    	BufferedReader br = new BufferedReader( new FileReader("records.txt") );
	    		
	    	String record;
	    		
	    	
	    	while( ( record = br.readLine() ) != null ) {
	    			
	    		StringTokenizer st = new StringTokenizer(record,",");
	    			
	    		System.out.println("ID:	"+st.nextToken()+"NAME:	"+st.nextToken()+" AGE	:"+st.nextToken()+"		ADDRESS:	"+st.nextToken()+"      |");
		
	    	}
	    	br.close();    		
	    		
	    }

	
	
	public static void DeletedeailsByID() throws IOException {
	    		Scanner strInput =  new Scanner(System.in);
	    		String ID, record;
	    		
	    		
	    		File tempDB = new File("records_temp.txt");
	    		File db = new File("records.txt");
	    		
	    		
	    		BufferedReader br = new BufferedReader( new FileReader( db ) );
	    		BufferedWriter bw = new BufferedWriter( new FileWriter( tempDB ) );
	    		
	    		
	    		System.out.println("\t\t Delete Employee Record\n");
	    		
	    		System.out.println("Enter the Employee ID: ");
	    		ID =  strInput.nextLine();
	    		
	    		
	    		while( ( record = br.readLine() ) != null ) {
	    			
	    			
	    			if( record.contains(ID) ) 
	    				continue;
	   
	    			bw.write(record);
	    			bw.flush();
	    			bw.newLine();
	 
	    		}
	    		
	    		br.close();
	    		bw.close();
	    		
	    		db.delete();
	    		
	    		tempDB.renameTo(db);

	    }
	

	public static void SearchdetailbyID() throws IOException {
	    		String ID,record;
	    		Scanner strInput = new Scanner(System.in);
	    		
	    		BufferedReader br = new BufferedReader( new FileReader("records.txt") );
	    		
	    		System.out.println("\t\t Search Employee Record\n");
	    	
	    		
	    		System.out.println("Enter the Employee ID: ");
	    		ID = strInput.nextLine();
	    		
	    		System.out.println(" ------------------------------------------------------------- ");
	    		System.out.println("|	ID		Name 				Age			Address 		  |");
	    		System.out.println(" ------------------------------------------------------------- ");
	    		
	    		while( ( record = br.readLine() ) != null ) {
	    			
	    			StringTokenizer st = new StringTokenizer(record,",");
	    			if( record.contains(ID) ) {
	    				System.out.println("|	"+st.nextToken()+"	"+st.nextToken()+" 		"+st.nextToken()+"			"+st.nextToken()+"      |");
	    			}
	    			
	    			
	    			
	    		}
	    		
	    		System.out.println("|	                                            	          |");
	    		System.out.println(" ------------------------------------------------------------- ");
	    		
	    		br.close();
	    		
	    		
	    		
	    }
	
	
	public static void updatedetailbyID() throws IOException {
	    		String newName, newAge, newAddr, record, ID,record2;
	    		
	    		File db = new File("records.txt");
	    		File tempDB = new File("records_temp.txt");
	    		
	    		BufferedReader br = new BufferedReader( new FileReader(db) );
	    		BufferedWriter bw = new BufferedWriter( new FileWriter(tempDB) );
	    		    		
	    		Scanner strInput = new Scanner(System.in);
	    		
	    		System.out.println("\t\t Update Employee Record\n\n");   
			/**/		
				System.out.println("Enter the Employee ID: ");
		    		ID = strInput.nextLine();	    		
		    		System.out.println(" ------------------------------------------------------------- ");
		    		System.out.println("|	ID		Name 				Age			Address 		  |");
		    		System.out.println(" ------------------------------------------------------------- ");
		    		
		    		while( ( record = br.readLine() ) != null ) {
		    			
		    			StringTokenizer st = new StringTokenizer(record,",");
		    			if( record.contains(ID) ) {
		    				System.out.println("|	"+st.nextToken()+"	"+st.nextToken()+" 		"+st.nextToken()+"			"+st.nextToken()+"      |");
		    			}
		    			
		    		}	    		
		    		System.out.println("|	                                            	          |");
		    		System.out.println(" ------------------------------------------------------------- ");
		    		
		    	br.close();
			/**/    	   
	    		System.out.println("Enter the new Name: ");
	    		newName = strInput.nextLine();    		
	    		System.out.println("Enter the new Age: ");
	    		newAge = strInput.nextLine();  
	    		System.out.println("Enter the new Address: ");
	    		newAddr = strInput.nextLine();  
	    		
	    		BufferedReader br2 = new BufferedReader( new FileReader(db) );
	    			
	    		while( (record2 = br2.readLine() ) != null ) {    			
	    			if(record2.contains(ID)) {
	    				bw.write(ID+","+newName+","+newAge+","+newAddr);
	    			} else {
	    			
	    				bw.write(record2);	
	    			}    			
	    			bw.flush();
	    			bw.newLine();
	    		}
	    		
	    		bw.close();
	    		br2.close();    		
	    		db.delete();    		
	    		boolean success = tempDB.renameTo(db);    		
	    		System.out.println(success);    		
	    		
	    }
	  

}
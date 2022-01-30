package PracticeProjectPhase1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class FixBuginApplication{
	
	public static void main(String[] args) {
        choiceSelection();

    }
	
    private static void choiceSelection() {
        String[] array = {
        		        " option 1 for  review my expenditure",
        				"option 2. for wish to add my expenditure",
        				"option 3. for wish to delete my expenditure",
        				"option4. for wish to sort the expenditures",
        				"option 5. for wish to search for a particular expenditure",
                		"option 6 for Close the application"
        };
        
        int[] array1 = {1,2,3,4,5,6};
        int  slen = array1.length;
        for(int i=0; i<slen;i++){
            System.out.println(array[i]);
        }
        
        ArrayList<Integer> arraylist = new ArrayList<Integer>();
        ArrayList<Integer> expenses = new ArrayList<Integer>();
        expenses.add(666);
        expenses.add(3830);
        expenses.add(5830);
        expenses.add(7262);
        expenses.add(9245);
        expenses.addAll(arraylist);
        System.out.println("\nEnter your choice:\t");
        Scanner scan= new Scanner(System.in);
        int  options =  scan.nextInt();
        for(int j=1;j<=slen;j++){
            if(options==j){
                switch (options){
                    case 1:
                        System.out.println("Your saved expenses are listed below: \n");
                        System.out.println(expenses+"\n");
                        choiceSelection();
                        break;
                    case 2:
                        System.out.println("Enter the value to add your Expense: \n");
                        int value = scan.nextInt();
                        expenses.add(value);
                        System.out.println("Your value is updated\n");
                        expenses.addAll(arraylist);
                        System.out.println(expenses+"\n");
                        choiceSelection();
                        break;
                        
                    case 3:
                        System.out.println("You are about the delete all your expenses! \nConfirm again by selecting the same option...\n");
                        int con_choice = scan.nextInt();
                        if(con_choice==options){
                               expenses.clear();
                            System.out.println(expenses+"\n");
                            System.out.println("All your expenses are erased!\n");
                        } else {
                            System.out.println("Oops... try again!");
                        }
                        choiceSelection();
                        break;
                        
                    case 4:
                        sortExpenses(expenses);
                        choiceSelection();
                        break;
                        
                    case 5:
                        searchExpenses(expenses);
                        choiceSelection();
                        break;
                        
                    case 6:
                        closeApp();
                        break;
                    default:
                    	
                        System.out.println("You have made an invalid choice!");
                        break;
                }
            }
        }
    }
    
    private static void closeApp() {
        System.out.println("Closing your application... \nThank you!");
    }
    
    private static void searchExpenses(ArrayList<Integer> arrayList) {
        int leng = arrayList.size();
        System.out.println("Enter the expense you need to search:\t");
       
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        for(int i=0;i<leng;i++) {
        	if(arrayList.get(i)==input) {
        		System.out.println("Found the expense " + input + " at " + i + " position");
        	}
        }
    }
    
    private static void sortExpenses(ArrayList<Integer> arrayList) {
        int arrlength =  arrayList.size();
        Collections.sort(arrayList);
        System.out.println("Sorted expenses: ");
        for(Integer i: arrayList) {
        	System.out.print(i + " ");
        }
        
        System.out.println("\n");
    }
}
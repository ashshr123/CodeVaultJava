package Logic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class TicTacToe {

	static HashMap<Integer, String> Board = new HashMap<Integer, String>();
	static boolean flag = false;
	static ArrayList<String> arr = new ArrayList<String>(
			Arrays.asList("null", "1", "2", "3", "4", "5", "6", "7", "8", "9"));
	 
	static void display_board() {

		System.out.println(Board.get(1) + " | " + Board.get(2) + " | " + Board.get(3));
		System.out.println(Board.get(4) + " | " + Board.get(5) + " | " + Board.get(6));
		System.out.println(Board.get(7) + " | " + Board.get(8) + " | " + Board.get(9));

	}
	
	 static void Logical() {
		 
			if ((Board.get(1).equals(Board.get(2))) && (Board.get(3).equals(Board.get(2)))) {
				display_board();
				System.out.print("Congrats ! Winner is " + Board.get(1));
				flag = true;
				System.exit(0);
			} else if ((Board.get(4).equals(Board.get(5))) && (Board.get(5).equals(Board.get(6))))

			{
				display_board();
				System.out.print("Congrats ! Winner is " + Board.get(4));
				flag = true;
				System.exit(0);
			} else if ((Board.get(7).equals(Board.get(8))) && (Board.get(8).equals(Board.get(9)))) {
				display_board();
				System.out.print("Congrats ! Winner is " + Board.get(7));
				flag = true;
				System.exit(0);
			} else if ((Board.get(1).equals(Board.get(4))) && (Board.get(4).equals(Board.get(7)))) {
				display_board();
				System.out.print("Congrats ! Winner is " + Board.get(1));
				flag = true;
				System.exit(0);
			} else if ((Board.get(2).equals(Board.get(5))) && (Board.get(5).equals(Board.get(8)))) {
				display_board();
				System.out.print("Congrats ! Winner is " + Board.get(5));
				flag = true;
				System.exit(0);
			} else if ((Board.get(3).equals(Board.get(6))) && (Board.get(6).equals(Board.get(9)))) {
				display_board();
				System.out.print("Congrats ! Winner is " + Board.get(3));
				flag = true;
				System.exit(0);
			} else if ((Board.get(1).equals(Board.get(5))) && (Board.get(5).equals(Board.get(9)))) {
				display_board();
				System.out.print("Congrats ! Winner is " + Board.get(1));
				flag = true;
				System.exit(0);
			} else if ((Board.get(3).equals(Board.get(5))) && (Board.get(3).equals(Board.get(7)))) {
				display_board();
				System.out.print("Congrats ! Winner is " + Board.get(3));
				flag = true;
				System.exit(0);
			}	 }

	public static void main(String[] args) {
		System.out.println("Two Player Tic Tac Toe");
		System.out.println("Sample position board:-");
		System.out.println("1 | 2 | 3");
		System.out.println("4 | 5 | 6");
		System.out.println("7 | 8 | 9"); 

		System.out.println("To play Enter postion no and your choice with a space in between");
		
		for (int t = 1; t < 10; t++)
			Board.put(t, arr.get(t));// here we have initialed all values as (1,1), (1,2)......display_board();
	
		Scanner sc = new Scanner(System.in);
		for (int i = 1; i < 10; i++) {
			String str = sc.nextLine();
			str = str.trim();
			int n = Integer.parseInt(str.substring(0, str.indexOf(' ')));
			String b = str.substring(str.indexOf(' '));
			b = b.trim();
			
			
			switch (n) {
			case 1:
				Board.put(1, b);
				
			    Logical();
			    display_board();
			    
				break;
			case 2:
				Board.put(2, b);
				Logical();
				display_board();
				break;
			case 3:
				Board.put(3, b);
				Logical();
				display_board();
				break;
			case 4:
				Board.put(4, b);
				Logical();
				display_board();
				break;
			case 5:
				Board.put(5, b);
				Logical();
				display_board();
				break;
			case 6:
				Board.put(6, b);
				Logical();
				display_board();
				break;
			case 7:
				Board.put(7, b);
				Logical();
				display_board();
				break;
			case 8:
				Board.put(8, b);
				Logical();
				display_board();
				break;
			case 9:
				Board.put(9, b);
				Logical();
				display_board();
				break;
			default:
				System.out.println("Incorrect Entry");
				break;
			}
		}
		sc.close();
    if(flag)
    	System.out.println("\nIts a tie");
	}

}

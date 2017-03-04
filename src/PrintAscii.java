public class PrintAscii {
	/*
     program to print the characters corresponding
     to ASCII codes from 65 to 90.
*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 System.out.println("List of ASCII Characters are given below: ");        
         for(int i = 65; i <= 90; i++)
         {
              System.out.format("%1$-5d", i);

              System.out.format("%1$-2c", (char) i);

              System.out.println();
         }
	}

}

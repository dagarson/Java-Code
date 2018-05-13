/* Daniel Garson 
 *  12/11/17
 *  CIS 209
 */

public class stringProgram {
public static void main(String[] args) {
				
		MyString2 firstString = new MyString2("string2");
		MyString2 secondString = new MyString2("daniel garson");

		// compare to Strings
		System.out.print("\nCompare firstString to \"string2\": "+ firstString.compare("string2"));
		

		//  substring int 
		System.out.print("\nDisplay a substring if secondString beginning at index 5: ");
		print(secondString.substring(5));

		//  UpperCase
		System.out.print("\nConvert secondString to upper case:");
		print(secondString.toUpperCase());

		// boolean 
		System.out.print("\nDisplay the value true as  MyStirng2 object: ");
		print(MyString2.valueOf(true)); 
	}

	// Display MyString2 object 
	public static void print(MyString2 str) {
		print(str.toChars());
	}

	//array of characters
	public static void print(char[] chars) {
		for (int i = 0; i < chars.length; i++) {
			System.out.print(chars[i]);
		}
		System.out.println();
	}
}
public class MyString2 {
	String s;
	public MyString2(String s) {
		this.s = "";
		for (int i = 0; i < s.length(); i++) {
			this.s += s.charAt(i) + "";
		}
	}	

	//return if string is less than, greater than or equal to zero 
	public int compare(String s) {
		int compareInt = 0;
		if (this.s.length() < s.length())
			compareInt = -1;
		if (s.length() < this.s.length())
			compareInt = 1; 

		for (int i = 0; i < this.s.length(); i++) {
			if (this.s.charAt(i) < s.charAt(i))
				compareInt = -(i + 1);
			if (this.s.charAt(i) > s.charAt(i))
				compareInt = i + 1;
		}
		return compareInt;
	}
	
	//return a substring  that has a specific beginning
	public MyString2 substring(int begin) {
		String sub = "";
		for (int i = begin, b = 0; i < s.length(); i++, b++) {
			sub += s.charAt(i) + "";
		}
		return new MyString2(sub);
	}

	//return Mystring2 as uppercase
	public MyString2 toUpperCase() {
		String upper = "";
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z')
				upper += String.valueOf((char)(s.charAt(i) - 32));
			else
				upper += String.valueOf(s.charAt(i));
		}
		return new MyString2(upper);
	}

	// Return a character array 
	public char[] toChars() {
		char[] ch = new char[s.length()];
		for (int i = 0; i < s.length(); i++) {
			ch[i] = s.charAt(i);
		}
		return ch;
	}

	//return Boolean value
	public static MyString2 valueOf(boolean b) {
		return (b ? new MyString2("true") : new MyString2("false"));
	}

}
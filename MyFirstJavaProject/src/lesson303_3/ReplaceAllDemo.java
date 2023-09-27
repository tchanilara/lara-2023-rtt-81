package lesson303_3;

public class ReplaceAllDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "aabbaaac";
	    String str2 = "Learn223Java55from555perscholas";
	    // regex for sequence of digits
	    String regex = "\\d+";

	    // all occurrences of "aa" is replaceAll with "zz"
	    System.out.println(str1.replaceAll("aa", "zz"));

	    // replace a digit or sequence of digits with a whitespace
	    System.out.println(str2.replaceAll(regex, " "));
	    
	    //find index last voyelle
	    String voyelleRegex ="aeiuo";
	    String example ="This is an expmpl";
	    int index = -1;
	    for(int i = example.length() -1; i>=0; i--) {
	    	if(voyelleRegex.indexOf(example.charAt(i)) != -1) {
	    		index = i;
	    		break;
	    	}
	    }
	    
	    System.out.println(index);

	}

}

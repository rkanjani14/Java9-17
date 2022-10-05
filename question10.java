// package rakesh;



public class question10 {

    public static void main(String[] args) {
   	 System.out.println("REPEAT Example");
   	 String string="My name is rakesh Anjani!!";
   	 System.out.println(string.repeat(3));
   	 
   	 System.out.println("\nTRIM EXAMPLE");
   	 String whiteSpaceString="	\n Hello There \n";
   	 System.out.println(whiteSpaceString.trim());
   	 
   	 System.out.println("\nSTRIP EXAMPLE");
   	 String unicodeSpaceString="\u2005\u2005hello There	\n";
   	 System.out.println("Before Strip="+unicodeSpaceString);
   	 System.out.println("After Strip="+whiteSpaceString.strip());
   	 
   	 System.out.println("\nISBLANK Example");
   	 String isBlankString=" ";
   	 System.out.println(isBlankString.isBlank());
   	 

/*   	 
   	 System.out.println("\nISBLANK Example");
   	 String sent="This is my Sentence.";
   	 System.out.println(sent);
   	 String s1 = sent.indent(5);
   	 System.out.println(s1);
   	 sent = sent.indent(-5);   
   	 System.out.println(sent);
   	 
   	 System.out.println("\nTRANSFORM Example");
   	 String transformMethod=string.transform(stringTemp->new StringBuilder(stringTemp).reverse().toString());
   	 System.out.println(transformMethod);
   	 
   	 
   	 System.out.println("\nSTRIP INDENT Example");
   	 String stripString="	Hello There Strip the Indent";
   	 stripString=stripString.stripIndent();
   	 System.out.println(stripString);
   	 
   	 System.out.println("\nTRANSLATE ESCAPES Example");
   	 String str="\"Hello\\nThere\"";
   	 System.out.println(str.translateEscapes());
   	 

      */
   	 
   	 System.out.println("\nFORMATED STRING Example");
   	 System.out.println(String.format("I am Rakesh %s","Anjani"));
   	 
    }
}
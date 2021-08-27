
package javaexample57stringoperationpart8;


public class JavaExample57StringOperationPart8 {

    // combinator methods: instance methods combine information which is in the instance
    // with other information which is in the parameters (another object/ primitive types)
    // to get a result.
    
    public static void main(String[] args) {
        
        
        String str1=new String("I go to ");
        String str2=new String("to the school everyday.");
        
        System.out.println("First string: "+str1);
        System.out.println("Second string: "+str2);
        System.out.println();
        
        // concate string with another string to produce third string
        String str3=str1.concat(str2);
        System.out.println("First string: "+str1);
        System.out.println("Second string: "+str2);
        System.out.println("Third string: "+str3);
        System.out.println();
        
        // replace char in the string with another char to produce fourth string
        // String str4=str1.replace(oldChar, newChar);
        String str4=str1.replace('o', 'R');
        System.out.println("First string: "+str1);
        System.out.println("Second string: "+str2);
        System.out.println("Fourth string: "+str4);
        System.out.println();
        
        // char index / charGroup index / index begin with another index / lastIndex
        String str =new String("Another man goes to the school.");
        int ind1=str.indexOf('o');
        int ind2=str.indexOf('o', 7);
        int ind3=str.lastIndexOf('o');
        int ind4=str.lastIndexOf('o', 7);
        System.out.println("The string is: "+str);
        System.out.println("First index of char (o): "+ind1);
        System.out.println("First index of char (o), beginning with index (7): "+ind2);
        System.out.println("Last index of char (o): "+ind3);
        System.out.println("Last index (last occurence) of char (o), beginning with index (7) and backward to the beginning of the string: "+ind4);
        System.out.println();
        
        int ind5=str.indexOf("th");
        int ind6=str.indexOf("th", 7);
        int ind7=str.lastIndexOf("th");
        int ind8=str.lastIndexOf("th", 7);
        System.out.println("The string is: "+str);
        System.out.println("First index of string (th): "+ind5);
        System.out.println("First index of string (th), beginning with index (7): "+ind6);
        System.out.println("Last index of string (th): "+ind7);
        System.out.println("Last index (last occurence) of string (th), beginning with index (7) and backward to the beginning of the string: "+ind8);
        
        
    }
    
}

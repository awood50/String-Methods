
/**
 * This class contains a main() method only
 * and its purpose is to demonstrate the use
 * of several methods in the String class API
 * 
 * @author 1337-2.0 
 * Philip Coker
 * Weston Harmon
 * Timothy Chacko
 * Andrew Wood
 * @version 2/2/17
 */
public class StringMethods
{
    public static void main(String[ ] args)
    {
        String sentence;
        int count;
        int lastS = 0;
        
        sentence = new String("The Mississippi originates in Minnesota and flows to Louisiana.");
        System.out.println("The number of characters in the sentence:\n" + sentence + "\nis "+ sentence.length());
        count = 0;
        for(int k = 0; k < sentence.length( ); k++)
        {
            if(sentence.charAt(k) == 'i')
            {
                count++;
            }
        }
        System.out.println("The lowercase i appears " + count + " times.");
        
        
        if(sentence.contains("nat"))    //contains nat?
        {
            System.out.println("1.  The sentence contains nat.");
        }
        else
        {
            System.out.println("1.  The sentence does not contain nat.");
        }
        
        if(sentence.contains("bat"))    //contains bat?
        {
            System.out.println("2.  The sentence contains bat.");
        }
        else
        {
            System.out.println("2.  The sentence does not contain bat.");
        }
        
        String endSentence = new String();
        
        endSentence = sentence.substring(sentence.length() - 3, sentence.length());
        
        if(endSentence.equals("ana"))   //ends with ana?
        {
            System.out.println("3.  The sentence ends with ana");
        }
        else
        {
            System.out.println("3.  The sentence does not end with ana");
        }
      
        endSentence = sentence.substring(sentence.length()-4, sentence.length());
        
        if(endSentence.equals("ana."))  //ends with ana.?
        {
            System.out.println("4.  The sentence ends with ana.");
        }
        else
        {
            System.out.println("4.  The sentence does not end with ana.");
        }
        
        System.out.println("5.  The first index of s is " + sentence.indexOf("s")); //first occurance of s
        
        System.out.println("6.  The second occurance of s is " + sentence.indexOf("s",sentence.indexOf("s")+1));    //2nd occurance of s
        
        System.out.println("7.  The third occurance of s is " + sentence.indexOf("s",sentence.indexOf("s",sentence.indexOf("s")+1)+1)); //3rd occurance of s
       
        System.out.println("8.  The last occurance of s is " + sentence.lastIndexOf("s"));  //last occurance of s
        
        System.out.println("9.  The first occurance of is is " + sentence.indexOf("is"));   //step 9
        
        System.out.println("10. The last occurance of is is " + sentence.lastIndexOf("is"));    //step 10
        
        System.out.println("11. " + sentence.replace('s','z'));//step 11
        
        System.out.println("12. " + sentence);   //step 12
        
        System.out.println("13. " + sentence.substring(2,8));   //step 13
        
        System.out.println("14. " + sentence.toUpperCase());    //step 14
        
        System.out.println("15. " + sentence);  //step 15
    
    }

}

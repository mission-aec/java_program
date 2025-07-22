import java.lang.String;
import java.nio.charset.Charset;
public class string {
    public char charAt(int index){
        return this .charAt(index);
    }

    public int codePointAt(int index){
        return this.codePointAt(index);
    }
    
    public int codePointBefore(int index){
        return this.codePointBefore(index);
    }
    
    public int codePointCount(int startIndex, int endIndex){
        return this.codePointCount(startIndex, endIndex);
    }

    public  int compareTo(String anotherString){
        return this.compareTo(anotherString);
    }

    public int compareToIgnoreCase(String string2){
        return this.compareToIgnoreCase(string2);
    }
    public String concat(String string2){
        return this.concat(string2);
    }

    public boolean contains(CharSequence chars){
        return this.contains(chars);
    }

    public boolean contentEquals(CharSequence chars){
        return this.contentEquals(chars);
    }

    public static String copyValueOf(char[] data, int offset, int  count){
        return copyValueOf(data,offset,count);
    }
    public boolean endsWith(String chars){
        return this.endsWith(chars);
    }
    public boolean equals(Object anotherObject){
        return this.equals(anotherObject);
    }
    public boolean equalsIgnoreCase(String anotherString){
        return this.equalsIgnoreCase(anotherString);
    }
    public byte[] getBytes(Charset charset){
        return this.getBytes(charset);
    }
    public static void main(String[] args) {
        
        String str=new String("mission hassan");
        String str1="MISSION HASSAN";
        char[] characters={'m','i','s','s','i','o','n'};
        String str2=String.copyValueOf(characters ,0, 7);
        System.out.println(str.charAt(0));
        System.out.println(str.codePointAt(1));
        System.out.println(str.codePointBefore(2));
        System.out.println(str.codePointCount(0, 9));
        System.out.println(str1.compareTo(str));
        System.out.println(str.compareToIgnoreCase(str1));
        System.out.println(str.concat(str1));
        System.out.println(str1.contains("Miss"));
        System.out.println(str.contentEquals(str1));
        System.out.println(str2);
        System.out.println(str.endsWith(str1));
        System.out.println(str.equals(str1));
        System.out.println(str.equalsIgnoreCase(str1));
        //format mathod
        byte[] result = str.getBytes();
        System.out.println(result[0]);


    }
    
}

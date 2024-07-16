import java.util.Scanner;
import java.util.*;

public class Main {

    static boolean isAnagram(String a, String b) {
        
    if(a.length()!=b.length()) return false;
    HashMap<Character,Integer> sta = new HashMap<Character,Integer>();
    HashMap<Character,Integer> stb = new HashMap<Character,Integer>();
    for(int i=0;i<a.length();i++){
        if(sta.containsKey(a.charAt(i))) sta.put(a.charAt(i),sta.get(a.charAt(i))+1);
        else sta.put(a.charAt(i),1);
        
        if(stb.containsKey(b.charAt(i))) stb.put(a.charAt(i),stb.get(b.charAt(i))+1);
        else stb.put(b.charAt(i),1);
    }
    for(int i=0;i<b.length();i++){
        if(sta.get(a.charAt(i))!=stb.get(a.charAt(i))) return false;
    }
    return true;
    }

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}

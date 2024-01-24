package Hash;

import java.util.HashMap;
import java.util.*;

public class Hashmap {
    public static void main(String[] args) {
        //country(key),population(key)
        HashMap<String,Integer> map=new HashMap<>();
        //insertion
        map.put("india",120 );
        map.put("us", 100);
        map.put("chine", 90);
        System.out.println(map);
        map.put("chine", 80);
        System.out.println(map);
        //search
        if(map.containsKey("chine"))
        {
            System.out.println("key is present in the map");
        }
        else{
            System.out.println("key isnot present in the map");
        }
        System.out.println(map.get("chine"));
        System.out.println(map.get("indonesia"));
        int arr[]={12,13,14};
        for(int i=0;i<3;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        for(int val: arr)
        {
            System.out.print(val+" ");
        }
        System.out.println();
        for(Map.Entry<String,Integer> e : map.entrySet())
        {  
            System.out.println(e.getKey());
            System.out.println(e.getValue());

        }
        Set<String> keys=map.keySet();
        for(String key:keys)
        {
            System.out.println(key+" "+map.get(key));
        }
        map.remove("chine");
        System.out.println(map);


    }
    
}

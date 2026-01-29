import java.util.*;
class countryinfo
{
    public static void main(String args[])
    {
        HashMap<String, Integer> map = new HashMap<>();

        //Inserting values - map.put() is used.
        map.put("India",135);
        map.put("USA",331);
        map.put("China",1441);
        map.put("Russia",146);

        System.out.println("Country Population Map: " + map);

        // Searching for a key - map.containsKey() is used.
        if(map.containsKey("Italy"))

            {
                System.out.println("Key is present in the map");
            }
        else{
            System.out.println("Key is not present in the map");
        }
    int arr[] = {1,2,3,4,5};
    for(int eval:arr)
    {
        System.out.print(eval + " ");
    }
      System.out.println();
    
    // Iterating over map using for-each loop
    for(Map.Entry<String, Integer> e : map.entrySet())
    

    {
        System.out.println(e.getKey() + " : " + e.getValue());
    }

   }
}
//prints out lyric and number of instances they appear. Duplicate lyrics appear. 
import java.util.*;
import java.io.*;
public class outputUsingHashMap{
  public static void main(String[] args) throws Exception{
    //make a HashMap to store lyric and corresponding number of instances individual lyric appears
    Map<Integer, String> map = new HashMap<Integer, String>();
    //given a file with lyrics
    File file = new File("C:\\Users\\Chang\\Desktop\\Thank U Next.txt");
    //create two scanners
    //first scanner is to compare a lyric to all other lyrics to count the instances
    //second scanner is to get the lyric that is to be compared to the lyrics to get the number of times it appears
    Scanner sc2 = new Scanner(file);
    //while the song still has words
    while(sc2.hasNext()){
      String word = sc2.next();
      
      getTimes(word, map);
    }
    PrintWriter pw = new PrintWriter("output.txt");
    
    for(Map.Entry<Integer, String> entry : map.entrySet()){
        //System.out.println(entry.getKey()+": "+entry.getValue());
        pw.println(entry.getValue()+": "+entry.getKey());
        
    }
    pw.close();
  }
  
  public static void getTimes(String word, Map<Integer, String> map)throws Exception{
    File file = new File("C:\\Users\\Chang\\Desktop\\Thank U Next.txt");
        Scanner sc = new Scanner(file);
  int times = 0;
    while(sc.hasNext()){
      String lyric = sc.next();
      if(lyric.equals(word)){
        times++;
      }
    }
    //System.out.println(word+": "+times);
    //make a new entry into HashMap
    map.put(times, word);
  }
}

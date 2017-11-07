import java.util.HashMap;
import java.util.Map;

public class CountCharacters {
    public static void main(String[] args){
        String stringToCheck = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc accumsan sem ut ligula scelerisque sollicitudin. Ut at sagittis augue. Praesent quis rhoncus justo. Aliquam erat volutpat. Donec sit amet suscipit metus, non lobortis massa. Vestibulum augue ex, dapibus ac suscipit vel, volutpat eget massa. Donec nec velit non ligula efficitur luctus.";

        char[] charArray = stringToCheck.toCharArray();

        HashMap<Character, Integer> characterCounts = new HashMap<>();

        for(int i = 0; i < charArray.length; i++){

            if(characterCounts.containsKey(charArray[i])){

                int toIterate = characterCounts.get(charArray[i]);
                toIterate++;
                characterCounts.replace(charArray[i], toIterate);
            }
            else{
                characterCounts.put(charArray[i],1);
            }
        }

        for (Map.Entry<Character,Integer> entry: characterCounts.entrySet()){
            System.out.println(entry.getKey()+": "+entry.getValue());
        }
    }
}

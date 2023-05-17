import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class StringManupulatorImpl implements StringManipulatorInterface {
    @Override
    public void toLowerCase(String str) {
        System.out.println(str.toLowerCase());
    }

    @Override
    public void toUpperCase(String str) {
        System.out.println(str.toUpperCase());
    }

    @Override
    public void capitalFirst(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        String firstChar = str.charAt(0) + "";
        String capitalLetter = firstChar.toUpperCase();
        String restPart = str.substring(1).toLowerCase();

        stringBuilder.append(capitalLetter);
        stringBuilder.append(restPart);

        System.out.println(capitalLetter + restPart); //
    }

    @Override
    //Daniela
    public void separate(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            stringBuilder.append(str.charAt(i));
            stringBuilder.append(" ");
        }
        String result = stringBuilder.toString().trim();
        System.out.println(result);
    }

//    @Override
//    public void letterIndex(String str) {
//
//    }

    @Override
    public Map<Integer, Character> letterIndex(String str) {
        Map<Integer, Character> result = new LinkedHashMap<>();
        for (int i = 0; i < str.length(); i++) {
            result.put(i, str.charAt(i));
        }
        return result;
    }
}


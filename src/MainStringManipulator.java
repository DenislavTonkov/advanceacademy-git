import java.util.Map;

public class MainStringManipulator {

    public static void main(String args[]){
        String example = "qwertgds";
        StringManupulatorImpl manupulator = new StringManupulatorImpl();
        manupulator.toLowerCase(example);
        manupulator.toUpperCase(example);;
        manupulator.capitalFirst(example);
        manupulator.separate(example);

        Map<Integer, Character> letterIndexMap = manupulator.letterIndex(example);
//        letterIndexMap.forEach(key, value) -> System.out.println();

        final int myVal = 20;
        System.out.println(myVal);
    }
}

public class StringManipulatorTesting {
    public static void main(String[] args) {
        StringManipulator manipulator = new StringManipulator();

        String str = manipulator.manipulator("  hola  ", "  diablo  ");
        System.out.println(str);

        char letter = 'n';
        Integer a = manipulator.getIndexOrNull("Coding", letter);
        Integer b = manipulator.getIndexOrNull("Hola Mundo", letter);
        Integer c = manipulator.getIndexOrNull("Saludar", letter);
        System.out.println(a); // 4
        System.out.println(b); // 7
        System.out.println(c); // -1

        String word = "Hola";
        String subString = "la";
        String notSubString = "mundo";

        Integer d = manipulator.getIndexSub(word, subString);
        Integer e = manipulator.getIndexSub(word, notSubString);

        System.out.println(d); // 2
        System.out.println(e); // -1
    }
}
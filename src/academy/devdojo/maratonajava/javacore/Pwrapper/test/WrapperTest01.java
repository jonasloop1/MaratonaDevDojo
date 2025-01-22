package academy.devdojo.maratonajava.javacore.Pwrapper.test;

public class WrapperTest01 {
    public static void main(String[] args) {
        //Tipos primitivos - Bits
        byte byteP = 127;
        short shortP = 1;
        int intP = 1;
        long longP = 10L;
        float floatP = 12F;
        double doubleP = 12D;
        char charP = 'a';
        boolean booleanP = false;

        //Classes Utilitárias - Wrappers - Objetos
        Byte byteW = 127;
        Short shortW = 1;
        Integer intW = 1;
        Long longW = 10L;
        Float floatW = 12F;
        Double doubleW = 12D;
        Character charW = 'a';
        Boolean booleanW = false;

        Integer intW2 = Integer.parseInt("1");
        boolean verdade = Boolean.parseBoolean("True");
        System.out.println("Integer.parseInt 1: "+intW2);
        System.out.println("Boolean.parseBoolean True: "+verdade);

        System.out.println("\nMétodos ultilitários da classe Character:");
        System.out.println("\nisDigit A: "+Character.isDigit('A'));
        System.out.println("isDigit 4: "+Character.isDigit('4'));
        System.out.println("\nisLetterOrDigit !: "+Character.isLetterOrDigit('!'));
        System.out.println("isUpperCase A: "+Character.isUpperCase('A'));
        System.out.println("isLowerCase a: "+Character.isLowerCase('a'));
        System.out.println("\nisUpperCase a: "+Character.toUpperCase('a'));
        System.out.println("isLowerCase A: "+Character.toLowerCase('A'));
    }
}
//autoboxing - TIPO PRIMITIVO PARA UM WRAPPER
//Integer integer = 9;
//
//unboxing - WRAPPER PARA UM TIPO PRIMITIVO
//int in = 0;
//in = new Integer(9);
package String;

public class StringApp1 {
    public static void main(String[] args) {

        // MEMBUAT STRING BUFFER
        StringBuffer stringBuffer = new StringBuffer("Are");

        String insertString = new String("nd");

        // MENYATUKAN STRING, DENGAN STRING BUFFER
        stringBuffer.insert(1, insertString);
        System.out.println(stringBuffer);

        //
        StringBuffer stringBuffer1 = new StringBuffer("ARB");
        char karakter = 'Z';
        stringBuffer1.insert(1, karakter);
        System.out.println(stringBuffer1);
    }
}


// OUTPUT
// Andre
// AZRB

package Character;

public class CharacterApp1 {

    // MEMBUAT METHOD
    public void CharacterMethod(){
        // MEMBUAT LOCAL VARIABLE
        Character a = 'a';
        Character a2 = 'a';
        Character b = 'b';

        // MENGECEK CHAR
        int dif = a.compareTo(b);

        if (dif == 0){
            System.out.println(" a is equal to b");
        } else if (dif < 0){
            System.out.println(" a is less than b");
        } else if (dif > 0){
            System.out.println(" a is greater than b");
        }

        System.out.println("a is " +((a.equals(a2)) ? " equal" : " not equal") + " to a2");
        System.out.println("The Character " +a.toString() + " is " +(Character.isUpperCase(a.charValue()) ? "Upper" : "Lower") + " case");
    }

    //
    public static void tampil(){
        CharacterApp1 objek = new CharacterApp1();
        objek.CharacterMethod();
    }

    // MAIN METHOD
    public static void main(String[] args) {

        tampil();
    }
}

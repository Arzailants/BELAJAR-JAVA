package ArrayApp;

public class ArrayMultidimensi1 {

    private int[][] matriksA = new int [2][3];
    private int[][] matriksB = new int [2][3];
    private int[][] matriksC = new int [2][3];

    // SET ELEMENT MATRIK A
    public void tampilMatrikA() {
        matriksA[0][0] = 1;
        matriksA[0][1] = 2;
        matriksA[0][2] = 3;
        matriksA[1][0] = 4;
        matriksA[1][1] = 5;
        matriksA[1][2] = 6;
    }

    // SET ELEMENT MATRIK B
    public void tampilMatrikB() {
        matriksB[0][0] = 1;
        matriksB[0][1] = 2;
        matriksB[0][2] = 3;
        matriksB[1][0] = 4;
        matriksB[1][1] = 5;
        matriksB[1][2] = 6;
    }

    // PENJUMLAHAN MATRIKS A DAN B, MASUKKAN KE MATRIK C
    public void jumlahMatrikAB() {
        matriksC[0][0] = matriksA[0][0] + matriksB[0][0];
        matriksC[0][1] = matriksA[0][1] + matriksB[0][1];
        matriksC[0][2] = matriksA[0][2] + matriksB[0][2];
        matriksC[1][0] = matriksA[1][0] + matriksB[1][0];
        matriksC[1][1] = matriksA[1][1] + matriksB[1][1];
        matriksC[1][2] = matriksA[1][2] + matriksB[1][2];
    }

    // MENAMPILKAN
    public void tampil(char parameter){
        if (parameter == 'A'){
            for (int i = 0; i < matriksA.length; i++){
                System.out.print("[");
                for (int j = 0; j < matriksA[i].length; j++){
                    System.out.print(matriksA[i][j] +",");
                }
                System.out.print("]");
                System.out.println();
            }
        }
        else if (parameter == 'B'){
            for (int i = 0; i < matriksB.length; i++){
                System.out.print("[");
                for (int j = 0; j < matriksB[i].length; j++){
                    System.out.print(matriksB[i][j] +",");
                }
                System.out.print("]");
                System.out.println();
            }
        }
        else if (parameter == 'C'){
            for (int i = 0; i < matriksC.length; i++){
                System.out.print("[");
                for (int j = 0; j < matriksC[i].length; j++){
                    System.out.print(matriksC[i][j] +",");
                }
                System.out.print("]");
                System.out.println();
            }
        }

    }
    public static void main(String[] args) {

        ArrayMultidimensi1 objek = new ArrayMultidimensi1();
        objek.tampilMatrikA();
        System.out.println("MATRIKS A");
        // MENAMPILKAN MATRIK A
        objek.tampil('A');

        //
        objek.tampilMatrikB();
        //
        System.out.println("MATRIK B");
        objek.tampil('B');

        //
        objek.jumlahMatrikAB();
        System.out.println("MATRIK C");
        objek.tampil('C');
    }
}

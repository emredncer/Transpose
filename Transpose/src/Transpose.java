public class Transpose {

    public static void main(String[] args) {

        int[][] matris = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        //3'e 3 bir matrisin transpozu da 3e 3 olacağından, 3'e 3 boş bir matris oluşturuldu:
        int[][] transpoze = new int[3][3];

        System.out.println("Unprocessed matrix:  ");
        //Matrisin işlem görmemiş halini yadıracak olan loop:
        for (int i = 0; i < matris.length; i++) {
            for (int j = 0; j < matris[i].length; j++) {
                System.out.print(matris[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Transpose of the matrix:  ");
        //Transpozu alıp yazdıracak olan loop:
        for (int i = 0; i < matris.length; i++) {
            for (int j = 0; j < matris[i].length; j++) {
                transpoze[i][j] = matris[j][i];
                System.out.print(transpoze[i][j] + " ");
            }
            System.out.println();
        }
    }
}

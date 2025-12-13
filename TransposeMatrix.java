import java.util.*;
public class TransposeMatrix {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        int r=2;
        int c =3;

        int[][] matrix = new int[r][c];

        System.out.println("Enter Matrix");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                matrix[i][j]=sc.nextInt();
            }
        }

        int trans[][] = new int[c][r];

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                trans[j][i]=matrix[i][j];
            }
        }

        System.out.println("Transpose Matrix ");
        for(int i=0;i<c;i++){
            for(int j=0;j<r;j++){
                System.out.print(trans[i][j]+" ");
            }
            System.out.println();
        }


    }
}

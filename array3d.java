package sept9.Loops.array;

public class array3d {
    public static void main(String[] args) {
        int [][][] matrix= new int[2][3][4];

        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
                for(int k=0;k<4;k++){
                    System.out.print(matrix[i][j][k]);
                }
            }
        }
        System.out.println(" ");
    }
}

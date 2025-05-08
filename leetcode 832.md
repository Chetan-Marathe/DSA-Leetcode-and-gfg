832. Flipping an Image

Given an n x n binary matrix image, flip the image horizontally, then invert it, and return the resulting image.

To flip an image horizontally means that each row of the image is reversed.

For example, flipping [1,1,0] horizontally results in [0,1,1].
To invert an image means that each 0 is replaced by 1, and each 1 is replaced by 0.

For example, inverting [0,1,1] results in [1,0,0].
 

Example 1:

Input: image = [[1,1,0],[1,0,1],[0,0,0]]
Output: [[1,0,0],[0,1,0],[1,1,1]]
Explanation: First reverse each row: [[0,1,1],[1,0,1],[0,0,0]].
Then, invert the image: [[1,0,0],[0,1,0],[1,1,1]]

Code:

class Solution {

    public void swap(int[][]image,int i, int j , int k){
        int temp = image[i][j];
        image[i][j]=image[i][k];
        image[i][k]=temp;
    }

    public int[][] flipAndInvertImage(int[][] image) {
       for(int i=0 ; i<image.length ;i++){
        int k=image[i].length-1;
            for(int j=0 ; j<image[i].length/2;j++){
                swap(image,i,j,k);
                k--;
            }
       }

        for(int m=0 ; m<image.length;m++){
            for(int n=0 ;n<image[m].length;n++){
                if(image[m][n]==1){
                    image[m][n]=0;
                }else{
                    image[m][n]=1;
                }
            }
        }



        return image;


    }


}
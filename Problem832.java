public class Problem832 {
    public int[][] flipAndInvertImage(int[][] image) {
        
        for(int i=0; i<image.length; i++)
        {
            int start = 0;
            int end = image[i].length-1;

            while(start < end)
            {
                int temp = image[i][start];
                image[i][start] = image[i][end];
                image[i][end] = temp;
                start++;
                end--;
            }

            for(int j=0; j<image[i].length; j++)
            {
                switch(image[i][j])
                {
                    case 0: image[i][j] = 1;break;
                    default:image[i][j] = 0;
                }
            }
        }

        return image;
    }
}

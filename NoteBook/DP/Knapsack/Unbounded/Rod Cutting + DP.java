class Solution{
    public int cutRod(int price[], int totalLenOfRod) {

        //In this question, we need to asume that the price array is also corospond to the rode size...
        //Actually price.length and totalLenOfRod both are equal....but to intact the actual concept we define as below
        int matrix[][] = new int[ price.length+1 ][ totalLenOfRod+1 ];

        for(int i=1; i<price.length+1; i++){
            for(int j=1; j<totalLenOfRod+1; j++){
                
                if( i <= j){
                   matrix[i][j] = Math.max( matrix[i-1][j] ,
                                            matrix[i][j-i] + price[i-1] );
                }else{
                   matrix[i][j] =  matrix[i-1][j];
                }
            }
        }
        return matrix[price.length][totalLenOfRod];
    }
}

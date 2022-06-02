class Solution{
    public int cutRod(int price[], int totalLenOfRod) {
        
        int matrix[][] = new int[ price.length+1 ][ totalLenOfRod+1 ];

        for(int i=1; i<price.length+1; i++){
            
            int currentInchCutOfItem  =  i;
            int currentValue   = price[i-1];
            
            for(int j=1; j<totalLenOfRod+1; j++){
                
                if(currentInchCutOfItem <= j){
                   matrix[i][j] = Math.max( matrix[i-1][j] ,
                                            matrix[i][j-currentInchCutOfItem] + currentValue );
                }else{
                   matrix[i][j] =  matrix[i-1][j];
                }
            }
        }
        return matrix[price.length][totalLenOfRod];

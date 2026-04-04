class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result=new ArrayList<>();
      int Sr=0;
      int Sc=0;  
      int Er=matrix.length-1;
      int Ec=matrix[0].length-1;
      while(Sr<=Er && Sc<=Ec){
        for(int j=Sc;j<=Ec;j++){
            result.add(matrix[Sr][j]);
        }
        for(int i=Sr+1;i<=Er;i++){
         result.add(matrix[i][Ec]) ;  
        }
        for(int j=Ec-1;j>=Sc;j--){
            if(Sr==Er)
            break;
            result.add(matrix[Er][j]);
        }
        for(int i=Er-1;i>=Sr+1;i--){
            if(Sc==Ec)
            break;
            result.add(matrix[i][Sc]);
        }
        Sc++;
        Ec--;
        Sr++;
        Er--;
      } 
      System.out.println();
      return result;
    }
}
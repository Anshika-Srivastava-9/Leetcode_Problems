class Solution {
    public String truncateSentence(String s, int k) {

        String[] arr=s.split(" ");

        StringBuilder ans=new StringBuilder();

        for(int i=0;i<k;i++){

            ans.append(arr[i]);

            if(i!=k-1){
                ans.append(" ");
            }

        }

        return ans.toString();
    }
}
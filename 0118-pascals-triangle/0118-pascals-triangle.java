class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> answer = new ArrayList<>(); 
        
        for (int i = 0; i <= numRows - 1; i++){
            List<Integer> row  = new ArrayList<>();
            if (i == 0){
                row.add(1);
            }else{
                for(int j = 0 ; j <= answer.get(i-1).size() ; j ++){
                    if (j == 0 || j == answer.get(i-1).size()){
                        row.add(1);
                    }else{
                        row.add(answer.get(i-1).get(j)+answer.get(i-1).get(j-1));
                    }
                }
            }
            answer.add(row);
        }
        return answer;
    }
    }
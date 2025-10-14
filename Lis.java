class Solution {
    public int lengthOfLIS(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(nums[0]);
        for(int i = 1;i<nums.length;i++)
        {
            int digit = nums[i];
            if(list.get(list.size() - 1)<digit){
                list.add(digit);
            }else{
                int lo = 0;
                int hi = list.size() - 1;
                while(lo<=hi)
                {
                    int mid = (lo + hi)/2;
                    if(list.get(mid)==digit){
                        lo = mid;
                        break;
                    }else if(list.get(mid)<digit){
                        lo = mid;
                        lo = mid + 1;
                    }else{
                        hi = mid - 1;
                    }
                }
                list.set(lo , digit);
            }
        }
        return list.size();
    }
}

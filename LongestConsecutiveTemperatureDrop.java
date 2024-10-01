class LongestConsecutiveTemperatureDrop 
{
	public static void main(String[] args) 
	{
		int[] arr = {1,6,0,-1,-2,3,4,8,7,6,5,4,3,2,1,0,-1,-2,-3};
		System.out.println(ConsecutiveDropWithLowestTemp(arr));
		System.out.println(LongestConsecativeDropCount(arr));
	}
	public static int ConsecutiveDropWithLowestTemp(int[] arr)
		{
			int longest = arr[0];
			for(int i=0;i<arr.length-1;i++)
				{
					if(arr[i+1]<arr[i] && arr[i+1]<longest)
						{
							longest=arr[i+1];
						}
				}
				return longest;
		}
	public static int LongestConsecativeDropCount(int[] arr)
		{
			int maxCount = 0;  // Store the longest sequence of consecutive drops
        int currentCount = 0;  // Track the current sequence length

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i + 1] < arr[i]) {
                currentCount++;  // Continue the current drop sequence
                maxCount = Math.max(maxCount, currentCount);  // Update max count if necessary
            } else {
                currentCount = 0;  // Reset current count if the sequence is broken
            }
        }

        return maxCount;
		}
}

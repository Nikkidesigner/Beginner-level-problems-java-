class ReturnVersionFromArray 
{
	public static void main(String[] args) 
	{
		String arr[] = {"File_1","File_2","File01", "File_7654", "File_4321", "NotAFile_123", "File_87654", "File_76543"};
		System.out.println(Version(arr));
	}
	public static int Version(String[] arr)
		{
			int version=0;
			int count=0;
			int maxversion=-1;
			for(int i=0;i<arr.length;i++)
				{
					String element=arr[i];
					

					if(element.substring(0,5).equals("File_"))
					{
						count=1;
						String ver = element.substring(5,(element.length()));
						 version = Integer.parseInt(ver);
						if(version>maxversion)
							{
								maxversion=version;
							}
						
					}
					
				}
		if(count==0)
			{
				return -1;
			}
		else 
			return maxversion;
		}
}

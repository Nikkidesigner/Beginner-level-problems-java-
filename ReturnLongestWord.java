class ReturnLongestWord 
{
	public static void main(String[] args) 
	{
		Longestword("Hello.My.Name.is.Nikhil.Pawar.");
	}
	public static void Longestword(String str)	
	{
		String arr[] = str.split("\\.");
		int maxindex=0;
		for (int i=0;i<arr.length;i++)
		{
			String s=arr[i];
			
            if(s.length()>arr[maxindex].length())
			{
				maxindex=i;
			}
		}
		System.out.println(arr[maxindex]);
	}
}
/*
The split() method in Java is used to split a string into an array of substrings based on a specified delimiter. This delimiter is a regular expression (regex). A regular expression is a pattern that defines a set of strings, and when you pass this pattern into split(), it matches substrings in the string that fit the pattern.

Syntax of split()
java
Copy code
String[] result = str.split(String regex);
regex: This is the regular expression you want to split the string by.
Returns: An array of strings where each element is a part of the string separated by the pattern defined in the regex.
Example 1: Split by Space (" ")
To split a string into words based on spaces:

java
Copy code
String str = "Hello world this is Java";
String[] arr = str.split(" ");

for(String word : arr) {
    System.out.println(word);
}
Output:

kotlin
Copy code
Hello
world
this
is
Java
Example 2: Split by Period (".")
The period (.) is a special character in regular expressions that matches any character. To split by a literal period (dot), you need to escape it with two backslashes (\\.):

java
Copy code
String str = "Hello.My.Name.is.Java";
String[] arr = str.split("\\.");

for(String word : arr) {
    System.out.println(word);
}
Output:

csharp
Copy code
Hello
My
Name
is
Java
Explanation:
.: In regular expressions, the dot (.) is a wildcard that matches any character. Therefore, if you want to split by an actual period (dot), you need to escape it with two backslashes (\\.).
split("\\."): This tells the method to split the string at every occurrence of the literal . character.
Example 3: Split by Comma (,)
To split a string by commas:

java
Copy code
String str = "apple,banana,orange,mango";
String[] arr = str.split(",");

for(String fruit : arr) {
    System.out.println(fruit);
}
Output:

Copy code
apple
banana
orange
mango
Example 4: Split by Multiple Delimiters
You can use regular expression patterns to split by multiple delimiters. For instance, to split by both spaces and commas:

java
Copy code
String str = "apple, banana,orange mango";
String[] arr = str.split("[, ]+");

for(String word : arr) {
    System.out.println(word);
}
[,]: Matches a comma.
[ ]: Matches a space.
[ ,]+: Matches one or more spaces or commas.
Output:

Copy code
apple
banana
orange
mango
Example 5: Split by Digit (\\d)
You can split a string by any digits:

java
Copy code
String str = "apple123banana456orange";
String[] arr = str.split("\\d+"); // split by one or more digits

for(String word : arr) {
    System.out.println(word);
}
Output:

Copy code
apple
banana
orange
Recap of Important Escape Characters in Regex:
.: Matches any character (so to split by a literal dot, use \\.).
\\d: Matches any digit (0-9).
\\s: Matches any whitespace (spaces, tabs, etc.).
\\w: Matches any word character (alphanumeric + underscore).
[ ]: Matches any character within the brackets.
+: One or more occurrences of the preceding element.
By mastering regular expressions, you can perform flexible and powerful string splitting operations!








*/
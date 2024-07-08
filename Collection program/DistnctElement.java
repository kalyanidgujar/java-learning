import java.util.*;
class DistnctElement
{
	public static void main(String[] args) {
		int[]arr={1,2,3,4,5,3,2,6};
		Arrays.stream(arr).distinct().forEach(ele->System.out.println(ele));
	}
}
/*
1
2
3
4
5
6 */
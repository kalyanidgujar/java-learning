import java.util.*;
class ListMethod_IndexOf
{
	public static void main(String[] args) {
		List<String>list=new LinkedList<>();
		list.add("Kalyani");
		list.add("Praju");
		list.add("Anandi");
		list.add("Komal");
		System.out.println(list);                      //[Kalyani, Praju, Anandi, Komal]

		System.out.println(list.indexOf("Praju"));      //1

	}
}
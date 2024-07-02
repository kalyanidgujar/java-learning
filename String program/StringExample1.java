class StringExample1
{
   public static void main(String args[])
   {
    String a="Hello";          //Hello
    System.out.println("a:"+a);
    String b="hello";          //hello
    System.out.println("b:"+b); 
   // System.out.println("c":+a==b);  // false
   
    String d="Hello";
    String e=new String("Hello");

    System.out.println(d==e);   //false
    System.out.println(d.equals(b)); //false

    String f=new String("hi");
    String g=new String("hi");
    System.out.println(f==g);   //false
 
    System.out.println(f.equals(g));
  
  
   }
}
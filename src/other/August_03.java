package other;

interface Interfacetalk{
	public String hi(String str);
}

public class August_03 {
	public static void main(String[] args) {

		Interfacetalk hello = name -> "こんちわ" + name ;
		Interfacetalk bye = name -> "バイバイ" + name;

		System.out.println(hello.hi("神様"));

		System.out.println(bye.hi("世界"));
	}

}

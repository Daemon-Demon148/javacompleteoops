import java.util.BitSet;
//Bitset creates an array which will return boolean value
public class bitsetdemo {

	public static void main(String[] args) {
	BitSet b=new BitSet();
	BitSet b1=new BitSet(4);
	b.set(1);
	b.set(2);
		//In bitset,size is extendible easily
b1.set(5);
b1.set(6);
b1.set(7);
b1.set(8);
b1.set(9);
System.out.println(b);
System.out.println(b1);

	}

}

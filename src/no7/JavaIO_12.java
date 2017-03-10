package no7;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Foo implements Serializable {
	private int x;
	private transient int y;
	private static int z;

	public Foo(int x, int y, int _z){
		this.x = x;
		this.y = y;
		z = _z;
	}


		@Override
		public String toString(){
			return x + ":" + y + ":" + z;
		}
}

public class JavaIO_12{
	public static void main(String[] args) {
			try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("out.ser"))){
				Foo foo = new Foo(1, 2, 3);
				out.writeObject(foo);
			}catch(Exception e){
				e.printStackTrace();
			}


			try(ObjectInputStream in = new ObjectInputStream(new FileInputStream("out.ser"))){
				Foo foo =(Foo)in.readObject();
				System.out.println(foo);
			}catch (Exception e){
				e.printStackTrace();
			}

	}


}
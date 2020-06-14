import java.util.TreeSet;
import java.util.Iterator;

class Array_mihon2{
	Array_mihon2(){
		TreeSet a;		//オブジェクト作成
		a = new TreeSet();		//インスタンス化する
		
		a.add("dog");
		a.add("cat");
		a.add("dog");
		a.add("rabbit");
		a.add("cat");

		// getせずIteratorで処理
		Iterator it;
		it = a.iterator();
		
		while(it.hasNext()){
			System.out.println( it.next());
		}
	}

	public static void main(String args[]){
		new Array_mihon2();	//インスタンス化
	}
}
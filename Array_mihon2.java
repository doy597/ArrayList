import java.util.TreeSet;
import java.util.Iterator;

class Array_mihon2{
	Array_mihon2(){
		TreeSet a;		//�I�u�W�F�N�g�쐬
		a = new TreeSet();		//�C���X�^���X������
		
		a.add("dog");
		a.add("cat");
		a.add("dog");
		a.add("rabbit");
		a.add("cat");

		// get����Iterator�ŏ���
		Iterator it;
		it = a.iterator();
		
		while(it.hasNext()){
			System.out.println( it.next());
		}
	}

	public static void main(String args[]){
		new Array_mihon2();	//�C���X�^���X��
	}
}
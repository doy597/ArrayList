import java.util.ArrayList;
class Array_mihon{			// コンストラクタ作成		
	
	Array_mihon(){
	ArrayList a;
	a = new ArrayList();

	a.add("dog");
	a.add("cat");
	a.add("rabbit");

	a.remove(1);
	int kazu = a.size();

	if(!a.isEmpty()){
		for(int i=0; i<kazu; i++){
			System.out.println(a.get(i));
		}
	}
}
	public static void main(String args[]){
		new Array_mihon();
	}
}
	
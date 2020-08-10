
class Unique {
	static int m=2;
public static void main(String[] args) {
	int k=8,z=1;
	for(int i=0;i< 2;i++){
	Pattern(z+(i+1), k, m);
	m=m+1;
	}
	for(int i=0;i< 2;i++){
		int temp=1;
		for(int f=0;f < 1;f++){
		while(temp < 8){
		System.out.print(Space());
		temp++;
		}
		temp=1;
		System.out.print(Space()+""+Star());
		System.out.println();
		}
		Pattern(z+(i+1), k, m);
		m=m+1;
		for(int f=0;f < 1;f++){
			while(temp < 8){
			System.out.print(Space());
			temp++;
			}
			temp=1;
			System.out.print(Space()+""+Star());
			System.out.println();
			}
	}
}
public static void Pattern(int z,int k,int l){
	for(int i=0;i<3;i++){
		int m=1;
		int n=8;
		if(i%2==0){
			while(m <= k){
			System.out.print(Space());	
			m++;
			}
			System.out.println("*");
		}
		else{
			while(m <= k-(l-1)){
				System.out.print(Space());	
				m++;
				}
			while(m <= k+l){
				System.out.print(Star());
				m++;
			}
			System.out.println();
		}
	}	
}
public static String Space(){
	return " ";
}
public static String Star(){
	return "*";
}
}

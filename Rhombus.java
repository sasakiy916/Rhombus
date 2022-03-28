import java.util.*;
public class Rhombus{
	public static void main(String[] args){
		int num;
		while(true){
			System.out.print("好きな奇数を入れてください>>");
			num = new Scanner(System.in).nextInt();
			if(num % 2 == 0){
				System.out.printf("奇数以外が入力されました。再入力してください。%n%n");
			}else{
				break;
			}
		}
		int halfNum = (num-1)/2;
		for(int i=0;i<num;i++){
			for(int j=0;j<num;j++){
				System.out.print(Math.abs(i-halfNum)+Math.abs(j-halfNum) == halfNum ? "X":" ");
			}
			System.out.println();
		}
	}
}

package todoList;

public class list {

	public static void main(String[] args) {
		String [] todo = {"공부" , "게임" , "저녁먹기"};
		
		for (int i = 0; i < todo.length; i++) {
			if(i == 0)
			{
				System.out.println((i+1) + ". " + todo[i]);
			}
			else
			{
				System.out.println((i+1) + ". " + todo[i]);
			}
		}
					
	}
}

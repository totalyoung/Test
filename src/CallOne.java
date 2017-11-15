
public class CallOne implements CallBack {
	
	private CallTwo two;
	public CallOne(){
		two = new CallTwo();
	}
	@Override
	public void call() {
		System.out.println("zhe shi yi ge hui tiao han shu");

	}
	public void test(){
		two.CallMe(CallOne.this);
	}
	
	public static void main(String args[]){
		CallOne one = new CallOne();
		//CallTwo two = new CallTwo();
		one.test();
	}
}

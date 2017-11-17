package pl.atena.edu.lambda;

public class LambdaTest6 {

	@Override
	public String toString() {
		return "LambdaTest6 []";
	}

	public void test() {
		MyFunctionlInterface mfi = (m) -> System.out.println(m + this.toString());
		mfi.fire("Wołam cię z: ");
	}

	public static void main(String[] args) {
		LambdaTest6 test = new LambdaTest6();
		test.test();
	}

}

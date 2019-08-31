// Problem 476: Number Complement
public class Problem0476 {

	public int findComplement(int num) {
		int oneConcat = 0b0;
		int temp = num;

		while (temp > 0) {
			oneConcat <<= 1;
			oneConcat |= 1;

			temp >>= 1;
		}

		return (num ^ oneConcat);
	}
}

package leetcode;

public class CountingBits_338 {

	public int[] countBits(int num) {
		int res[] = new int[num + 1];
		int i = res.length;

		while (num > 0) {
			int temp = num;

			int count = oneCount(temp);
			i--;
			res[i] = count;
			num--;
		}

		return res;
	}

	private int oneCount(int n) {
		int res = 0;

		while (n > 0) {
			if ((n & 1) == 1) res++;
			n = n >> 1;
		}

		return res;
	}
}

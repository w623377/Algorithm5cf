public class Code07_EvenTimesOddTimes {

	// 一个数组中有一种数出现了奇数次，其他的数都出现了偶数次，怎么找到并打印这种数？
	public static void printOddTimesNum1(int[] arr) {
		int eO = 0;
		for (int cur : arr) {
			eO ^= cur;
		}
		System.out.println(eO);
	}

	// 一个数组中有两种数出现了奇数次，其他的数都出现了偶数次，怎么找到并打印这两种数？
	public static void printOddTimesNum2(int[] arr) {
		int eO = 0, eOhasOne = 0;
		for (int curNum : arr) {
			eO ^= curNum;			//e0=a^b
		}
		int rightOne = eO & (~eO + 1);// 提取出eO最右侧的1，其他位都是0，假如提取出来的是0000001000，说明a和b在第4位上不一致，一个是0，一个是1,分别属于两类数
		for (int cur : arr) {
			if ((cur & rightOne) != 0) {//将cur中两类数中的一类与rightOne^，剩下的就是a或者b
				eOhasOne ^= cur;
			}
		}
		System.out.println(eOhasOne + " " + (eO ^ eOhasOne));
	}

	public static void main(String[] args) {
		int a = 5;
		int b = 7;

		a = a ^ b;
		b = a ^ b;
		a = a ^ b;

		System.out.println(a);
		System.out.println(b);

		int[] arr1 = { 3, 3, 2, 3, 1, 1, 1, 3, 1, 1, 1 };
		printOddTimesNum1(arr1);

		int[] arr2 = { 4, 3, 4, 2, 2, 2, 4, 1, 1, 1, 3, 3, 1, 1, 1, 4, 2, 2 };
		printOddTimesNum2(arr2);

	}

}

package night.hacker_rank.jan23;

public class GasAndBurner {

	public static int solve(int N, int K, int[] X) {
		int tot = 0, min = 0, time = 1;
		for (int i = K; i < N; i++)
			tot += X[i];
		
		for (int i = K - 1; i > 0; i--) {
			if (tot >= time * (X[i - 1] - X[i])) {
				tot -= time * (X[i - 1] - X[i]);
				time++;
				min = X[i - 1];
			} else {
				min += tot / time;
				tot = 0;
				break;
			}
		}
		if (tot > 0)
			min += tot / time;
		return min;
	}
	// K= number of burners
	// N= number of cylinders
	public static void main(String[] args) {

//		int N = 5, K = 3;
//		int[] X = { 10, 10, 6, 9, 3 };
//		int min = solve(N, K, X);
		
//		int N = 3, K = 2;
//		int[] X = { 3, 3,3 };
//		int min = solve(N, K, X);
		
		int N = 5, K = 4;
		int[] X = { 20, 20, 20, 20, 20 };
		int min = solve(N, K, X);
		
	
		
		System.out.println(min);
		
	}
}
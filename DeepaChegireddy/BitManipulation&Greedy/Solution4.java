class Solution4{
	public static int minPillsToSurvive(int N, int V, int[] a) {
		int pillsTaken = 0;
		int health = V;
	
		for (int i = 0; i < N; i++) {
			if (health <= 0) {
				break; 
			}
	
			if (a[i] > 1 && health <= 1) {
	
				pillsTaken++;
				health = a[i] - 1;
			} else if (a[i] > health) {
	
				pillsTaken++;
				health = a[i];
			}
	
			health--;
		}
	
		return pillsTaken;
	}
}
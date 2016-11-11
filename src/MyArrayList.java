
public class MyArrayList {

	int[] array;

	public MyArrayList() {

	}

	public void add(int i) {
		if (array == null) {
			array = new int[1];
			array[0] = i;
		}
		
		else {
			int[] j = new int[array.length + 1];
			for (int j2 = 0; j2 < array.length; j2++) {
				j[j2] = array[j2];
			}

			array = new int[array.length + 1];
			for (int j2 = 0; j2 < j.length; j2++) {
				array[j2] = j[j2];
			}
			array[array.length - 1] = i;
		}
	}

	public int get(int e) {
		return array[e];

	}

	public int remove(int i) {
		// TODO Auto-generated method stub
		return array[i];
	}
}

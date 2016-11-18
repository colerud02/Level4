
public class MyArrayList<T> {

	T[] array;

	public MyArrayList() {

	}

	public void add(T i) {
		if (array == null) {
			array = new T[1];
			array[0] = i;
		}

		else {
			T[] j = new T[array.length + 1];
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
		int temp = 0;
		int[] j = new int[array.length - 1];
		if (i < array.length && i > -1) {
			temp = array[i];
			System.out.println(temp);
			int ctr = 0;
			for (int k = 0; k < array.length; k++) {

				if (k != i) {
					j[ctr] = array[k];
					ctr++;
				}
				
			}
			array = new int[j.length];
			for (int k = 0; k < j.length; k++) {
				array[k] = j[k];
			}

		}
		
		return temp;
	}
}

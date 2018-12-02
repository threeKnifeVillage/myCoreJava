package Generic;
import java.util.*;

class ArrayAlg {
	public static <T extends Comparable> Pair<T> minMax(T[] a) {
		if (a == null || a.length == 0) {
			return null;
		}
		
		T min = a[0];
		T max = a[0];
		
		for (int i = 0; i < a.length; i++) {
			if (max.compareTo(a[i]) < 0) max = a[i];
			if (min.compareTo(a[0]) > 0) min = a[i];
		}
		
		return new Pair<>(max, min);
	}
}

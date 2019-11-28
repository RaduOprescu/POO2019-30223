package lab9;

public class TestLongMatrix {
	public static void main(String[] args) {
		// Creaza tablourile de intregi m1, m2
		Long[][] m1 = new Long[][] { { 1L, 2L, 3L }, { 4L, 5L, 6L }, { 1L, 1L, 1L } };
		Long[][] m2 = new Long[][] { { 1L, 1L, 1L }, { 2L, 2L, 2L }, { 0L, 0L, 0L } };
		// Creaza o instanta de IntegerMatrix
		LongMatrix longMatrix = new LongMatrix();
		System.out.println("\nm1 + m2 is ");
		GenericMatrix.printResult(m1, m2, longMatrix.addMatrix(m1, m2), '+');
		System.out.println("\nm1 * m2 is ");
		GenericMatrix.printResult(m1, m2, longMatrix.multiplyMatrix(m1, m2), '*');
	}
}
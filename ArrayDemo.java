class ArrayDemo{
	public static void main(String[] args) {
		int[] array1 = new int[7];
		System.out.println(array1.length);
		array1[0] = 1;
		System.out.println(array1[0]);

		int array2[] = new int[]{1, 2, 3};
		System.out.println(array2[2]);

		int[] array3 = null;
		System.out.println(array3 == null ? "null" : array3);
	}
}
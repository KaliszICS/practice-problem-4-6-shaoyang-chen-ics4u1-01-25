
class Notes {
	public static void main(String[] args) {

		String[] Names;
		int[] ages;
		int[] studentNumber;

		Names = new String[15];
		ages = new int[15];
		studentNumber = new int[15];

		Names[0] = "Steven";
		ages[0] = 15;
		studentNumber[0] = 123456789;

		Student[] students = new Student[15];
		students[0] = new Student("Steven", 15, 123456789);
	}
}

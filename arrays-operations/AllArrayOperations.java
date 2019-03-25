import java.util.Scanner;

class AllArrayOperations {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your name: ");
		String s = sc.next();
		System.out.println("Hello, " + s);
		L1: while (true) {
			System.out.println("You have following types of arrays: ");
			System.out.println("1. 1D array  ");
			System.out.println("2. 2D array  ");
			System.out.println("3. 3D array");
			System.out.println("4. Exit ");
			System.out.print("Enter your choice: ");
			int n = sc.nextInt();

			switch (n) {
			case 1:
				System.out.print("Enter how many arrays : ");
				int k = sc.nextInt();
				System.out.print("Please enter the size of the First Array : ");
				int l = sc.nextInt();
				System.out.print("Enter the elements : ");
				int a1[] = new int[l];
				for (int i = 0; i < l; i++)
					a1[i] = sc.nextInt();
				System.out.print("Please enter the size of the Second Array : ");
				int m = sc.nextInt();
				System.out.print("Enter the elements : ");
				int a11[] = new int[m];
				for (int i = 0; i < m; i++)
					a11[i] = sc.nextInt();
				L2: while (true) {
					System.out.println("Please choose one from following : ");
					System.out.println("1. Find Union ");
					System.out.println("2. Find Intersection ");
					System.out.println("3. Add two arrays");
					System.out.println("4. Subtract two arrays");
					System.out.println("5. Go Back to Main Menu");
					System.out.println("6. Exit");
					System.out.print("Choice : ");
					int a = sc.nextInt();

					switch (a) {
					case 1:
						System.out.print("Union : ");
						boolean c[] = new boolean[50];
						for (int i = 0; i < l; i++) {
							int key = a1[i];
							if (!c[key])
								c[key] = true;
						}
						for (int i = 0; i < m; i++) {
							int key1 = a11[i];
							if (!c[key1])
								c[key1] = true;
						}
						for (int j = 0; j < c.length; j++)
							if (c[j])
								System.out.print(j + " ");
						break;
					case 2:
						System.out.print("Intersection : ");
						boolean h[] = new boolean[50];
						for (int i = 0; i < l; i++) {
							int key = a1[i];
							if (!h[key])
								h[key] = true;
						}
						for (int i = 0; i < m; i++) {
							int key1 = a11[i];
							if (h[key1])
								System.out.print(key1 + " ");
						}
						break;
					case 3:
						System.out.print("Sum : ");
						int sum[] = new int[l];
						for (int i = 0; i < l; i++) {
							sum[i] = 0;
							sum[i] += (a1[i] + a11[i]);
						}
						for (int i = 0; i < l; i++)
							System.out.print(sum[i] + " ");
						System.out.println();
						break;
					case 4:
						System.out.print("Subtraction : ");
						int sub[] = new int[l];
						for (int i = 0; i < l; i++) {
							sub[i] = 0;
							sub[i] += (a1[i] - a11[i]);
						}
						for (int i = 0; i < l; i++)
							System.out.print(sub[i] + " ");
						System.out.println();
						break;
					case 5:
						continue L1;
					case 6:
						System.out.println("Thank you");
					case 7:
						System.exit(0);
					}

				}

			case 2:
				System.out.print("Enter how many arrays : ");
				int k1 = sc.nextInt();
				System.out.print("Please enter the no of rows for first array  : ");
				int l1 = sc.nextInt();
				System.out.print("Please enter the no of cols for first array  : ");
				int m1 = sc.nextInt();
				System.out.print("Enter the elements : ");
				int b1[][] = new int[l1][m1];
				for (int i = 0; i < l1; i++)
					for (int j = 0; j < m1; j++)
						b1[i][j] = sc.nextInt();

				System.out.print("Please enter the no of rows for second array : ");

				int l2 = sc.nextInt();

				System.out.print("Please enter the no of cols for second array  : ");

				int m2 = sc.nextInt();
				System.out.print("Enter the elements : ");
				int b11[][] = new int[l2][m2];
				for (int i = 0; i < l2; i++)
					for (int j = 0; j < m2; j++)
						b11[i][j] = sc.nextInt();

				L3: while (true) {

					System.out.println("Please choose one from following : ");

					System.out.println("1. Add two matrices  ");
					System.out.println("2. Subtract two matrices ");
					System.out.println("3. Multiply  two arrays  ");
					System.out.println("4. Go Back to Main Menu");
					System.out.println("5. Exit");
					System.out.print("Choice : ");
					int a2 = sc.nextInt();

					switch (a2) {
					case 1:
						if ((l1 == l2) && (m1 == m2)) {
							int sum2[][] = new int[l1][m1];
							System.out.println("Sum : ");
							for (int i = 0; i < l1; i++) {
								for (int j = 0; j < m1; j++) {
									sum2[i][j] = 0;
									sum2[i][j] += (b1[i][j] + b11[i][j]);
								}
							}
							for (int i = 0; i < l1; i++) {
								for (int j = 0; j < m1; j++)
									System.out.print(sum2[i][j] + " ");
								System.out.println();
							}
						} else
							System.out.println(
									"No. of  rows & cols first array should be equal to that of the second array.");
						break;
					case 2:
						if ((l1 == l2) && (m1 == m2)) {
							int sub2[][] = new int[l1][m1];
							System.out.println("Subtraction : ");
							for (int i = 0; i < l1; i++) {
								for (int j = 0; j < m1; j++) {
									sub2[i][j] = 0;
									sub2[i][j] += (b1[i][j] - b11[i][j]);
								}
							}
							for (int i = 0; i < l1; i++) {
								for (int j = 0; j < m1; j++)
									System.out.print(sub2[i][j] + " ");
								System.out.println();
							}
						} else
							System.out.println(
									"No. of  rows & cols first array should be equal to that of the second array.");
						break;
					case 3:
						if (m2 == l1) {
							int mul[][] = new int[m1][l2];
							System.out.println("Multiplication : ");
							for (int i = 0; i < l1; i++) {
								for (int j = 0; j < m1; j++) {
									mul[i][j] = 0;
									for (int q = 0; q < l2; q++) {

										mul[i][j] = mul[i][j] * (b1[i][q] * b11[q][j]);

									}
								}
							}
							for (int j = 0; j < m1; j++) {
								for (int q = 0; q < l2; q++)
									System.out.print(" " + mul[j][q]);
								System.out.println();
							}
						}

						else
							System.out.println(
									"No. of  cols of first array should be equal to no. of  rows of second array.");
						break;
					case 4:
						continue L3;

					case 5:
						System.out.println("Thank you");
					case 6:
						System.exit(0);
					}
				}
			case 3:
				System.out.print("Enter how many arrays : ");
				int k2 = sc.nextInt();
				System.out.print("Please enter the no of rows for first array  : ");
				int u = sc.nextInt();
				System.out.print("Please enter the no of cols for first array  : ");
				int v = sc.nextInt();
				System.out.print("Enter the elements : ");
				int c1[][][] = new int[3][u][v];
				for (int i = 0; i < u; i++)
					for (int j = 0; j < v; j++)
						c1[0][i][j] = sc.nextInt();

				System.out.print("Please enter the no of rows for second array : ");
				int u1 = sc.nextInt();
				System.out.print("Please enter the no of cols for second array  : ");
				int v1 = sc.nextInt();
				System.out.print("Enter the elements : ");

				for (int i = 0; i < u1; i++)
					for (int j = 0; j < v1; j++)
						c1[1][i][j] = sc.nextInt();
				L4: while (true) {
					System.out.println("Please choose one from following : ");
					System.out.println("1. Add two matrices  ");
					System.out.println("2. Subtract two matrices ");
					System.out.println("3. Multiply  two arrays  ");
					System.out.println("4. Go Back to Main Menu");
					System.out.println("5. Exit");
					System.out.print("Choice : ");
					int a3 = sc.nextInt();

					switch (a3) {
					case 1:
						if ((u == u1) && (v == v1)) {

							System.out.println("Sum : ");
							for (int i = 0; i < u; i++) {
								for (int j = 0; j < v; j++) {
									c1[2][i][j] = 0;
									c1[2][i][j] += (c1[0][i][j] + c1[1][i][j]);
								}
							}
							for (int i = 0; i < u; i++) {
								for (int j = 0; j < v; j++)
									System.out.print(c1[2][i][j] + " ");
								System.out.println();
							}
						} else
							System.out.println(
									"No. of  rows & cols first array should be equal to that of the second array.");
						break;
					case 2:
						if ((u == u1) && (v == v1)) {

							System.out.println("Subtraction : ");
							for (int i = 0; i < u; i++) {
								for (int j = 0; j < v; j++) {
									c1[2][i][j] = 0;
									c1[2][i][j] += (c1[0][i][j] - c1[1][i][j]);
								}
							}
							for (int i = 0; i < u; i++) {
								for (int j = 0; j < v; j++)
									System.out.print(c1[2][i][j] + " ");
								System.out.println();
							}
						} else
							System.out.println(
									"No. of  rows & cols first array should be equal to that of the second array.");
						break;
					case 3:
						if (u == v1) {

							System.out.println("Multiplication : ");
							for (int i = 0; i < u; i++) {
								for (int j = 0; j < v1; j++) {
									for (int q = 0; q < v1; q++) {
										c1[2][i][j] = 0;
										c1[2][i][j] += (c1[0][i][q] * c1[1][q][j]);
									}
								}
							}
							for (int i = 0; i < u; i++) {
								for (int j = 0; j < v1; j++)
									System.out.print(c1[2][i][j] + " ");
								System.out.println();
							}
						} else
							System.out.println(
									"No. of  cols of first array should be equal to no. of  rows of second array.");
						break;
					case 4:
						continue L4;

					case 5:
						System.out.println("Thank you");
					case 6:
						System.exit(0);
					}
				}
			default:
				System.out.println("Choose the right option ");
			}
		}
	}
}

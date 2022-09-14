package com.yash.java.string_problem5;

public class StringBufferAndStringBuilder_Problem5 {

	public static void main(String[] args) {
		int N = 6234567;
		long t;

		{
			System.out.println("String Buffer timing..");
			StringBuffer sb = new StringBuffer();
			t = System.currentTimeMillis();
			for (int i = N; i-- > 0;) {
				sb.append("");
			}
			System.out.println(System.currentTimeMillis() - t);
		}

		{
			System.out.println("String Builder timing..");
			StringBuilder sb = new StringBuilder();
			t = System.currentTimeMillis();
			for (int i = N; i > 0; i--) {
				sb.append("");
			}
			System.out.println(System.currentTimeMillis() - t);
		}
	}
}

public class lab8 {
		public static void main(String [] args) {
			lab8();
		}
		
		public static void lab8() {
			for(int count = 0; count <= 20; count++ ) {
				if( count == 11) {
					System.out.println(count);
					break;
				}
				System.out.println("Normal : " + count);
			}
		}
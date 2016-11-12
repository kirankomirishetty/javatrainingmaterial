/**
 * 
 */

/**
 * @author kiran
 *
 */
public class ArraysExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] i = {1,2,3,4,5}; // One Dimension
		System.out.println("Lenght of the array is "+i.length);
		System.out.println("Element at Index Zero "+i[0]);
		System.out.println("Element at Index One "+i[1]);
		System.out.println("Element at Index Four "+i[4]);
//		System.out.println("Element at Index Five "+i[5]);
		
		int[][] j = {{1,2,3},{3,4,3},{5,6,3},{7,8,3},{9,10,3}};  // Two dimension
		
		System.out.println("Length of the array is "+j.length);
		System.out.println("Element at index Zero is "+j[0][0]+ " Zero one "+j[0][1]);
		System.out.println("Element at index Zero is "+j[1][0]+ " Zero one "+j[1][1]);
		System.out.println("Element at index Zero is "+j[2][0]+ " Zero one "+j[2][1]);
		
		int[][][] k = {
				{
					{1,2},
					{3,4}
				},
				{
					{10,20},
					{30,40}
				},
				{
					{100,200},
					{300,400}
				},
				{
					{1000,2000},
					{3000,4000}
				},
				{
					{10000,20000},
					{30000,4000}
				}
				};
		System.out.println("Length of the array is "+k.length);
		System.out.println("Element at index Zero is "+k[0][0][0]+ " Zero one "+k[0][0][1]);
		System.out.println("Element at index Zero is "+k[0][1][0]+ " Zero one "+k[0][1][1]);
		System.out.println("Element at index Zero is "+k[1][0][0]+ " Zero one "+k[1][0][1]);
	}

}

package lesson10;

public class lesson10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("While Loop Example");
		int i=10;
        while(i>1){
             System.out.println(i);
             i--;
        }
        
        System.out.println("\n Infinite While Loop Example (Not Displayed)");
        /*
        int i2=10;
        while(i2>1)
        {
            System.out.println(i2);
             i2++;
        } */
        
        System.out.println("\n While Loop Array Example");
        int arr[]={2,11,45,9};
        //i starts with 0 as array index starts with 0 too
        int i3=0;
        while(i3<4){
             System.out.println(arr[i3]);
             i3++;
        }
        
        
	}

}

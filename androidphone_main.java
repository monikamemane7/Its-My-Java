package array;

public class androidphone_main {
	
	public static void main(String[] args) {
	
	    androidphone p1 = new androidphone(6.0,4,"black");
	    androidphone p2 = new androidphone(8,6,"red");
        androidphone p3 = new androidphone(5.5 ,4,"blue");
    
    androidphone[] arr = new androidphone[3];
    
    arr[0] = p1;
    arr[1] = p2;
    arr[2] = p3;
    
    
    for (androidphone p : arr)
    {
    	System.out.println("display:" + p.display + "ram:" + p.Ram +"   and color:" + p.color);
    }


	}}

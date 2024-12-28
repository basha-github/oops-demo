public class IsVaildIpAddress {
	public static void main(String[] args) {
		String input = "172.16.254.1.250";
		input = input.replace('.', ' ');
		String[] data = input.split(" ");
		// 172 16 254 1
		int num =0;
		boolean isValid = true;
		if(data.length !=4) isValid=false;
		else {
			for(int i=0;i<data.length;i++) {
				//System.out.print(data[i]+" ");
				num = Integer.parseInt(data[i]);
				if( (num <0) ||(num > 255)) {
					isValid = false;
					break;
				}//if
			}// for
		}
		if(isValid == true) {
			System.out.println("Valid IPv4 Address");
		}
		else {
			System.out.println("Not a Valid IPv4 Address");
		}
	}
}

package huawei.programme.practice;

import java.util.Scanner;

public class MovingCoordinate {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while (sc.hasNextLine()) {
			String coordinates = sc.nextLine();
			String[] coordinate = coordinates.split(";");
			int x = 0;
			int y = 0;
			for (int i = 0; i < coordinate.length; i++) {
				if (isvalid(coordinate[i])) {
					if (coordinate[i].charAt(0) == 'W')
						y += Integer.parseInt(coordinate[i].substring(1));
					else if (coordinate[i].charAt(0) == 'S')
						y -= Integer.parseInt(coordinate[i].substring(1));
					else if (coordinate[i].charAt(0) == 'A')
						x -= Integer.parseInt(coordinate[i].substring(1));
					else
						x += Integer.parseInt(coordinate[i].substring(1));
				}
			}
			System.out.println(x + "," + y);
		}
		sc.close();
	}
	
	public static boolean isvalid(String str){
		str = str.trim();
		if(str == null || str.length() < 2 || str.length() > 3)
			return false;
		if(str.charAt(0) != 'A' && str.charAt(0) != 'W' && str.charAt(0) != 'D' && str.charAt(0) != 'S')
			return false;
		if(str.length() == 3 && (str.charAt(1) < '0' || str.charAt(2) < '0' || str.charAt(1) > '9' || str.charAt(2) > '9'))
			return false;
		if(str.length() ==2 && (str.charAt(1) < '0' || str.charAt(1) >'9'))
			return false;
		return true;
	}
}

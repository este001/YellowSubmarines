import java.util.Scanner;

public class Armada {

	public static Scanner myScanner = new Scanner(System.in);

	public static void main(String[] args) {
		
		IDatabaseService db = new DatabaseService();
		db.readDatabase();
	}
}

//		String ShipName;
//		String Propulsion;
//		String Carrying;
//		String newName;
//		double WeightInTons;
//
//		int shipID;
//
//		System.out.print("Name on boat: ");
//		ShipName = myScanner.nextLine();
//		System.out.print("Motor / Sail: ");
//		Propulsion = myScanner.nextLine();
//		System.out.print("People / Cargo: ");
//		Carrying = myScanner.nextLine();
//		System.out.print("Weight in tons: ");
//		WeightInTons = myScanner.nextDouble();
//
//		// insertIntoDatabase(ShipName, Propulsion, Carrying, WeightInTons);
//
//		System.out.print("Enter Ship ID: ");
//		shipID = myScanner.nextInt();
//
//		printSelectedRow(shipID);
//
//		System.out.print("\nEnter Ship ID: ");
//		shipID = myScanner.nextInt();
//
//		newName = myScanner.nextLine();
//		System.out.print("\nEnter new name: ");
//		newName = myScanner.nextLine();
//
//		updateShipName(shipID, newName);
//		printSelectedRow(shipID);
//
//		myScanner.close();
//	}
//
//	public static void updateShipName(int shipID, String newName) {
//
//		try {
//			Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/fleet", "root",
//					ArmadaCongifReader.usingBufferedReader());
//
//			Statement myStmt = myConn.createStatement();
//			String myQuerry = "update ship set ShipName='" + newName + "' where ShipID = " + shipID;
//			String updString = "update comments set MYUSER='Olle' where id=4";
//			myStmt.executeUpdate(myQuerry);
//
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//	}
//
//
//	public static void printSelectedRow(int shipID) {
//
//		try {
//			Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/fleet", "root",
//					ArmadaCongifReader.usingBufferedReader());
//
//			Statement myStmt = myConn.createStatement();
//			ResultSet myRs = myStmt.executeQuery("select * from ship where ShipID =" + shipID);
//
//
//			while (myRs.next()) {
//
//				System.out.println(myRs.getString(1));
//				System.out.println(myRs.getString(2));
//				System.out.println(myRs.getString(3));
//
//			}
//
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//	}
//
//	public static void insertIntoDatabase(String ShipName, String Propulsion, String Carrying, double WeightInTons) {
//		try {
//			Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/fleet", "root",
//					ArmadaCongifReader.usingBufferedReader());
//
//			String query = " insert into ship (ShipName, Propulsion, Carrying, WeightInTons)"
//					+ " values (?, ?, ?, ?)";
//
//			PreparedStatement preparedStmt = myConn.prepareStatement(query);
//			preparedStmt.setString(1, ShipName);
//			preparedStmt.setString(2, Propulsion);
//			preparedStmt.setString(3, Carrying);
//			preparedStmt.setDouble(4, WeightInTons);
//
//			preparedStmt.execute();
//			myConn.close();
//
//
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//
//			e.printStackTrace();
//		}
//	}
//
//}

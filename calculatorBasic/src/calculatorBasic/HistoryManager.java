package calculatorBasic;

import java.sql.*;
import java.util.ArrayList;

public class HistoryManager {
	// Informasi koneksi database
	private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/calculator_basic";
	private static final String USERNAME = "root";
	private static final String PASSWORD = "";
	
	// Objek Connection untuk penggunaan berulang
	private static Connection conn = null;
	
	// Inisialisasi koneksi database pada saat class di konekkan
	static {
	    try {
	        conn = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	}
	
	/**
	   * Menyimpan riwayat perhitungan ke dalam database.
	   * 
	   * @param expression Ekspresi perhitungan (misal: 2 + 3)
	   * @param result Hasil perhitungan
	   */
	public static void storeHistory(String expression, String result) {
	    try {
	    	// Persiapkan query untuk memasukkan data ke tabel history
	        PreparedStatement statement = conn.prepareStatement("INSERT INTO history (expression, result) VALUES (?, ?)");
	        statement.setString(1, expression); // Set nilai parameter pertama dengan expression
	        statement.setString(2, result); // Set nilai parameter kedua dengan result
	        statement.executeUpdate(); // Jalankan query untuk memasukkan data
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	}
	
	/**
	   * Mengambil riwayat perhitungan dari database.
	   * 
	   * @return ArrayList berisi gabungan ekspresi dan hasil perhitungan, dipisahkan tanda sama dengan (=)
	   */
	public static ArrayList<String> fetchHistory() {
	    ArrayList<String> historyList = new ArrayList<>();
	    // Persiapkan query untuk mengambil data dari tabel history
	    try {
	        PreparedStatement statement = conn.prepareStatement("SELECT expression, result FROM history ORDER BY history_id DESC");
	        ResultSet resultSet = statement.executeQuery();

	        while (resultSet.next()) {
	            String expression = resultSet.getString("expression");
	            String result = resultSet.getString("result");
	            
	            // Gabungkan ekspresi dan hasil perhitungan dengan tanda sama dengan (=)
	            String combinedHistory = expression + " = " + result;
	            historyList.add(combinedHistory);
	        }
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	    return historyList;
	}
}

package com.apress.springrecipes.vehicle;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

public class JdbcVehicleDao implements VehicleDao {
	private DataSource dataSource;

	public void insert(Vehicle vehicle) {
		String sql="insert into vehicle (vehicle_No,color, wheel,seat) values (?,?,?,?)";
		Connection conn = null;
		
		try {
			conn = dataSource.getConnection();
			PreparedStatement pst = conn.prepareStatement(sql);
			
			pst.setString(1, vehicle.getVehicleNo());
			pst.setString(2, vehicle.getColor());
			pst.setInt(3, vehicle.getWheel());
			pst.setInt(4, vehicle.getSeat() );
			
			pst.executeUpdate();
			pst.close();
		} catch (SQLException e) {
			 e.printStackTrace(); 	}
		
	}

	public DataSource getDataSource() {
		return dataSource;
	}

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

}

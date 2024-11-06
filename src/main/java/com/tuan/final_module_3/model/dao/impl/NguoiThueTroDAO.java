package com.tuan.final_module_3.model.dao.impl;

import com.tuan.final_module_3.model.connection.JDBCConnection;
import com.tuan.final_module_3.model.dao.INguoiThueTroDAO;
import com.tuan.final_module_3.model.entity.NguoiThueTro;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class NguoiThueTroDAO implements INguoiThueTroDAO {

    @Override
    public List<NguoiThueTro> findAll() {
        List<NguoiThueTro> nguoiThueTroList = null;
        Connection connection = JDBCConnection.getConnection();
        if (connection != null) {
            try {
                PreparedStatement preparedStatement = connection.prepareStatement("SELECT*FROM phong_tro pt INNER JOIN hinh_thuc_thanh_toan ht ON pt.ma_hinh_thuc_tt = ht.ma_hinh_thuc_tt;");
                ResultSet resultSet = preparedStatement.executeQuery();
                nguoiThueTroList = new ArrayList<>();
                while (resultSet.next()) {
                    int maPhong = resultSet.getInt("ma_phong");
                    String tenNguoiThue = resultSet.getString("ten_nguoi_thue");
                    String sdt = resultSet.getString("so_dien_thoai");
                    Date ngayBatDau = resultSet.getDate("ngay_bat_dau_thue");
                    String hinhThucThanhToan = resultSet.getString("ten_hinh_thuc_tt");
                    String ghiChu = resultSet.getString("ghi_chu");
                    nguoiThueTroList.add(new NguoiThueTro(maPhong, tenNguoiThue, sdt, ngayBatDau, hinhThucThanhToan, ghiChu));
                }
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
        return nguoiThueTroList;

    }

    @Override
    public void insert(NguoiThueTro nguoiThueTro) {

    }


    @Override
    public void deleteUserById(int maPhong) {
        Connection connection = JDBCConnection.getConnection();
        if (connection != null) {
            PreparedStatement preparedStatement = null;
            try {
                preparedStatement = connection.prepareStatement(
                        "DELETE FROM phong_tro WHERE ma_phong = ?;");
                System.out.println(preparedStatement);
                preparedStatement.setInt(1, maPhong);
                preparedStatement.executeUpdate();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}

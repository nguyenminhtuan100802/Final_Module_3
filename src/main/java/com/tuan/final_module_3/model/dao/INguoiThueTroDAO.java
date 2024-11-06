package com.tuan.final_module_3.model.dao;

import com.tuan.final_module_3.model.entity.NguoiThueTro;

import java.util.List;

public interface INguoiThueTroDAO {
    List<NguoiThueTro> findAll();
    void insert(NguoiThueTro nguoiThueTro);
    void deleteUserById(int maPhong);

}

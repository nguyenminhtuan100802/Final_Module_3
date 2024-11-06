package com.tuan.final_module_3.model.service;

import com.tuan.final_module_3.model.entity.NguoiThueTro;

import java.util.List;

public interface INguoiThueTroService {
    List<NguoiThueTro> findAll();
    void deleteUserById(int maPhong);

}

package com.tuan.final_module_3.model.service.impl;

import com.tuan.final_module_3.model.dao.INguoiThueTroDAO;
import com.tuan.final_module_3.model.dao.impl.NguoiThueTroDAO;
import com.tuan.final_module_3.model.entity.NguoiThueTro;
import com.tuan.final_module_3.model.service.INguoiThueTroService;

import java.util.List;

public class NguoiThueTroService implements INguoiThueTroService {
    INguoiThueTroDAO nguoiThueTroDAO = new NguoiThueTroDAO();
    @Override
    public List<NguoiThueTro> findAll() {
        return nguoiThueTroDAO.findAll();
    }

    @Override
    public void deleteUserById(int maPhong) {
        nguoiThueTroDAO.deleteUserById(maPhong);
    }
}

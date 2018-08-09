package com.example.demo.service;

import com.example.demo.entity.InvoiceInfo;
import com.example.demo.repository.IInvoiceDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Service
@Transactional
public class InvoiceService {

    @Autowired
    private IInvoiceDAO dao;

    public List<InvoiceInfo> getInvoiceInfo(String fpqqlsh){
        return dao.queryInvoiceInfo(fpqqlsh);
    }

    public int addInvoiceInfo(InvoiceInfo info){
        int header = dao.insertInvoiceHeader(info);
        int detail = dao.insertInvoiceDetail(info.getDetailList());
        return header + detail;
    }

    public int deleteInvoiceInfo(String fpqqlsh){
        return dao.deleteInvoiceInfo(fpqqlsh);
    }

    public int updateInvoiceInfo(Map paraMap){
        return dao.updateInvoiceInfo(paraMap);
    }
}

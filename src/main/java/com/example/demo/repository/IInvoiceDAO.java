package com.example.demo.repository;

import com.example.demo.entity.InvoiceDetail;
import com.example.demo.entity.InvoiceInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.cache.annotation.Cacheable;

import java.util.List;
import java.util.Map;

@Mapper
public interface IInvoiceDAO {

    /**
     * 根据发票请求流水号查询发票信息
     */

    public List<InvoiceInfo> queryInvoiceInfo(@Param("fpqqlsh") String fpqqlsh);

    /**
     * 插入发票头
     */
    public int insertInvoiceHeader(InvoiceInfo info);

    /**
     * 插入发票明细
     */
    public int insertInvoiceDetail(List<InvoiceDetail> detail);

    /**
     * 根据发票请求流水号删除发票信息
     */
    public int deleteInvoiceInfo(@Param("fpqqlsh") String fpqqlsh);

    /**
     * 修改发票信息
     */
    public int updateInvoiceInfo(Map paramMap);
}

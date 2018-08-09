package com.example.demo.repository;

import com.example.demo.entity.InvoiceDetail;
import com.example.demo.entity.InvoiceInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;

import java.util.List;
import java.util.Map;

@Mapper
@CacheConfig(cacheNames = "InvoiceInfo")
public interface IInvoiceDAO {

    /**
     * 根据发票请求流水号查询发票信息
     */
    @Cacheable(key = "#p0" )
    public List<InvoiceInfo> queryInvoiceInfo(@Param("fpqqlsh") String fpqqlsh);

    /**
     * 插入发票头
     */
    @CacheEvict(key = "#p0.fpqqlsh")
    public int insertInvoiceHeader(InvoiceInfo info);

    /**
     * 插入发票明细
     */
    @CacheEvict(key = "#p0.fpqqlsh")
    public int insertInvoiceDetail(List<InvoiceDetail> detail);

    /**
     * 根据发票请求流水号删除发票信息
     */
    @CacheEvict(key = "#p0")
    public int deleteInvoiceInfo(@Param("fpqqlsh") String fpqqlsh);

    /**
     * 修改发票信息
     */
    public int updateInvoiceInfo(Map paramMap);
}

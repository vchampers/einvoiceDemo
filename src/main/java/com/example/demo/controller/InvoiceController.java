package com.example.demo.controller;

import com.example.demo.entity.InvoiceInfo;
import com.example.demo.service.InvoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
public class InvoiceController {

    @Autowired
    private InvoiceService service;

    @Cacheable(cacheNames = "InvoiceInfo", key = "#fpqqlsh" )
    @RequestMapping(value = "/queryInvoiceInfo", method = RequestMethod.GET)
    public @ResponseBody List<InvoiceInfo> getInvoiceInfo(@RequestParam String fpqqlsh){
        return service.getInvoiceInfo(fpqqlsh);
    }

    @RequestMapping(value = "/deleteInvoiceInfo", method = RequestMethod.POST)
    public @ResponseBody int deleteInvoiceInfo(@RequestParam String fpqqlsh){
        return service.deleteInvoiceInfo(fpqqlsh);
    }

    @RequestMapping(value = "/addInvoiceInfo", method = RequestMethod.POST)
    public @ResponseBody int addInvoiceInfo(@RequestParam InvoiceInfo info){
        return service.addInvoiceInfo(info);
    }

    @RequestMapping(value = "/updateInvoiceInfo", method = RequestMethod.POST)
    public @ResponseBody int updateInvoiceInfo(@RequestParam Map param){
        return service.updateInvoiceInfo(param);
    }
}

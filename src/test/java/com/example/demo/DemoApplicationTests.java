package com.example.demo;

import com.example.demo.entity.InvoiceDetail;
import com.example.demo.entity.InvoiceInfo;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {
    private static final Logger log = LoggerFactory.getLogger(DemoApplication.class);

	@Test
	public void contextLoads() {
	}

	private MockMvc mockMvc;

	@Autowired
	private WebApplicationContext wac;

	@Before
	public void setup(){
		this.mockMvc = MockMvcBuilders.webAppContextSetup(this.wac).build();
	}

	@Test
	public void testQuery() throws Exception {
        RequestBuilder request = MockMvcRequestBuilders.get("/queryInvoiceInfo")
                .param("fpqqlsh","1000000001")
                .contentType(MediaType.APPLICATION_JSON_UTF8);
        MvcResult result = mockMvc.perform(request).andReturn();
        String content = result.getResponse().getContentAsString();
        log.info(content);
	}

	@Test
    public void testDelete() throws  Exception {
	    RequestBuilder request = MockMvcRequestBuilders.post("/deleteInvoiceInfo")
                .param("fpqqlsh", "1000000005")
                .contentType(MediaType.APPLICATION_JSON_UTF8);
        MvcResult result = mockMvc.perform(request).andReturn();
        String content = result.getResponse().getContentAsString();
        log.info(content);
    }

//	@Test
//	public void testInsert() throws  Exception {
//		List<InvoiceDetail> detailList = new ArrayList<>();
//		detailList.add(new InvoiceDetail("项目名称006", 34, 0.13,
//				"20006", "1000000003"));
//		InvoiceInfo invoiceInfo = new InvoiceInfo("1000000003", "0000000002",
//				"名称002", "名称103", "100", detailList);
//		//JSONObject jsonObject = JSONObject.fromObject(invoiceInfo);
//		ObjectMapper mapper = new ObjectMapper();
//		ObjectWriter ow = mapper.writer().withDefaultPrettyPrinter();
//		java.lang.String requestJson = ow.writeValueAsString(invoiceInfo);
//		RequestBuilder request = MockMvcRequestBuilders.post("/addInvoiceInfo")
//				.content(requestJson)
//				.contentType(MediaType.APPLICATION_JSON_UTF8);
//		MvcResult result = mockMvc.perform(request).andReturn();
//		String content = result.getResponse().getContentAsString();
//		log.info(content);
//	}
//
//	@Test
//	public void testUpdate() throws  Exception {
//		RequestBuilder request = MockMvcRequestBuilders.post("/deleteInvoiceInfo")
//				.param("fpqqlsh", "1000000005")
//				.contentType(MediaType.APPLICATION_JSON_UTF8);
//		MvcResult result = mockMvc.perform(request).andReturn();
//		String content = result.getResponse().getContentAsString();
//		log.info(content);
//	}
}

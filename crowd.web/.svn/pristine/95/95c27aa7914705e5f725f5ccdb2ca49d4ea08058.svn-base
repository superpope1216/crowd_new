package com.wisedu.crowd.webSocket;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.socket.TextMessage;

import com.wisedu.crowd.service.dto.DataResult;

@Controller
@RequestMapping("messages")
public class SendMessageController {
	@Autowired
    MyHandler handler;

	
	@RequestMapping("sendMessage")
	@ResponseBody
	public DataResult<String> sendMessage(){
		 boolean hasSend = handler.sendMessageToUser("9389e0ff8bfd4d97b5156bd23ced22d4", new TextMessage("发送一条小xi"));
	      System.out.println(hasSend);
	      return DataResult.success("1");
	}
}

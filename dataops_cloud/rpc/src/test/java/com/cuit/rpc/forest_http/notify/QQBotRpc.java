//package com.cuit.common.rpc.forest_http.notify;
//
//
//import com.cuit.common.pojo.notify.Message;
//import com.dtflys.forest.annotation.BaseRequest;
//import com.dtflys.forest.annotation.JSONBody;
//import com.dtflys.forest.annotation.Request;
//import org.springframework.stereotype.Component;
//
///**
// * @author dailinfeng
// */
//@Component
//@BaseRequest(
//        baseURL = "${notifyUrl}"   // 默认域名
//)
//public interface QQBotRpc {
//    /**
//     * @param message 消息体
//     * @return
//     */
//    @Request(url = "/send_private_msg", type = "post")
//    void nodityUser(@JSONBody Message message);
//}

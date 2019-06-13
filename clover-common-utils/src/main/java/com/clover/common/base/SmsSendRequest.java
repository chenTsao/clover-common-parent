package com.clover.common.base;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 普通短信发送实体类
 * @author dingpengfei
 * @date 2019-05-08 22:42
 */
@Data@NoArgsConstructor@AllArgsConstructor
public class SmsSendRequest {
  /** 用户账号，必填 */
  private String account;

  /** 用户密码，必填 */
  private String password;

  /** 短信内容。长度不能超过536个字符，必填 */
  private String msg;

  /** 机号码。多个手机号码使用英文逗号分隔，必填 */
  private String phone;

  /** 定时发送短信时间。格式为yyyyMMddHHmm，值小于或等于当前时间则立即发送，默认立即发送，选填 */
  private String sendtime;

  /** 是否需要状态报告（默认false），选填 */
  private String report;

  /** 下发短信号码扩展码，纯数字，建议1-3位，选填 */
  private String extend;

  /** 该条短信在您业务系统内的ID，如订单号或者短信发送记录流水号，选填 */
  private String uid;



  public SmsSendRequest(String account, String password, String msg, String phone, String report) {
    super();
    this.account = account;
    this.password = password;
    this.msg = msg;
    this.phone = phone;
    this.report = report;
  }


}

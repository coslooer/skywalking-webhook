package com.example.webhook;

import jdk.nashorn.internal.ir.annotations.Ignore;
import lombok.Data;
@Data
public class SwAlarmDTO {

    private String scopeId;
    private String scope;
    private String name;
    private String id0;
    private String id1;
    private String ruleName;
    private String alarmMessage;
    private Long startTime;
}

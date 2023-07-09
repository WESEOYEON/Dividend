package com.dayone.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
// getter, setter, toString 등.. -> lombok 기능을 모두 포함한 어노테이션 (객체간 비교연산이 중요한 상황에서는 data 어노테이션 지양)
@NoArgsConstructor
@AllArgsConstructor
//builder 패턴을 사용할 수 있도록,,
//일부 변수만 세팅해줄 수 있음

public class Company {

    private String ticker;
    private String name;

}

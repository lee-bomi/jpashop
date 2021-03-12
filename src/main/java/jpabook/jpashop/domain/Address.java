package jpabook.jpashop.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Embeddable;

@Embeddable          //새로운 값타입을 정의
@Getter @Setter
public class Address {

    private String city;
    private String street;
    private String zipcode;
}

package jpabook.jpashop.domain.item;

import jpabook.jpashop.domain.Item;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@DiscriminatorValue("B")   //DB에 넣을때 구분해야하는 값
@Getter @Setter
public class Book extends Item {

    private String author;
    private String isbn;

}

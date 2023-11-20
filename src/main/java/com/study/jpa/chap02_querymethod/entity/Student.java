package com.study.jpa.chap02_querymethod.entity;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.rmi.server.UID;
import java.util.UUID;

@Setter // 실무적 측면에서 setter는 신중하게 선택할 것!
@Getter @Builder
@ToString @EqualsAndHashCode(of = "id") // id 가 같으면 같은 객체로 인식. 여러 개를 주고 싶으면 {"id" , "name"}
@NoArgsConstructor @AllArgsConstructor
@Entity
@Table(name = "tbl_student")
public class Student {

    @Id
    @Column(name = "stu_id")
    @GeneratedValue(generator = "uid")
    @GenericGenerator(strategy = "uuid", name="uid")
    private String id;

    @Column(name = "stu_name", nullable = false)
    private String name;

    private String city;

    private String major;
}

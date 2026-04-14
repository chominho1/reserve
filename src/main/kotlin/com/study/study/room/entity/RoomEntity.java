package com.study.study.room.entity;


import com.study.study.room.type.RoomState;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;

import java.util.Date;


@Entity
@Table(name = "STUDY_ROOM")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class RoomEntity {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "BRANCH_ID")
    private long branchId;

    @Column(name = "NAME")
    private String name;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "CAPACITY")
    private long capacity;

    @Column(name = "HOURLY_PRICE")
    private long hourlyPrice;

    @Enumerated(EnumType.STRING)
    @Column(name = "STATE")
    private RoomState state;

    @CreatedDate
    private Date createAt;

    @CreatedDate
    private Date updateAt;
}

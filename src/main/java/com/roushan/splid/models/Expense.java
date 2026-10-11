package com.roushan.splid.models;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Builder
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Expense extends BaseEntity {


    private String description;

    @Column(name = "total_amount")
    private Double totalAmount;

    @Column(name = "split_type")
    @Enumerated(EnumType.STRING)
    private SplitType splitType;

    @ManyToOne
    @JoinColumn(name = "group_id")
    private ExpenseGroup group;

    @ManyToOne
    @JoinColumn(name = "created_by_id")
    private User createdBy;

    @OneToMany(mappedBy = "expense", cascade = CascadeType.ALL)
    @JsonManagedReference
    private List<Split> splits = new ArrayList<>();

    @Transient
    private List<Long> userIds;


}

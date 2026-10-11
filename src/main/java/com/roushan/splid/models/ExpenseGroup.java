package com.roushan.splid.models;

import jakarta.persistence.*;
import lombok.*;
import java.util.List;

@Getter
@Setter
@Builder
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class ExpenseGroup extends BaseEntity {

    @Column(name = "name", nullable = false)
    private String name;

    @ManyToOne
    @JoinColumn(name = "owner")
    private User owner;

    @ManyToMany
    @JoinTable(
            name = "expense_group_members",
            joinColumns = @JoinColumn(name = "expense_group_id"),
            inverseJoinColumns = @JoinColumn(name = "member_id")
    )
    private List<User> members;


}

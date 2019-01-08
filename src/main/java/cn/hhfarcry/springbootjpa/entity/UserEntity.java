package cn.hhfarcry.springbootjpa.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

/**
 * @program: springbootjpa
 * @description: ${description}
 * @author: huanghong
 * @date: 2019-01-07 17:33
 */
@Entity
@NoArgsConstructor
@Table(name="t_user")
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    @Setter@Getter
    private Long id;

    @Column
    @Setter@Getter
    private String name;

    public UserEntity(String name) {
        this.name = name;
    }
}


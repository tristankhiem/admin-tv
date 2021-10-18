package tranvivan.phanlop.quanlysinhvien.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "student")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Student {
    @Id
    private String id;
    private String name;
    private String phone;
    private String email;
}

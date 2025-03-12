package br.com.senac.sp.Aula1.domainmodel;

import jakarta.persistence.*;
import lombok.*;

import java.util.Objects;

@AllArgsConstructor
@NoArgsConstructor
@Data
//cria construtor/ getter e setter para todos os atributos
@ToString
@Entity
@Table(name = "USERS")



public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private @Getter @Setter  Long id;
    private String name;
    private String username;
    private String password;
    @Override



    public int hashCode() {
        return Objects.hashCode(id);
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(id, user.id);
    }

}

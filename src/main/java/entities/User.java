package entities;

import javax.persistence.Column;
import javax.persistence.Table;
import lombok.Data;
import org.hibernate.annotations.Entity;

import javax.persistence.Id;
import java.util.UUID;

@Entity
@Data
@Table(name = "users")
public class User {

  @Id
  @Column(name = "id")
  private UUID id;
  @Column(name = "name")
  private String name;
  @Column(name = "login")
  private String login;
  @Column(name = "password")
  private String password;
}

package User;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class User {
    @Id@GeneratedValue(strategy = GenerationType.UUID)
    private long id;
}

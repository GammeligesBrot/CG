package de.thowl.Anmeldung;

    import jakarta.persistence.Entity;
    import jakarta.persistence.GeneratedValue;
    import jakarta.persistence.GenerationType;
    import jakarta.persistence.Id;
    import jakarta.persistence.Table;
    import lombok.Data;
    import lombok.NoArgsConstructor;
    import lombok.NonNull;
    import lombok.RequiredArgsConstructor;
    
    @Data
    @Entity
    @Table(name = "Users")
    @NoArgsConstructor
    @RequiredArgsConstructor
    public class User {
    
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private long id;
    
        @NonNull
        private String firstname;
    
        @NonNull
        private String lastname;
    
        @NonNull
        private String username;
    
        @NonNull
        private String email;
    
        @NonNull
        private String password;
}

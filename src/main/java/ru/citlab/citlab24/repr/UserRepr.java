package ru.citlab.citlab24.repr;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.ToString;
import ru.citlab.citlab24.model.User;

@Data
@ToString
@RequiredArgsConstructor
public class UserRepr {

    private Long id;

    @NotEmpty
    private String password;

    @Size(min = 3, message = "Имя слишком короткое")
    private String userName;

    public UserRepr(User user) {
        this.id = user.getId();
        this.password = user.getPassword();
        this.userName = user.getUserName();
    }
}

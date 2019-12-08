package com.chanhyeong.auth.infra.database;

import com.chanhyeong.auth.model.user.*;
import org.springframework.data.repository.*;

public interface UserRepository extends CrudRepository<User, Long> {
}

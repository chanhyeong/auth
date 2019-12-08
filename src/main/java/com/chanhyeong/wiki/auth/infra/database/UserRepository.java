package com.chanhyeong.wiki.auth.infra.database;

import com.chanhyeong.wiki.auth.model.user.*;
import org.springframework.data.repository.*;

public interface UserRepository extends CrudRepository<User, Long> {
}

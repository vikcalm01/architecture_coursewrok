package com.misis.archapp.user.service.cache;

import com.misis.archapp.user.dto.UserDTO;
import org.springframework.stereotype.Service;
import java.util.Optional;
import java.util.UUID;

@Service
public class UserCacheService {
    public Optional<UserDTO> getFromCache(UUID id) { return Optional.empty(); }
    public void saveToCache(UserDTO user) {}
    public void removeFromCache(UUID id) {}
}
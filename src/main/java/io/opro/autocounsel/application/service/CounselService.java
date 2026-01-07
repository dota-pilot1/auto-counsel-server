package io.opro.autocounsel.application.service;

import io.opro.autocounsel.domain.model.CounselMessage;
import io.opro.autocounsel.domain.repository.CounselRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CounselService {
    private final CounselRepository counselRepository;

    public CounselMessage getHello() {
        return counselRepository.getHelloMessage();
    }
}

package io.opro.autocounsel.application.service;

import io.opro.autocounsel.domain.model.CounselMessage;
import io.opro.autocounsel.infrastructure.persistence.mybatis.CounselMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CounselService {
    private final CounselMapper counselMapper;

    public CounselMessage getHello() {
        return counselMapper.getHelloMessage();
    }
}

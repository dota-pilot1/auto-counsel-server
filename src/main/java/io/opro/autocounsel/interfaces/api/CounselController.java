package io.opro.autocounsel.interfaces.api;

import io.opro.autocounsel.application.service.CounselService;
import io.opro.autocounsel.domain.model.CounselMessage;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class CounselController {
    private final CounselService counselService;

    @GetMapping("/hello")
    public CounselMessage hello() {
        return counselService.getHello();
    }
}

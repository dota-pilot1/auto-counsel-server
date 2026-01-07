package io.opro.autocounsel.infrastructure.persistence.mybatis;

import io.opro.autocounsel.domain.model.CounselMessage;
import io.opro.autocounsel.domain.repository.CounselRepository;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface CounselMapper extends CounselRepository {
    @Override
    @Select("SELECT message FROM counsels LIMIT 1")
    CounselMessage getHelloMessage();
}

package io.opro.autocounsel.infrastructure.persistence.mybatis;

import io.opro.autocounsel.domain.model.CounselMessage;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface CounselMapper {
    @Select("SELECT 'Hello World from Database!' as message")
    CounselMessage getHelloMessage();
}

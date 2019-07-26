package leilei.springboot.mapper;

import leilei.springboot.pojo.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface StudentMapper {

    @Select("SELECT * FROM student")
    List<Student> findAll();
}

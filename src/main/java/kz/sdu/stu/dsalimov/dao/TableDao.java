package kz.sdu.stu.dsalimov.dao;

import kz.sdu.stu.dsalimov.dto.db.TableDetails;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface TableDao {
    String TABLE_NAME = "table_details";

    @Select("SELECT uuid, floor, internal_id as internalId, temporary_key as temporaryKey FROM table_details")
    List<TableDetails> getTables();

    @Select("select * from " + TABLE_NAME + " where uuid = #{uuid}")
    TableDetails findById(String uuid);

    @Insert("INSERT INTO table_details (uuid, floor, internalId, temporaryKey) VALUES (#{uuid}, #{floor}, #{internalId}, #{temporaryKey})")
    String insert(TableDetails table);

    @Delete("DELETE FROM table_details WHERE uuid = #{uuid}")
    boolean delete(String uuid);
}

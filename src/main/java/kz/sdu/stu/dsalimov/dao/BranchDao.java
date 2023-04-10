package kz.sdu.stu.dsalimov.dao;

import kz.sdu.stu.dsalimov.dto.db.Branch;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface BranchDao {
    @Select(//language=PostgreSQL
            "SELECT * FROM branches")
    List<Branch> findAll();

    @Select(//language=PostgreSQL
            "SELECT * FROM branches WHERE uuid = #{uuid}")
    Branch findByUuid(String uuid);

    @Insert(//language=PostgreSQL
            "INSERT INTO branches (uuid, name, address, admin_uuid, company_id) VALUES (#{uuid}, #{name}, #{address}, #{adminUuid}, #{companyId})")
    void insert(Branch branch);

    @Update(//language=PostgreSQL
            "UPDATE branches SET name = #{name}, address = #{address}, admin_uuid = #{adminUuid}, company_id = #{companyId} WHERE uuid = #{uuid}")
    void update(Branch branch);

    @Delete(//language=PostgreSQL
            "DELETE FROM branches WHERE uuid = #{uuid}")
    void deleteByUuid(String uuid);

    @Update(//language=PostgreSQL
            "UPDATE branches SET name = #{name} WHERE uuid = #{uuid}")
    void updateName(@Param("uuid") String uuid, @Param("name") String name);

    @Update(//language=PostgreSQL
            "UPDATE branches SET address = #{address} WHERE uuid = #{uuid}")
    void updateAddress(@Param("uuid") String uuid, @Param("address") String address);

    @Update(//language=PostgreSQL
            "UPDATE branches SET admin_uuid = #{adminUuid} WHERE uuid = #{uuid}")
    void updateAdminUuid(@Param("uuid") String uuid, @Param("adminUuid") String adminUuid);

    @Update(//language=PostgreSQL
            "UPDATE branches SET company_id = #{companyId} WHERE uuid = #{uuid}")
    void updateCompanyId(@Param("uuid") String uuid, @Param("companyId") String companyId);

}

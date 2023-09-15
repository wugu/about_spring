package com.it;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface AccountDao {
    @Insert("insert into user(name,money)values(#{name},#{money})")
    void save(Account account);
    @Delete("delete from user where id = #{id}")
    void delete(Integer id);
    @Update("update user set name = #{name} , money = #{money} where id = #{id}")
    void update(Account account);
    @Select("select * form user")
    List<Account> findAll();
    @Select("select * form user where id = #{id]")
    Account findById(Integer id);
}

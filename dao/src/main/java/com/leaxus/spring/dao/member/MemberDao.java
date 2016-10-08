package com.leaxus.spring.dao.member;

import com.leaxus.spring.model.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by leaxus on 2016/9/29.
 */
@Repository
public interface MemberDao extends JpaRepository<Member,Long> {


    Member  findByNickName(String nickname);
    List<Member> findAll();

//    SysUser findBySysUserId(Long sysUserId);

//    SysUser findBySysUserLoginName(String sysUserLoginName);
//
//    //使用了 Distinct 关键字 和 or 关键字
//    List<SysUser> findDistinctSysUserBySysUserLoginNameOrSysUserId(String sysUserLoginName, Long sysUserId);
//
//    //使用了 and 关键字
//    List<SysUser> findSysUserBySysUserLoginNameAndSysUserId(String sysUserLoginName, Long sysUserId);
//
//
//    // 使用了 Order by 进行排序（正序）
//    List<SysUser> findBySysUserIsDeleteOrderBySysUserIdAsc(String sysUserIsDelete);
//
//    // 使用了 Order by 进行排序（倒序）
//    List<SysUser> findBySysUserIsDeleteOrderBySysUserIdDesc(String sysUserIsDelete);
//
//    // 使用了 Top ，取出结果集的第一个，使用 First 也可以，效果一样
//    SysUser findTopBySysUserIsDeleteOrderBySysUserIdDesc(String sysUserIsDelete);
//
//
//    Page<SysUser> findBySysUserIsDeleteOrderBySysUserIdDesc(String sysUserIsDelete, Pageable pageable);
//
//    List<SysUser> findBySysUserIsDelete(String sysUserIsDelete, Pageable pageable);
//
//    List<SysUser> findBySysUserIsDelete(String sysUserIsDelete, Sort sort);
//
//    // 使用了 Top 2，取出结果集的前2个，使用 First 也可以，效果一样
//    List<SysUser> findTop2BySysUserIsDelete(String sysUserIsDelete, Sort sort);
//
//    // 删除操作
//    void deleteBySysUserId(Long sysUserId);
//
//
//    //小于 生成的JQL:where sysUserIsDelete < ?1
//    List<SysUser> findBySysUserIsDeleteLessThan(String sysUserIsDelete);
//
//    //大于 生成的JQL:where sysUserIsDelete > ?1
//    List<SysUser> findBySysUserIsDeleteGreaterThan(String sysUserIsDelete);
//
//    //is null 生成的JQL:where sysUserIsDelete is null
//    List<SysUser> findBySysUserIsDeleteIsNull(String sysUserIsDelete);
//
//    //like 生成的JQL:where sysUserIsDelete like ?1
//    List<SysUser> findBySysUserIsDeleteLike(String sysUserIsDelete);
//
//
//    //使用二级缓存
//    @Query(value = "select u from SysUser u where u.sysUserIsDelete = ?1")
//    @QueryHints(value = {@QueryHint(name = "org.hibernate.cacheable", value = "true")})
//    List<SysUser> findIsNotDeleteUserListToTestEhCache(String sysUserIsDelete);
//
//
//    @Modifying//如果是更新操作，需要写这个标识
//    @Query("update SysUser u set u.sysUserLoginName = ?1,u.sysUserEmail = ?2 where u.sysUserMobile = ?3 ")
//    int updateSysUserBySysUserMobile(String sysUserLoginName, String sysUserEmail, String sysUserMobile);

}

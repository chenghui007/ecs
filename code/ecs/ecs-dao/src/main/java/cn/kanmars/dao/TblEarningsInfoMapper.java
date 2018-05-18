/**
 * ecm Generator 
 */
package cn.kanmars.dao;


import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import java.util.HashMap;

import cn.kanmars.entity.TblEarningsGather;
import cn.kanmars.entity.TblEarningsInfo;
/**
 * 收益表
 * tbl_earnings_info
 */
@cn.kanmars.MybatisRepository
public interface TblEarningsInfoMapper {
    /**
     * 查询单个对象
     */
    public TblEarningsInfo select(TblEarningsInfo tblEarningsInfo);

    /**
     * 查询一个对象列表
     */
    public List<TblEarningsInfo> selectList(TblEarningsInfo tblEarningsInfo);

    /**
     * 查询一个对象列表(分页)
     */
    public List<TblEarningsInfo> selectpage(TblEarningsInfo tei);
    
    /**
     * 新增对象，返回增加的数量
     */
    public int insert(TblEarningsInfo tblEarningsInfo);

    /**
     * 通过主键修改对象，返回修改的数量，主键不可修改
     */
    public int updateByPrimaryKey(TblEarningsInfo tblEarningsInfo);

    /**
     * 删除对象，返回删除的数量
     */
    public int delete(TblEarningsInfo tblEarningsInfo);

    /**
     * 查询一个对象HashMap，字段未驼峰化
     */
    public HashMap queryOneMap(HashMap paramMap);

    /**
     * 查询一个对象List<HashMap>，字段未驼峰化
     */
    public List<HashMap> queryListMap(HashMap paramMap);

    /**
     * 原子性更新一个对象，主键不可修改
     */
    public int updateCAS(HashMap paramMap);

    /**
     * 分页查询
     * 参数有两种情况：
     *     1、传递countFlag=Y标记,则返回的是计数
     *     2、传递countFlag=N标记、limitStart、limitSize,则返回的是分页结果,字段未驼峰化
     */
    public List<HashMap> queryForPage(HashMap paramMap);

    /**
     * 批量插入,如果是mysql数据库，需要在jdbcUrl中设置allowMultiQueries=true参数才可以使用
     * 如果为MYSQL数据库，返回值为插入条数，如果为ORACLE，返回值为第一条更新语句的指定结果，并非所有批量插入的总影响行数
     */
    public int insertBatch(List<HashMap> tblEarningsInfo);

    /**
     * 批量更新,如果是mysql数据库，需要在jdbcUrl中设置allowMultiQueries=true参数才可以使用
     * 返回值为第一条更新语句的执行结果，并非所有批量更新的语句总和
     */
    public int updateBatch(List<HashMap> tblEarningsInfo);

    /**
     * 根据主键查询单个对象
     */
    public TblEarningsInfo selectByPrimaryKey(String id);

    /**
     * editInfo，空的update语句
     */
    public int editInfo(HashMap paramMap);

	public void insetEarningsInfo(TblEarningsInfo tei);

	public TblEarningsInfo queryEarningsInfo(@Param("id") String id);

	public void updEarningsInfo(TblEarningsInfo tei);

	public void delEarningsInfo(@Param("ids")String ids);

	public List<TblEarningsInfo> detailEdearningsInfo(String openid);
//	收益明细
	public List<TblEarningsInfo> shouyimingxi(String openid);
//月
	public List<TblEarningsInfo> shouyimingxiyue(@Param("openid") String openid,@Param("yuekai") String yuekai,@Param("yuejie") String yuejie);
//日
	public List<TblEarningsInfo> shouyimingxiyueri(@Param("openid") String openid,@Param("rikai") String rikai,@Param("rijie") String rijie);

    
}


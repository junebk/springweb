package com.spring.deptdao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.spring.deptvo.DeptVO;

@Repository
public class DeptMapperImpl implements DeptMapper {
	@Inject
	private SqlSession sqlSession;

	private static final String namespace = "com.spring.deptdao.DeptMapper";

	@Override
	public List<DeptVO> listDepartment(DeptVO param) {
		// TODO Auto-generated method stub
		return sqlSession.selectList(namespace + ".listDepartment", param);
	}

	@Override
	public DeptVO selectDepartment(String deptid) {
		// TODO Auto-generated method stub
		return sqlSession.selectOne(namespace + ".selectDepartment", deptid);
	}

	@Override
	public int insertDepartment(DeptVO param) {
		// TODO Auto-generated method stub
		return sqlSession.insert(namespace + ".insertDepartment", param);
	}

	@Override
	public int updateDepartment(DeptVO param) {
		// TODO Auto-generated method stub
		return sqlSession.update(namespace + ".updateDepartment", param);
	}

	@Override
	public int deleteDepartment(DeptVO param) {
		// TODO Auto-generated method stub
		return sqlSession.delete(namespace + ".deleteDepartment", param);
	}

}

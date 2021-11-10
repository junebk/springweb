package com.spring.deptservice;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spring.deptdao.DeptMapper;
import com.spring.deptvo.DeptVO;

@Service
@Transactional
public class DeptServiceImpl implements DeptService {

	@Autowired
	private DeptMapper deptMapper;

	@Override
	public List<DeptVO> listDepartment(DeptVO param) {
		List<DeptVO> list = new ArrayList<DeptVO>();
		list = deptMapper.listDepartment(param);
		return list;
	}

	@Override
	public DeptVO selectDepartment(String deptid) {
		// TODO Auto-generated method stub
		return deptMapper.selectDepartment(deptid);
	}

	@Override
	public int insertDepartment(DeptVO param) {
		// TODO Auto-generated method stub
		return deptMapper.insertDepartment(param);
	}

	@Override
	public int updateDepartment(DeptVO param) {
		// TODO Auto-generated method stub
		return deptMapper.updateDepartment(param);
	}

	@Override
	public int deleteDepartment(DeptVO param) {
		// TODO Auto-generated method stub
		return deptMapper.deleteDepartment(param);
	}

}

package dao;

import java.util.ArrayList;

import dto.MemberDto;

public interface MemberDao {

	// 데이터 넣고 
	public void insert(MemberDto dto);
	
	// ID로 검색하고
	public MemberDto select(String id);
	
	// 전체 데이터 가져오기
	public ArrayList<MemberDto> select();
	
	// 점수 정보 업데이트
	public void update(MemberDto dto);
}

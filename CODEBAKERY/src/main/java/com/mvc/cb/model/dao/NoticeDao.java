package com.mvc.cb.model.dao;

import java.util.List;

import com.mvc.cb.model.dto.NoticeDto;
import com.mvc.cb.model.dto.PageNavigator;

public interface NoticeDao {

	String NAMESPACE = "notice.";

	public List<NoticeDto> selectAll(PageNavigator paging);

	public NoticeDto selectOne(int notice_No);

	public int insert(NoticeDto dto);

	public int update(NoticeDto dto);

	public int delete(int notice_No);

	public int viewUpdate(int notice_No);

	public int pageCnt();

	public List<NoticeDto> noticeList();

}
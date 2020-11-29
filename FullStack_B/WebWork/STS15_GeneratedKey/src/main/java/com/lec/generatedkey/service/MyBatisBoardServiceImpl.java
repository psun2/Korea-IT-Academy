package com.lec.generatedkey.service;

import com.lec.generatedkey.domain.BoardDAO;
import com.lec.generatedkey.domain.BoardDTO;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Slf4j
@Component
@Transactional
public class MyBatisBoardServiceImpl implements BoardService {

    // MyBatis Session
    @Autowired
    @Qualifier("sqlSessionTemplate")
    private SqlSession sqlSession; // 설정파일에서 생성
    // 세션 객체는 SessionFactory를 의존 합니다.

    BoardDAO dao;

    @Override
    public List<BoardDTO> getListAll() {
        // 세션은 한번 사용하면 죽어버리기 때문에
        // 계속 만들어 주어야 합니다.

        return sqlSession.getMapper(BoardDAO.class).getListAll();
    }

    @Override
    public int write(BoardDTO dto) {
        dao = sqlSession.getMapper(BoardDAO.class);
        // return dao.insert(dto.getSubject(), dto.setContent(), dto.getName());

        int result = dao.write(dto);
        log.info("MyBatis: 생성된 uid 는 {}", dto.getUid());
        // foren key 로 잡혀있는 경우 바로 필요하기 때문에 !!
        // 다시 select 할 필요가 없어짐!!

        return result;
    }

    @Override
    public List<BoardDTO> viewByUid(long uid) {
        dao = sqlSession.getMapper(BoardDAO.class);
        int cnt = dao.viewCnt(uid);

        if (cnt == 1)
            return dao.selectByUid(uid);
        return null;
    }

    @Override
    public List<BoardDTO> selectByUid(long uid) {
        dao = sqlSession.getMapper(BoardDAO.class);
        return dao.selectByUid(uid);
    }

    @Override
    public int update(BoardDTO dto) {
        dao = sqlSession.getMapper(BoardDAO.class);
        // return dao.update(dto);
        // return dao.update(dto.getUid(), dto);
        // return dao.update(dto.getUid(), dto.getSubject(), dto.getContent(), dto);
        return dao.update(dto.getUid(), dto.getSubject(), dto.getContent(), dto);
    }

    @Override
    public int deleteByUid(long uid) {
        dao = sqlSession.getMapper(BoardDAO.class);
        return dao.deleteByUid(uid);
    }

}

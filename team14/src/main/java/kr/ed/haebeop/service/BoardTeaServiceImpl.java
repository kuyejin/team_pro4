package kr.ed.haebeop.service;

import kr.ed.haebeop.domain.Board;
import kr.ed.haebeop.domain.Report;
import kr.ed.haebeop.repository.BoardTeaDAOImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardTeaServiceImpl implements BoardService{

    @Autowired
    private BoardTeaDAOImpl boardDAO;

    @Override
    public List<Board> boardList() throws Exception {
        return boardDAO.boardList();
    }

    @Override
    public Board boardDetail(int bno) throws Exception {
        return boardDAO.boardDetail(bno);
    }

    @Override
    public void boardInsert(Board dto) throws Exception {
        boardDAO.boardInsert(dto);
    }

    @Override
    public void boardDelete(int bno) throws Exception {
        boardDAO.boardDelete(bno);
    }

    @Override
    public void boardEdit(Board dto) throws Exception {
        boardDAO.boardEdit(dto);
    }

    @Override
    public void countUp(int bno) throws Exception {

    }

    @Override
    public List<Board> commentList(int bno) throws Exception {
        return boardDAO.commentList(bno);
    }

    @Override
    public void commentInsert(Board dto) throws Exception {
        boardDAO.commentInsert(dto);
    }

    @Override
    public void commentDeleteAll(int bno) throws Exception {
        boardDAO.commentDeleteAll(bno);
    }
    @Override
    public List<Board> allCommentList() throws Exception {
        return boardDAO.allCommentList();
    }
    @Override
    public void reportBoard(Report report) throws Exception {
        boardDAO.reportBoard(report);
    }
    @Override
    public int checkReported(Report report) throws Exception {
        return boardDAO.checkReported(report);
    }
    @Override
    public List<Board> boardReportList() throws Exception {
        return boardDAO.boardReportList();
    }
    @Override
    public List<Board> recentReportList() throws Exception {
        return boardDAO.recentReportList();
    }
}

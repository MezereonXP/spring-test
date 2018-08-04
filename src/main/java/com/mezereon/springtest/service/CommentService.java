package com.mezereon.springtest.service;

import com.mezereon.springtest.bean.Comment;
import com.mezereon.springtest.bean.CommentExample;
import com.mezereon.springtest.bean.Forum;
import com.mezereon.springtest.bean.ForumExample;
import com.mezereon.springtest.dao.CommentMapper;
import com.mezereon.springtest.dao.ForumMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;

/**
 * @program: CommentService
 * @description: Service for comment mapper
 * @author: mezereonxp Email: mezereonxp@gmail.com
 * @create: 2018/8/4
 **/
@Service
public class CommentService {

    @Autowired
    CommentMapper commentMapper;

    @Autowired
    ForumMapper forumMapper;

    public List<Comment> getCommentByGId(Integer gId) {
        CommentExample commentExample = new CommentExample();
        commentExample.createCriteria().andCmGoodsIdEqualTo(gId);
        List<Comment> commentList = commentMapper.selectByExample(commentExample);
        commentList.sort(Comparator.comparing(Comment::getCmDate));
        return commentList;
    }

    public List<Forum> getForumByCMId(Integer cmId) {
        ForumExample forumExample = new ForumExample();
        forumExample.createCriteria().andFCmidEqualTo(cmId);
        return forumMapper.selectByExampleWithBLOBs(forumExample);
    }
}

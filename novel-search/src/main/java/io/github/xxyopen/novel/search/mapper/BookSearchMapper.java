package io.github.xxyopen.novel.search.mapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import io.github.xxyopen.novel.book.dao.entity.BookInfo;
import io.github.xxyopen.novel.book.dto.req.BookSearchReqDto;
import io.github.xxyopen.novel.book.dto.resp.BookInfoRespDto;
import org.apache.ibatis.annotations.Param;

import java.util.List;
public interface BookSearchMapper {
        /**
     * 小说搜索
     * @param page mybatis-plus 分页对象
     * @param condition 搜索条件
     * @return 返回结果
     * */
    List<BookInfo> searchBooks(IPage<BookInfoRespDto> page, BookSearchReqDto condition);

}

package com.qi.search.model.vo;

import com.qi.search.model.entity.Picture;
import lombok.Data;

import java.util.List;

@Data
public class SearchVO {
    private List<UserVO> userList;

    private List<PostVO> postList;

    private List<Picture> pictureList;

    private List<?> dataList;

    private static final long serialVersionUID = 1L;

}

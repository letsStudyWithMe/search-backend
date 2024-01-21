package com.qi.search.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.qi.search.model.entity.Picture;

public interface PictureService {
    Page<Picture> searchPicture(String searchText, long pageNum, long pageSize);
}
package com.qi.search.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.qi.search.common.BaseResponse;
import com.qi.search.common.ErrorCode;
import com.qi.search.common.ResultUtils;
import com.qi.search.exception.BusinessException;
import com.qi.search.exception.ThrowUtils;
import com.qi.search.model.dto.picture.PictureQueryRequest;
import com.qi.search.model.dto.user.UserQueryRequest;
import com.qi.search.model.entity.Picture;
import com.qi.search.model.entity.User;
import com.qi.search.model.vo.UserVO;
import com.qi.search.service.PictureService;
import com.qi.search.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * 图片接口
 *
 *
 */
@RestController
@RequestMapping("/picture")
@Slf4j
public class PictureController {

    @Resource
    private PictureService pictureService;

    /**
     * 分页获取用户封装列表
     *
     * @param pictureQueryRequest
     * @param request
     * @return
     */
    @PostMapping("/list/page/vo")
    public BaseResponse<Page<Picture>> listUserVOByPage(@RequestBody PictureQueryRequest pictureQueryRequest,
                                                       HttpServletRequest request) {
        long current = pictureQueryRequest.getCurrent();
        long size = pictureQueryRequest.getPageSize();
        // 限制爬虫
        ThrowUtils.throwIf(size > 20, ErrorCode.PARAMS_ERROR);
        String searchText = pictureQueryRequest.getSearchText();
        Page<Picture> picturePage = pictureService.searchPicture(searchText, current, size);
        return ResultUtils.success(picturePage);
    }
}

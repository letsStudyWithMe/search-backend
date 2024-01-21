package com.qi.search.model.dto.picture;

import com.qi.search.common.PageRequest;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * 用户查询请求
 *
 *
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class PictureQueryRequest extends PageRequest implements Serializable {
    /**
     * 图片相关文本
     */
    private String searchText;

    private static final long serialVersionUID = 1L;
}
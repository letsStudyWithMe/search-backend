package com.qi.search.model.dto.search;

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
public class QueryRequest extends PageRequest implements Serializable {
    /**
     * 图片相关文本
     */
    private String searchText;

    /**
     * 类型
     */
    private String type;

    private static final long serialVersionUID = 1L;
}
package com.leyou.item.api;

import com.leyou.item.pojo.Brand;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 提供品牌接口
 */
@RequestMapping("/brand")
public interface BrandApi {
    /**
     * 通过id查询品牌
     *
     * @param id
     * @return
     */
    @GetMapping("/{id}")
    Brand queryBrandById(@PathVariable("id") Long id);
}
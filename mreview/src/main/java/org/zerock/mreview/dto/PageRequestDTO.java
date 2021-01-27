package org.zerock.mreview.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.extern.log4j.Log4j2;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Builder
@AllArgsConstructor
@Data
public class PageRequestDTO {



    private int page;
    private int size;
    private String type;
    private String keyword;

    public PageRequestDTO() {
        this.page = 1;
        this.size = 10;
    }

    public Pageable getPageable(Sort sort) {

        return PageRequest.of(page -1, size, sort);
    }
}

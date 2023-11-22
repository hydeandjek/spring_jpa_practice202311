package com.study.jpa.chap05_practice.dto;

import lombok.*;

import java.util.List;

@Setter @Getter
@ToString
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PostListResponseDTO {

    private int count; // 총 게시물 수
    private PageResponseDTO pageInfo; // 페이지 렌더링 정보
    private List<PostDetailResopnseDTO> posts; // 게시물 렌더링 정보






}

package com.study.jpa.chap05_practice.dto;

import com.study.jpa.chap05_practice.entity.Post;
import lombok.*;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.List;

@Setter @Getter@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PostCreateDTO {

    //@NotNull -> null 을 허용하지 않음. 화이트스페이스는 허용
    //@NotEmpty -> null과 "" 허용 안함 " "허용
    @NotBlank // -> 위에것 모두 허용 안함
    @Size(min = 2, max = 5)
    private String writer;

    @NotBlank
    @Size(min = 1, max = 20)
    private String title;
    
    private String content;
    private List<String> hashTags;

    //dto를 언터티로 변환하는 메서드
    public Post toEntity(){

        return Post.builder()
                .writer(this.writer)
                .content(this.content)
                .title(this.content)
                // 해시태그는 여기서 넣는게 아니에요~
                .build();
    }


}

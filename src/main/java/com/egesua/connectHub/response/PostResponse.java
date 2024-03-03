package com.egesua.connectHub.response;

import com.egesua.connectHub.entity.Like;
import com.egesua.connectHub.entity.Post;
import lombok.Data;

import java.util.List;

@Data
public class PostResponse {
    private Long id;
    private Long userId;
    private String username;
    private String title;
    private String text;
    private List<LikeResponse> postLikes;

    public PostResponse(Post entity, List<LikeResponse> likes) {
        this.id = entity.getId();
        this.userId = entity.getUser().getId();
        this.username = entity.getUser().getUsername();
        this.title = entity.getTitle();
        this.text = entity.getText();
        this.postLikes = likes;
    }
}
